// Generated from JurjenLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JurjenLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBERS", "FUNC_KW", "FUNC_RET", "PRINTSCOPE_KW", "PRINT_KW", "ASSERT_KW", 
			"IF_KW", "ELIF_KW", "ELSE_KW", "WHILE_KW", "REPEAT_KW", "UNTIL_KW", "BREAK_KW", 
			"TRUE_KW", "FALSE_KW", "AND_KW", "OR_KW", "NOT_KW", "MATRIX_INV", "MATRIX_TRANS", 
			"EQUALS", "ISNOT", "LESSEQUALS", "MOREEQUALS", "LESSTHAN", "MORETHAN", 
			"SYMB_DOUBLEPLUS", "SYMB_EXCLM", "SYMB_HAT", "SYMB_STAR", "SYMB_SLASH", 
			"SYMB_PLUS", "SYMB_MINUS", "SYMB_QUOTE", "SYMB_DQUOTE", "SYMB_DOT", "SYMB_COMMA", 
			"FLOAT_IDENT", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", "SQBRACK_OPEN", "SQBRACK_CLOSE", 
			"BRACK_OPEN", "BRACK_CLOSE", "IDENTIFIER", "STR_CONTENT", "WS", "HEX_DIGIT", 
			"ESC_SEQ", "UNICODE_ESC", "DIGIT", "BIT"
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


	public JurjenLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JurjenLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\6\2o\n\2\r\2\16\2p\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\7/\u0113\n/\f/\16/\u0116\13/\3\60\3\60\3\60"+
		"\7\60\u011b\n\60\f\60\16\60\u011e\13\60\3\60\3\60\3\61\6\61\u0123\n\61"+
		"\r\61\16\61\u0124\3\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u012e\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\2\2\67\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2\3\2\b\4\2C\\c|\6"+
		"\2\62;C\\aac|\4\2$$^^\5\2\13\f\17\17\"\"\5\2\62;CHch\n\2$$))^^ddhhppt"+
		"tvv\2\u013a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\3n\3\2\2\2\5r\3\2\2\2\7w\3\2\2\2\t~\3\2\2\2\13\u0089\3"+
		"\2\2\2\r\u008f\3\2\2\2\17\u0096\3\2\2\2\21\u0099\3\2\2\2\23\u009e\3\2"+
		"\2\2\25\u00a3\3\2\2\2\27\u00a9\3\2\2\2\31\u00b0\3\2\2\2\33\u00b6\3\2\2"+
		"\2\35\u00bc\3\2\2\2\37\u00c1\3\2\2\2!\u00c7\3\2\2\2#\u00cb\3\2\2\2%\u00ce"+
		"\3\2\2\2\'\u00d2\3\2\2\2)\u00d6\3\2\2\2+\u00d9\3\2\2\2-\u00dc\3\2\2\2"+
		"/\u00df\3\2\2\2\61\u00e2\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67"+
		"\u00e9\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2"+
		"\2\2A\u00f4\3\2\2\2C\u00f6\3\2\2\2E\u00f8\3\2\2\2G\u00fa\3\2\2\2I\u00fc"+
		"\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0104\3\2\2\2S"+
		"\u0106\3\2\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2[\u010e\3\2"+
		"\2\2]\u0110\3\2\2\2_\u0117\3\2\2\2a\u0122\3\2\2\2c\u0128\3\2\2\2e\u012d"+
		"\3\2\2\2g\u012f\3\2\2\2i\u0136\3\2\2\2k\u0138\3\2\2\2mo\5i\65\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\4\3\2\2\2rs\7h\2\2st\7w\2\2tu\7p\2"+
		"\2uv\7e\2\2v\6\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7v\2\2z{\7w\2\2{|\7t\2\2|}"+
		"\7p\2\2}\b\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0084\7u\2\2\u0084\u0085\7e\2\2"+
		"\u0085\u0086\7q\2\2\u0086\u0087\7r\2\2\u0087\u0088\7g\2\2\u0088\n\3\2"+
		"\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7v\2\2\u008e\f\3\2\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7v\2\2\u0095\16\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098"+
		"\20\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7h\2\2\u009d\22\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4"+
		"\u00a5\7j\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\26\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7"+
		"r\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\30"+
		"\3\2\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7m\2\2"+
		"\u00bb\34\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7"+
		"w\2\2\u00bf\u00c0\7g\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3"+
		"\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		" \3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\"\3\2\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7v\2\2\u00d1&\3\2\2\2\u00d2"+
		"\u00d3\7`\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7\63\2\2\u00d5(\3\2\2\2\u00d6"+
		"\u00d7\7`\2\2\u00d7\u00d8\7V\2\2\u00d8*\3\2\2\2\u00d9\u00da\7?\2\2\u00da"+
		"\u00db\7?\2\2\u00db,\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7?\2\2\u00de"+
		".\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7?\2\2\u00e1\60\3\2\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e3\u00e4\7?\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6"+
		"\64\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea"+
		"\u00eb\7-\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed:\3\2\2\2\u00ee\u00ef"+
		"\7`\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7"+
		"\61\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7"+
		"/\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7$"+
		"\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7"+
		".\2\2\u00ffL\3\2\2\2\u0100\u0101\7h\2\2\u0101N\3\2\2\2\u0102\u0103\7?"+
		"\2\2\u0103P\3\2\2\2\u0104\u0105\7*\2\2\u0105R\3\2\2\2\u0106\u0107\7+\2"+
		"\2\u0107T\3\2\2\2\u0108\u0109\7]\2\2\u0109V\3\2\2\2\u010a\u010b\7_\2\2"+
		"\u010bX\3\2\2\2\u010c\u010d\7}\2\2\u010dZ\3\2\2\2\u010e\u010f\7\177\2"+
		"\2\u010f\\\3\2\2\2\u0110\u0114\t\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"^\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\7$\2\2\u0118\u011b\5e\63\2\u0119"+
		"\u011b\n\4\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\7$\2\2\u0120`\3\2\2\2\u0121\u0123\t\5\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\61\2\2\u0127b\3\2\2\2\u0128\u0129"+
		"\t\6\2\2\u0129d\3\2\2\2\u012a\u012b\7^\2\2\u012b\u012e\t\7\2\2\u012c\u012e"+
		"\5g\64\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2\2\2\u012ef\3\2\2\2\u012f"+
		"\u0130\7^\2\2\u0130\u0131\7w\2\2\u0131\u0132\5c\62\2\u0132\u0133\5c\62"+
		"\2\u0133\u0134\5c\62\2\u0134\u0135\5c\62\2\u0135h\3\2\2\2\u0136\u0137"+
		"\4\62;\2\u0137j\3\2\2\2\u0138\u0139\4\62\63\2\u0139l\3\2\2\2\t\2p\u0114"+
		"\u011a\u011c\u0124\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}