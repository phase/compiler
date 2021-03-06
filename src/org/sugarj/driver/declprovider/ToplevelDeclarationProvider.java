package org.sugarj.driver.declprovider;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.shared.SGLRException;
import org.sugarj.driver.Driver;

/**
 * @author jp
 * @author seba
 */
public interface ToplevelDeclarationProvider extends Serializable {
  /**
   * @param recovery use recovery parser if possible
   * @param lookahead if true, this is a lookahead parse that should not annotate errors.
   * @return the AST of the next toplevel declaration
   */
  public IStrategoTerm getNextToplevelDecl(boolean recovery, boolean lookahead) throws IOException, ParseException, InvalidParseTableException, SGLRException;

  public void retract(IStrategoTerm term);
  public boolean hasNextToplevelDecl();
  public IToken getStartToken();
  public void setDriver(Driver driver);
}
