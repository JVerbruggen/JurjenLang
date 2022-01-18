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
		NUMBERS=1, FUNC_KW=2, FUNC_RET=3, PRINTSCOPE_KW=4, PRINT_KW=5, ASSERT_KW=6, 
		IF_KW=7, ELIF_KW=8, ELSE_KW=9, WHILE_KW=10, REPEAT_KW=11, UNTIL_KW=12, 
		BREAK_KW=13, TRUE_KW=14, FALSE_KW=15, AND_KW=16, OR_KW=17, NOT_KW=18, 
		MATRIX_INV=19, MATRIX_TRANS=20, EQUALS=21, ISNOT=22, LESSEQUALS=23, MOREEQUALS=24, 
		LESSTHAN=25, MORETHAN=26, SYMB_DOUBLEPLUS=27, SYMB_EXCLM=28, SYMB_HAT=29, 
		SYMB_STAR=30, SYMB_SLASH=31, SYMB_PLUS=32, SYMB_MINUS=33, SYMB_QUOTE=34, 
		SYMB_DQUOTE=35, SYMB_DOT=36, SYMB_COMMA=37, FLOAT_IDENT=38, ASSIGN=39, 
		PAR_OPEN=40, PAR_CLOSE=41, SQBRACK_OPEN=42, SQBRACK_CLOSE=43, BRACK_OPEN=44, 
		BRACK_CLOSE=45, IDENTIFIER=46, STR_CONTENT=47, WS=48;
	public static final int
		RULE_startRule = 0, RULE_globalscope = 1, RULE_func = 2, RULE_func_def = 3, 
		RULE_func_return = 4, RULE_func_call = 5, RULE_func_params = 6, RULE_func_call_params = 7, 
		RULE_scope = 8, RULE_stats = 9, RULE_stat = 10, RULE_break_stat = 11, 
		RULE_debugtools = 12, RULE_printscopestat = 13, RULE_printstat = 14, RULE_retstat = 15, 
		RULE_whileloop = 16, RULE_repeatloop = 17, RULE_ifchain = 18, RULE_ifstat = 19, 
		RULE_elifstat_chain = 20, RULE_elifstat = 21, RULE_maybe_elsestat = 22, 
		RULE_elsestat = 23, RULE_assertion = 24, RULE_assignment = 25, RULE_assignable = 26, 
		RULE_matrix_assignment = 27, RULE_e = 28, RULE_bool_e = 29, RULE_boolean_type = 30, 
		RULE_comparison = 31, RULE_bool_comparison = 32, RULE_variable = 33, RULE_float_type = 34, 
		RULE_integer = 35, RULE_string = 36, RULE_any_value = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "globalscope", "func", "func_def", "func_return", "func_call", 
			"func_params", "func_call_params", "scope", "stats", "stat", "break_stat", 
			"debugtools", "printscopestat", "printstat", "retstat", "whileloop", 
			"repeatloop", "ifchain", "ifstat", "elifstat_chain", "elifstat", "maybe_elsestat", 
			"elsestat", "assertion", "assignment", "assignable", "matrix_assignment", 
			"e", "bool_e", "boolean_type", "comparison", "bool_comparison", "variable", 
			"float_type", "integer", "string", "any_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'func'", "'return'", "'printscope'", "'print'", "'assert'", 
			"'if'", "'elif'", "'else'", "'while'", "'repeat'", "'until'", "'break'", 
			"'true'", "'false'", "'and'", "'or'", "'not'", "'^-1'", "'^T'", "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'++'", "'!'", "'^'", "'*'", "'/'", 
			"'+'", "'-'", "'''", "'\"'", "'.'", "','", "'f'", "'='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBERS", "FUNC_KW", "FUNC_RET", "PRINTSCOPE_KW", "PRINT_KW", 
			"ASSERT_KW", "IF_KW", "ELIF_KW", "ELSE_KW", "WHILE_KW", "REPEAT_KW", 
			"UNTIL_KW", "BREAK_KW", "TRUE_KW", "FALSE_KW", "AND_KW", "OR_KW", "NOT_KW", 
			"MATRIX_INV", "MATRIX_TRANS", "EQUALS", "ISNOT", "LESSEQUALS", "MOREEQUALS", 
			"LESSTHAN", "MORETHAN", "SYMB_DOUBLEPLUS", "SYMB_EXCLM", "SYMB_HAT", 
			"SYMB_STAR", "SYMB_SLASH", "SYMB_PLUS", "SYMB_MINUS", "SYMB_QUOTE", "SYMB_DQUOTE", 
			"SYMB_DOT", "SYMB_COMMA", "FLOAT_IDENT", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", 
			"SQBRACK_OPEN", "SQBRACK_CLOSE", "BRACK_OPEN", "BRACK_CLOSE", "IDENTIFIER", 
			"STR_CONTENT", "WS"
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
		public GlobalscopeContext globalscope() {
			return getRuleContext(GlobalscopeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			globalscope();
			setState(77);
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

	public static class GlobalscopeContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public GlobalscopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalscope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterGlobalscope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitGlobalscope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitGlobalscope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalscopeContext globalscope() throws RecognitionException {
		GlobalscopeContext _localctx = new GlobalscopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalscope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC_KW) | (1L << FUNC_RET) | (1L << PRINTSCOPE_KW) | (1L << PRINT_KW) | (1L << ASSERT_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << REPEAT_KW) | (1L << BREAK_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC_KW:
					{
					setState(79);
					func();
					}
					break;
				case FUNC_RET:
				case PRINTSCOPE_KW:
				case PRINT_KW:
				case ASSERT_KW:
				case IF_KW:
				case WHILE_KW:
				case REPEAT_KW:
				case BREAK_KW:
				case IDENTIFIER:
					{
					setState(80);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			func_def();
			setState(87);
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
		public Func_paramsContext func_params() {
			return getRuleContext(Func_paramsContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(FUNC_KW);
			setState(90);
			match(IDENTIFIER);
			setState(91);
			func_params();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_returnContext func_return() throws RecognitionException {
		Func_returnContext _localctx = new Func_returnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNC_RET);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(94);
				retstat();
				}
				break;
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JurjenLangParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(JurjenLangParser.PAR_OPEN, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(JurjenLangParser.PAR_CLOSE, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(PAR_OPEN);
			setState(99);
			func_call_params();
			setState(100);
			match(PAR_CLOSE);
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

	public static class Func_paramsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JurjenLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JurjenLangParser.IDENTIFIER, i);
		}
		public Func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramsContext func_params() throws RecognitionException {
		Func_paramsContext _localctx = new Func_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(102);
				match(IDENTIFIER);
				}
				}
				setState(107);
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

	public static class Func_call_paramsContext extends ParserRuleContext {
		public Func_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_params; }
	 
		public Func_call_paramsContext() { }
		public void copyFrom(Func_call_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_call_params_singleContext extends Func_call_paramsContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public Func_call_params_singleContext(Func_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_call_params_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_call_params_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_call_params_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Func_call_params_multipleContext extends Func_call_paramsContext {
		public List<AssignableContext> assignable() {
			return getRuleContexts(AssignableContext.class);
		}
		public AssignableContext assignable(int i) {
			return getRuleContext(AssignableContext.class,i);
		}
		public List<TerminalNode> SYMB_COMMA() { return getTokens(JurjenLangParser.SYMB_COMMA); }
		public TerminalNode SYMB_COMMA(int i) {
			return getToken(JurjenLangParser.SYMB_COMMA, i);
		}
		public Func_call_params_multipleContext(Func_call_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFunc_call_params_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFunc_call_params_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFunc_call_params_multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_paramsContext func_call_params() throws RecognitionException {
		Func_call_paramsContext _localctx = new Func_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call_params);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Func_call_params_singleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERS) | (1L << TRUE_KW) | (1L << FALSE_KW) | (1L << NOT_KW) | (1L << SYMB_MINUS) | (1L << SYMB_DOT) | (1L << PAR_OPEN) | (1L << SQBRACK_OPEN) | (1L << IDENTIFIER) | (1L << STR_CONTENT))) != 0)) {
					{
					setState(108);
					assignable();
					}
				}

				}
				break;
			case 2:
				_localctx = new Func_call_params_multipleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				assignable();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYMB_COMMA) {
					{
					{
					setState(112);
					match(SYMB_COMMA);
					setState(113);
					assignable();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode BRACK_OPEN() { return getToken(JurjenLangParser.BRACK_OPEN, 0); }
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public TerminalNode BRACK_CLOSE() { return getToken(JurjenLangParser.BRACK_CLOSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(BRACK_OPEN);
			setState(122);
			stats();
			setState(123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC_RET) | (1L << PRINTSCOPE_KW) | (1L << PRINT_KW) | (1L << ASSERT_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << REPEAT_KW) | (1L << BREAK_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(125);
				stat();
				}
				}
				setState(130);
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
		public DebugtoolsContext debugtools() {
			return getRuleContext(DebugtoolsContext.class,0);
		}
		public IfchainContext ifchain() {
			return getRuleContext(IfchainContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public RepeatloopContext repeatloop() {
			return getRuleContext(RepeatloopContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stat);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				debugtools();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				ifchain();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				assertion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				whileloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				repeatloop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				func_return();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				func_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				break_stat();
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

	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode BREAK_KW() { return getToken(JurjenLangParser.BREAK_KW, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBreak_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBreak_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(BREAK_KW);
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

	public static class DebugtoolsContext extends ParserRuleContext {
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public PrintscopestatContext printscopestat() {
			return getRuleContext(PrintscopestatContext.class,0);
		}
		public DebugtoolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugtools; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterDebugtools(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitDebugtools(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitDebugtools(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugtoolsContext debugtools() throws RecognitionException {
		DebugtoolsContext _localctx = new DebugtoolsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_debugtools);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				printstat();
				}
				break;
			case PRINTSCOPE_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				printscopestat();
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

	public static class PrintscopestatContext extends ParserRuleContext {
		public TerminalNode PRINTSCOPE_KW() { return getToken(JurjenLangParser.PRINTSCOPE_KW, 0); }
		public PrintscopestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printscopestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterPrintscopestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitPrintscopestat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitPrintscopestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintscopestatContext printscopestat() throws RecognitionException {
		PrintscopestatContext _localctx = new PrintscopestatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printscopestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PRINTSCOPE_KW);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitPrintstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PRINT_KW);
			setState(151);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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

	public static class WhileloopContext extends ParserRuleContext {
		public Bool_eContext expr;
		public TerminalNode WHILE_KW() { return getToken(JurjenLangParser.WHILE_KW, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHILE_KW);
			setState(156);
			((WhileloopContext)_localctx).expr = bool_e(0);
			setState(157);
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

	public static class RepeatloopContext extends ParserRuleContext {
		public Bool_eContext expr;
		public TerminalNode REPEAT_KW() { return getToken(JurjenLangParser.REPEAT_KW, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode UNTIL_KW() { return getToken(JurjenLangParser.UNTIL_KW, 0); }
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public RepeatloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterRepeatloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitRepeatloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitRepeatloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatloopContext repeatloop() throws RecognitionException {
		RepeatloopContext _localctx = new RepeatloopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeatloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(REPEAT_KW);
			setState(160);
			scope();
			setState(161);
			match(UNTIL_KW);
			setState(162);
			((RepeatloopContext)_localctx).expr = bool_e(0);
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

	public static class IfchainContext extends ParserRuleContext {
		public IfstatContext ifchain_if;
		public Elifstat_chainContext ifchain_elifs;
		public Maybe_elsestatContext ifchain_else;
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public Elifstat_chainContext elifstat_chain() {
			return getRuleContext(Elifstat_chainContext.class,0);
		}
		public Maybe_elsestatContext maybe_elsestat() {
			return getRuleContext(Maybe_elsestatContext.class,0);
		}
		public IfchainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifchain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterIfchain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitIfchain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitIfchain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfchainContext ifchain() throws RecognitionException {
		IfchainContext _localctx = new IfchainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifchain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((IfchainContext)_localctx).ifchain_if = ifstat();
			setState(165);
			((IfchainContext)_localctx).ifchain_elifs = elifstat_chain();
			setState(166);
			((IfchainContext)_localctx).ifchain_else = maybe_elsestat();
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

	public static class IfstatContext extends ParserRuleContext {
		public Bool_eContext expr;
		public TerminalNode IF_KW() { return getToken(JurjenLangParser.IF_KW, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitIfstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF_KW);
			setState(169);
			((IfstatContext)_localctx).expr = bool_e(0);
			setState(170);
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

	public static class Elifstat_chainContext extends ParserRuleContext {
		public List<ElifstatContext> elifstat() {
			return getRuleContexts(ElifstatContext.class);
		}
		public ElifstatContext elifstat(int i) {
			return getRuleContext(ElifstatContext.class,i);
		}
		public Elifstat_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstat_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterElifstat_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitElifstat_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitElifstat_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elifstat_chainContext elifstat_chain() throws RecognitionException {
		Elifstat_chainContext _localctx = new Elifstat_chainContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elifstat_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF_KW) {
				{
				{
				setState(172);
				elifstat();
				}
				}
				setState(177);
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

	public static class ElifstatContext extends ParserRuleContext {
		public Bool_eContext expr;
		public TerminalNode ELIF_KW() { return getToken(JurjenLangParser.ELIF_KW, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public ElifstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterElifstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitElifstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitElifstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifstatContext elifstat() throws RecognitionException {
		ElifstatContext _localctx = new ElifstatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ELIF_KW);
			setState(179);
			((ElifstatContext)_localctx).expr = bool_e(0);
			setState(180);
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

	public static class Maybe_elsestatContext extends ParserRuleContext {
		public ElsestatContext elsestat() {
			return getRuleContext(ElsestatContext.class,0);
		}
		public Maybe_elsestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_elsestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterMaybe_elsestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitMaybe_elsestat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitMaybe_elsestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_elsestatContext maybe_elsestat() throws RecognitionException {
		Maybe_elsestatContext _localctx = new Maybe_elsestatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_maybe_elsestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(182);
				elsestat();
				}
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

	public static class ElsestatContext extends ParserRuleContext {
		public TerminalNode ELSE_KW() { return getToken(JurjenLangParser.ELSE_KW, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ElsestatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterElsestat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitElsestat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitElsestat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatContext elsestat() throws RecognitionException {
		ElsestatContext _localctx = new ElsestatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elsestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ELSE_KW);
			setState(186);
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

	public static class AssertionContext extends ParserRuleContext {
		public Bool_eContext expr;
		public TerminalNode ASSERT_KW() { return getToken(JurjenLangParser.ASSERT_KW, 0); }
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ASSERT_KW);
			setState(189);
			((AssertionContext)_localctx).expr = bool_e(0);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assignment_assignContext extends AssignmentContext {
		public VariableContext name;
		public AssignableContext ass;
		public TerminalNode ASSIGN() { return getToken(JurjenLangParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public Assignment_assignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignment_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignment_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignment_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_incrementContext extends AssignmentContext {
		public VariableContext name;
		public TerminalNode SYMB_DOUBLEPLUS() { return getToken(JurjenLangParser.SYMB_DOUBLEPLUS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Assignment_incrementContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignment_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignment_increment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignment_increment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_assign_tomatrixContext extends AssignmentContext {
		public VariableContext name;
		public AssignableContext ass;
		public TerminalNode SQBRACK_OPEN() { return getToken(JurjenLangParser.SQBRACK_OPEN, 0); }
		public List<TerminalNode> NUMBERS() { return getTokens(JurjenLangParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(JurjenLangParser.NUMBERS, i);
		}
		public TerminalNode SYMB_COMMA() { return getToken(JurjenLangParser.SYMB_COMMA, 0); }
		public TerminalNode SQBRACK_CLOSE() { return getToken(JurjenLangParser.SQBRACK_CLOSE, 0); }
		public TerminalNode ASSIGN() { return getToken(JurjenLangParser.ASSIGN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public Assignment_assign_tomatrixContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignment_assign_tomatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignment_assign_tomatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignment_assign_tomatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Assignment_assign_tomatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((Assignment_assign_tomatrixContext)_localctx).name = variable();
				setState(192);
				match(SQBRACK_OPEN);
				setState(193);
				match(NUMBERS);
				setState(194);
				match(SYMB_COMMA);
				setState(195);
				match(NUMBERS);
				setState(196);
				match(SQBRACK_CLOSE);
				setState(197);
				match(ASSIGN);
				setState(198);
				((Assignment_assign_tomatrixContext)_localctx).ass = assignable();
				}
				break;
			case 2:
				_localctx = new Assignment_assignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((Assignment_assignContext)_localctx).name = variable();
				setState(201);
				match(ASSIGN);
				setState(202);
				((Assignment_assignContext)_localctx).ass = assignable();
				}
				break;
			case 3:
				_localctx = new Assignment_incrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				((Assignment_incrementContext)_localctx).name = variable();
				setState(205);
				match(SYMB_DOUBLEPLUS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignable_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignable_matrixContext extends AssignableContext {
		public Matrix_assignmentContext expr;
		public Matrix_assignmentContext matrix_assignment() {
			return getRuleContext(Matrix_assignmentContext.class,0);
		}
		public Assignable_matrixContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAssignable_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAssignable_matrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignable_matrix(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignable_bool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignable);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Assignable_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((Assignable_expressionContext)_localctx).expr = e(0);
				}
				break;
			case 2:
				_localctx = new Assignable_bool_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				((Assignable_bool_expressionContext)_localctx).expr = bool_e(0);
				}
				break;
			case 3:
				_localctx = new Assignable_matrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				((Assignable_matrixContext)_localctx).expr = matrix_assignment();
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

	public static class Matrix_assignmentContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode SQBRACK_OPEN() { return getToken(JurjenLangParser.SQBRACK_OPEN, 0); }
		public TerminalNode SYMB_COMMA() { return getToken(JurjenLangParser.SYMB_COMMA, 0); }
		public TerminalNode SQBRACK_CLOSE() { return getToken(JurjenLangParser.SQBRACK_CLOSE, 0); }
		public List<TerminalNode> NUMBERS() { return getTokens(JurjenLangParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(JurjenLangParser.NUMBERS, i);
		}
		public Matrix_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterMatrix_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitMatrix_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitMatrix_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_assignmentContext matrix_assignment() throws RecognitionException {
		Matrix_assignmentContext _localctx = new Matrix_assignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matrix_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(SQBRACK_OPEN);
			setState(215);
			((Matrix_assignmentContext)_localctx).x = match(NUMBERS);
			setState(216);
			match(SYMB_COMMA);
			setState(217);
			((Matrix_assignmentContext)_localctx).y = match(NUMBERS);
			setState(218);
			match(SQBRACK_CLOSE);
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
	public static class E_any_valueContext extends EContext {
		public Any_valueContext value;
		public Any_valueContext any_value() {
			return getRuleContext(Any_valueContext.class,0);
		}
		public E_any_valueContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_any_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_any_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_any_value(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public E_subtractionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_subtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_subtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_subtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_matrix_transContext extends EContext {
		public VariableContext name;
		public TerminalNode MATRIX_TRANS() { return getToken(JurjenLangParser.MATRIX_TRANS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public E_matrix_transContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_matrix_trans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_matrix_trans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_matrix_trans(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_matrix_invContext extends EContext {
		public VariableContext name;
		public TerminalNode MATRIX_INV() { return getToken(JurjenLangParser.MATRIX_INV, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public E_matrix_invContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_matrix_inv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_matrix_inv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_matrix_inv(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SYMB_HAT() { return getToken(JurjenLangParser.SYMB_HAT, 0); }
		public E_exponentContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_exponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_exponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_exponent(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SYMB_STAR() { return getToken(JurjenLangParser.SYMB_STAR, 0); }
		public E_multiplyContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_multiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_multiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_multiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_matrixContext extends EContext {
		public VariableContext name;
		public TerminalNode SQBRACK_OPEN() { return getToken(JurjenLangParser.SQBRACK_OPEN, 0); }
		public List<TerminalNode> NUMBERS() { return getTokens(JurjenLangParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(JurjenLangParser.NUMBERS, i);
		}
		public TerminalNode SYMB_COMMA() { return getToken(JurjenLangParser.SYMB_COMMA, 0); }
		public TerminalNode SQBRACK_CLOSE() { return getToken(JurjenLangParser.SQBRACK_CLOSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public E_matrixContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_matrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_matrix(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SYMB_PLUS() { return getToken(JurjenLangParser.SYMB_PLUS, 0); }
		public E_additionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_addition(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_factorialContext extends EContext {
		public EContext expr;
		public Token operator;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode SYMB_EXCLM() { return getToken(JurjenLangParser.SYMB_EXCLM, 0); }
		public E_factorialContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_factorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_factorial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_factorial(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_parentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_negationContext extends EContext {
		public EContext expr;
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public E_negationContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_negation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_negation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_negation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_funcContext extends EContext {
		public Func_callContext e_func;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public E_funcContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_func(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SYMB_SLASH() { return getToken(JurjenLangParser.SYMB_SLASH, 0); }
		public E_divisionContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterE_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitE_division(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitE_division(this);
			else return visitor.visitChildren(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new E_parenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				match(PAR_OPEN);
				setState(222);
				((E_parenthesesContext)_localctx).expr = e(0);
				setState(223);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new E_negationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(SYMB_MINUS);
				setState(226);
				((E_negationContext)_localctx).expr = e(7);
				}
				break;
			case 3:
				{
				_localctx = new E_matrixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				((E_matrixContext)_localctx).name = variable();
				setState(228);
				match(SQBRACK_OPEN);
				setState(229);
				match(NUMBERS);
				setState(230);
				match(SYMB_COMMA);
				setState(231);
				match(NUMBERS);
				setState(232);
				match(SQBRACK_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new E_matrix_invContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				((E_matrix_invContext)_localctx).name = variable();
				setState(235);
				match(MATRIX_INV);
				}
				break;
			case 5:
				{
				_localctx = new E_matrix_transContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				((E_matrix_transContext)_localctx).name = variable();
				setState(238);
				match(MATRIX_TRANS);
				}
				break;
			case 6:
				{
				_localctx = new E_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				((E_variableContext)_localctx).name = variable();
				}
				break;
			case 7:
				{
				_localctx = new E_funcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				((E_funcContext)_localctx).e_func = func_call();
				}
				break;
			case 8:
				{
				_localctx = new E_any_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				((E_any_valueContext)_localctx).value = any_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new E_exponentContext(new EContext(_parentctx, _parentState));
						((E_exponentContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(245);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(246);
						((E_exponentContext)_localctx).operator = match(SYMB_HAT);
						setState(247);
						((E_exponentContext)_localctx).right = e(13);
						}
						break;
					case 2:
						{
						_localctx = new E_multiplyContext(new EContext(_parentctx, _parentState));
						((E_multiplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249);
						((E_multiplyContext)_localctx).operator = match(SYMB_STAR);
						setState(250);
						((E_multiplyContext)_localctx).right = e(12);
						}
						break;
					case 3:
						{
						_localctx = new E_divisionContext(new EContext(_parentctx, _parentState));
						((E_divisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(251);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(252);
						((E_divisionContext)_localctx).operator = match(SYMB_SLASH);
						setState(253);
						((E_divisionContext)_localctx).right = e(11);
						}
						break;
					case 4:
						{
						_localctx = new E_additionContext(new EContext(_parentctx, _parentState));
						((E_additionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(254);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(255);
						((E_additionContext)_localctx).operator = match(SYMB_PLUS);
						setState(256);
						((E_additionContext)_localctx).right = e(10);
						}
						break;
					case 5:
						{
						_localctx = new E_subtractionContext(new EContext(_parentctx, _parentState));
						((E_subtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						((E_subtractionContext)_localctx).operator = match(SYMB_MINUS);
						setState(259);
						((E_subtractionContext)_localctx).right = e(9);
						}
						break;
					case 6:
						{
						_localctx = new E_factorialContext(new EContext(_parentctx, _parentState));
						((E_factorialContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(260);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(261);
						((E_factorialContext)_localctx).operator = match(SYMB_EXCLM);
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_parenthesesContext extends Bool_eContext {
		public Bool_eContext bool_expr;
		public TerminalNode PAR_OPEN() { return getToken(JurjenLangParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(JurjenLangParser.PAR_CLOSE, 0); }
		public Bool_eContext bool_e() {
			return getRuleContext(Bool_eContext.class,0);
		}
		public Bool_parenthesesContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_parentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_parentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_parentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_e_variableContext extends Bool_eContext {
		public VariableContext name;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Bool_e_variableContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_variable(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_e_booleanContext extends Bool_eContext {
		public Boolean_typeContext value;
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_boolean(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_e_expressionsContext extends Bool_eContext {
		public EContext left;
		public ComparisonContext oper;
		public EContext right;
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_expressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_e_expressions_boolsContext extends Bool_eContext {
		public Bool_eContext left;
		public Bool_comparisonContext oper;
		public Bool_eContext right;
		public List<Bool_eContext> bool_e() {
			return getRuleContexts(Bool_eContext.class);
		}
		public Bool_eContext bool_e(int i) {
			return getRuleContext(Bool_eContext.class,i);
		}
		public Bool_comparisonContext bool_comparison() {
			return getRuleContext(Bool_comparisonContext.class,0);
		}
		public Bool_e_expressions_boolsContext(Bool_eContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_e_expressions_bools(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_e_expressions_bools(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_e_expressions_bools(this);
			else return visitor.visitChildren(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_bool_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new Bool_parenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(268);
				match(PAR_OPEN);
				setState(269);
				((Bool_parenthesesContext)_localctx).bool_expr = bool_e(0);
				setState(270);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new Bool_e_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(NOT_KW);
				setState(273);
				((Bool_e_notContext)_localctx).bool_expr = bool_e(5);
				}
				break;
			case 3:
				{
				_localctx = new Bool_e_expressionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				((Bool_e_expressionsContext)_localctx).left = e(0);
				setState(275);
				((Bool_e_expressionsContext)_localctx).oper = comparison();
				setState(276);
				((Bool_e_expressionsContext)_localctx).right = e(0);
				}
				break;
			case 4:
				{
				_localctx = new Bool_e_booleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				((Bool_e_booleanContext)_localctx).value = boolean_type();
				}
				break;
			case 5:
				{
				_localctx = new Bool_e_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				((Bool_e_variableContext)_localctx).name = variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_e_andContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_andContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(282);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(283);
						match(AND_KW);
						setState(284);
						((Bool_e_andContext)_localctx).right = bool_e(8);
						}
						break;
					case 2:
						{
						_localctx = new Bool_e_orContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_orContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(285);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(286);
						match(OR_KW);
						setState(287);
						((Bool_e_orContext)_localctx).right = bool_e(7);
						}
						break;
					case 3:
						{
						_localctx = new Bool_e_expressions_boolsContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_expressions_boolsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(288);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(289);
						((Bool_e_expressions_boolsContext)_localctx).oper = bool_comparison();
						setState(290);
						((Bool_e_expressions_boolsContext)_localctx).right = bool_e(4);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Boolean_typeContext extends ParserRuleContext {
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
	 
		public Boolean_typeContext() { }
		public void copyFrom(Boolean_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Boolean_falseContext extends Boolean_typeContext {
		public TerminalNode FALSE_KW() { return getToken(JurjenLangParser.FALSE_KW, 0); }
		public Boolean_falseContext(Boolean_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBoolean_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBoolean_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBoolean_false(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Boolean_trueContext extends Boolean_typeContext {
		public TerminalNode TRUE_KW() { return getToken(JurjenLangParser.TRUE_KW, 0); }
		public Boolean_trueContext(Boolean_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBoolean_true(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBoolean_true(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBoolean_true(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_boolean_type);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_KW:
				_localctx = new Boolean_trueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(TRUE_KW);
				}
				break;
			case FALSE_KW:
				_localctx = new Boolean_falseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(JurjenLangParser.EQUALS, 0); }
		public TerminalNode ISNOT() { return getToken(JurjenLangParser.ISNOT, 0); }
		public TerminalNode LESSTHAN() { return getToken(JurjenLangParser.LESSTHAN, 0); }
		public TerminalNode LESSEQUALS() { return getToken(JurjenLangParser.LESSEQUALS, 0); }
		public TerminalNode MORETHAN() { return getToken(JurjenLangParser.MORETHAN, 0); }
		public TerminalNode MOREEQUALS() { return getToken(JurjenLangParser.MOREEQUALS, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << ISNOT) | (1L << LESSEQUALS) | (1L << MOREEQUALS) | (1L << LESSTHAN) | (1L << MORETHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Bool_comparisonContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(JurjenLangParser.EQUALS, 0); }
		public TerminalNode ISNOT() { return getToken(JurjenLangParser.ISNOT, 0); }
		public Bool_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterBool_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitBool_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitBool_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_comparisonContext bool_comparison() throws RecognitionException {
		Bool_comparisonContext _localctx = new Bool_comparisonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==ISNOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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

	public static class Float_typeContext extends ParserRuleContext {
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
	 
		public Float_typeContext() { }
		public void copyFrom(Float_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Float_no_prior_by_dot_and_identContext extends Float_typeContext {
		public Token post_nrs;
		public TerminalNode SYMB_DOT() { return getToken(JurjenLangParser.SYMB_DOT, 0); }
		public TerminalNode FLOAT_IDENT() { return getToken(JurjenLangParser.FLOAT_IDENT, 0); }
		public TerminalNode NUMBERS() { return getToken(JurjenLangParser.NUMBERS, 0); }
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public Float_no_prior_by_dot_and_identContext(Float_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFloat_no_prior_by_dot_and_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFloat_no_prior_by_dot_and_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFloat_no_prior_by_dot_and_ident(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_by_identContext extends Float_typeContext {
		public Token pre_nrs;
		public TerminalNode FLOAT_IDENT() { return getToken(JurjenLangParser.FLOAT_IDENT, 0); }
		public TerminalNode NUMBERS() { return getToken(JurjenLangParser.NUMBERS, 0); }
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public Float_by_identContext(Float_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFloat_by_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFloat_by_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFloat_by_ident(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_by_dotContext extends Float_typeContext {
		public Token pre_nrs;
		public Token post_nrs;
		public TerminalNode SYMB_DOT() { return getToken(JurjenLangParser.SYMB_DOT, 0); }
		public List<TerminalNode> NUMBERS() { return getTokens(JurjenLangParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(JurjenLangParser.NUMBERS, i);
		}
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public Float_by_dotContext(Float_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFloat_by_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFloat_by_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFloat_by_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_by_dot_and_identContext extends Float_typeContext {
		public Token pre_nrs;
		public Token post_nrs;
		public TerminalNode SYMB_DOT() { return getToken(JurjenLangParser.SYMB_DOT, 0); }
		public TerminalNode FLOAT_IDENT() { return getToken(JurjenLangParser.FLOAT_IDENT, 0); }
		public List<TerminalNode> NUMBERS() { return getTokens(JurjenLangParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(JurjenLangParser.NUMBERS, i);
		}
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public Float_by_dot_and_identContext(Float_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFloat_by_dot_and_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFloat_by_dot_and_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFloat_by_dot_and_ident(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_no_prior_by_dotContext extends Float_typeContext {
		public Token post_nrs;
		public TerminalNode SYMB_DOT() { return getToken(JurjenLangParser.SYMB_DOT, 0); }
		public TerminalNode NUMBERS() { return getToken(JurjenLangParser.NUMBERS, 0); }
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
		public Float_no_prior_by_dotContext(Float_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterFloat_no_prior_by_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitFloat_no_prior_by_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitFloat_no_prior_by_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_float_type);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Float_by_dot_and_identContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(307);
					match(SYMB_MINUS);
					}
				}

				setState(310);
				((Float_by_dot_and_identContext)_localctx).pre_nrs = match(NUMBERS);
				setState(311);
				match(SYMB_DOT);
				setState(312);
				((Float_by_dot_and_identContext)_localctx).post_nrs = match(NUMBERS);
				setState(313);
				match(FLOAT_IDENT);
				}
				break;
			case 2:
				_localctx = new Float_by_dotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(314);
					match(SYMB_MINUS);
					}
				}

				setState(317);
				((Float_by_dotContext)_localctx).pre_nrs = match(NUMBERS);
				setState(318);
				match(SYMB_DOT);
				setState(319);
				((Float_by_dotContext)_localctx).post_nrs = match(NUMBERS);
				}
				break;
			case 3:
				_localctx = new Float_by_identContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(320);
					match(SYMB_MINUS);
					}
				}

				setState(323);
				((Float_by_identContext)_localctx).pre_nrs = match(NUMBERS);
				setState(324);
				match(FLOAT_IDENT);
				}
				break;
			case 4:
				_localctx = new Float_no_prior_by_dotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(325);
					match(SYMB_MINUS);
					}
				}

				setState(328);
				match(SYMB_DOT);
				setState(329);
				((Float_no_prior_by_dotContext)_localctx).post_nrs = match(NUMBERS);
				}
				break;
			case 5:
				_localctx = new Float_no_prior_by_dot_and_identContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(330);
					match(SYMB_MINUS);
					}
				}

				setState(333);
				match(SYMB_DOT);
				setState(334);
				((Float_no_prior_by_dot_and_identContext)_localctx).post_nrs = match(NUMBERS);
				setState(335);
				match(FLOAT_IDENT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(JurjenLangParser.NUMBERS, 0); }
		public TerminalNode SYMB_MINUS() { return getToken(JurjenLangParser.SYMB_MINUS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMB_MINUS) {
				{
				setState(338);
				match(SYMB_MINUS);
				}
			}

			setState(341);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR_CONTENT() { return getToken(JurjenLangParser.STR_CONTENT, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(STR_CONTENT);
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

	public static class Any_valueContext extends ParserRuleContext {
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Any_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).enterAny_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JurjenLangListener ) ((JurjenLangListener)listener).exitAny_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAny_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_valueContext any_value() throws RecognitionException {
		Any_valueContext _localctx = new Any_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_any_value);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				float_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				string();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return e_sempred((EContext)_localctx, predIndex);
		case 29:
			return bool_e_sempred((Bool_eContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean bool_e_sempred(Bool_eContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0161\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\7\3T\n"+
		"\3\f\3\16\3W\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6b\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\5\tp\n\t\3\t\3\t\3\t\7\t"+
		"u\n\t\f\t\16\tx\13\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\13\7\13\u0081\n\13\f\13"+
		"\16\13\u0084\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3"+
		"\r\3\r\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\7\26\u00b0\n\26\f\26\16\26\u00b3\13\26\3\27\3\27\3"+
		"\27\3\27\3\30\5\30\u00ba\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00d2\n\33\3\34\3\34\3\34\5\34\u00d7\n\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f6\n\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u0109\n\36\f\36\16\36\u010c\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u011b\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0127\n\37\f\37\16"+
		"\37\u012a\13\37\3 \3 \5 \u012e\n \3!\3!\3\"\3\"\3#\3#\3$\5$\u0137\n$\3"+
		"$\3$\3$\3$\3$\5$\u013e\n$\3$\3$\3$\3$\5$\u0144\n$\3$\3$\3$\5$\u0149\n"+
		"$\3$\3$\3$\5$\u014e\n$\3$\3$\3$\5$\u0153\n$\3%\5%\u0156\n%\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\5\'\u015f\n\'\3\'\2\4:<(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\4\3\2\27\34\3\2\27\30\2\u0172"+
		"\2N\3\2\2\2\4U\3\2\2\2\6X\3\2\2\2\b[\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16"+
		"k\3\2\2\2\20y\3\2\2\2\22{\3\2\2\2\24\u0082\3\2\2\2\26\u008e\3\2\2\2\30"+
		"\u0090\3\2\2\2\32\u0094\3\2\2\2\34\u0096\3\2\2\2\36\u0098\3\2\2\2 \u009b"+
		"\3\2\2\2\"\u009d\3\2\2\2$\u00a1\3\2\2\2&\u00a6\3\2\2\2(\u00aa\3\2\2\2"+
		"*\u00b1\3\2\2\2,\u00b4\3\2\2\2.\u00b9\3\2\2\2\60\u00bb\3\2\2\2\62\u00be"+
		"\3\2\2\2\64\u00d1\3\2\2\2\66\u00d6\3\2\2\28\u00d8\3\2\2\2:\u00f5\3\2\2"+
		"\2<\u011a\3\2\2\2>\u012d\3\2\2\2@\u012f\3\2\2\2B\u0131\3\2\2\2D\u0133"+
		"\3\2\2\2F\u0152\3\2\2\2H\u0155\3\2\2\2J\u0159\3\2\2\2L\u015e\3\2\2\2N"+
		"O\5\4\3\2OP\7\2\2\3P\3\3\2\2\2QT\5\6\4\2RT\5\26\f\2SQ\3\2\2\2SR\3\2\2"+
		"\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2\2XY\5\b\5\2YZ\5\22"+
		"\n\2Z\7\3\2\2\2[\\\7\4\2\2\\]\7\60\2\2]^\5\16\b\2^\t\3\2\2\2_a\7\5\2\2"+
		"`b\5 \21\2a`\3\2\2\2ab\3\2\2\2b\13\3\2\2\2cd\7\60\2\2de\7*\2\2ef\5\20"+
		"\t\2fg\7+\2\2g\r\3\2\2\2hj\7\60\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2l\17\3\2\2\2mk\3\2\2\2np\5\66\34\2on\3\2\2\2op\3\2\2\2pz\3\2\2\2"+
		"qv\5\66\34\2rs\7\'\2\2su\5\66\34\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wz\3\2\2\2xv\3\2\2\2yo\3\2\2\2yq\3\2\2\2z\21\3\2\2\2{|\7.\2\2|}\5"+
		"\24\13\2}~\7/\2\2~\23\3\2\2\2\177\u0081\5\26\f\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0085\u008f\5\64\33\2\u0086\u008f\5\32\16\2\u0087"+
		"\u008f\5&\24\2\u0088\u008f\5\62\32\2\u0089\u008f\5\"\22\2\u008a\u008f"+
		"\5$\23\2\u008b\u008f\5\n\6\2\u008c\u008f\5\f\7\2\u008d\u008f\5\30\r\2"+
		"\u008e\u0085\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u0088"+
		"\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\7\17\2"+
		"\2\u0091\31\3\2\2\2\u0092\u0095\5\36\20\2\u0093\u0095\5\34\17\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\7\6\2"+
		"\2\u0097\35\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5\66\34\2\u009a\37"+
		"\3\2\2\2\u009b\u009c\5\66\34\2\u009c!\3\2\2\2\u009d\u009e\7\f\2\2\u009e"+
		"\u009f\5<\37\2\u009f\u00a0\5\22\n\2\u00a0#\3\2\2\2\u00a1\u00a2\7\r\2\2"+
		"\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5<\37\2\u00a5%"+
		"\3\2\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\5.\30\2\u00a9"+
		"\'\3\2\2\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\5<\37\2\u00ac\u00ad\5\22\n"+
		"\2\u00ad)\3\2\2\2\u00ae\u00b0\5,\27\2\u00af\u00ae\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2+\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5<\37\2\u00b6\u00b7\5\22"+
		"\n\2\u00b7-\3\2\2\2\u00b8\u00ba\5\60\31\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba/\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\61\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5<\37\2\u00c0\63\3\2\2\2\u00c1"+
		"\u00c2\5D#\2\u00c2\u00c3\7,\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\7\'\2"+
		"\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\7-\2\2\u00c7\u00c8\7)\2\2\u00c8\u00c9"+
		"\5\66\34\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\5D#\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00cd\5\66\34\2\u00cd\u00d2\3\2\2\2\u00ce\u00cf\5D#\2\u00cf\u00d0\7\35"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d2\65\3\2\2\2\u00d3\u00d7\5:\36\2\u00d4\u00d7\5<\37"+
		"\2\u00d5\u00d7\58\35\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\67\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\3\2\2\u00da"+
		"\u00db\7\'\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\7-\2\2\u00dd9\3\2\2\2\u00de"+
		"\u00df\b\36\1\2\u00df\u00e0\7*\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e2\7+"+
		"\2\2\u00e2\u00f6\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00f6\5:\36\t\u00e5"+
		"\u00e6\5D#\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00e9\7\'\2"+
		"\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\7-\2\2\u00eb\u00f6\3\2\2\2\u00ec\u00ed"+
		"\5D#\2\u00ed\u00ee\7\25\2\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\5D#\2\u00f0"+
		"\u00f1\7\26\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f6\5D#\2\u00f3\u00f6\5\f"+
		"\7\2\u00f4\u00f6\5L\'\2\u00f5\u00de\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5"+
		"\u00e5\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u010a\3\2\2\2\u00f7"+
		"\u00f8\f\16\2\2\u00f8\u00f9\7\37\2\2\u00f9\u0109\5:\36\17\u00fa\u00fb"+
		"\f\r\2\2\u00fb\u00fc\7 \2\2\u00fc\u0109\5:\36\16\u00fd\u00fe\f\f\2\2\u00fe"+
		"\u00ff\7!\2\2\u00ff\u0109\5:\36\r\u0100\u0101\f\13\2\2\u0101\u0102\7\""+
		"\2\2\u0102\u0109\5:\36\f\u0103\u0104\f\n\2\2\u0104\u0105\7#\2\2\u0105"+
		"\u0109\5:\36\13\u0106\u0107\f\17\2\2\u0107\u0109\7\36\2\2\u0108\u00f7"+
		"\3\2\2\2\u0108\u00fa\3\2\2\2\u0108\u00fd\3\2\2\2\u0108\u0100\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b;\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e"+
		"\b\37\1\2\u010e\u010f\7*\2\2\u010f\u0110\5<\37\2\u0110\u0111\7+\2\2\u0111"+
		"\u011b\3\2\2\2\u0112\u0113\7\24\2\2\u0113\u011b\5<\37\7\u0114\u0115\5"+
		":\36\2\u0115\u0116\5@!\2\u0116\u0117\5:\36\2\u0117\u011b\3\2\2\2\u0118"+
		"\u011b\5> \2\u0119\u011b\5D#\2\u011a\u010d\3\2\2\2\u011a\u0112\3\2\2\2"+
		"\u011a\u0114\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0128"+
		"\3\2\2\2\u011c\u011d\f\t\2\2\u011d\u011e\7\22\2\2\u011e\u0127\5<\37\n"+
		"\u011f\u0120\f\b\2\2\u0120\u0121\7\23\2\2\u0121\u0127\5<\37\t\u0122\u0123"+
		"\f\5\2\2\u0123\u0124\5B\"\2\u0124\u0125\5<\37\6\u0125\u0127\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129=\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012e\7\20\2\2\u012c\u012e\7\21\2\2\u012d\u012b\3\2\2\2"+
		"\u012d\u012c\3\2\2\2\u012e?\3\2\2\2\u012f\u0130\t\2\2\2\u0130A\3\2\2\2"+
		"\u0131\u0132\t\3\2\2\u0132C\3\2\2\2\u0133\u0134\7\60\2\2\u0134E\3\2\2"+
		"\2\u0135\u0137\7#\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\7\3\2\2\u0139\u013a\7&\2\2\u013a\u013b\7\3\2\2\u013b"+
		"\u0153\7(\2\2\u013c\u013e\7#\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u0140\7\3\2\2\u0140\u0141\7&\2\2\u0141\u0153"+
		"\7\3\2\2\u0142\u0144\7#\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\7\3\2\2\u0146\u0153\7(\2\2\u0147\u0149\7#\2"+
		"\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\7&\2\2\u014b\u0153\7\3\2\2\u014c\u014e\7#\2\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7&\2\2\u0150\u0151\7\3"+
		"\2\2\u0151\u0153\7(\2\2\u0152\u0136\3\2\2\2\u0152\u013d\3\2\2\2\u0152"+
		"\u0143\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u014d\3\2\2\2\u0153G\3\2\2\2"+
		"\u0154\u0156\7#\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\7\3\2\2\u0158I\3\2\2\2\u0159\u015a\7\61\2\2\u015a"+
		"K\3\2\2\2\u015b\u015f\5F$\2\u015c\u015f\5H%\2\u015d\u015f\5J&\2\u015e"+
		"\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fM\3\2\2\2"+
		"\37SUakovy\u0082\u008e\u0094\u00b1\u00b9\u00d1\u00d6\u00f5\u0108\u010a"+
		"\u011a\u0126\u0128\u012d\u0136\u013d\u0143\u0148\u014d\u0152\u0155\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}