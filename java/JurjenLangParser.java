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
		IF_KW=7, ELIF_KW=8, ELSE_KW=9, WHILE_KW=10, TRUE_KW=11, FALSE_KW=12, AND_KW=13, 
		OR_KW=14, NOT_KW=15, EQUALS=16, ISNOT=17, LESSEQUALS=18, MOREEQUALS=19, 
		LESSTHAN=20, MORETHAN=21, SYMB_EXCLM=22, SYMB_HAT=23, SYMB_STAR=24, SYMB_SLASH=25, 
		SYMB_PLUS=26, SYMB_MINUS=27, SYMB_QUOTE=28, SYMB_DQUOTE=29, SYMB_DOT=30, 
		SYMB_COMMA=31, FLOAT_IDENT=32, ASSIGN=33, PAR_OPEN=34, PAR_CLOSE=35, BRACK_OPEN=36, 
		BRACK_CLOSE=37, IDENTIFIER=38, STR_CONTENT=39, WS=40;
	public static final int
		RULE_startRule = 0, RULE_globalscope = 1, RULE_func = 2, RULE_func_def = 3, 
		RULE_func_return = 4, RULE_func_call = 5, RULE_func_params = 6, RULE_func_call_params = 7, 
		RULE_scope = 8, RULE_stats = 9, RULE_stat = 10, RULE_debugtools = 11, 
		RULE_printscopestat = 12, RULE_printstat = 13, RULE_retstat = 14, RULE_whileloop = 15, 
		RULE_ifchain = 16, RULE_ifstat = 17, RULE_elifstat_chain = 18, RULE_elifstat = 19, 
		RULE_maybe_elsestat = 20, RULE_elsestat = 21, RULE_assertion = 22, RULE_assignment = 23, 
		RULE_assignable = 24, RULE_e = 25, RULE_bool_e = 26, RULE_boolean_type = 27, 
		RULE_comparison = 28, RULE_bool_comparison = 29, RULE_variable = 30, RULE_float_type = 31, 
		RULE_integer = 32, RULE_string = 33, RULE_any_value = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "globalscope", "func", "func_def", "func_return", "func_call", 
			"func_params", "func_call_params", "scope", "stats", "stat", "debugtools", 
			"printscopestat", "printstat", "retstat", "whileloop", "ifchain", "ifstat", 
			"elifstat_chain", "elifstat", "maybe_elsestat", "elsestat", "assertion", 
			"assignment", "assignable", "e", "bool_e", "boolean_type", "comparison", 
			"bool_comparison", "variable", "float_type", "integer", "string", "any_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'func'", "'return'", "'printscope'", "'print'", "'assert'", 
			"'if'", "'elif'", "'else'", "'while'", "'true'", "'false'", "'and'", 
			"'or'", "'not'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", 
			"'^'", "'*'", "'/'", "'+'", "'-'", "'''", "'\"'", "'.'", "','", "'f'", 
			"'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBERS", "FUNC_KW", "FUNC_RET", "PRINTSCOPE_KW", "PRINT_KW", 
			"ASSERT_KW", "IF_KW", "ELIF_KW", "ELSE_KW", "WHILE_KW", "TRUE_KW", "FALSE_KW", 
			"AND_KW", "OR_KW", "NOT_KW", "EQUALS", "ISNOT", "LESSEQUALS", "MOREEQUALS", 
			"LESSTHAN", "MORETHAN", "SYMB_EXCLM", "SYMB_HAT", "SYMB_STAR", "SYMB_SLASH", 
			"SYMB_PLUS", "SYMB_MINUS", "SYMB_QUOTE", "SYMB_DQUOTE", "SYMB_DOT", "SYMB_COMMA", 
			"FLOAT_IDENT", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", "BRACK_OPEN", "BRACK_CLOSE", 
			"IDENTIFIER", "STR_CONTENT", "WS"
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
			setState(70);
			globalscope();
			setState(71);
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC_KW) | (1L << FUNC_RET) | (1L << PRINTSCOPE_KW) | (1L << PRINT_KW) | (1L << ASSERT_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC_KW:
					{
					setState(73);
					func();
					}
					break;
				case FUNC_RET:
				case PRINTSCOPE_KW:
				case PRINT_KW:
				case ASSERT_KW:
				case IF_KW:
				case WHILE_KW:
				case IDENTIFIER:
					{
					setState(74);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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
			setState(80);
			func_def();
			setState(81);
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
			setState(83);
			match(FUNC_KW);
			setState(84);
			match(IDENTIFIER);
			setState(85);
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
			setState(87);
			match(FUNC_RET);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88);
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
			setState(91);
			match(IDENTIFIER);
			setState(92);
			match(PAR_OPEN);
			setState(93);
			func_call_params();
			setState(94);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(96);
				match(IDENTIFIER);
				}
				}
				setState(101);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Func_call_params_singleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBERS) | (1L << TRUE_KW) | (1L << FALSE_KW) | (1L << NOT_KW) | (1L << SYMB_MINUS) | (1L << SYMB_DOT) | (1L << PAR_OPEN) | (1L << IDENTIFIER) | (1L << STR_CONTENT))) != 0)) {
					{
					setState(102);
					assignable();
					}
				}

				}
				break;
			case 2:
				_localctx = new Func_call_params_multipleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				assignable();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYMB_COMMA) {
					{
					{
					setState(106);
					match(SYMB_COMMA);
					setState(107);
					assignable();
					}
					}
					setState(112);
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
			setState(115);
			match(BRACK_OPEN);
			setState(116);
			stats();
			setState(117);
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
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC_RET) | (1L << PRINTSCOPE_KW) | (1L << PRINT_KW) | (1L << ASSERT_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(119);
				stat();
				}
				}
				setState(124);
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
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				debugtools();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				ifchain();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				assertion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				whileloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				func_return();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				func_call();
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
		enterRule(_localctx, 22, RULE_debugtools);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				printstat();
				}
				break;
			case PRINTSCOPE_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
		enterRule(_localctx, 24, RULE_printscopestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 26, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PRINT_KW);
			setState(141);
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
		enterRule(_localctx, 28, RULE_retstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 30, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WHILE_KW);
			setState(146);
			((WhileloopContext)_localctx).expr = bool_e(0);
			setState(147);
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
		enterRule(_localctx, 32, RULE_ifchain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((IfchainContext)_localctx).ifchain_if = ifstat();
			setState(150);
			((IfchainContext)_localctx).ifchain_elifs = elifstat_chain();
			setState(151);
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
		enterRule(_localctx, 34, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF_KW);
			setState(154);
			((IfstatContext)_localctx).expr = bool_e(0);
			setState(155);
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
		enterRule(_localctx, 36, RULE_elifstat_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF_KW) {
				{
				{
				setState(157);
				elifstat();
				}
				}
				setState(162);
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
		enterRule(_localctx, 38, RULE_elifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ELIF_KW);
			setState(164);
			((ElifstatContext)_localctx).expr = bool_e(0);
			setState(165);
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
		enterRule(_localctx, 40, RULE_maybe_elsestat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(167);
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
		enterRule(_localctx, 42, RULE_elsestat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ELSE_KW);
			setState(171);
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
		enterRule(_localctx, 44, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ASSERT_KW);
			setState(174);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((AssignmentContext)_localctx).name = variable();
			setState(177);
			match(ASSIGN);
			setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JurjenLangVisitor ) return ((JurjenLangVisitor<? extends T>)visitor).visitAssignable_expression(this);
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
		enterRule(_localctx, 48, RULE_assignable);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Assignable_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((Assignable_expressionContext)_localctx).expr = e(0);
				}
				break;
			case 2:
				_localctx = new Assignable_bool_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new E_parenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(PAR_OPEN);
				setState(186);
				((E_parenthesesContext)_localctx).expr = e(0);
				setState(187);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new E_negationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(SYMB_MINUS);
				setState(190);
				((E_negationContext)_localctx).expr = e(4);
				}
				break;
			case 3:
				{
				_localctx = new E_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				((E_variableContext)_localctx).name = variable();
				}
				break;
			case 4:
				{
				_localctx = new E_funcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((E_funcContext)_localctx).e_func = func_call();
				}
				break;
			case 5:
				{
				_localctx = new E_any_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				((E_any_valueContext)_localctx).value = any_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new E_exponentContext(new EContext(_parentctx, _parentState));
						((E_exponentContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((E_exponentContext)_localctx).operator = match(SYMB_HAT);
						setState(198);
						((E_exponentContext)_localctx).right = e(10);
						}
						break;
					case 2:
						{
						_localctx = new E_multiplyContext(new EContext(_parentctx, _parentState));
						((E_multiplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						((E_multiplyContext)_localctx).operator = match(SYMB_STAR);
						setState(201);
						((E_multiplyContext)_localctx).right = e(9);
						}
						break;
					case 3:
						{
						_localctx = new E_divisionContext(new EContext(_parentctx, _parentState));
						((E_divisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((E_divisionContext)_localctx).operator = match(SYMB_SLASH);
						setState(204);
						((E_divisionContext)_localctx).right = e(8);
						}
						break;
					case 4:
						{
						_localctx = new E_additionContext(new EContext(_parentctx, _parentState));
						((E_additionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((E_additionContext)_localctx).operator = match(SYMB_PLUS);
						setState(207);
						((E_additionContext)_localctx).right = e(7);
						}
						break;
					case 5:
						{
						_localctx = new E_subtractionContext(new EContext(_parentctx, _parentState));
						((E_subtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((E_subtractionContext)_localctx).operator = match(SYMB_MINUS);
						setState(210);
						((E_subtractionContext)_localctx).right = e(6);
						}
						break;
					case 6:
						{
						_localctx = new E_factorialContext(new EContext(_parentctx, _parentState));
						((E_factorialContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(211);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(212);
						((E_factorialContext)_localctx).operator = match(SYMB_EXCLM);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_bool_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new Bool_parenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				match(PAR_OPEN);
				setState(220);
				((Bool_parenthesesContext)_localctx).bool_expr = bool_e(0);
				setState(221);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new Bool_e_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(NOT_KW);
				setState(224);
				((Bool_e_notContext)_localctx).bool_expr = bool_e(5);
				}
				break;
			case 3:
				{
				_localctx = new Bool_e_expressionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				((Bool_e_expressionsContext)_localctx).left = e(0);
				setState(226);
				((Bool_e_expressionsContext)_localctx).oper = comparison();
				setState(227);
				((Bool_e_expressionsContext)_localctx).right = e(0);
				}
				break;
			case 4:
				{
				_localctx = new Bool_e_booleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				((Bool_e_booleanContext)_localctx).value = boolean_type();
				}
				break;
			case 5:
				{
				_localctx = new Bool_e_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				((Bool_e_variableContext)_localctx).name = variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_e_andContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_andContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						match(AND_KW);
						setState(235);
						((Bool_e_andContext)_localctx).right = bool_e(8);
						}
						break;
					case 2:
						{
						_localctx = new Bool_e_orContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_orContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						match(OR_KW);
						setState(238);
						((Bool_e_orContext)_localctx).right = bool_e(7);
						}
						break;
					case 3:
						{
						_localctx = new Bool_e_expressions_boolsContext(new Bool_eContext(_parentctx, _parentState));
						((Bool_e_expressions_boolsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool_e);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						((Bool_e_expressions_boolsContext)_localctx).oper = bool_comparison();
						setState(241);
						((Bool_e_expressions_boolsContext)_localctx).right = bool_e(4);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 54, RULE_boolean_type);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_KW:
				_localctx = new Boolean_trueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(TRUE_KW);
				}
				break;
			case FALSE_KW:
				_localctx = new Boolean_falseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
		enterRule(_localctx, 56, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 58, RULE_bool_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 60, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 62, RULE_float_type);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Float_by_dot_and_identContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(258);
					match(SYMB_MINUS);
					}
				}

				setState(261);
				((Float_by_dot_and_identContext)_localctx).pre_nrs = match(NUMBERS);
				setState(262);
				match(SYMB_DOT);
				setState(263);
				((Float_by_dot_and_identContext)_localctx).post_nrs = match(NUMBERS);
				setState(264);
				match(FLOAT_IDENT);
				}
				break;
			case 2:
				_localctx = new Float_by_dotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(265);
					match(SYMB_MINUS);
					}
				}

				setState(268);
				((Float_by_dotContext)_localctx).pre_nrs = match(NUMBERS);
				setState(269);
				match(SYMB_DOT);
				setState(270);
				((Float_by_dotContext)_localctx).post_nrs = match(NUMBERS);
				}
				break;
			case 3:
				_localctx = new Float_by_identContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(271);
					match(SYMB_MINUS);
					}
				}

				setState(274);
				((Float_by_identContext)_localctx).pre_nrs = match(NUMBERS);
				setState(275);
				match(FLOAT_IDENT);
				}
				break;
			case 4:
				_localctx = new Float_no_prior_by_dotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(276);
					match(SYMB_MINUS);
					}
				}

				setState(279);
				match(SYMB_DOT);
				setState(280);
				((Float_no_prior_by_dotContext)_localctx).post_nrs = match(NUMBERS);
				}
				break;
			case 5:
				_localctx = new Float_no_prior_by_dot_and_identContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYMB_MINUS) {
					{
					setState(281);
					match(SYMB_MINUS);
					}
				}

				setState(284);
				match(SYMB_DOT);
				setState(285);
				((Float_no_prior_by_dot_and_identContext)_localctx).post_nrs = match(NUMBERS);
				setState(286);
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
		enterRule(_localctx, 64, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMB_MINUS) {
				{
				setState(289);
				match(SYMB_MINUS);
				}
			}

			setState(292);
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
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		enterRule(_localctx, 68, RULE_any_value);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				float_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
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
		case 25:
			return e_sempred((EContext)_localctx, predIndex);
		case 26:
			return bool_e_sempred((Bool_eContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\b\7"+
		"\bd\n\b\f\b\16\bg\13\b\3\t\5\tj\n\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13"+
		"\t\5\tt\n\t\3\n\3\n\3\n\3\n\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\7\24\u00a1\n\24\f\24\16\24\u00a4\13\24\3\25\3\25\3\25"+
		"\3\25\3\26\5\26\u00ab\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\5\32\u00b9\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u00c5\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00d8\n\33\f\33\16\33\u00db"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00ea\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u00f6\n\34\f\34\16\34\u00f9\13\34\3\35\3\35\5\35\u00fd\n\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\5!\u0106\n!\3!\3!\3!\3!\3!\5!\u010d\n!\3!\3!\3!\3"+
		"!\5!\u0113\n!\3!\3!\3!\5!\u0118\n!\3!\3!\3!\5!\u011d\n!\3!\3!\3!\5!\u0122"+
		"\n!\3\"\5\"\u0125\n\"\3\"\3\"\3#\3#\3$\3$\3$\5$\u012e\n$\3$\2\4\64\66"+
		"%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"\2\4\3\2\22\27\3\2\22\23\2\u013c\2H\3\2\2\2\4O\3\2\2\2\6R\3\2\2\2\bU\3"+
		"\2\2\2\nY\3\2\2\2\f]\3\2\2\2\16e\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24|\3"+
		"\2\2\2\26\u0086\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2"+
		"\2\2\36\u0091\3\2\2\2 \u0093\3\2\2\2\"\u0097\3\2\2\2$\u009b\3\2\2\2&\u00a2"+
		"\3\2\2\2(\u00a5\3\2\2\2*\u00aa\3\2\2\2,\u00ac\3\2\2\2.\u00af\3\2\2\2\60"+
		"\u00b2\3\2\2\2\62\u00b8\3\2\2\2\64\u00c4\3\2\2\2\66\u00e9\3\2\2\28\u00fc"+
		"\3\2\2\2:\u00fe\3\2\2\2<\u0100\3\2\2\2>\u0102\3\2\2\2@\u0121\3\2\2\2B"+
		"\u0124\3\2\2\2D\u0128\3\2\2\2F\u012d\3\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3"+
		"\2\2\2KN\5\6\4\2LN\5\26\f\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP"+
		"\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\5\b\5\2ST\5\22\n\2T\7\3\2\2\2UV\7\4\2"+
		"\2VW\7(\2\2WX\5\16\b\2X\t\3\2\2\2Y[\7\5\2\2Z\\\5\36\20\2[Z\3\2\2\2[\\"+
		"\3\2\2\2\\\13\3\2\2\2]^\7(\2\2^_\7$\2\2_`\5\20\t\2`a\7%\2\2a\r\3\2\2\2"+
		"bd\7(\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2\2ge\3\2\2"+
		"\2hj\5\62\32\2ih\3\2\2\2ij\3\2\2\2jt\3\2\2\2kp\5\62\32\2lm\7!\2\2mo\5"+
		"\62\32\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2s"+
		"i\3\2\2\2sk\3\2\2\2t\21\3\2\2\2uv\7&\2\2vw\5\24\13\2wx\7\'\2\2x\23\3\2"+
		"\2\2y{\5\26\f\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~|"+
		"\3\2\2\2\177\u0087\5\60\31\2\u0080\u0087\5\30\r\2\u0081\u0087\5\"\22\2"+
		"\u0082\u0087\5.\30\2\u0083\u0087\5 \21\2\u0084\u0087\5\n\6\2\u0085\u0087"+
		"\5\f\7\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2"+
		"\2\2\u0087\27\3\2\2\2\u0088\u008b\5\34\17\2\u0089\u008b\5\32\16\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7\6\2"+
		"\2\u008d\33\3\2\2\2\u008e\u008f\7\7\2\2\u008f\u0090\5\62\32\2\u0090\35"+
		"\3\2\2\2\u0091\u0092\5\62\32\2\u0092\37\3\2\2\2\u0093\u0094\7\f\2\2\u0094"+
		"\u0095\5\66\34\2\u0095\u0096\5\22\n\2\u0096!\3\2\2\2\u0097\u0098\5$\23"+
		"\2\u0098\u0099\5&\24\2\u0099\u009a\5*\26\2\u009a#\3\2\2\2\u009b\u009c"+
		"\7\t\2\2\u009c\u009d\5\66\34\2\u009d\u009e\5\22\n\2\u009e%\3\2\2\2\u009f"+
		"\u00a1\5(\25\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\'\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\7\n\2\2\u00a6\u00a7\5\66\34\2\u00a7\u00a8\5\22\n\2\u00a8)\3\2\2\2\u00a9"+
		"\u00ab\5,\27\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab+\3\2\2\2"+
		"\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\22\n\2\u00ae-\3\2\2\2\u00af\u00b0"+
		"\7\b\2\2\u00b0\u00b1\5\66\34\2\u00b1/\3\2\2\2\u00b2\u00b3\5> \2\u00b3"+
		"\u00b4\7#\2\2\u00b4\u00b5\5\62\32\2\u00b5\61\3\2\2\2\u00b6\u00b9\5\64"+
		"\33\2\u00b7\u00b9\5\66\34\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\63\3\2\2\2\u00ba\u00bb\b\33\1\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5\64\33"+
		"\2\u00bd\u00be\7%\2\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c5"+
		"\5\64\33\6\u00c1\u00c5\5> \2\u00c2\u00c5\5\f\7\2\u00c3\u00c5\5F$\2\u00c4"+
		"\u00ba\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00d9\3\2\2\2\u00c6\u00c7\f\13\2\2\u00c7"+
		"\u00c8\7\31\2\2\u00c8\u00d8\5\64\33\f\u00c9\u00ca\f\n\2\2\u00ca\u00cb"+
		"\7\32\2\2\u00cb\u00d8\5\64\33\13\u00cc\u00cd\f\t\2\2\u00cd\u00ce\7\33"+
		"\2\2\u00ce\u00d8\5\64\33\n\u00cf\u00d0\f\b\2\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\u00d8\5\64\33\t\u00d2\u00d3\f\7\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d8"+
		"\5\64\33\b\u00d5\u00d6\f\f\2\2\u00d6\u00d8\7\30\2\2\u00d7\u00c6\3\2\2"+
		"\2\u00d7\u00c9\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d2"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\65\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\34\1"+
		"\2\u00dd\u00de\7$\2\2\u00de\u00df\5\66\34\2\u00df\u00e0\7%\2\2\u00e0\u00ea"+
		"\3\2\2\2\u00e1\u00e2\7\21\2\2\u00e2\u00ea\5\66\34\7\u00e3\u00e4\5\64\33"+
		"\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\5\64\33\2\u00e6\u00ea\3\2\2\2\u00e7"+
		"\u00ea\58\35\2\u00e8\u00ea\5> \2\u00e9\u00dc\3\2\2\2\u00e9\u00e1\3\2\2"+
		"\2\u00e9\u00e3\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00f7"+
		"\3\2\2\2\u00eb\u00ec\f\t\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00f6\5\66\34"+
		"\n\u00ee\u00ef\f\b\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f6\5\66\34\t\u00f1"+
		"\u00f2\f\5\2\2\u00f2\u00f3\5<\37\2\u00f3\u00f4\5\66\34\6\u00f4\u00f6\3"+
		"\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\67\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\7\r\2\2\u00fb\u00fd\7\16\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd9\3\2\2\2\u00fe\u00ff\t\2\2\2"+
		"\u00ff;\3\2\2\2\u0100\u0101\t\3\2\2\u0101=\3\2\2\2\u0102\u0103\7(\2\2"+
		"\u0103?\3\2\2\2\u0104\u0106\7\35\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7 \2\2\u0109"+
		"\u010a\7\3\2\2\u010a\u0122\7\"\2\2\u010b\u010d\7\35\2\2\u010c\u010b\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\3\2\2\u010f"+
		"\u0110\7 \2\2\u0110\u0122\7\3\2\2\u0111\u0113\7\35\2\2\u0112\u0111\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\3\2\2\u0115"+
		"\u0122\7\"\2\2\u0116\u0118\7\35\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7 \2\2\u011a\u0122\7\3\2\2\u011b"+
		"\u011d\7\35\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3"+
		"\2\2\2\u011e\u011f\7 \2\2\u011f\u0120\7\3\2\2\u0120\u0122\7\"\2\2\u0121"+
		"\u0105\3\2\2\2\u0121\u010c\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0117\3\2"+
		"\2\2\u0121\u011c\3\2\2\2\u0122A\3\2\2\2\u0123\u0125\7\35\2\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\3\2\2\u0127"+
		"C\3\2\2\2\u0128\u0129\7)\2\2\u0129E\3\2\2\2\u012a\u012e\5@!\2\u012b\u012e"+
		"\5B\"\2\u012c\u012e\5D#\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012eG\3\2\2\2\36MO[eips|\u0086\u008a\u00a2\u00aa\u00b8"+
		"\u00c4\u00d7\u00d9\u00e9\u00f5\u00f7\u00fc\u0105\u010c\u0112\u0117\u011c"+
		"\u0121\u0124\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}