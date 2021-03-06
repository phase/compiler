package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class attrs_1_0 extends Strategy 
{ 
  public static attrs_1_0 instance = new attrs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("attrs_1_0");
    Fail246:
    { 
      IStrategoTerm u_144 = null;
      IStrategoTerm t_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consattrs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail246;
      t_144 = term.getSubterm(0);
      IStrategoList annos202 = term.getAnnotations();
      u_144 = annos202;
      term = q_28.invoke(context, t_144);
      if(term == null)
        break Fail246;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consattrs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}