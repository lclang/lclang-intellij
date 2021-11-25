// Generated from C:/IdeaProjects/lclang-intellij/src/lclang\lclang.g4 by ANTLR 4.9.1
package lclang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lclangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, OPEN=3, CLOSE=4, OPEN_BRACE=5, CLOSE_BRACE=6, 
		OPEN_BRACKET=7, CLOSE_BRACKET=8, POW=9, EQUALS=10, NOT_EQUALS=11, AND_BOOL=12, 
		OR_BOOL=13, LESS_EQUALS=14, LARGER_EQUALS=15, UNARY_ADD=16, UNARY_MINUS=17, 
		NULLABLE_OR=18, NULLABLE=19, LAMBDA_PREFIX=20, TYPE_PREFIX=21, COMMA=22, 
		SEMICOLON=23, ASSIGN=24, OR=25, AND=26, NOT=27, LESS=28, LARGER=29, MULTYPLICATION=30, 
		DIVISION=31, ADD=32, MINUS=33, COLON=34, DOT=35, AS_ATTR=36, GLOBAL=37, 
		METHOD=38, USE=39, CLASS=40, FROM=41, EXTENDS=42, COMPONENT=43, STOP=44, 
		RETURN=45, WHILE=46, IF=47, IS=48, ELSE=49, NULL=50, BOOL=51, ID=52, STRING=53, 
		CHAR=54, HEX_LONG=55, LONG=56, DOUBLE=57, INTEGER=58, WS=59, ERRCHAR=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LINE_COMMENT", "OPEN", "CLOSE", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "POW", "EQUALS", "NOT_EQUALS", "AND_BOOL", 
			"OR_BOOL", "LESS_EQUALS", "LARGER_EQUALS", "UNARY_ADD", "UNARY_MINUS", 
			"NULLABLE_OR", "NULLABLE", "LAMBDA_PREFIX", "TYPE_PREFIX", "COMMA", "SEMICOLON", 
			"ASSIGN", "OR", "AND", "NOT", "LESS", "LARGER", "MULTYPLICATION", "DIVISION", 
			"ADD", "MINUS", "COLON", "DOT", "AS_ATTR", "GLOBAL", "METHOD", "USE", 
			"CLASS", "FROM", "EXTENDS", "COMPONENT", "STOP", "RETURN", "WHILE", "IF", 
			"IS", "ELSE", "NULL", "BOOL", "ID", "STRING", "CHAR", "HEX_LONG", "LONG", 
			"DOUBLE", "INTEGER", "WS", "ESC", "UNICODE", "HEX", "ERRCHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'**'", "'=='", 
			"'!='", "'&&'", "'||'", "'<='", "'>='", "'++'", "'--'", "'?:'", "'?'", 
			"'->'", "'\\'", "','", "';'", "'='", "'|'", "'&'", "'!'", "'<'", "'>'", 
			"'*'", "'/'", "'+'", "'-'", "':'", "'.'", "'@'", "'global'", "'method'", 
			"'use'", "'class'", "'from'", "'extends'", "'component'", "'stop'", "'return'", 
			"'while'", "'if'", "'is'", "'else'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "OPEN", "CLOSE", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "POW", "EQUALS", "NOT_EQUALS", "AND_BOOL", 
			"OR_BOOL", "LESS_EQUALS", "LARGER_EQUALS", "UNARY_ADD", "UNARY_MINUS", 
			"NULLABLE_OR", "NULLABLE", "LAMBDA_PREFIX", "TYPE_PREFIX", "COMMA", "SEMICOLON", 
			"ASSIGN", "OR", "AND", "NOT", "LESS", "LARGER", "MULTYPLICATION", "DIVISION", 
			"ADD", "MINUS", "COLON", "DOT", "AS_ATTR", "GLOBAL", "METHOD", "USE", 
			"CLASS", "FROM", "EXTENDS", "COMPONENT", "STOP", "RETURN", "WHILE", "IF", 
			"IS", "ELSE", "NULL", "BOOL", "ID", "STRING", "CHAR", "HEX_LONG", "LONG", 
			"DOUBLE", "INTEGER", "WS", "ERRCHAR"
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


	public lclangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lclang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u019e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\6\2\u0086\n\2\r\2\16\2\u0087\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\u0093\n\3\r\3\16\3\u0094\3\3\5\3\u0098"+
		"\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0145"+
		"\n\64\3\65\6\65\u0148\n\65\r\65\16\65\u0149\3\66\3\66\3\66\7\66\u014f"+
		"\n\66\f\66\16\66\u0152\13\66\3\66\3\66\3\67\3\67\3\67\5\67\u0159\n\67"+
		"\3\67\3\67\38\38\68\u015f\n8\r8\168\u0160\39\39\39\69\u0166\n9\r9\169"+
		"\u0167\59\u016a\n9\39\39\3:\3:\3:\7:\u0171\n:\f:\16:\u0174\13:\5:\u0176"+
		"\n:\3:\3:\6:\u017a\n:\r:\16:\u017b\3;\3;\3;\6;\u0181\n;\r;\16;\u0182\5"+
		";\u0185\n;\3<\6<\u0188\n<\r<\16<\u0189\3<\3<\3=\3=\3=\5=\u0191\n=\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\4\u0087\u0094\2A\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y\2{\2}\2\177"+
		">\3\2\13\4\3\f\f\17\17\5\2C\\aac|\4\2$$^^\4\2))^^\3\2\62;\3\2\63;\5\2"+
		"\13\f\17\17\"\"\n\2$$))\61\61^^ddppttvv\4\2\62;Ch\2\u01ab\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2"+
		"\2\2\5\u008e\3\2\2\2\7\u009b\3\2\2\2\t\u009d\3\2\2\2\13\u009f\3\2\2\2"+
		"\r\u00a1\3\2\2\2\17\u00a3\3\2\2\2\21\u00a5\3\2\2\2\23\u00a7\3\2\2\2\25"+
		"\u00aa\3\2\2\2\27\u00ad\3\2\2\2\31\u00b0\3\2\2\2\33\u00b3\3\2\2\2\35\u00b6"+
		"\3\2\2\2\37\u00b9\3\2\2\2!\u00bc\3\2\2\2#\u00bf\3\2\2\2%\u00c2\3\2\2\2"+
		"\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00ca\3\2\2\2-\u00cc\3\2\2\2/\u00ce\3"+
		"\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67\u00d6\3\2"+
		"\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00e0"+
		"\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I\u00e8\3\2\2\2K"+
		"\u00ea\3\2\2\2M\u00f1\3\2\2\2O\u00f8\3\2\2\2Q\u00fc\3\2\2\2S\u0102\3\2"+
		"\2\2U\u0107\3\2\2\2W\u010f\3\2\2\2Y\u0119\3\2\2\2[\u011e\3\2\2\2]\u0125"+
		"\3\2\2\2_\u012b\3\2\2\2a\u012e\3\2\2\2c\u0131\3\2\2\2e\u0136\3\2\2\2g"+
		"\u0144\3\2\2\2i\u0147\3\2\2\2k\u014b\3\2\2\2m\u0155\3\2\2\2o\u015c\3\2"+
		"\2\2q\u0169\3\2\2\2s\u0175\3\2\2\2u\u0184\3\2\2\2w\u0187\3\2\2\2y\u018d"+
		"\3\2\2\2{\u0192\3\2\2\2}\u0198\3\2\2\2\177\u019a\3\2\2\2\u0081\u0082\7"+
		"\61\2\2\u0082\u0083\7,\2\2\u0083\u0085\3\2\2\2\u0084\u0086\13\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\2\2\2\u008d\4\3\2\2\2\u008e\u008f\7\61\2"+
		"\2\u008f\u0090\7\61\2\2\u0090\u0092\3\2\2\2\u0091\u0093\13\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\3\2\2\u009a\6\3\2\2\2\u009b\u009c\7*\2\2"+
		"\u009c\b\3\2\2\2\u009d\u009e\7+\2\2\u009e\n\3\2\2\2\u009f\u00a0\7}\2\2"+
		"\u00a0\f\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7"+
		"]\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7_\2\2\u00a6\22\3\2\2\2\u00a7\u00a8"+
		"\7,\2\2\u00a8\u00a9\7,\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af\30"+
		"\3\2\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\7(\2\2\u00b2\32\3\2\2\2\u00b3"+
		"\u00b4\7~\2\2\u00b4\u00b5\7~\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		" \3\2\2\2\u00bc\u00bd\7-\2\2\u00bd\u00be\7-\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\7/\2\2\u00c0\u00c1\7/\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7A\2\2\u00c3"+
		"\u00c4\7<\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7A\2\2\u00c6(\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\u00c9\7@\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7^\2\2\u00cb,\3"+
		"\2\2\2\u00cc\u00cd\7.\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\60\3"+
		"\2\2\2\u00d0\u00d1\7?\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3\64"+
		"\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7"+
		"8\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9:\3\2\2\2\u00da\u00db\7@\2\2\u00db<"+
		"\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd>\3\2\2\2\u00de\u00df\7\61\2\2\u00df"+
		"@\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3D"+
		"\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7"+
		"H\3\2\2\2\u00e8\u00e9\7B\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec"+
		"\7n\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0L\3\2\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7f\2\2"+
		"\u00f7N\3\2\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2"+
		"\2\u00fbP\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7"+
		"c\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7u\2\2\u0101R\3\2\2\2\u0102\u0103"+
		"\7h\2\2\u0103\u0104\7t\2\2\u0104\u0105\7q\2\2\u0105\u0106\7o\2\2\u0106"+
		"T\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7z\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7g\2\2\u010b\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d\u010e\7u\2\2"+
		"\u010eV\3\2\2\2\u010f\u0110\7e\2\2\u0110\u0111\7q\2\2\u0111\u0112\7o\2"+
		"\2\u0112\u0113\7r\2\2\u0113\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118X\3\2\2\2\u0119\u011a"+
		"\7u\2\2\u011a\u011b\7v\2\2\u011b\u011c\7q\2\2\u011c\u011d\7r\2\2\u011d"+
		"Z\3\2\2\2\u011e\u011f\7t\2\2\u011f\u0120\7g\2\2\u0120\u0121\7v\2\2\u0121"+
		"\u0122\7w\2\2\u0122\u0123\7t\2\2\u0123\u0124\7p\2\2\u0124\\\3\2\2\2\u0125"+
		"\u0126\7y\2\2\u0126\u0127\7j\2\2\u0127\u0128\7k\2\2\u0128\u0129\7n\2\2"+
		"\u0129\u012a\7g\2\2\u012a^\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7h\2"+
		"\2\u012d`\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7u\2\2\u0130b\3\2\2\2"+
		"\u0131\u0132\7g\2\2\u0132\u0133\7n\2\2\u0133\u0134\7u\2\2\u0134\u0135"+
		"\7g\2\2\u0135d\3\2\2\2\u0136\u0137\7p\2\2\u0137\u0138\7w\2\2\u0138\u0139"+
		"\7n\2\2\u0139\u013a\7n\2\2\u013af\3\2\2\2\u013b\u013c\7v\2\2\u013c\u013d"+
		"\7t\2\2\u013d\u013e\7w\2\2\u013e\u0145\7g\2\2\u013f\u0140\7h\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7n\2\2\u0142\u0143\7u\2\2\u0143\u0145\7g\2\2"+
		"\u0144\u013b\3\2\2\2\u0144\u013f\3\2\2\2\u0145h\3\2\2\2\u0146\u0148\t"+
		"\3\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014aj\3\2\2\2\u014b\u0150\7$\2\2\u014c\u014f\5y=\2\u014d"+
		"\u014f\n\4\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154l\3\2\2\2\u0155\u0158\7)\2\2\u0156"+
		"\u0159\5y=\2\u0157\u0159\n\5\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015b\7)\2\2\u015bn\3\2\2\2\u015c\u015e\7"+
		"%\2\2\u015d\u015f\5}?\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161p\3\2\2\2\u0162\u016a\t\6\2\2"+
		"\u0163\u0165\t\7\2\2\u0164\u0166\t\6\2\2\u0165\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0162\3\2\2\2\u0169\u0163\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7N"+
		"\2\2\u016cr\3\2\2\2\u016d\u0176\t\6\2\2\u016e\u0172\t\7\2\2\u016f\u0171"+
		"\t\6\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u016d\3\2"+
		"\2\2\u0175\u016e\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\60\2\2\u0178"+
		"\u017a\t\6\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017ct\3\2\2\2\u017d\u0185\t\6\2\2\u017e\u0180"+
		"\t\7\2\2\u017f\u0181\t\6\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u017d\3\2"+
		"\2\2\u0184\u017e\3\2\2\2\u0185v\3\2\2\2\u0186\u0188\t\b\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\b<\3\2\u018cx\3\2\2\2\u018d\u0190\7^\2\2\u018e"+
		"\u0191\t\t\2\2\u018f\u0191\5{>\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2"+
		"\2\u0191z\3\2\2\2\u0192\u0193\7w\2\2\u0193\u0194\5}?\2\u0194\u0195\5}"+
		"?\2\u0195\u0196\5}?\2\u0196\u0197\5}?\2\u0197|\3\2\2\2\u0198\u0199\t\n"+
		"\2\2\u0199~\3\2\2\2\u019a\u019b\13\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\b@\2\2\u019d\u0080\3\2\2\2\25\2\u0087\u0094\u0097\u0144\u0149\u014e\u0150"+
		"\u0158\u0160\u0167\u0169\u0172\u0175\u017b\u0182\u0184\u0189\u0190\4\2"+
		"\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}