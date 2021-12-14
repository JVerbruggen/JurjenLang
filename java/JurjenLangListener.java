// Generated from JurjenLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JurjenLangParser}.
 */
public interface JurjenLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(JurjenLangParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(JurjenLangParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(JurjenLangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(JurjenLangParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(JurjenLangParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(JurjenLangParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(JurjenLangParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(JurjenLangParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(JurjenLangParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(JurjenLangParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#stats}.
	 * @param ctx the parse tree
	 */
	void enterStats(JurjenLangParser.StatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#stats}.
	 * @param ctx the parse tree
	 */
	void exitStats(JurjenLangParser.StatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(JurjenLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(JurjenLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(JurjenLangParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(JurjenLangParser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(JurjenLangParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(JurjenLangParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JurjenLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JurjenLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignable_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable_expression(JurjenLangParser.Assignable_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignable_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable_expression(JurjenLangParser.Assignable_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignable_bool_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable_bool_expression(JurjenLangParser.Assignable_bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignable_bool_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable_bool_expression(JurjenLangParser.Assignable_bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_integer}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_integer(JurjenLangParser.E_integerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_integer}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_integer(JurjenLangParser.E_integerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_subtraction}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_subtraction(JurjenLangParser.E_subtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_subtraction}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_subtraction(JurjenLangParser.E_subtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_addition}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_addition(JurjenLangParser.E_additionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_addition}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_addition(JurjenLangParser.E_additionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_variable}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_variable(JurjenLangParser.E_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_variable}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_variable(JurjenLangParser.E_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_factorial}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_factorial(JurjenLangParser.E_factorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_factorial}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_factorial(JurjenLangParser.E_factorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_exponent}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_exponent(JurjenLangParser.E_exponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_exponent}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_exponent(JurjenLangParser.E_exponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_parentheses}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_parentheses(JurjenLangParser.E_parenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_parentheses}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_parentheses(JurjenLangParser.E_parenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_multiply}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_multiply(JurjenLangParser.E_multiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_multiply}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_multiply(JurjenLangParser.E_multiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_division}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_division(JurjenLangParser.E_divisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_division}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_division(JurjenLangParser.E_divisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_not}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_not(JurjenLangParser.Bool_e_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_not}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_not(JurjenLangParser.Bool_e_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_or}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_or(JurjenLangParser.Bool_e_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_or}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_or(JurjenLangParser.Bool_e_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_boolean}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_boolean(JurjenLangParser.Bool_e_booleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_boolean}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_boolean(JurjenLangParser.Bool_e_booleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_and}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_and(JurjenLangParser.Bool_e_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_and}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_and(JurjenLangParser.Bool_e_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_expressions}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_expressions(JurjenLangParser.Bool_e_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_expressions}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_expressions(JurjenLangParser.Bool_e_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JurjenLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JurjenLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JurjenLangParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JurjenLangParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_true}
	 * labeled alternative in {@link JurjenLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_true(JurjenLangParser.Boolean_trueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_true}
	 * labeled alternative in {@link JurjenLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_true(JurjenLangParser.Boolean_trueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_false}
	 * labeled alternative in {@link JurjenLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_false(JurjenLangParser.Boolean_falseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_false}
	 * labeled alternative in {@link JurjenLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_false(JurjenLangParser.Boolean_falseContext ctx);
}