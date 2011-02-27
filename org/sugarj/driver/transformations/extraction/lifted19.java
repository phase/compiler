package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted19 extends Strategy 
{ 
  public static final lifted19 instance = new lifted19();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail290:
    { 
      IStrategoTerm term5 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success6:
      { 
        if(cons5 == extraction._consgrammar_elem_1)
        { 
          Fail291:
          { 
            IStrategoTerm t_154 = null;
            t_154 = term.getSubterm(0);
            term = t_154;
            if(true)
              break Success6;
          }
          term = term5;
        }
        if(cons5 == extraction._constransformation_elem_1)
        { 
          IStrategoTerm y_154 = null;
          y_154 = term.getSubterm(0);
          term = comp_desugarings_to_sdf_0_0.instance.invoke(context, y_154);
          if(term == null)
            break Fail290;
        }
        else
        { 
          break Fail290;
        }
      }
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)extraction.constNil0);
      if(true)
        return term;
    }
    return null;
  }
}