// Generated from GameLang.g by ANTLR 4.5
package gamelang.parser; import static gamelang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Define=31, 
		Print=32, Roll=33, CALL=34, EXIT_GAME=35, Let=36, Dot=37, ENTER_QUEST=38, 
		Number=39, Identifier=40, Letter=41, LetterOrDigit=42, AT=43, ELLIPSIS=44, 
		WS=45, Comment=46, Line_Comment=47, STRING=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "Define", "Print", "Roll", 
		"CALL", "EXIT_GAME", "Let", "Dot", "ENTER_QUEST", "Number", "Identifier", 
		"Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'#'", "'*'", "'/'", 
		"'%'", "'^'", "'DETECTION-METER'", "'|'", "'DESPAWN'", "'GAME'", "'ORDER66'", 
		"'TRAVELER'", "'ARTHUR'", "'PORTAL'", "'JOEL'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'SHOOT-IF'", "'{'", "'}'", "'RESPAWN-WHILE'", 
		"'define'", "'PRINT'", "'ROLL'", "'CALL'", "'EXIT_GAME'", "'let'", "'.'", 
		"'ENTER-QUEST'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Define", "Print", "Roll", "CALL", 
		"EXIT_GAME", "Let", "Dot", "ENTER_QUEST", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", "STRING"
	};
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


	public GameLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 41:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u0121\n(\r(\16(\u0122\3)\3)\7)\u0127\n"+
		")\f)\16)\u012a\13)\3*\3*\3*\3*\3*\3*\5*\u0132\n*\3+\3+\3+\3+\3+\3+\5+"+
		"\u013a\n+\3,\3,\3-\3-\3.\3.\3.\3.\3/\6/\u0145\n/\r/\16/\u0146\3/\3/\3"+
		"\60\3\60\3\60\3\60\7\60\u014f\n\60\f\60\16\60\u0152\13\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015d\n\61\f\61\16\61\u0160\13"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0168\n\62\f\62\16\62\u016b\13"+
		"\62\3\62\3\62\3\u0150\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[.]/_\60a\61"+
		"c\62\3\2\n\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2$$^^\u0177"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\3e\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2"+
		"\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3"+
		"\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37\u0098\3\2\2\2!\u009d\3\2\2"+
		"\2#\u00a5\3\2\2\2%\u00ae\3\2\2\2\'\u00b5\3\2\2\2)\u00bc\3\2\2\2+\u00c1"+
		"\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c8\3\2\2\2\63\u00cb\3\2\2"+
		"\2\65\u00ce\3\2\2\2\67\u00d1\3\2\2\29\u00da\3\2\2\2;\u00dc\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00ec\3\2\2\2A\u00f3\3\2\2\2C\u00f9\3\2\2\2E\u00fe\3\2\2\2G"+
		"\u0103\3\2\2\2I\u010d\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0120\3\2"+
		"\2\2Q\u0124\3\2\2\2S\u0131\3\2\2\2U\u0139\3\2\2\2W\u013b\3\2\2\2Y\u013d"+
		"\3\2\2\2[\u013f\3\2\2\2]\u0144\3\2\2\2_\u014a\3\2\2\2a\u0158\3\2\2\2c"+
		"\u0163\3\2\2\2ef\7U\2\2fg\7V\2\2gh\7C\2\2hi\7V\2\2i\4\3\2\2\2jk\7?\2\2"+
		"k\6\3\2\2\2lm\7*\2\2m\b\3\2\2\2no\7+\2\2o\n\3\2\2\2pq\7/\2\2q\f\3\2\2"+
		"\2rs\7-\2\2s\16\3\2\2\2tu\7%\2\2u\20\3\2\2\2vw\7,\2\2w\22\3\2\2\2xy\7"+
		"\61\2\2y\24\3\2\2\2z{\7\'\2\2{\26\3\2\2\2|}\7`\2\2}\30\3\2\2\2~\177\7"+
		"F\2\2\177\u0080\7G\2\2\u0080\u0081\7V\2\2\u0081\u0082\7G\2\2\u0082\u0083"+
		"\7E\2\2\u0083\u0084\7V\2\2\u0084\u0085\7K\2\2\u0085\u0086\7Q\2\2\u0086"+
		"\u0087\7P\2\2\u0087\u0088\7/\2\2\u0088\u0089\7O\2\2\u0089\u008a\7G\2\2"+
		"\u008a\u008b\7V\2\2\u008b\u008c\7G\2\2\u008c\u008d\7T\2\2\u008d\32\3\2"+
		"\2\2\u008e\u008f\7~\2\2\u008f\34\3\2\2\2\u0090\u0091\7F\2\2\u0091\u0092"+
		"\7G\2\2\u0092\u0093\7U\2\2\u0093\u0094\7R\2\2\u0094\u0095\7C\2\2\u0095"+
		"\u0096\7Y\2\2\u0096\u0097\7P\2\2\u0097\36\3\2\2\2\u0098\u0099\7I\2\2\u0099"+
		"\u009a\7C\2\2\u009a\u009b\7O\2\2\u009b\u009c\7G\2\2\u009c \3\2\2\2\u009d"+
		"\u009e\7Q\2\2\u009e\u009f\7T\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1\7G\2\2"+
		"\u00a1\u00a2\7T\2\2\u00a2\u00a3\78\2\2\u00a3\u00a4\78\2\2\u00a4\"\3\2"+
		"\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9"+
		"\7X\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7G\2\2\u00ac"+
		"\u00ad\7T\2\2\u00ad$\3\2\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7T\2\2\u00b0"+
		"\u00b1\7V\2\2\u00b1\u00b2\7J\2\2\u00b2\u00b3\7W\2\2\u00b3\u00b4\7T\2\2"+
		"\u00b4&\3\2\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7T\2"+
		"\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7N\2\2\u00bb(\3\2"+
		"\2\2\u00bc\u00bd\7L\2\2\u00bd\u00be\7Q\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0"+
		"\7N\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7"+
		">\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6\u00c7\7?\2\2\u00c7\60\3"+
		"\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca\7?\2\2\u00ca\62\3\2\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc\u00cd\7?\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d0"+
		"\7?\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7J\2\2\u00d3\u00d4"+
		"\7Q\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7\7/\2\2\u00d7"+
		"\u00d8\7K\2\2\u00d8\u00d9\7H\2\2\u00d98\3\2\2\2\u00da\u00db\7}\2\2\u00db"+
		":\3\2\2\2\u00dc\u00dd\7\177\2\2\u00dd<\3\2\2\2\u00de\u00df\7T\2\2\u00df"+
		"\u00e0\7G\2\2\u00e0\u00e1\7U\2\2\u00e1\u00e2\7R\2\2\u00e2\u00e3\7C\2\2"+
		"\u00e3\u00e4\7Y\2\2\u00e4\u00e5\7P\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7"+
		"\7Y\2\2\u00e7\u00e8\7J\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7N\2\2\u00ea"+
		"\u00eb\7G\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7h\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7g\2\2"+
		"\u00f2@\3\2\2\2\u00f3\u00f4\7R\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7K\2"+
		"\2\u00f6\u00f7\7P\2\2\u00f7\u00f8\7V\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7"+
		"T\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7N\2\2\u00fc\u00fd\7N\2\2\u00fdD"+
		"\3\2\2\2\u00fe\u00ff\7E\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7N\2\2\u0101"+
		"\u0102\7N\2\2\u0102F\3\2\2\2\u0103\u0104\7G\2\2\u0104\u0105\7Z\2\2\u0105"+
		"\u0106\7K\2\2\u0106\u0107\7V\2\2\u0107\u0108\7a\2\2\u0108\u0109\7I\2\2"+
		"\u0109\u010a\7C\2\2\u010a\u010b\7O\2\2\u010b\u010c\7G\2\2\u010cH\3\2\2"+
		"\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2\u010f\u0110\7v\2\2\u0110J\3\2"+
		"\2\2\u0111\u0112\7\60\2\2\u0112L\3\2\2\2\u0113\u0114\7G\2\2\u0114\u0115"+
		"\7P\2\2\u0115\u0116\7V\2\2\u0116\u0117\7G\2\2\u0117\u0118\7T\2\2\u0118"+
		"\u0119\7/\2\2\u0119\u011a\7S\2\2\u011a\u011b\7W\2\2\u011b\u011c\7G\2\2"+
		"\u011c\u011d\7U\2\2\u011d\u011e\7V\2\2\u011eN\3\2\2\2\u011f\u0121\5W,"+
		"\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123P\3\2\2\2\u0124\u0128\5S*\2\u0125\u0127\5U+\2\u0126\u0125"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"R\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0132\t\2\2\2\u012c\u012d\n\3\2\2"+
		"\u012d\u0132\6*\2\2\u012e\u012f\t\4\2\2\u012f\u0130\t\5\2\2\u0130\u0132"+
		"\6*\3\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012e\3\2\2\2\u0132"+
		"T\3\2\2\2\u0133\u013a\t\6\2\2\u0134\u0135\n\3\2\2\u0135\u013a\6+\4\2\u0136"+
		"\u0137\t\4\2\2\u0137\u0138\t\5\2\2\u0138\u013a\6+\5\2\u0139\u0133\3\2"+
		"\2\2\u0139\u0134\3\2\2\2\u0139\u0136\3\2\2\2\u013aV\3\2\2\2\u013b\u013c"+
		"\4\62;\2\u013cX\3\2\2\2\u013d\u013e\7B\2\2\u013eZ\3\2\2\2\u013f\u0140"+
		"\7\60\2\2\u0140\u0141\7\60\2\2\u0141\u0142\7\60\2\2\u0142\\\3\2\2\2\u0143"+
		"\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b/\2\2\u0149"+
		"^\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\7,\2\2\u014c\u0150\3\2\2\2"+
		"\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\7,\2\2\u0154\u0155\7\61\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\60"+
		"\2\2\u0157`\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7\61\2\2\u015a\u015e"+
		"\3\2\2\2\u015b\u015d\n\b\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0162\b\61\2\2\u0162b\3\2\2\2\u0163\u0169\7$\2\2\u0164\u0168"+
		"\n\t\2\2\u0165\u0166\7^\2\2\u0166\u0168\13\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7$\2\2\u016d"+
		"d\3\2\2\2\f\2\u0122\u0128\u0131\u0139\u0146\u0150\u015e\u0167\u0169\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}