# Generated from JurjenLang.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JurjenLangParser import JurjenLangParser
else:
    from JurjenLangParser import JurjenLangParser

# This class defines a complete generic visitor for a parse tree produced by JurjenLangParser.

class JurjenLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JurjenLangParser#startRule.
    def visitStartRule(self, ctx:JurjenLangParser.StartRuleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#globalscope.
    def visitGlobalscope(self, ctx:JurjenLangParser.GlobalscopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func.
    def visitFunc(self, ctx:JurjenLangParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_def.
    def visitFunc_def(self, ctx:JurjenLangParser.Func_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_return.
    def visitFunc_return(self, ctx:JurjenLangParser.Func_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_call.
    def visitFunc_call(self, ctx:JurjenLangParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_params.
    def visitFunc_params(self, ctx:JurjenLangParser.Func_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_call_params_single.
    def visitFunc_call_params_single(self, ctx:JurjenLangParser.Func_call_params_singleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#func_call_params_multiple.
    def visitFunc_call_params_multiple(self, ctx:JurjenLangParser.Func_call_params_multipleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#scope.
    def visitScope(self, ctx:JurjenLangParser.ScopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#stats.
    def visitStats(self, ctx:JurjenLangParser.StatsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#stat.
    def visitStat(self, ctx:JurjenLangParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#break_stat.
    def visitBreak_stat(self, ctx:JurjenLangParser.Break_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#debugtools.
    def visitDebugtools(self, ctx:JurjenLangParser.DebugtoolsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#printscopestat.
    def visitPrintscopestat(self, ctx:JurjenLangParser.PrintscopestatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#printstat.
    def visitPrintstat(self, ctx:JurjenLangParser.PrintstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#retstat.
    def visitRetstat(self, ctx:JurjenLangParser.RetstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#whileloop.
    def visitWhileloop(self, ctx:JurjenLangParser.WhileloopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#repeatloop.
    def visitRepeatloop(self, ctx:JurjenLangParser.RepeatloopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#ifchain.
    def visitIfchain(self, ctx:JurjenLangParser.IfchainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#ifstat.
    def visitIfstat(self, ctx:JurjenLangParser.IfstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#elifstat_chain.
    def visitElifstat_chain(self, ctx:JurjenLangParser.Elifstat_chainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#elifstat.
    def visitElifstat(self, ctx:JurjenLangParser.ElifstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#maybe_elsestat.
    def visitMaybe_elsestat(self, ctx:JurjenLangParser.Maybe_elsestatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#elsestat.
    def visitElsestat(self, ctx:JurjenLangParser.ElsestatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assertion.
    def visitAssertion(self, ctx:JurjenLangParser.AssertionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignment_assign_tomatrix.
    def visitAssignment_assign_tomatrix(self, ctx:JurjenLangParser.Assignment_assign_tomatrixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignment_assign.
    def visitAssignment_assign(self, ctx:JurjenLangParser.Assignment_assignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignment_increment.
    def visitAssignment_increment(self, ctx:JurjenLangParser.Assignment_incrementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignable_expression.
    def visitAssignable_expression(self, ctx:JurjenLangParser.Assignable_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignable_bool_expression.
    def visitAssignable_bool_expression(self, ctx:JurjenLangParser.Assignable_bool_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#assignable_matrix.
    def visitAssignable_matrix(self, ctx:JurjenLangParser.Assignable_matrixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#matrix_assignment.
    def visitMatrix_assignment(self, ctx:JurjenLangParser.Matrix_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_any_value.
    def visitE_any_value(self, ctx:JurjenLangParser.E_any_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_subtraction.
    def visitE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_matrix_trans.
    def visitE_matrix_trans(self, ctx:JurjenLangParser.E_matrix_transContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_matrix_inv.
    def visitE_matrix_inv(self, ctx:JurjenLangParser.E_matrix_invContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_exponent.
    def visitE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_multiply.
    def visitE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_matrix.
    def visitE_matrix(self, ctx:JurjenLangParser.E_matrixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_addition.
    def visitE_addition(self, ctx:JurjenLangParser.E_additionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_variable.
    def visitE_variable(self, ctx:JurjenLangParser.E_variableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_factorial.
    def visitE_factorial(self, ctx:JurjenLangParser.E_factorialContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_parentheses.
    def visitE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_negation.
    def visitE_negation(self, ctx:JurjenLangParser.E_negationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_func.
    def visitE_func(self, ctx:JurjenLangParser.E_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#e_division.
    def visitE_division(self, ctx:JurjenLangParser.E_divisionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_not.
    def visitBool_e_not(self, ctx:JurjenLangParser.Bool_e_notContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_parentheses.
    def visitBool_parentheses(self, ctx:JurjenLangParser.Bool_parenthesesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_variable.
    def visitBool_e_variable(self, ctx:JurjenLangParser.Bool_e_variableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_or.
    def visitBool_e_or(self, ctx:JurjenLangParser.Bool_e_orContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_boolean.
    def visitBool_e_boolean(self, ctx:JurjenLangParser.Bool_e_booleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_and.
    def visitBool_e_and(self, ctx:JurjenLangParser.Bool_e_andContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_expressions.
    def visitBool_e_expressions(self, ctx:JurjenLangParser.Bool_e_expressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_e_expressions_bools.
    def visitBool_e_expressions_bools(self, ctx:JurjenLangParser.Bool_e_expressions_boolsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#boolean_true.
    def visitBoolean_true(self, ctx:JurjenLangParser.Boolean_trueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#boolean_false.
    def visitBoolean_false(self, ctx:JurjenLangParser.Boolean_falseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#comparison.
    def visitComparison(self, ctx:JurjenLangParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#bool_comparison.
    def visitBool_comparison(self, ctx:JurjenLangParser.Bool_comparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#variable.
    def visitVariable(self, ctx:JurjenLangParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#float_by_dot_and_ident.
    def visitFloat_by_dot_and_ident(self, ctx:JurjenLangParser.Float_by_dot_and_identContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#float_by_dot.
    def visitFloat_by_dot(self, ctx:JurjenLangParser.Float_by_dotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#float_by_ident.
    def visitFloat_by_ident(self, ctx:JurjenLangParser.Float_by_identContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#float_no_prior_by_dot.
    def visitFloat_no_prior_by_dot(self, ctx:JurjenLangParser.Float_no_prior_by_dotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#float_no_prior_by_dot_and_ident.
    def visitFloat_no_prior_by_dot_and_ident(self, ctx:JurjenLangParser.Float_no_prior_by_dot_and_identContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#integer.
    def visitInteger(self, ctx:JurjenLangParser.IntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#string.
    def visitString(self, ctx:JurjenLangParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JurjenLangParser#any_value.
    def visitAny_value(self, ctx:JurjenLangParser.Any_valueContext):
        return self.visitChildren(ctx)



del JurjenLangParser