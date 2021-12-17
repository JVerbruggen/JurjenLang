// Generated from JurjenLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JurjenLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JurjenLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(JurjenLangParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#globalscope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalscope(JurjenLangParser.GlobalscopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(JurjenLangParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(JurjenLangParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(JurjenLangParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(JurjenLangParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_params(JurjenLangParser.Func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call_params_single}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_params_single(JurjenLangParser.Func_call_params_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_call_params_multiple}
	 * labeled alternative in {@link JurjenLangParser#func_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_params_multiple(JurjenLangParser.Func_call_params_multipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(JurjenLangParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(JurjenLangParser.StatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(JurjenLangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#debugtools}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebugtools(JurjenLangParser.DebugtoolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#printscopestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintscopestat(JurjenLangParser.PrintscopestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#printstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstat(JurjenLangParser.PrintstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(JurjenLangParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(JurjenLangParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#ifchain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfchain(JurjenLangParser.IfchainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(JurjenLangParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#elifstat_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstat_chain(JurjenLangParser.Elifstat_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#elifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstat(JurjenLangParser.ElifstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#maybe_elsestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_elsestat(JurjenLangParser.Maybe_elsestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#elsestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestat(JurjenLangParser.ElsestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(JurjenLangParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JurjenLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignable_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable_expression(JurjenLangParser.Assignable_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignable_bool_expression}
	 * labeled alternative in {@link JurjenLangParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable_bool_expression(JurjenLangParser.Assignable_bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_any_value}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_any_value(JurjenLangParser.E_any_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_subtraction}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_subtraction(JurjenLangParser.E_subtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_addition}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_addition(JurjenLangParser.E_additionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_variable}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_variable(JurjenLangParser.E_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_factorial}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_factorial(JurjenLangParser.E_factorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_exponent}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_exponent(JurjenLangParser.E_exponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_parentheses}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_parentheses(JurjenLangParser.E_parenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_multiply}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_multiply(JurjenLangParser.E_multiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_negation}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_negation(JurjenLangParser.E_negationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_func}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_func(JurjenLangParser.E_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e_division}
	 * labeled alternative in {@link JurjenLangParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_division(JurjenLangParser.E_divisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_not}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_not(JurjenLangParser.Bool_e_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_parentheses}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_parentheses(JurjenLangParser.Bool_parenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_variable}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_variable(JurjenLangParser.Bool_e_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_or}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_or(JurjenLangParser.Bool_e_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_boolean}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_boolean(JurjenLangParser.Bool_e_booleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_and}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_and(JurjenLangParser.Bool_e_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_expressions}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_expressions(JurjenLangParser.Bool_e_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_e_expressions_bools}
	 * labeled alternative in {@link JurjenLangParser#bool_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_e_expressions_bools(JurjenLangParser.Bool_e_expressions_boolsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean_true}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_true(JurjenLangParser.Boolean_trueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean_false}
	 * labeled alternative in {@link JurjenLangParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_false(JurjenLangParser.Boolean_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JurjenLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#bool_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_comparison(JurjenLangParser.Bool_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JurjenLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_by_dot_and_ident(JurjenLangParser.Float_by_dot_and_identContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_by_dot(JurjenLangParser.Float_by_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_by_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_by_ident(JurjenLangParser.Float_by_identContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_no_prior_by_dot}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_no_prior_by_dot(JurjenLangParser.Float_no_prior_by_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_no_prior_by_dot_and_ident}
	 * labeled alternative in {@link JurjenLangParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_no_prior_by_dot_and_ident(JurjenLangParser.Float_no_prior_by_dot_and_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(JurjenLangParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JurjenLangParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JurjenLangParser#any_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_value(JurjenLangParser.Any_valueContext ctx);
}