package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.isApplication;
import static org.sugarj.driver.Environment.includePath;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.Log.log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class ModuleSystemCommands {
  
  /**
   * 
   * @param modulePath
   * @param importTerm
   * @param javaOutFile
   * @param interp
   * @param driverResult
   * @return true iff a class file existed.
   * @throws IOException
   */
  public static boolean importClass(String modulePath, IStrategoTerm importTerm, String javaOutFile, HybridInterpreter interp, Result driverResult) throws IOException {
    URI classUri = searchFile(modulePath, ".class");
    if (classUri == null)
      return false;
    
    driverResult.addFileDependency(classUri.getPath());
    
    log.beginTask("Generate Java code");
    try {
      driverResult.appendToFile(javaOutFile, SDFCommands.prettyPrintJava(importTerm, interp) + "\n");
    } finally {
      log.endTask();
    }
    
    return true;
  }
  
  /**
   * 
   * @param modulePath
   * @param currentGrammarModule
   * @param availableSDFImports
   * @param driverResult
   * @return path to new grammar or null if no sdf file existed.
   * @throws IOException 
   */
  public static String importSdf(String modulePath, String currentGrammarModule, List<String> availableSDFImports, Result driverResult) throws IOException {
    URI sdfUri = searchFile(modulePath, ".sdf");
    
    if (sdfUri == null)
      return null;
    
    driverResult.addFileDependency(sdfUri.getPath());
    
    log.beginTask("Incorporation", "Incorporate the imported grammar " + modulePath);
    try {
      // build extension of current grammar
      String newGrammarName = 
        FileCommands.hashFileName("sugarj", currentGrammarModule + modulePath);
        

      String newGrammar = Environment.tmpDir + sep + newGrammarName + ".sdf";

      String grammar = 
        "module " + newGrammarName + "\n"
      + "imports " + currentGrammarModule + "\n"
      + "        " + modulePath;
      
      driverResult.generateFile(newGrammar, grammar);

      availableSDFImports.add(modulePath);

      return newGrammar;
    } finally {
      log.endTask();
    }
  }
  
  /**
   * 
   * @param modulePath
   * @param currentTransModule
   * @param availableSTRImports
   * @param driverResult
   * @return path to new Stratego module or null of no str file existed
   * @throws IOException 
   */
  public static String importStratego(String modulePath, String currentTransModule, List<String> availableSTRImports, Result driverResult) throws IOException {
    URI strUri = searchFile(modulePath, ".str");
    
    if (strUri == null)
      return null;
    
    driverResult.addFileDependency(strUri.getPath());
    
    log.beginTask("Incorporation", "Incorporate the imported desugaring rules " + modulePath);
    try {
      // build extension of current transformation
      String newTransName =
        FileCommands.hashFileName("sugarj", currentTransModule + modulePath);

      String newTrans = Environment.tmpDir + sep + newTransName + ".str";

      String trans =
          "module " + newTransName + "\n"
        + "imports " + currentTransModule + "\n"
        + "        " + modulePath;
      
      driverResult.generateFile(newTrans, trans);

      availableSTRImports.add(modulePath);

      return newTrans;
    } finally {
      log.endTask();
    }
  }
  
  /**
   * 
   * @param modulePath
   * @param driverResult
   * @return true iff a serv file existed.
   * @throws IOException
   */
  public static boolean importEditorServices(String modulePath, Result driverResult) throws IOException {
    URI servUri = searchFile(modulePath, ".serv");
    
    if (servUri == null)
      return false;
    
    driverResult.addFileDependency(servUri.getPath());
    
    log.beginTask("Incorporation", "Incorporate the imported editor services " + modulePath);
    try {
      BufferedReader reader = new BufferedReader(new FileReader(new File(servUri)));
      String line;
      
      while ((line = reader.readLine()) != null)
        driverResult.addEditorService(ATermCommands.atermFromString(line));
      
      return true;
    } finally {
      log.endTask();
    }
  }
  
  public static URI locateSourceFile(String modulePath) {
    if (modulePath.startsWith("org/sugarj"))
      return null;
    
    URI result = searchFile(modulePath, ".sugj", Collections.singleton(Environment.src));
    
    if (result == null)
      result = searchFile(modulePath, ".java", Collections.singleton(Environment.src));
    
    return result;
  }
  
  
  
  public static String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (isApplication(toplevelDecl, "TypeImportDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp);
      
      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp) + ".*";
    } finally {
      log.endTask(name);
    }
    return name;
  }

  
  
  /**
   * 
   * @param relativePath
   * @param fileExtension including leading "."
   * @return URI or null.
   */
  public static URI searchFile(String relativePath, String fileExtension) {
    return searchFile(relativePath, fileExtension, includePath);
  }

  private static URI searchFile(String relativePath, String extension, Set<String> searchPath) {
    URI result = null;
    try {
      ClassLoader cl;
      try {
        cl = createClassLoader(searchPath);
      } catch (MalformedURLException e) {
        throw new IllegalStateException("could not create class loader", e);
      }
      URL url = cl.getResource(relativePath + extension);
      if (url != null)
        result = url.toURI();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    
    return result;
  }
  
  private static ClassLoader createClassLoader(Collection<String> path) throws MalformedURLException {
    // log.beginTask("Creating", "Create a class loader for " + what);
    try {
      URL[] urls = new URL[path.size() + 1];
      
      int i = 0;
      for (String include : path)
        urls[i++] = new File(include).toURI().toURL();

      urls[urls.length - 1] = new File(StdLib.stdLibDir.getPath()).toURI().toURL();
      
      /*
       * we use 'null' as the parent class loader purposely, so
       * that only the given urls are searched.
       */
      return new URLClassLoader(urls, null);
    } finally {
      // log.endTask();
    }
  }
}