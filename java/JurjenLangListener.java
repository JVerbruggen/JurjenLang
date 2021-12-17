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
	 * Enter a parse tree produced by {@link JurjenLangParser#globalscope}.
	 * @param ctx the parse tree
	 */
	void enterGlobalscope(JurjenLangParser.GlobalscopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#globalscope}.
	 * @param ctx the parse tree
	 */
	void exitGlobalscope(JurjenLangParser.GlobalscopeContext ctx);
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
	 * Enter a parse tree produced by {@link JurjenLangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(JurjenLangParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(JurjenLangParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#func_params}.
	 * @param ctx the parse tree
	 */
	void enterFunc_params(JurjenLangParser.Func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#func_params}.
	 * @param ctx the parse tree
	 */
	void exitFunc_params(JurjenLangParser.Func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call_params_single}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_params_single(JurjenLangParser.Func_call_params_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call_params_single}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_params_single(JurjenLangParser.Func_call_params_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_call_params_multiple}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_params_multiple(JurjenLangParser.Func_call_params_multipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_call_params_multiple}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_params_multiple(JurjenLangParser.Func_call_params_multipleContext ctx);
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
	 * Enter a parse tree produced by {@link JurjenLangParser#debugtools}.
	 * @param ctx the parse tree
	 */
	void enterDebugtools(JurjenLangParser.DebugtoolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#debugtools}.
	 * @param ctx the parse tree
	 */
	void exitDebugtools(JurjenLangParser.DebugtoolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#printscopestat}.
	 * @param ctx the parse tree
	 */
	void enterPrintscopestat(JurjenLangParser.PrintscopestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#printscopestat}.
	 * @param ctx the parse tree
	 */
	void exitPrintscopestat(JurjenLangParser.PrintscopestatContext ctx);
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
	 * Enter a parse tree produced by {@link JurjenLangParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(JurjenLangParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(JurjenLangParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#ifchain}.
	 * @param ctx the parse tree
	 */
	void enterIfchain(JurjenLangParser.IfchainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#ifchain}.
	 * @param ctx the parse tree
	 */
	void exitIfchain(JurjenLangParser.IfchainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(JurjenLangParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(JurjenLangParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#elifstat_chain}.
	 * @param ctx the parse tree
	 */
	void enterElifstat_chain(JurjenLangParser.Elifstat_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#elifstat_chain}.
	 * @param ctx the parse tree
	 */
	void exitElifstat_chain(JurjenLangParser.Elifstat_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#elifstat}.
	 * @param ctx the parse tree
	 */
	void enterElifstat(JurjenLangParser.ElifstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#elifstat}.
	 * @param ctx the parse tree
	 */
	void exitElifstat(JurjenLangParser.ElifstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#maybe_elsestat}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_elsestat(JurjenLangParser.Maybe_elsestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#maybe_elsestat}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_elsestat(JurjenLangParser.Maybe_elsestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void enterElsestat(JurjenLangParser.ElsestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void exitElsestat(JurjenLangParser.ElsestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(JurjenLangParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(JurjenLangParser.AssertionContext ctx);
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
	 * Enter a parse tree produced by the {@code e_any_value}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_any_value(JurjenLangParser.E_any_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_any_value}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_any_value(JurjenLangParser.E_any_valueContext ctx);
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
	 * Enter a parse tree produced by the {@code e_negation}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_negation(JurjenLangParser.E_negationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_negation}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_negation(JurjenLangParser.E_negationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e_func}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE_func(JurjenLangParser.E_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e_func}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE_func(JurjenLangParser.E_funcContext ctx);
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
	 * Enter a parse tree produced by the {@code bool_parentheses}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_parentheses(JurjenLangParser.Bool_parenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_parentheses}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_parentheses(JurjenLangParser.Bool_parenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_e_variable}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_variable(JurjenLangParser.Bool_e_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_variable}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_variable(JurjenLangParser.Bool_e_variableContext ctx);
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
	 * Enter a parse tree produced by the {@code bool_e_expressions_bools}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void enterBool_e_expressions_bools(JurjenLangParser.Bool_e_expressions_boolsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_e_expressions_bools}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 */
	void exitBool_e_expressions_bools(JurjenLangParser.Bool_e_expressions_boolsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_true}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_true(JurjenLangParser.Boolean_trueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_true}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_true(JurjenLangParser.Boolean_trueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_false}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_false(JurjenLangParser.Boolean_falseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_false}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_false(JurjenLangParser.Boolean_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JurjenLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JurjenLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#bool_comparison}.
	 * @param ctx the parse tree
	 */
	void enterBool_comparison(JurjenLangParser.Bool_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#bool_comparison}.
	 * @param ctx the parse tree
	 */
	void exitBool_comparison(JurjenLangParser.Bool_comparisonContext ctx);
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
	 * Enter a parse tree produced by the {@code float_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_by_dot_and_ident(JurjenLangParser.Float_by_dot_and_identContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_by_dot_and_ident(JurjenLangParser.Float_by_dot_and_identContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_by_dot(JurjenLangParser.Float_by_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_by_dot(JurjenLangParser.Float_by_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_by_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_by_ident(JurjenLangParser.Float_by_identContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_by_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_by_ident(JurjenLangParser.Float_by_identContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_no_prior_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_no_prior_by_dot(JurjenLangParser.Float_no_prior_by_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_no_prior_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_no_prior_by_dot(JurjenLangParser.Float_no_prior_by_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_no_prior_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_no_prior_by_dot_and_ident(JurjenLangParser.Float_no_prior_by_dot_and_identContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_no_prior_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_no_prior_by_dot_and_ident(JurjenLangParser.Float_no_prior_by_dot_and_identContext ctx);
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
	 * Enter a parse tree produced by {@link JurjenLangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JurjenLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JurjenLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JurjenLangParser#any_value}.
	 * @param ctx the parse tree
	 */
	void enterAny_value(JurjenLangParser.Any_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JurjenLangParser#any_value}.
	 * @param ctx the parse tree
	 */
	void exitAny_value(JurjenLangParser.Any_valueContext ctx);
}