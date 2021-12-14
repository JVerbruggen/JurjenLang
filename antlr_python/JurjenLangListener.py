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


    # Enter a parse tree produced by JurjenLangParser#assignment.
    def enterAssignment(self, ctx:JurjenLangParser.AssignmentContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#assignment.
    def exitAssignment(self, ctx:JurjenLangParser.AssignmentContext):
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


    # Enter a parse tree produced by JurjenLangParser#e_integer.
    def enterE_integer(self, ctx:JurjenLangParser.E_integerContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_integer.
    def exitE_integer(self, ctx:JurjenLangParser.E_integerContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_subtraction.
    def enterE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_subtraction.
    def exitE_subtraction(self, ctx:JurjenLangParser.E_subtractionContext):
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


    # Enter a parse tree produced by JurjenLangParser#e_exponent.
    def enterE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_exponent.
    def exitE_exponent(self, ctx:JurjenLangParser.E_exponentContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_parentheses.
    def enterE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_parentheses.
    def exitE_parentheses(self, ctx:JurjenLangParser.E_parenthesesContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_multiply.
    def enterE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_multiply.
    def exitE_multiply(self, ctx:JurjenLangParser.E_multiplyContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#e_negation.
    def enterE_negation(self, ctx:JurjenLangParser.E_negationContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#e_negation.
    def exitE_negation(self, ctx:JurjenLangParser.E_negationContext):
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


    # Enter a parse tree produced by JurjenLangParser#variable.
    def enterVariable(self, ctx:JurjenLangParser.VariableContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#variable.
    def exitVariable(self, ctx:JurjenLangParser.VariableContext):
        pass


    # Enter a parse tree produced by JurjenLangParser#integer.
    def enterInteger(self, ctx:JurjenLangParser.IntegerContext):
        pass

    # Exit a parse tree produced by JurjenLangParser#integer.
    def exitInteger(self, ctx:JurjenLangParser.IntegerContext):
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



del JurjenLangParser