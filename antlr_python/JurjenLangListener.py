# Generated from JurjenLang.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JurjenLangParser import JurjenLangParser
else:
    from JurjenLangParser import JurjenLangParser

# This class defines a complete listener for a parse tree produced by JurjenLangParser.
class JurjenLangListener(ParseTreeListener):

    # Enter a parse tree produced by JurjenLangParser#startRule.
    def enterStartRule(self, ctx:JurjenLangParser.StartRuleContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#startRule.
    def exitStartRule(self, ctx:JurjenLangParser.StartRuleContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#globalscope.
    def enterGlobalscope(self, ctx:JurjenLangParser.GlobalscopeContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#globalscope.
    def exitGlobalscope(self, ctx:JurjenLangParser.GlobalscopeContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func.
    def enterFunc(self, ctx:JurjenLangParser.FuncContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func.
    def exitFunc(self, ctx:JurjenLangParser.FuncContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_def.
    def enterFunc_def(self, ctx:JurjenLangParser.Func_defContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_def.
    def exitFunc_def(self, ctx:JurjenLangParser.Func_defContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_return.
    def enterFunc_return(self, ctx:JurjenLangParser.Func_returnContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_return.
    def exitFunc_return(self, ctx:JurjenLangParser.Func_returnContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_call.
    def enterFunc_call(self, ctx:JurjenLangParser.Func_callContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_call.
    def exitFunc_call(self, ctx:JurjenLangParser.Func_callContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_params.
    def enterFunc_params(self, ctx:JurjenLangParser.Func_paramsContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_params.
    def exitFunc_params(self, ctx:JurjenLangParser.Func_paramsContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_call_params_single.
    def enterFunc_call_params_single(self, ctx:JurjenLangParser.Func_call_params_singleContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_call_params_single.
    def exitFunc_call_params_single(self, ctx:JurjenLangParser.Func_call_params_singleContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#func_call_params_multiple.
    def enterFunc_call_params_multiple(self, ctx:JurjenLangParser.Func_call_params_multipleContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#func_call_params_multiple.
    def exitFunc_call_params_multiple(self, ctx:JurjenLangParser.Func_call_params_multipleContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#scope.
    def enterScope(self, ctx:JurjenLangParser.ScopeContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#scope.
    def exitScope(self, ctx:JurjenLangParser.ScopeContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#stats.
    def enterStats(self, ctx:JurjenLangParser.StatsContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#stats.
    def exitStats(self, ctx:JurjenLangParser.StatsContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#stat.
    def enterStat(self, ctx:JurjenLangParser.StatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#stat.
    def exitStat(self, ctx:JurjenLangParser.StatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#break_stat.
    def enterBreak_stat(self, ctx:JurjenLangParser.Break_statContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#break_stat.
    def exitBreak_stat(self, ctx:JurjenLangParser.Break_statContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#debugtools.
    def enterDebugtools(self, ctx:JurjenLangParser.DebugtoolsContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#debugtools.
    def exitDebugtools(self, ctx:JurjenLangParser.DebugtoolsContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#printscopestat.
    def enterPrintscopestat(self, ctx:JurjenLangParser.PrintscopestatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#printscopestat.
    def exitPrintscopestat(self, ctx:JurjenLangParser.PrintscopestatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#printstat.
    def enterPrintstat(self, ctx:JurjenLangParser.PrintstatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#printstat.
    def exitPrintstat(self, ctx:JurjenLangParser.PrintstatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#retstat.
    def enterRetstat(self, ctx:JurjenLangParser.RetstatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#retstat.
    def exitRetstat(self, ctx:JurjenLangParser.RetstatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#whileloop.
    def enterWhileloop(self, ctx:JurjenLangParser.WhileloopContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#whileloop.
    def exitWhileloop(self, ctx:JurjenLangParser.WhileloopContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#repeatloop.
    def enterRepeatloop(self, ctx:JurjenLangParser.RepeatloopContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#repeatloop.
    def exitRepeatloop(self, ctx:JurjenLangParser.RepeatloopContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#ifchain.
    def enterIfchain(self, ctx:JurjenLangParser.IfchainContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#ifchain.
    def exitIfchain(self, ctx:JurjenLangParser.IfchainContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#ifstat.
    def enterIfstat(self, ctx:JurjenLangParser.IfstatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#ifstat.
    def exitIfstat(self, ctx:JurjenLangParser.IfstatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#elifstat_chain.
    def enterElifstat_chain(self, ctx:JurjenLangParser.Elifstat_chainContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#elifstat_chain.
    def exitElifstat_chain(self, ctx:JurjenLangParser.Elifstat_chainContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#elifstat.
    def enterElifstat(self, ctx:JurjenLangParser.ElifstatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#elifstat.
    def exitElifstat(self, ctx:JurjenLangParser.ElifstatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#maybe_elsestat.
    def enterMaybe_elsestat(self, ctx:JurjenLangParser.Maybe_elsestatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#maybe_elsestat.
    def exitMaybe_elsestat(self, ctx:JurjenLangParser.Maybe_elsestatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#elsestat.
    def enterElsestat(self, ctx:JurjenLangParser.ElsestatContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#elsestat.
    def exitElsestat(self, ctx:JurjenLangParser.ElsestatContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assertion.
    def enterAssertion(self, ctx:JurjenLangParser.AssertionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assertion.
    def exitAssertion(self, ctx:JurjenLangParser.AssertionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignment_assign_tomatrix.
    def enterAssignment_assign_tomatrix(self, ctx:JurjenLangParser.Assignment_assign_tomatrixContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignment_assign_tomatrix.
    def exitAssignment_assign_tomatrix(self, ctx:JurjenLangParser.Assignment_assign_tomatrixContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignment_assign.
    def enterAssignment_assign(self, ctx:JurjenLangParser.Assignment_assignContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignment_assign.
    def exitAssignment_assign(self, ctx:JurjenLangParser.Assignment_assignContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignment_increment.
    def enterAssignment_increment(self, ctx:JurjenLangParser.Assignment_incrementContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignment_increment.
    def exitAssignment_increment(self, ctx:JurjenLangParser.Assignment_incrementContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignable_expression.
    def enterAssignable_expression(self, ctx:JurjenLangParser.Assignable_expressionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignable_expression.
    def exitAssignable_expression(self, ctx:JurjenLangParser.Assignable_expressionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignable_bool_expression.
    def enterAssignable_bool_expression(self, ctx:JurjenLangParser.Assignable_bool_expressionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignable_bool_expression.
    def exitAssignable_bool_expression(self, ctx:JurjenLangParser.Assignable_bool_expressionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#assignable_matrix.
    def enterAssignable_matrix(self, ctx:JurjenLangParser.Assignable_matrixContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignable_matrix.
    def exitAssignable_matrix(self, ctx:JurjenLangParser.Assignable_matrixContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#matrix_assignment.
    def enterMatrix_assignment(self, ctx:JurjenLangParser.Matrix_assignmentContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#matrix_assignment.
    def exitMatrix_assignment(self, ctx:JurjenLangParser.Matrix_assignmentContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_any_value.
    def enterE_any_value(self, ctx:JurjenLangParser.E_any_valueContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_any_value.
    def exitE_any_value(self, ctx:JurjenLangParser.E_any_valueContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_subtraction.
    def enterE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_subtraction.
    def exitE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_matrix_trans.
    def enterE_matrix_trans(self, ctx:JurjenLangParser.E_matrix_transContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_matrix_trans.
    def exitE_matrix_trans(self, ctx:JurjenLangParser.E_matrix_transContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_matrix_inv.
    def enterE_matrix_inv(self, ctx:JurjenLangParser.E_matrix_invContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_matrix_inv.
    def exitE_matrix_inv(self, ctx:JurjenLangParser.E_matrix_invContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_exponent.
    def enterE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_exponent.
    def exitE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_multiply.
    def enterE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_multiply.
    def exitE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_matrix.
    def enterE_matrix(self, ctx:JurjenLangParser.E_matrixContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_matrix.
    def exitE_matrix(self, ctx:JurjenLangParser.E_matrixContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_addition.
    def enterE_addition(self, ctx:JurjenLangParser.E_additionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_addition.
    def exitE_addition(self, ctx:JurjenLangParser.E_additionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_variable.
    def enterE_variable(self, ctx:JurjenLangParser.E_variableContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_variable.
    def exitE_variable(self, ctx:JurjenLangParser.E_variableContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_factorial.
    def enterE_factorial(self, ctx:JurjenLangParser.E_factorialContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_factorial.
    def exitE_factorial(self, ctx:JurjenLangParser.E_factorialContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_parentheses.
    def enterE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_parentheses.
    def exitE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_negation.
    def enterE_negation(self, ctx:JurjenLangParser.E_negationContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_negation.
    def exitE_negation(self, ctx:JurjenLangParser.E_negationContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_func.
    def enterE_func(self, ctx:JurjenLangParser.E_funcContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_func.
    def exitE_func(self, ctx:JurjenLangParser.E_funcContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_division.
    def enterE_division(self, ctx:JurjenLangParser.E_divisionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_division.
    def exitE_division(self, ctx:JurjenLangParser.E_divisionContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_not.
    def enterBool_e_not(self, ctx:JurjenLangParser.Bool_e_notContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_not.
    def exitBool_e_not(self, ctx:JurjenLangParser.Bool_e_notContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_parentheses.
    def enterBool_parentheses(self, ctx:JurjenLangParser.Bool_parenthesesContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_parentheses.
    def exitBool_parentheses(self, ctx:JurjenLangParser.Bool_parenthesesContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_variable.
    def enterBool_e_variable(self, ctx:JurjenLangParser.Bool_e_variableContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_variable.
    def exitBool_e_variable(self, ctx:JurjenLangParser.Bool_e_variableContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_or.
    def enterBool_e_or(self, ctx:JurjenLangParser.Bool_e_orContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_or.
    def exitBool_e_or(self, ctx:JurjenLangParser.Bool_e_orContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_boolean.
    def enterBool_e_boolean(self, ctx:JurjenLangParser.Bool_e_booleanContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_boolean.
    def exitBool_e_boolean(self, ctx:JurjenLangParser.Bool_e_booleanContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_and.
    def enterBool_e_and(self, ctx:JurjenLangParser.Bool_e_andContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_and.
    def exitBool_e_and(self, ctx:JurjenLangParser.Bool_e_andContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_expressions.
    def enterBool_e_expressions(self, ctx:JurjenLangParser.Bool_e_expressionsContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_expressions.
    def exitBool_e_expressions(self, ctx:JurjenLangParser.Bool_e_expressionsContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_e_expressions_bools.
    def enterBool_e_expressions_bools(self, ctx:JurjenLangParser.Bool_e_expressions_boolsContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_e_expressions_bools.
    def exitBool_e_expressions_bools(self, ctx:JurjenLangParser.Bool_e_expressions_boolsContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#boolean_true.
    def enterBoolean_true(self, ctx:JurjenLangParser.Boolean_trueContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#boolean_true.
    def exitBoolean_true(self, ctx:JurjenLangParser.Boolean_trueContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#boolean_false.
    def enterBoolean_false(self, ctx:JurjenLangParser.Boolean_falseContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#boolean_false.
    def exitBoolean_false(self, ctx:JurjenLangParser.Boolean_falseContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#comparison.
    def enterComparison(self, ctx:JurjenLangParser.ComparisonContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#comparison.
    def exitComparison(self, ctx:JurjenLangParser.ComparisonContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#bool_comparison.
    def enterBool_comparison(self, ctx:JurjenLangParser.Bool_comparisonContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#bool_comparison.
    def exitBool_comparison(self, ctx:JurjenLangParser.Bool_comparisonContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#variable.
    def enterVariable(self, ctx:JurjenLangParser.VariableContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#variable.
    def exitVariable(self, ctx:JurjenLangParser.VariableContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#float_by_dot_and_ident.
    def enterFloat_by_dot_and_ident(self, ctx:JurjenLangParser.Float_by_dot_and_identContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#float_by_dot_and_ident.
    def exitFloat_by_dot_and_ident(self, ctx:JurjenLangParser.Float_by_dot_and_identContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#float_by_dot.
    def enterFloat_by_dot(self, ctx:JurjenLangParser.Float_by_dotContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#float_by_dot.
    def exitFloat_by_dot(self, ctx:JurjenLangParser.Float_by_dotContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#float_by_ident.
    def enterFloat_by_ident(self, ctx:JurjenLangParser.Float_by_identContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#float_by_ident.
    def exitFloat_by_ident(self, ctx:JurjenLangParser.Float_by_identContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#float_no_prior_by_dot.
    def enterFloat_no_prior_by_dot(self, ctx:JurjenLangParser.Float_no_prior_by_dotContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#float_no_prior_by_dot.
    def exitFloat_no_prior_by_dot(self, ctx:JurjenLangParser.Float_no_prior_by_dotContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#float_no_prior_by_dot_and_ident.
    def enterFloat_no_prior_by_dot_and_ident(self, ctx:JurjenLangParser.Float_no_prior_by_dot_and_identContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#float_no_prior_by_dot_and_ident.
    def exitFloat_no_prior_by_dot_and_ident(self, ctx:JurjenLangParser.Float_no_prior_by_dot_and_identContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#integer.
    def enterInteger(self, ctx:JurjenLangParser.IntegerContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#integer.
    def exitInteger(self, ctx:JurjenLangParser.IntegerContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#string.
    def enterString(self, ctx:JurjenLangParser.StringContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#string.
    def exitString(self, ctx:JurjenLangParser.StringContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#any_value.
    def enterAny_value(self, ctx:JurjenLangParser.Any_valueContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#any_value.
    def exitAny_value(self, ctx:JurjenLangParser.Any_valueContext):
        pass



del JurjenLangParser