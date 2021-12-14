// Generated from JurjenLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JurjenLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNC_KW=1, FUNC_RET=2, PRINT_KW=3, TRUE_KW=4, FALSE_KW=5, AND_KW=6, OR_KW=7, 
		NOT_KW=8, NUMBERS=9, IDENTIFIER=10, OPERATOR_FAC=11, OPERATOR_EXP=12, 
		OPERATOR_MULT=13, OPERATOR_DIV=14, OPERATOR_ADD=15, OPERATOR_SUB=16, ASSIGN=17, 
		EQUALS=18, PAR_OPEN=19, PAR_CLOSE=20, BRACK_OPEN=21, BRACK_CLOSE=22, WS=23;
	public static final int
		RULE_startRule = 0, RULE_func = 1, RULE_func_def = 2, RULE_func_return = 3, 
		RULE_scope = 4, RULE_stats = 5, RULE_stat = 6, RULE_printstat = 7, RULE_retstat = 8, 
		RULE_assignment = 9, RULE_assignable = 10, RULE_e = 11, RULE_bool_e = 12, 
		RULE_variable = 13, RULE_integer = 14, RULE_boolean = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "func", "func_def", "func_return", "scope", "stats", "stat", 
			"printstat", "retstat", "assignment", "assignable", "e", "bool_e", "variable", 
			"integer", "boolean"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'return'", "'print'", "'true'", "'false'", "'and'", 
			"'or'", "'not'", null, null, "'!'", "'^'", "'*'", "'/'", "'+'", "'-'", 
			"'='", "'=='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNC_KW", "FUNC_RET", "PRINT_KW", "TRUE_KW", "FALSE_KW", "AND_KW", 
			"OR_KW", "NOT_KW", "NUMBERS", "IDENTIFIER", "OPERATOR_FAC", "OPERATOR_EXP", 
			"OPERATOR_MULT", "OPERATOR_DIV", "OPERATOR_ADD", "OPERATOR_SUB", "ASSIGN", 
			"EQUALS", "PAR_OPEN", "PAR_CLOSE", "BRACK_OPEN", "BRACK_CLOSE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JurjenLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JurjenLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JurjenLangParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			func();
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			func_def();
			setState(36);
			scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode FUNC_KW() { return getToken(JurjenLangParser.FUNC_KW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JurjenLangParser.IDENTIFIER, 0); }
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_def(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(FUNC_KW);
			setState(39);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_returnContext extends ParserRuleContext {
		public TerminalNode FUNC_RET() { return getToken(JurjenLangParser.FUNC_RET, 0); }
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public Func_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_return(this);
		}
	}

	public final Func_returnContext func_return() throws RecognitionException {
		Func_returnContext _localctx = new Func_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(FUNC_RET);
			setState(42);
			retstat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode BRACK_OPEN() { return getToken(JurjenLangParser.BRACK_OPEN, 0); }
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public TerminalNode BRACK_CLOSE() { return getToken(JurjenLangParser.BRACK_CLOSE, 0); }
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(BRACK_OPEN);
			setState(45);
			stats();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNC_RET) {
				{
				setState(46);
				func_return();
				}
			}

			setState(49);
			match(BRACK_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitStats(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT_KW || _la==IDENTIFIER) {
				{
				{
				setState(51);
				stat();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				assignment();
				}
				break;
			case PRINT_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				printstat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintstatContext extends ParserRuleContext {
		public AssignableContext expr;
		public TerminalNode PRINT_KW() { return getToken(JurjenLangParser.PRINT_KW, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitPrintstat(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PRINT_KW);
			setState(62);
			((PrintstatContext)_localctx).expr = assignable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetstatContext extends ParserRuleContext {
		public AssignableContext expr;
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterRetstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitRetstat(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_retstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((RetstatContext)_localctx).expr = assignable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext name;
		public AssignableContext ass;
		public TerminalNode ASSIGN() { return getToken(JurjenLangParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((AssignmentContext)_localctx).name = variable();
			setState(67);
			match(ASSIGN);
			setState(68);
			((AssignmentContext)_localctx).ass = assignable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
	 
		public AssignableContext() { }
		public void copyFrom(AssignableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assignable_expressionContext extends AssignableContext {
		public EContext expr;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public Assignable_expressionContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignable_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignable_expression(this);
		}
	}
	public static class Assignable_bool_expressionContext extends AssignableContext {
		public Bool_eContext expr;
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public Assignable_bool_expressionContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignable_bool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignable_bool_expression(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignable);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Assignable_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((Assignable_expressionContext)_localctx).expr = e(0);
				}
				break;
			case 2:
				_localctx = new Assignable_bool_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((Assignable_bool_expressionContext)_localctx).expr = bool_e(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class E_integerContext extends EContext {
		public IntegerContext value;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public E_integerContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_integer(this);
		}
	}
	public static class E_subtractionContext extends EContext {
		public EContext left;
		public Token operator;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPERATOR_SUB() { return getToken(JurjenLangParser.OPERATOR_SUB, 0); }
		public E_subtractionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_subtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_subtraction(this);
		}
	}
	public static class E_additionContext extends EContext {
		public EContext left;
		public Token operator;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPERATOR_ADD() { return getToken(JurjenLangParser.OPERATOR_ADD, 0); }
		public E_additionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_addition(this);
		}
	}
	public static class E_variableContext extends EContext {
		public VariableContext name;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public E_variableContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_variable(this);
		}
	}
	public static class E_factorialContext extends EContext {
		public EContext expr;
		public Token operator;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode OPERATOR_FAC() { return getToken(JurjenLangParser.OPERATOR_FAC, 0); }
		public E_factorialContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_factorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_factorial(this);
		}
	}
	public static class E_exponentContext extends EContext {
		public EContext left;
		public Token operator;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPERATOR_EXP() { return getToken(JurjenLangParser.OPERATOR_EXP, 0); }
		public E_exponentContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_exponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_exponent(this);
		}
	}
	public static class E_parenthesesContext extends EContext {
		public EContext expr;
		public TerminalNode PAR_OPEN() { return getToken(JurjenLangParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(JurjenLangParser.PAR_CLOSE, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public E_parenthesesContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_parentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_parentheses(this);
		}
	}
	public static class E_multiplyContext extends EContext {
		public EContext left;
		public Token operator;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPERATOR_MULT() { return getToken(JurjenLangParser.OPERATOR_MULT, 0); }
		public E_multiplyContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_multiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_multiply(this);
		}
	}
	public static class E_divisionContext extends EContext {
		public EContext left;
		public Token operator;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode OPERATOR_DIV() { return getToken(JurjenLangParser.OPERATOR_DIV, 0); }
		public E_divisionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_division(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
				{
				_localctx = new E_parenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(PAR_OPEN);
				setState(76);
				((E_parenthesesContext)_localctx).expr = e(0);
				setState(77);
				match(PAR_CLOSE);
				}
				break;
			case NUMBERS:
				{
				_localctx = new E_integerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				((E_integerContext)_localctx).value = integer();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new E_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((E_variableContext)_localctx).name = variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new E_exponentContext(new EContext(_parentctx, _parentState));
						((E_exponentContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						((E_exponentContext)_localctx).operator = match(OPERATOR_EXP);
						setState(85);
						((E_exponentContext)_localctx).right = e(8);
						}
						break;
					case 2:
						{
						_localctx = new E_multiplyContext(new EContext(_parentctx, _parentState));
						((E_multiplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						((E_multiplyContext)_localctx).operator = match(OPERATOR_MULT);
						setState(88);
						((E_multiplyContext)_localctx).right = e(7);
						}
						break;
					case 3:
						{
						_localctx = new E_divisionContext(new EContext(_parentctx, _parentState));
						((E_divisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						((E_divisionContext)_localctx).operator = match(OPERATOR_DIV);
						setState(91);
						((E_divisionContext)_localctx).right = e(6);
						}
						break;
					case 4:
						{
						_localctx = new E_additionContext(new EContext(_parentctx, _parentState));
						((E_additionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						((E_additionContext)_localctx).operator = match(OPERATOR_ADD);
						setState(94);
						((E_additionContext)_localctx).right = e(5);
						}
						break;
					case 5:
						{
						_localctx = new E_subtractionContext(new EContext(_parentctx, _parentState));
						((E_subtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						((E_subtractionContext)_localctx).operator = match(OPERATOR_SUB);
						setState(97);
						((E_subtractionContext)_localctx).right = e(4);
						}
						break;
					case 6:
						{
						_localctx = new E_factorialContext(new EContext(_parentctx, _parentState));
						((E_factorialContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(98);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(99);
						((E_factorialContext)_localctx).operator = match(OPERATOR_FAC);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_eContext extends ParserRuleContext {
		public Bool_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_e; }
	 
		public Bool_eContext() { }
		public void copyFrom(Bool_eContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bool_e_notContext extends Bool_eContext {
		public Bool_eContext bool_expr;
		public TerminalNode NOT_KW() { return getToken(JurjenLangParser.NOT_KW, 0); }
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public Bool_e_notContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_not(this);
		}
	}
	public static class Bool_e_orContext extends Bool_eContext {
		public Bool_eContext left;
		public Bool_eContext right;
		public TerminalNode OR_KW() { return getToken(JurjenLangParser.OR_KW, 0); }
		public List<Bool_eContext> bool_e() {
			return getRuleContexts(Bool_eContext.class);
		}
		public Bool_eContext bool_e(int i) {
			return getRuleContext(Bool_eContext.class,i);
		}
		public Bool_e_orContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_or(this);
		}
	}
	public static class Bool_e_booleanContext extends Bool_eContext {
		public BooleanContext value;
		public BooleanContext boolean() {
			return getRuleContext(BooleanContext.class,0);
		}
		public Bool_e_booleanContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_boolean(this);
		}
	}
	public static class Bool_e_andContext extends Bool_eContext {
		public Bool_eContext left;
		public Bool_eContext right;
		public TerminalNode AND_KW() { return getToken(JurjenLangParser.AND_KW, 0); }
		public List<Bool_eContext> bool_e() {
			return getRuleContexts(Bool_eContext.class);
		}
		public Bool_eContext bool_e(int i) {
			return getRuleContext(Bool_eContext.class,i);
		}
		public Bool_e_andContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_and(this);
		}
	}
	public static class Bool_e_expressionsContext extends Bool_eContext {
		public EContext left;
		public EContext right;
		public TerminalNode EQUALS() { return getToken(JurjenLangParser.EQUALS, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public Bool_e_expressionsContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_expressions(this);
		}
	}

	public final Bool_eContext bool_e() throws RecognitionException {
		return bool_e(0);
	}

	private Bool_eContext bool_e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_eContext _localctx = new Bool_eContext(_ctx, _parentState);
		Bool_eContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_bool_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_KW:
				{
				_localctx = new Bool_e_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				match(NOT_KW);
				setState(107);
				((Bool_e_notContext)_localctx).bool_expr = bool_e(3);
				}
				break;
			case NUMBERS:
			case IDENTIFIER:
			case PAR_OPEN:
				{
				_localctx = new Bool_e_expressionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((Bool_e_expressionsContext)_localctx).left = e(0);
				setState(109);
				match(EQUALS);
				setState(110);
				((Bool_e_expressionsContext)_localctx).right = e(0);
				}
				break;
			case TRUE_KW:
			case FALSE_KW:
				{
				_localctx = new Bool_e_booleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				((Bool_e_booleanContext)_localctx).value = boolean();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_e_andContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_andContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						match(AND_KW);
						setState(117);
						((Bool_e_andContext)_localctx).right = bool_e(6);
						}
						break;
					case 2:
						{
						_localctx = new Bool_e_orContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_orContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(OR_KW);
						setState(120);
						((Bool_e_orContext)_localctx).right = bool_e(5);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JurjenLangParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(JurjenLangParser.NUMBERS, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NUMBERS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanContext extends ParserRuleContext {
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
	 
		public BooleanContext() { }
		public void copyFrom(BooleanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Boolean_falseContext extends BooleanContext {
		public TerminalNode FALSE_KW() { return getToken(JurjenLangParser.FALSE_KW, 0); }
		public Boolean_falseContext(BooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBoolean_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBoolean_false(this);
		}
	}
	public static class Boolean_trueContext extends BooleanContext {
		public TerminalNode TRUE_KW() { return getToken(JurjenLangParser.TRUE_KW, 0); }
		public Boolean_trueContext(BooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBoolean_true(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBoolean_true(this);
		}
	}

	public final BooleanContext boolean() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_KW:
				_localctx = new Boolean_trueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(TRUE_KW);
				}
				break;
			case FALSE_KW:
				_localctx = new Boolean_falseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(FALSE_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return e_sempred((EContext)_localctx, predIndex);
		case 12:
			return bool_e_sempred((Bool_eContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean bool_e_sempred(Bool_eContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\62\n\6\3\6\3"+
		"\6\3\7\7\7\67\n\7\f\7\16\7:\13\7\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\fK\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"T\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\rg\n\r\f\r\16\rj\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16t\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u0087\n\21\3\21\2\4\30\32\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u0089\2\"\3\2\2\2\4%\3\2\2\2"+
		"\6(\3\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f8\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22"+
		"B\3\2\2\2\24D\3\2\2\2\26J\3\2\2\2\30S\3\2\2\2\32s\3\2\2\2\34\u0080\3\2"+
		"\2\2\36\u0082\3\2\2\2 \u0086\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%"+
		"&\5\6\4\2&\'\5\n\6\2\'\5\3\2\2\2()\7\3\2\2)*\7\f\2\2*\7\3\2\2\2+,\7\4"+
		"\2\2,-\5\22\n\2-\t\3\2\2\2./\7\27\2\2/\61\5\f\7\2\60\62\5\b\5\2\61\60"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\30\2\2\64\13\3\2\2\2\65\67"+
		"\5\16\b\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\r\3\2\2\2:"+
		"8\3\2\2\2;>\5\24\13\2<>\5\20\t\2=;\3\2\2\2=<\3\2\2\2>\17\3\2\2\2?@\7\5"+
		"\2\2@A\5\26\f\2A\21\3\2\2\2BC\5\26\f\2C\23\3\2\2\2DE\5\34\17\2EF\7\23"+
		"\2\2FG\5\26\f\2G\25\3\2\2\2HK\5\30\r\2IK\5\32\16\2JH\3\2\2\2JI\3\2\2\2"+
		"K\27\3\2\2\2LM\b\r\1\2MN\7\25\2\2NO\5\30\r\2OP\7\26\2\2PT\3\2\2\2QT\5"+
		"\36\20\2RT\5\34\17\2SL\3\2\2\2SQ\3\2\2\2SR\3\2\2\2Th\3\2\2\2UV\f\t\2\2"+
		"VW\7\16\2\2Wg\5\30\r\nXY\f\b\2\2YZ\7\17\2\2Zg\5\30\r\t[\\\f\7\2\2\\]\7"+
		"\20\2\2]g\5\30\r\b^_\f\6\2\2_`\7\21\2\2`g\5\30\r\7ab\f\5\2\2bc\7\22\2"+
		"\2cg\5\30\r\6de\f\n\2\2eg\7\r\2\2fU\3\2\2\2fX\3\2\2\2f[\3\2\2\2f^\3\2"+
		"\2\2fa\3\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\31\3\2\2\2jh\3"+
		"\2\2\2kl\b\16\1\2lm\7\n\2\2mt\5\32\16\5no\5\30\r\2op\7\24\2\2pq\5\30\r"+
		"\2qt\3\2\2\2rt\5 \21\2sk\3\2\2\2sn\3\2\2\2sr\3\2\2\2t}\3\2\2\2uv\f\7\2"+
		"\2vw\7\b\2\2w|\5\32\16\bxy\f\6\2\2yz\7\t\2\2z|\5\32\16\7{u\3\2\2\2{x\3"+
		"\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\33\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7\f\2\2\u0081\35\3\2\2\2\u0082\u0083\7\13\2\2\u0083\37\3\2\2\2"+
		"\u0084\u0087\7\6\2\2\u0085\u0087\7\7\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087!\3\2\2\2\r\618=JSfhs{}\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}