package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
{ 
  @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    register(context, compiledContext, context.getVarScope());
  }

  @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
  { 
    registerLazy(context, compiledContext, classLoader, context.getVarScope());
  }

  private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("renaming");
    renaming.init(compiledContext);
    varScope.addSVar("apply_renamings_0_0", new InteropSDefT(apply_renamings_0_0.instance, context));
    varScope.addSVar("apply_renamings_0_1", new InteropSDefT(apply_renamings_0_1.instance, context));
    varScope.addSVar("rename_decl_0_1", new InteropSDefT(rename_decl_0_1.instance, context));
    varScope.addSVar("rename_rules_0_2", new InteropSDefT(rename_rules_0_2.instance, context));
    varScope.addSVar("rename_rule_0_2", new InteropSDefT(rename_rule_0_2.instance, context));
    varScope.addSVar("RuleNames_1_0", new InteropSDefT($Rule$Names_1_0.instance, context));
    varScope.addSVar("RDecT_3_0", new InteropSDefT($R$Dec$T_3_0.instance, context));
    varScope.addSVar("RDec_2_0", new InteropSDefT($R$Dec_2_0.instance, context));
    varScope.addSVar("RDecNoArgs_1_0", new InteropSDefT($R$Dec$No$Args_1_0.instance, context));
    varScope.addSVar("DynRuleScopeId_1_0", new InteropSDefT($Dyn$Rule$Scope$Id_1_0.instance, context));
    varScope.addSVar("LabeledDynRuleScopeId_2_0", new InteropSDefT($Labeled$Dyn$Rule$Scope$Id_2_0.instance, context));
    varScope.addSVar("DynRuleId_1_0", new InteropSDefT($Dyn$Rule$Id_1_0.instance, context));
    varScope.addSVar("AddLabelDynRuleId_2_0", new InteropSDefT($Add$Label$Dyn$Rule$Id_2_0.instance, context));
    varScope.addSVar("LabeledDynRuleId_2_0", new InteropSDefT($Labeled$Dyn$Rule$Id_2_0.instance, context));
    varScope.addSVar("SetDynRuleDepends_3_0", new InteropSDefT($Set$Dyn$Rule$Depends_3_0.instance, context));
    varScope.addSVar("DynRuleAssignAdd_2_0", new InteropSDefT($Dyn$Rule$Assign$Add_2_0.instance, context));
    varScope.addSVar("DynRuleAssign_2_0", new InteropSDefT($Dyn$Rule$Assign_2_0.instance, context));
    varScope.addSVar("SetDynRuleMatch_2_0", new InteropSDefT($Set$Dyn$Rule$Match_2_0.instance, context));
    varScope.addSVar("AddDynRule_2_0", new InteropSDefT($Add$Dyn$Rule_2_0.instance, context));
    varScope.addSVar("SetDynRule_2_0", new InteropSDefT($Set$Dyn$Rule_2_0.instance, context));
    varScope.addSVar("UndefineDynRule_2_0", new InteropSDefT($Undefine$Dyn$Rule_2_0.instance, context));
    varScope.addSVar("AddScopeLabel_2_0", new InteropSDefT($Add$Scope$Label_2_0.instance, context));
    varScope.addSVar("ScopeLabels_1_0", new InteropSDefT($Scope$Labels_1_0.instance, context));
    varScope.addSVar("WithClause_1_0", new InteropSDefT($With$Clause_1_0.instance, context));
    varScope.addSVar("WhereClause_1_0", new InteropSDefT($Where$Clause_1_0.instance, context));
    varScope.addSVar("Rule_3_0", new InteropSDefT($Rule_3_0.instance, context));
    varScope.addSVar("RuleNoCond_2_0", new InteropSDefT($Rule$No$Cond_2_0.instance, context));
    varScope.addSVar("RDefT_4_0", new InteropSDefT($R$Def$T_4_0.instance, context));
    varScope.addSVar("RDef_3_0", new InteropSDefT($R$Def_3_0.instance, context));
    varScope.addSVar("RDefNoArgs_2_0", new InteropSDefT($R$Def$No$Args_2_0.instance, context));
    varScope.addSVar("Overlay_3_0", new InteropSDefT($Overlay_3_0.instance, context));
    varScope.addSVar("OverlayNoArgs_2_0", new InteropSDefT($Overlay$No$Args_2_0.instance, context));
    varScope.addSVar("SwitchCase_2_0", new InteropSDefT($Switch$Case_2_0.instance, context));
    varScope.addSVar("StrategyCurly_1_0", new InteropSDefT($Strategy$Curly_1_0.instance, context));
    varScope.addSVar("ListVar_1_0", new InteropSDefT($List$Var_1_0.instance, context));
    varScope.addSVar("ImportWildcard_1_0", new InteropSDefT($Import$Wildcard_1_0.instance, context));
    varScope.addSVar("Import_1_0", new InteropSDefT($Import_1_0.instance, context));
    varScope.addSVar("Overlays_1_0", new InteropSDefT($Overlays_1_0.instance, context));
    varScope.addSVar("Rules_1_0", new InteropSDefT($Rules_1_0.instance, context));
    varScope.addSVar("Signature_1_0", new InteropSDefT($Signature_1_0.instance, context));
    varScope.addSVar("Strategies_1_0", new InteropSDefT($Strategies_1_0.instance, context));
    varScope.addSVar("Imports_1_0", new InteropSDefT($Imports_1_0.instance, context));
    varScope.addSVar("Specification_1_0", new InteropSDefT($Specification_1_0.instance, context));
    varScope.addSVar("Module_2_0", new InteropSDefT($Module_2_0.instance, context));
    varScope.addSVar("ParenStrat_1_0", new InteropSDefT($Paren$Strat_1_0.instance, context));
    varScope.addSVar("DefaultVarDec_1_0", new InteropSDefT($Default$Var$Dec_1_0.instance, context));
    varScope.addSVar("VarDec_2_0", new InteropSDefT($Var$Dec_2_0.instance, context));
    varScope.addSVar("SDef_3_0", new InteropSDefT($S$Def_3_0.instance, context));
    varScope.addSVar("SDefNoArgs_2_0", new InteropSDefT($S$Def$No$Args_2_0.instance, context));
    varScope.addSVar("ExtSDef_3_0", new InteropSDefT($Ext$S$Def_3_0.instance, context));
    varScope.addSVar("ExtSDefInl_4_0", new InteropSDefT($Ext$S$Def$Inl_4_0.instance, context));
    varScope.addSVar("SDefT_4_0", new InteropSDefT($S$Def$T_4_0.instance, context));
    varScope.addSVar("DynRuleIntersectUnion_4_0", new InteropSDefT($Dyn$Rule$Intersect$Union_4_0.instance, context));
    varScope.addSVar("DynRuleUnion_3_0", new InteropSDefT($Dyn$Rule$Union_3_0.instance, context));
    varScope.addSVar("DynRuleIntersect_3_0", new InteropSDefT($Dyn$Rule$Intersect_3_0.instance, context));
    varScope.addSVar("DynRuleIntersectUnionFix_3_0", new InteropSDefT($Dyn$Rule$Intersect$Union$Fix_3_0.instance, context));
    varScope.addSVar("DynRuleUnionFix_2_0", new InteropSDefT($Dyn$Rule$Union$Fix_2_0.instance, context));
    varScope.addSVar("DynRuleIntersectFix_2_0", new InteropSDefT($Dyn$Rule$Intersect$Fix_2_0.instance, context));
    varScope.addSVar("GenDynRules_1_0", new InteropSDefT($Gen$Dyn$Rules_1_0.instance, context));
    varScope.addSVar("DynRuleScope_2_0", new InteropSDefT($Dyn$Rule$Scope_2_0.instance, context));
    varScope.addSVar("Assign_2_0", new InteropSDefT($Assign_2_0.instance, context));
    varScope.addSVar("AM_2_0", new InteropSDefT($A$M_2_0.instance, context));
    varScope.addSVar("SwitchChoice_3_0", new InteropSDefT($Switch$Choice_3_0.instance, context));
    varScope.addSVar("SwitchChoiceNoOtherwise_2_0", new InteropSDefT($Switch$Choice$No$Otherwise_2_0.instance, context));
    varScope.addSVar("IfThen_2_0", new InteropSDefT($If$Then_2_0.instance, context));
    varScope.addSVar("CondChoice_3_0", new InteropSDefT($Cond$Choice_3_0.instance, context));
    varScope.addSVar("RChoice_2_0", new InteropSDefT($R$Choice_2_0.instance, context));
    varScope.addSVar("Choice_2_0", new InteropSDefT($Choice_2_0.instance, context));
    varScope.addSVar("SRule_1_0", new InteropSDefT($S$Rule_1_0.instance, context));
    varScope.addSVar("LRule_1_0", new InteropSDefT($L$Rule_1_0.instance, context));
    varScope.addSVar("CallNoArgs_1_0", new InteropSDefT($Call$No$Args_1_0.instance, context));
    varScope.addSVar("ExplodeCong_2_0", new InteropSDefT($Explode$Cong_2_0.instance, context));
    varScope.addSVar("ListCong_2_0", new InteropSDefT($List$Cong_2_0.instance, context));
    varScope.addSVar("ListCongNoTail_1_0", new InteropSDefT($List$Cong$No$Tail_1_0.instance, context));
    varScope.addSVar("TupleCong_2_0", new InteropSDefT($Tuple$Cong_2_0.instance, context));
    varScope.addSVar("EmptyTupleCong_0_0", new InteropSDefT($Empty$Tuple$Cong_0_0.instance, context));
    varScope.addSVar("AnnoCong_2_0", new InteropSDefT($Anno$Cong_2_0.instance, context));
    varScope.addSVar("CongQ_2_0", new InteropSDefT($Cong$Q_2_0.instance, context));
    varScope.addSVar("CharCong_1_0", new InteropSDefT($Char$Cong_1_0.instance, context));
    varScope.addSVar("RealCong_1_0", new InteropSDefT($Real$Cong_1_0.instance, context));
    varScope.addSVar("IntCong_1_0", new InteropSDefT($Int$Cong_1_0.instance, context));
    varScope.addSVar("StrCong_1_0", new InteropSDefT($Str$Cong_1_0.instance, context));
    varScope.addSVar("Prim_2_0", new InteropSDefT($Prim_2_0.instance, context));
    varScope.addSVar("PrimNoArgs_1_0", new InteropSDefT($Prim$No$Args_1_0.instance, context));
    varScope.addSVar("Test_1_0", new InteropSDefT($Test_1_0.instance, context));
    varScope.addSVar("With_1_0", new InteropSDefT($With_1_0.instance, context));
    varScope.addSVar("Where_1_0", new InteropSDefT($Where_1_0.instance, context));
    varScope.addSVar("Not_1_0", new InteropSDefT($Not_1_0.instance, context));
    varScope.addSVar("Rec_2_0", new InteropSDefT($Rec_2_0.instance, context));
    varScope.addSVar("LChoice_2_0", new InteropSDefT($L$Choice_2_0.instance, context));
    varScope.addSVar("BA_2_0", new InteropSDefT($B$A_2_0.instance, context));
    varScope.addSVar("ScopeDefault_1_0", new InteropSDefT($Scope$Default_1_0.instance, context));
    varScope.addSVar("Call_2_0", new InteropSDefT($Call_2_0.instance, context));
    varScope.addSVar("ImportTerm_1_0", new InteropSDefT($Import$Term_1_0.instance, context));
    varScope.addSVar("All_1_0", new InteropSDefT($All_1_0.instance, context));
    varScope.addSVar("One_1_0", new InteropSDefT($One_1_0.instance, context));
    varScope.addSVar("PrimT_3_0", new InteropSDefT($Prim$T_3_0.instance, context));
    varScope.addSVar("GuardedLChoice_3_0", new InteropSDefT($Guarded$L$Choice_3_0.instance, context));
    varScope.addSVar("Seq_2_0", new InteropSDefT($Seq_2_0.instance, context));
    varScope.addSVar("Scope_2_0", new InteropSDefT($Scope_2_0.instance, context));
    varScope.addSVar("Build_1_0", new InteropSDefT($Build_1_0.instance, context));
    varScope.addSVar("Match_1_0", new InteropSDefT($Match_1_0.instance, context));
    varScope.addSVar("Id_0_0", new InteropSDefT($Id_0_0.instance, context));
    varScope.addSVar("Fail_0_0", new InteropSDefT($Fail_0_0.instance, context));
    varScope.addSVar("CallDynamic_3_0", new InteropSDefT($Call$Dynamic_3_0.instance, context));
    varScope.addSVar("CallT_3_0", new InteropSDefT($Call$T_3_0.instance, context));
    varScope.addSVar("Let_2_0", new InteropSDefT($Let_2_0.instance, context));
    varScope.addSVar("SVar_1_0", new InteropSDefT($S$Var_1_0.instance, context));
    varScope.addSVar("FunType_2_0", new InteropSDefT($Fun$Type_2_0.instance, context));
    varScope.addSVar("ConstType_1_0", new InteropSDefT($Const$Type_1_0.instance, context));
    varScope.addSVar("ExtOpDeclInj_1_0", new InteropSDefT($Ext$Op$Decl$Inj_1_0.instance, context));
    varScope.addSVar("ExtOpDeclQ_2_0", new InteropSDefT($Ext$Op$Decl$Q_2_0.instance, context));
    varScope.addSVar("ExtOpDecl_2_0", new InteropSDefT($Ext$Op$Decl_2_0.instance, context));
    varScope.addSVar("OpDeclInj_1_0", new InteropSDefT($Op$Decl$Inj_1_0.instance, context));
    varScope.addSVar("OpDeclQ_2_0", new InteropSDefT($Op$Decl$Q_2_0.instance, context));
    varScope.addSVar("OpDecl_2_0", new InteropSDefT($Op$Decl_2_0.instance, context));
    varScope.addSVar("SortTuple_1_0", new InteropSDefT($Sort$Tuple_1_0.instance, context));
    varScope.addSVar("SortListTl_2_0", new InteropSDefT($Sort$List$Tl_2_0.instance, context));
    varScope.addSVar("SortList_1_0", new InteropSDefT($Sort$List_1_0.instance, context));
    varScope.addSVar("Sort_2_0", new InteropSDefT($Sort_2_0.instance, context));
    varScope.addSVar("SortNoArgs_1_0", new InteropSDefT($Sort$No$Args_1_0.instance, context));
    varScope.addSVar("SortVar_1_0", new InteropSDefT($Sort$Var_1_0.instance, context));
    varScope.addSVar("Constructors_1_0", new InteropSDefT($Constructors_1_0.instance, context));
    varScope.addSVar("Sorts_1_0", new InteropSDefT($Sorts_1_0.instance, context));
    varScope.addSVar("Wld_0_0", new InteropSDefT($Wld_0_0.instance, context));
    varScope.addSVar("RootApp_1_0", new InteropSDefT($Root$App_1_0.instance, context));
    varScope.addSVar("App_2_0", new InteropSDefT($App_2_0.instance, context));
    varScope.addSVar("NoAnnoList_1_0", new InteropSDefT($No$Anno$List_1_0.instance, context));
    varScope.addSVar("AnnoList_2_0", new InteropSDefT($Anno$List_2_0.instance, context));
    varScope.addSVar("BuildDefault_1_0", new InteropSDefT($Build$Default_1_0.instance, context));
    varScope.addSVar("As_2_0", new InteropSDefT($As_2_0.instance, context));
    varScope.addSVar("ListTail_2_0", new InteropSDefT($List$Tail_2_0.instance, context));
    varScope.addSVar("List_1_0", new InteropSDefT($List_1_0.instance, context));
    varScope.addSVar("Tuple_1_0", new InteropSDefT($Tuple_1_0.instance, context));
    varScope.addSVar("Char_1_0", new InteropSDefT($Char_1_0.instance, context));
    varScope.addSVar("BuildDefaultPT_1_0", new InteropSDefT($Build$Default$P$T_1_0.instance, context));
    varScope.addSVar("Explode_2_0", new InteropSDefT($Explode_2_0.instance, context));
    varScope.addSVar("OpQ_2_0", new InteropSDefT($Op$Q_2_0.instance, context));
    varScope.addSVar("Op_2_0", new InteropSDefT($Op_2_0.instance, context));
    varScope.addSVar("Str_1_0", new InteropSDefT($Str_1_0.instance, context));
    varScope.addSVar("Real_1_0", new InteropSDefT($Real_1_0.instance, context));
    varScope.addSVar("Int_1_0", new InteropSDefT($Int_1_0.instance, context));
    varScope.addSVar("Var_1_0", new InteropSDefT($Var_1_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("renaming");
    renaming.init(compiledContext);
    varScope.addSVar("apply_renamings_0_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.apply_renamings_0_0", context));
    varScope.addSVar("apply_renamings_0_1", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.apply_renamings_0_1", context));
    varScope.addSVar("rename_decl_0_1", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.rename_decl_0_1", context));
    varScope.addSVar("rename_rules_0_2", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.rename_rules_0_2", context));
    varScope.addSVar("rename_rule_0_2", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.rename_rule_0_2", context));
    varScope.addSVar("RuleNames_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Rule$Names_1_0", context));
    varScope.addSVar("RDecT_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Dec$T_3_0", context));
    varScope.addSVar("RDec_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Dec_2_0", context));
    varScope.addSVar("RDecNoArgs_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Dec$No$Args_1_0", context));
    varScope.addSVar("DynRuleScopeId_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Scope$Id_1_0", context));
    varScope.addSVar("LabeledDynRuleScopeId_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Labeled$Dyn$Rule$Scope$Id_2_0", context));
    varScope.addSVar("DynRuleId_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Id_1_0", context));
    varScope.addSVar("AddLabelDynRuleId_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Add$Label$Dyn$Rule$Id_2_0", context));
    varScope.addSVar("LabeledDynRuleId_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Labeled$Dyn$Rule$Id_2_0", context));
    varScope.addSVar("SetDynRuleDepends_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Set$Dyn$Rule$Depends_3_0", context));
    varScope.addSVar("DynRuleAssignAdd_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Assign$Add_2_0", context));
    varScope.addSVar("DynRuleAssign_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Assign_2_0", context));
    varScope.addSVar("SetDynRuleMatch_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Set$Dyn$Rule$Match_2_0", context));
    varScope.addSVar("AddDynRule_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Add$Dyn$Rule_2_0", context));
    varScope.addSVar("SetDynRule_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Set$Dyn$Rule_2_0", context));
    varScope.addSVar("UndefineDynRule_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Undefine$Dyn$Rule_2_0", context));
    varScope.addSVar("AddScopeLabel_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Add$Scope$Label_2_0", context));
    varScope.addSVar("ScopeLabels_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Scope$Labels_1_0", context));
    varScope.addSVar("WithClause_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$With$Clause_1_0", context));
    varScope.addSVar("WhereClause_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Where$Clause_1_0", context));
    varScope.addSVar("Rule_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Rule_3_0", context));
    varScope.addSVar("RuleNoCond_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Rule$No$Cond_2_0", context));
    varScope.addSVar("RDefT_4_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Def$T_4_0", context));
    varScope.addSVar("RDef_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Def_3_0", context));
    varScope.addSVar("RDefNoArgs_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Def$No$Args_2_0", context));
    varScope.addSVar("Overlay_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Overlay_3_0", context));
    varScope.addSVar("OverlayNoArgs_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Overlay$No$Args_2_0", context));
    varScope.addSVar("SwitchCase_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Switch$Case_2_0", context));
    varScope.addSVar("StrategyCurly_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Strategy$Curly_1_0", context));
    varScope.addSVar("ListVar_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$List$Var_1_0", context));
    varScope.addSVar("ImportWildcard_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Import$Wildcard_1_0", context));
    varScope.addSVar("Import_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Import_1_0", context));
    varScope.addSVar("Overlays_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Overlays_1_0", context));
    varScope.addSVar("Rules_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Rules_1_0", context));
    varScope.addSVar("Signature_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Signature_1_0", context));
    varScope.addSVar("Strategies_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Strategies_1_0", context));
    varScope.addSVar("Imports_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Imports_1_0", context));
    varScope.addSVar("Specification_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Specification_1_0", context));
    varScope.addSVar("Module_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Module_2_0", context));
    varScope.addSVar("ParenStrat_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Paren$Strat_1_0", context));
    varScope.addSVar("DefaultVarDec_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Default$Var$Dec_1_0", context));
    varScope.addSVar("VarDec_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Var$Dec_2_0", context));
    varScope.addSVar("SDef_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$S$Def_3_0", context));
    varScope.addSVar("SDefNoArgs_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$S$Def$No$Args_2_0", context));
    varScope.addSVar("ExtSDef_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Ext$S$Def_3_0", context));
    varScope.addSVar("ExtSDefInl_4_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Ext$S$Def$Inl_4_0", context));
    varScope.addSVar("SDefT_4_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$S$Def$T_4_0", context));
    varScope.addSVar("DynRuleIntersectUnion_4_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Intersect$Union_4_0", context));
    varScope.addSVar("DynRuleUnion_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Union_3_0", context));
    varScope.addSVar("DynRuleIntersect_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Intersect_3_0", context));
    varScope.addSVar("DynRuleIntersectUnionFix_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Intersect$Union$Fix_3_0", context));
    varScope.addSVar("DynRuleUnionFix_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Union$Fix_2_0", context));
    varScope.addSVar("DynRuleIntersectFix_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Intersect$Fix_2_0", context));
    varScope.addSVar("GenDynRules_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Gen$Dyn$Rules_1_0", context));
    varScope.addSVar("DynRuleScope_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Dyn$Rule$Scope_2_0", context));
    varScope.addSVar("Assign_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Assign_2_0", context));
    varScope.addSVar("AM_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$A$M_2_0", context));
    varScope.addSVar("SwitchChoice_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Switch$Choice_3_0", context));
    varScope.addSVar("SwitchChoiceNoOtherwise_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Switch$Choice$No$Otherwise_2_0", context));
    varScope.addSVar("IfThen_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$If$Then_2_0", context));
    varScope.addSVar("CondChoice_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Cond$Choice_3_0", context));
    varScope.addSVar("RChoice_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$R$Choice_2_0", context));
    varScope.addSVar("Choice_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Choice_2_0", context));
    varScope.addSVar("SRule_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$S$Rule_1_0", context));
    varScope.addSVar("LRule_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$L$Rule_1_0", context));
    varScope.addSVar("CallNoArgs_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Call$No$Args_1_0", context));
    varScope.addSVar("ExplodeCong_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Explode$Cong_2_0", context));
    varScope.addSVar("ListCong_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$List$Cong_2_0", context));
    varScope.addSVar("ListCongNoTail_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$List$Cong$No$Tail_1_0", context));
    varScope.addSVar("TupleCong_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Tuple$Cong_2_0", context));
    varScope.addSVar("EmptyTupleCong_0_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Empty$Tuple$Cong_0_0", context));
    varScope.addSVar("AnnoCong_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Anno$Cong_2_0", context));
    varScope.addSVar("CongQ_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Cong$Q_2_0", context));
    varScope.addSVar("CharCong_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Char$Cong_1_0", context));
    varScope.addSVar("RealCong_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Real$Cong_1_0", context));
    varScope.addSVar("IntCong_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Int$Cong_1_0", context));
    varScope.addSVar("StrCong_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Str$Cong_1_0", context));
    varScope.addSVar("Prim_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Prim_2_0", context));
    varScope.addSVar("PrimNoArgs_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Prim$No$Args_1_0", context));
    varScope.addSVar("Test_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Test_1_0", context));
    varScope.addSVar("With_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$With_1_0", context));
    varScope.addSVar("Where_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Where_1_0", context));
    varScope.addSVar("Not_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Not_1_0", context));
    varScope.addSVar("Rec_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Rec_2_0", context));
    varScope.addSVar("LChoice_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$L$Choice_2_0", context));
    varScope.addSVar("BA_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$B$A_2_0", context));
    varScope.addSVar("ScopeDefault_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Scope$Default_1_0", context));
    varScope.addSVar("Call_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Call_2_0", context));
    varScope.addSVar("ImportTerm_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Import$Term_1_0", context));
    varScope.addSVar("All_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$All_1_0", context));
    varScope.addSVar("One_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$One_1_0", context));
    varScope.addSVar("PrimT_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Prim$T_3_0", context));
    varScope.addSVar("GuardedLChoice_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Guarded$L$Choice_3_0", context));
    varScope.addSVar("Seq_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Seq_2_0", context));
    varScope.addSVar("Scope_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Scope_2_0", context));
    varScope.addSVar("Build_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Build_1_0", context));
    varScope.addSVar("Match_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Match_1_0", context));
    varScope.addSVar("Id_0_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Id_0_0", context));
    varScope.addSVar("Fail_0_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Fail_0_0", context));
    varScope.addSVar("CallDynamic_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Call$Dynamic_3_0", context));
    varScope.addSVar("CallT_3_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Call$T_3_0", context));
    varScope.addSVar("Let_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Let_2_0", context));
    varScope.addSVar("SVar_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$S$Var_1_0", context));
    varScope.addSVar("FunType_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Fun$Type_2_0", context));
    varScope.addSVar("ConstType_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Const$Type_1_0", context));
    varScope.addSVar("ExtOpDeclInj_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Ext$Op$Decl$Inj_1_0", context));
    varScope.addSVar("ExtOpDeclQ_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Ext$Op$Decl$Q_2_0", context));
    varScope.addSVar("ExtOpDecl_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Ext$Op$Decl_2_0", context));
    varScope.addSVar("OpDeclInj_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Op$Decl$Inj_1_0", context));
    varScope.addSVar("OpDeclQ_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Op$Decl$Q_2_0", context));
    varScope.addSVar("OpDecl_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Op$Decl_2_0", context));
    varScope.addSVar("SortTuple_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort$Tuple_1_0", context));
    varScope.addSVar("SortListTl_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort$List$Tl_2_0", context));
    varScope.addSVar("SortList_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort$List_1_0", context));
    varScope.addSVar("Sort_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort_2_0", context));
    varScope.addSVar("SortNoArgs_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort$No$Args_1_0", context));
    varScope.addSVar("SortVar_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sort$Var_1_0", context));
    varScope.addSVar("Constructors_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Constructors_1_0", context));
    varScope.addSVar("Sorts_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Sorts_1_0", context));
    varScope.addSVar("Wld_0_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Wld_0_0", context));
    varScope.addSVar("RootApp_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Root$App_1_0", context));
    varScope.addSVar("App_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$App_2_0", context));
    varScope.addSVar("NoAnnoList_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$No$Anno$List_1_0", context));
    varScope.addSVar("AnnoList_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Anno$List_2_0", context));
    varScope.addSVar("BuildDefault_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Build$Default_1_0", context));
    varScope.addSVar("As_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$As_2_0", context));
    varScope.addSVar("ListTail_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$List$Tail_2_0", context));
    varScope.addSVar("List_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$List_1_0", context));
    varScope.addSVar("Tuple_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Tuple_1_0", context));
    varScope.addSVar("Char_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Char_1_0", context));
    varScope.addSVar("BuildDefaultPT_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Build$Default$P$T_1_0", context));
    varScope.addSVar("Explode_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Explode_2_0", context));
    varScope.addSVar("OpQ_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Op$Q_2_0", context));
    varScope.addSVar("Op_2_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Op_2_0", context));
    varScope.addSVar("Str_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Str_1_0", context));
    varScope.addSVar("Real_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Real_1_0", context));
    varScope.addSVar("Int_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Int_1_0", context));
    varScope.addSVar("Var_1_0", new InteropSDefT(classLoader, "org.sugarj.driver.transformations.renaming.$Var_1_0", context));
  }
}