package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong_2_0 extends Strategy 
{ 
  public static $List$Cong_2_0 instance = new $List$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_21, Strategy g_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail102:
    { 
      IStrategoTerm k_117 = null;
      IStrategoTerm i_117 = null;
      IStrategoTerm j_117 = null;
      IStrategoTerm l_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      i_117 = term.getSubterm(0);
      j_117 = term.getSubterm(1);
      IStrategoList annos75 = term.getAnnotations();
      k_117 = annos75;
      term = f_21.invoke(context, i_117);
      if(term == null)
        break Fail102;
      l_117 = term;
      term = g_21.invoke(context, j_117);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consListCong_2, new IStrategoTerm[]{l_117, term}), checkListAnnos(termFactory, k_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}