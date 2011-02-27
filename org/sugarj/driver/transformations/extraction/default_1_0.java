package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class default_1_0 extends Strategy 
{ 
  public static default_1_0 instance = new default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("default_1_0");
    Fail194:
    { 
      IStrategoTerm y_136 = null;
      IStrategoTerm v_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consdefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      v_136 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      y_136 = annos162;
      term = s_26.invoke(context, v_136);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consdefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}