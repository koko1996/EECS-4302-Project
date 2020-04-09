// Generated from Expr.g4 by ANTLR 4.8

        package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
			T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
			T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, VARIABLE = 36, IntConstant = 37, BoolConstant = 38,
			ConstantValue = 39, ID = 40, COMMENT = 41, WS = 42, SEMICOLON = 43, COMMA = 44;
	public static final int
			RULE_prog = 0, RULE_statement = 1, RULE_declaration = 2, RULE_loop = 3,
			RULE_function = 4, RULE_parameters = 5, RULE_parameterVariable = 6, RULE_functionCall = 7,
			RULE_functionCallParameter = 8, RULE_singleParameter = 9, RULE_assertedConditional = 10,
			RULE_conditional = 11, RULE_elseIf = 12, RULE_finaElse = 13, RULE_multAssigSimple = 14,
			RULE_multAssig = 15, RULE_assignment = 16, RULE_expression = 17, RULE_arithmeticOp = 18,
			RULE_relationalOp = 19, RULE_logicalOp = 20;
	public static final String[] ruleNames = makeRuleNames();
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0148\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\3" +
					"\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
					"\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
					"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\7\3" +
					"\7\5\7\u0087\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0094" +
					"\n\n\f\n\16\n\u0097\13\n\3\n\3\n\5\n\u009b\n\n\3\13\3\13\5\13\u009f\n" +
					"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3" +
					"\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\r\5\r\u00b9\n\r\3\16\3\16\3" +
					"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00ca" +
					"\n\20\r\20\16\20\u00cb\3\21\3\21\6\21\u00d0\n\21\r\21\16\21\u00d1\3\22" +
					"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22" +
					"\u00e2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ec\n\23\3" +
					"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\24\3\24" +
					"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24" +
					"\u0108\n\24\f\24\16\24\u010b\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
					"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
					"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\26\3\26\3\26\3\26" +
					"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0135\n\26\3\26\3\26\3\26\3\26\3\26" +
					"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0143\n\26\f\26\16\26\u0146\13" +
					"\26\3\26\2\4&*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2" +
					"\u0161\2-\3\2\2\2\49\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\ng\3\2\2\2\f\u0086" +
					"\3\2\2\2\16\u0088\3\2\2\2\20\u008b\3\2\2\2\22\u009a\3\2\2\2\24\u009e\3" +
					"\2\2\2\26\u00a0\3\2\2\2\30\u00aa\3\2\2\2\32\u00ba\3\2\2\2\34\u00c3\3\2" +
					"\2\2\36\u00c9\3\2\2\2 \u00cf\3\2\2\2\"\u00e1\3\2\2\2$\u00eb\3\2\2\2&\u00f6" +
					"\3\2\2\2(\u0128\3\2\2\2*\u0134\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/" +
					"-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63:\5\6" +
					"\4\2\64:\5\"\22\2\65:\5\30\r\2\66:\5\26\f\2\67:\5\n\6\28:\5\b\5\29\63" +
					"\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5" +
					"\3\2\2\2;<\7&\2\2<=\7*\2\2=J\7-\2\2>?\7&\2\2?@\7*\2\2@A\7\3\2\2AB\7*\2" +
					"\2BJ\7-\2\2CD\7&\2\2DE\7*\2\2EF\7\3\2\2FG\5$\23\2GH\7-\2\2HJ\3\2\2\2I" +
					";\3\2\2\2I>\3\2\2\2IC\3\2\2\2J\7\3\2\2\2KL\7\4\2\2LM\7\5\2\2MN\5*\26\2" +
					"NO\7\6\2\2OP\7\7\2\2PQ\7\b\2\2QR\5\36\20\2RS\7\t\2\2ST\7\n\2\2TU\7\5\2" +
					"\2UV\5*\26\2VW\7\6\2\2WX\7\b\2\2XY\7\13\2\2YZ\7\5\2\2Z[\5$\23\2[\\\7\6" +
					"\2\2\\]\7\f\2\2]^\7\5\2\2^_\7*\2\2_`\7\6\2\2`a\5 \21\2ab\7\t\2\2bc\7\r" +
					"\2\2cd\7\5\2\2de\5*\26\2ef\7\6\2\2f\t\3\2\2\2gh\7\16\2\2hi\7&\2\2ij\7" +
					"*\2\2jk\7\5\2\2kl\5\f\7\2lm\7\6\2\2mn\7\b\2\2no\7\17\2\2op\7\5\2\2pq\5" +
					"*\26\2qr\7\6\2\2rs\5 \21\2st\7\20\2\2tu\7*\2\2uv\7-\2\2vw\7\21\2\2wx\7" +
					"\5\2\2xy\5*\26\2yz\7\6\2\2z{\7\t\2\2{\13\3\2\2\2|}\5\16\b\2}~\7.\2\2~" +
					"\u0080\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081" +
					"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\5\16" +
					"\b\2\u0085\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087" +
					"\r\3\2\2\2\u0088\u0089\7&\2\2\u0089\u008a\7*\2\2\u008a\17\3\2\2\2\u008b" +
					"\u008c\7*\2\2\u008c\u008d\7\5\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\6" +
					"\2\2\u008f\21\3\2\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7.\2\2\u0092\u0094" +
					"\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095" +
					"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009b\5\24" +
					"\13\2\u0099\u009b\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b" +
					"\23\3\2\2\2\u009c\u009f\7*\2\2\u009d\u009f\5$\23\2\u009e\u009c\3\2\2\2" +
					"\u009e\u009d\3\2\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2" +
					"\7\5\2\2\u00a2\u00a3\5*\26\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5\30\r\2" +
					"\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\5*\26\2\u00a8\u00a9" +
					"\7\6\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7\5\2\2\u00ac" +
					"\u00ad\5*\26\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5 " +
					"\21\2\u00b0\u00b4\7\t\2\2\u00b1\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b3" +
					"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2" +
					"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8" +
					"\u00b9\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\7\24" +
					"\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\6\2\2\u00bf" +
					"\u00c0\7\b\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\7\t\2\2\u00c2\33\3\2\2" +
					"\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5 \21\2\u00c6" +
					"\u00c7\7\t\2\2\u00c7\35\3\2\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c8\3\2\2" +
					"\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\37" +
					"\3\2\2\2\u00cd\u00d0\5\"\22\2\u00ce\u00d0\5\30\r\2\u00cf\u00cd\3\2\2\2" +
					"\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2" +
					"\3\2\2\2\u00d2!\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4\u00e2\7-\2\2\u00d5\u00d6" +
					"\7*\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\7*\2\2\u00d8\u00e2\7-\2\2\u00d9" +
					"\u00da\7*\2\2\u00da\u00db\7\3\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7-\2" +
					"\2\u00dd\u00e2\3\2\2\2\u00de\u00df\5$\23\2\u00df\u00e0\7-\2\2\u00e0\u00e2" +
					"\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1" +
					"\u00de\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00ec\5&\24\2\u00e4\u00ec\5*\26\2" +
					"\u00e5\u00ec\5(\25\2\u00e6\u00ec\5\20\t\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9" +
					"\5$\23\2\u00e9\u00ea\7\6\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb" +
					"\u00e4\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2" +
					"\2\2\u00ec%\3\2\2\2\u00ed\u00ee\b\24\1\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0" +
					"\5&\24\2\u00f0\u00f1\7\6\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f7\7*\2\2\u00f3" +
					"\u00f7\7\'\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f7\7\'\2\2\u00f6\u00ed\3" +
					"\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7" +
					"\u0109\3\2\2\2\u00f8\u00f9\f\n\2\2\u00f9\u00fa\7\26\2\2\u00fa\u0108\5" +
					"&\24\13\u00fb\u00fc\f\t\2\2\u00fc\u00fd\7\27\2\2\u00fd\u0108\5&\24\n\u00fe" +
					"\u00ff\f\b\2\2\u00ff\u0100\7\30\2\2\u0100\u0108\5&\24\t\u0101\u0102\f" +
					"\7\2\2\u0102\u0103\7\31\2\2\u0103\u0108\5&\24\b\u0104\u0105\f\6\2\2\u0105" +
					"\u0106\7\32\2\2\u0106\u0108\5&\24\7\u0107\u00f8\3\2\2\2\u0107\u00fb\3" +
					"\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0108" +
					"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\'\3\2\2\2" +
					"\u010b\u0109\3\2\2\2\u010c\u010d\7\5\2\2\u010d\u010e\5(\25\2\u010e\u010f" +
					"\7\6\2\2\u010f\u0129\3\2\2\2\u0110\u0111\5&\24\2\u0111\u0112\7\33\2\2" +
					"\u0112\u0113\5&\24\2\u0113\u0129\3\2\2\2\u0114\u0115\5&\24\2\u0115\u0116" +
					"\7\34\2\2\u0116\u0117\5&\24\2\u0117\u0129\3\2\2\2\u0118\u0119\5&\24\2" +
					"\u0119\u011a\7\35\2\2\u011a\u011b\5&\24\2\u011b\u0129\3\2\2\2\u011c\u011d" +
					"\5&\24\2\u011d\u011e\7\36\2\2\u011e\u011f\5&\24\2\u011f\u0129\3\2\2\2" +
					"\u0120\u0121\5&\24\2\u0121\u0122\7\37\2\2\u0122\u0123\5&\24\2\u0123\u0129" +
					"\3\2\2\2\u0124\u0125\5&\24\2\u0125\u0126\7 \2\2\u0126\u0127\5&\24\2\u0127" +
					"\u0129\3\2\2\2\u0128\u010c\3\2\2\2\u0128\u0110\3\2\2\2\u0128\u0114\3\2" +
					"\2\2\u0128\u0118\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u0120\3\2\2\2\u0128" +
					"\u0124\3\2\2\2\u0129)\3\2\2\2\u012a\u012b\b\26\1\2\u012b\u012c\7\5\2\2" +
					"\u012c\u012d\5*\26\2\u012d\u012e\7\6\2\2\u012e\u0135\3\2\2\2\u012f\u0130" +
					"\7!\2\2\u0130\u0135\5*\26\n\u0131\u0135\5(\25\2\u0132\u0135\7*\2\2\u0133" +
					"\u0135\7(\2\2\u0134\u012a\3\2\2\2\u0134\u012f\3\2\2\2\u0134\u0131\3\2" +
					"\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0144\3\2\2\2\u0136" +
					"\u0137\f\t\2\2\u0137\u0138\7\"\2\2\u0138\u0143\5*\26\n\u0139\u013a\f\b" +
					"\2\2\u013a\u013b\7#\2\2\u013b\u0143\5*\26\t\u013c\u013d\f\7\2\2\u013d" +
					"\u013e\7$\2\2\u013e\u0143\5*\26\b\u013f\u0140\f\6\2\2\u0140\u0141\7%\2" +
					"\2\u0141\u0143\5*\26\7\u0142\u0136\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013c" +
					"\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144" +
					"\u0145\3\2\2\2\u0145+\3\2\2\2\u0146\u0144\3\2\2\2\30/9I\u0081\u0086\u0095" +
					"\u009a\u009e\u00b4\u00b8\u00cb\u00cf\u00d1\u00e1\u00eb\u00f6\u0107\u0109" +
					"\u0128\u0134\u0142\u0144";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();

	static {
		RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
	}

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		public ProgContext() {
		}

		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"prog", "statement", "declaration", "loop", "function", "parameters",
				"parameterVariable", "functionCall", "functionCallParameter", "singleParameter",
				"assertedConditional", "conditional", "elseIf", "finaElse", "multAssigSimple",
				"multAssig", "assignment", "expression", "arithmeticOp", "relationalOp",
				"logicalOp"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'='", "'loop_require'", "'('", "')'", "'loop_init'", "'{'", "'}'",
				"'loop'", "'loop_invariant'", "'loop_variant'", "'loop_ensure'", "'fun'",
				"'fun_require'", "'return'", "'fun_ensure'", "'if_require'", "'if_ensure'",
				"'if'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'",
				"'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'", null,
				null, null, null, null, null, null, "';'", "','"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				"VARIABLE", "IntConstant", "BoolConstant", "ConstantValue", "ID", "COMMENT",
				"WS", "SEMICOLON", "COMMA"
		};
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(42);
							statement();
						}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__23) | (1L << T__30) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
				setState(47);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableInitializationConstantCopyContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public VariableInitializationConstantCopyContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableInitializationConstantCopy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableInitializationConstantCopy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableInitializationConstantCopy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitVariableDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VARIABLE:
					enterOuterAlt(_localctx, 1);
				{
					setState(49);
					declaration();
				}
				break;
				case T__2:
				case T__23:
				case T__30:
				case IntConstant:
				case BoolConstant:
				case ID:
					enterOuterAlt(_localctx, 2);
				{
					setState(50);
					assignment();
				}
				break;
				case T__17:
					enterOuterAlt(_localctx, 3);
				{
					setState(51);
					conditional();
				}
				break;
				case T__15:
					enterOuterAlt(_localctx, 4);
				{
					setState(52);
					assertedConditional();
				}
				break;
				case T__11:
					enterOuterAlt(_localctx, 5);
				{
					setState(53);
					function();
				}
				break;
				case T__1:
					enterOuterAlt(_localctx, 6);
				{
					setState(54);
					loop();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					_localctx = new VariableDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(57);
					match(VARIABLE);
					setState(58);
					match(ID);
					setState(59);
					match(SEMICOLON);
				}
				break;
				case 2:
					_localctx = new VariableInitializationConstantCopyContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(60);
					match(VARIABLE);
					setState(61);
					match(ID);
					setState(62);
					match(T__0);
					setState(63);
					match(ID);
					setState(64);
					match(SEMICOLON);
				}
				break;
				case 3:
					_localctx = new VariableInitializationConstantContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(65);
					match(VARIABLE);
					setState(66);
					match(ID);
					setState(67);
					match(T__0);
					setState(68);
					expression();
					setState(69);
					match(SEMICOLON);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		try {
			_localctx = new LoopStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(73);
				match(T__1);
				setState(74);
				match(T__2);
				setState(75);
				logicalOp(0);
				setState(76);
				match(T__3);
				setState(77);
				match(T__4);
				setState(78);
				match(T__5);
				setState(79);
				multAssigSimple();
				setState(80);
				match(T__6);
				setState(81);
				match(T__7);
				setState(82);
				match(T__2);
				setState(83);
				logicalOp(0);
				setState(84);
				match(T__3);
				setState(85);
				match(T__5);
				setState(86);
				match(T__8);
				setState(87);
				match(T__2);
				setState(88);
				expression();
				setState(89);
				match(T__3);
				setState(90);
				match(T__9);
				setState(91);
				match(T__2);
				setState(92);
				match(ID);
				setState(93);
				match(T__3);
				setState(94);
				multAssig();
				setState(95);
				match(T__6);
				setState(96);
				match(T__10);
				setState(97);
				match(T__2);
				setState(98);
				logicalOp(0);
				setState(99);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			_localctx = new FunctionConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				match(T__11);
				setState(102);
				match(VARIABLE);
				setState(103);
				match(ID);
				setState(104);
				match(T__2);
				setState(105);
				parameters();
				setState(106);
				match(T__3);
				setState(107);
				match(T__5);
				setState(108);
				match(T__12);
				setState(109);
				match(T__2);
				setState(110);
				logicalOp(0);
				setState(111);
				match(T__3);
				setState(112);
				multAssig();
				setState(113);
				match(T__13);
				setState(114);
				match(ID);
				setState(115);
				match(SEMICOLON);
				setState(116);
				match(T__14);
				setState(117);
				match(T__2);
				setState(118);
				logicalOp(0);
				setState(119);
				match(T__3);
				setState(120);
				match(T__6);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		try {
			int _alt;
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VARIABLE:
					_localctx = new ParameterArgumentsContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(122);
									parameterVariable();
									setState(123);
									match(COMMA);
								}
							}
						}
						setState(129);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
					}
					setState(130);
					parameterVariable();
				}
				break;
				case T__3:
					_localctx = new ParameterEmptyContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ParameterVariableContext parameterVariable() throws RecognitionException {
		ParameterVariableContext _localctx = new ParameterVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterVariable);
		try {
			_localctx = new ParameterArgumentVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				match(VARIABLE);
				setState(135);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			_localctx = new FunctionCallStatmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
				setState(139);
				functionCallParameter();
				setState(140);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FunctionCallParameterContext functionCallParameter() throws RecognitionException {
		FunctionCallParameterContext _localctx = new FunctionCallParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCallParameter);
		try {
			int _alt;
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__2:
				case T__23:
				case T__30:
				case IntConstant:
				case BoolConstant:
				case ID:
					_localctx = new FunctionCallParametersContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					{
						setState(147);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(142);
										singleParameter();
										setState(143);
										match(COMMA);
									}
								}
							}
							setState(149);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
						}
						setState(150);
						singleParameter();
					}
				}
				break;
				case T__3:
					_localctx = new FunctionCallParametersEpsilonContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameters;
		}

		public ParametersContext() {
		}

		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ParameterArgumentsContext extends ParametersContext {
		public List<ParameterVariableContext> parameterVariable() {
			return getRuleContexts(ParameterVariableContext.class);
		}

		public ParameterVariableContext parameterVariable(int i) {
			return getRuleContext(ParameterVariableContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(ExprParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}

		public ParameterArgumentsContext(ParametersContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParameterArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParameterArguments(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParameterArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleParameterContext singleParameter() throws RecognitionException {
		SingleParameterContext _localctx = new SingleParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleParameter);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
				case 1:
					_localctx = new SingleParameterIDContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(154);
					match(ID);
				}
				break;
				case 2:
					_localctx = new SingleParameterExpressionContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(155);
					expression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssertedConditionalContext assertedConditional() throws RecognitionException {
		AssertedConditionalContext _localctx = new AssertedConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assertedConditional);
		try {
			_localctx = new ConditionalAssertionStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				match(T__15);
				setState(159);
				match(T__2);
				setState(160);
				logicalOp(0);
				setState(161);
				match(T__3);
				setState(162);
				conditional();
				setState(163);
				match(T__16);
				setState(164);
				match(T__2);
				setState(165);
				logicalOp(0);
				setState(166);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterVariableContext extends ParserRuleContext {
		public ParameterVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameterVariable;
		}

		public ParameterVariableContext() {
		}

		public void copyFrom(ParameterVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		int _la;
		try {
			int _alt;
			_localctx = new IfConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(168);
				match(T__17);
				setState(169);
				match(T__2);
				setState(170);
				logicalOp(0);
				setState(171);
				match(T__3);
				setState(172);
				match(T__5);
				setState(173);
				multAssig();
				setState(174);
				match(T__6);
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(175);
								elseIf();
							}
						}
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__18) {
					{
						setState(181);
						finaElse();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIf);
		try {
			_localctx = new ElseIfConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(184);
				match(T__18);
				setState(185);
				match(T__17);
				setState(186);
				match(T__2);
				setState(187);
				logicalOp(0);
				setState(188);
				match(T__3);
				setState(189);
				match(T__5);
				setState(190);
				multAssig();
				setState(191);
				match(T__6);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionCall;
		}

		public FunctionCallContext() {
		}

		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public final FinaElseContext finaElse() throws RecognitionException {
		FinaElseContext _localctx = new FinaElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_finaElse);
		try {
			_localctx = new ElseConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(193);
				match(T__18);
				setState(194);
				match(T__5);
				setState(195);
				multAssig();
				setState(196);
				match(T__6);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MultAssigSimpleContext multAssigSimple() throws RecognitionException {
		MultAssigSimpleContext _localctx = new MultAssigSimpleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multAssigSimple);
		int _la;
		try {
			_localctx = new MultipleAssignmentsSimpleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(198);
							assignment();
						}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__30) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParameterContext extends ParserRuleContext {
		public FunctionCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionCallParameter;
		}

		public FunctionCallParameterContext() {
		}

		public void copyFrom(FunctionCallParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FunctionCallParametersEpsilonContext extends FunctionCallParameterContext {
		public FunctionCallParametersEpsilonContext(FunctionCallParameterContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionCallParametersEpsilon(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionCallParametersEpsilon(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitFunctionCallParametersEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultAssigContext multAssig() throws RecognitionException {
		MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multAssig);
		int _la;
		try {
			_localctx = new MultipleAssignmentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(205);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case T__2:
							case T__23:
							case T__30:
							case IntConstant:
							case BoolConstant:
							case ID: {
								setState(203);
								assignment();
							}
							break;
							case T__17: {
								setState(204);
								conditional();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__17) | (1L << T__23) | (1L << T__30) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1:
					_localctx = new IDExpressionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(209);
					match(ID);
					setState(210);
					match(SEMICOLON);
				}
				break;
				case 2:
					_localctx = new IDAssignmentContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(211);
					match(ID);
					setState(212);
					match(T__0);
					setState(213);
					match(ID);
					setState(214);
					match(SEMICOLON);
				}
				break;
				case 3:
					_localctx = new AssignAssignmentContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(215);
					match(ID);
					setState(216);
					match(T__0);
					setState(217);
					expression();
					setState(218);
					match(SEMICOLON);
				}
				break;
				case 4:
					_localctx = new AssignExpressionContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(220);
					expression();
					setState(221);
					match(SEMICOLON);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleParameterContext extends ParserRuleContext {
		public SingleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleParameter;
		}

		public SingleParameterContext() {
		}

		public void copyFrom(SingleParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class SingleParameterExpressionContext extends SingleParameterContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public SingleParameterExpressionContext(SingleParameterContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterSingleParameterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitSingleParameterExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitSingleParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
				case 1:
					_localctx = new ArithmeticOperationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(225);
					arithmeticOp(0);
				}
				break;
				case 2:
					_localctx = new LogicalOpterationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(226);
					logicalOp(0);
				}
				break;
				case 3:
					_localctx = new RelationalOperationContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(227);
					relationalOp();
				}
				break;
				case 4:
					_localctx = new FunctionReturnOperationContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(228);
					functionCall();
				}
				break;
				case 5:
					_localctx = new ParanthesesExpressionContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(229);
					match(T__2);
					setState(230);
					expression();
					setState(231);
					match(T__3);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
	}

	public static class AssertedConditionalContext extends ParserRuleContext {
		public AssertedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assertedConditional;
		}

		public AssertedConditionalContext() {
		}

		public void copyFrom(AssertedConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}

	private ArithmeticOpContext arithmeticOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, _parentState);
		ArithmeticOpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmeticOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T__2: {
						_localctx = new ParanthesesArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(236);
						match(T__2);
						setState(237);
						arithmeticOp(0);
						setState(238);
						match(T__3);
					}
					break;
					case ID: {
						_localctx = new VariableArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(240);
						match(ID);
					}
					break;
					case IntConstant: {
						_localctx = new IntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(241);
						match(IntConstant);
					}
					break;
					case T__23: {
						_localctx = new NegationIntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(242);
						match(T__23);
						setState(243);
						match(IntConstant);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(261);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
								case 1: {
									_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(246);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(247);
									match(T__19);
									setState(248);
									arithmeticOp(9);
								}
								break;
								case 2: {
									_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(249);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(250);
									match(T__20);
									setState(251);
									arithmeticOp(8);
								}
								break;
								case 3: {
									_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(252);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(253);
									match(T__21);
									setState(254);
									arithmeticOp(7);
								}
								break;
								case 4: {
									_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(255);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(256);
									match(T__22);
									setState(257);
									arithmeticOp(6);
								}
								break;
								case 5: {
									_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(258);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(259);
									match(T__23);
									setState(260);
									arithmeticOp(5);
								}
								break;
							}
						}
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationalOp);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
				case 1:
					_localctx = new ParanthesesRelationalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(266);
					match(T__2);
					setState(267);
					relationalOp();
					setState(268);
					match(T__3);
				}
				break;
				case 2:
					_localctx = new LessRelationalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(270);
					arithmeticOp(0);
					setState(271);
					match(T__24);
					setState(272);
					arithmeticOp(0);
				}
				break;
				case 3:
					_localctx = new LessEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(274);
					arithmeticOp(0);
					setState(275);
					match(T__25);
					setState(276);
					arithmeticOp(0);
				}
				break;
				case 4:
					_localctx = new GreaterRelationalContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(278);
					arithmeticOp(0);
					setState(279);
					match(T__26);
					setState(280);
					arithmeticOp(0);
				}
				break;
				case 5:
					_localctx = new GreaterEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(282);
					arithmeticOp(0);
					setState(283);
					match(T__27);
					setState(284);
					arithmeticOp(0);
				}
				break;
				case 6:
					_localctx = new EqualityRelationalContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(286);
					arithmeticOp(0);
					setState(287);
					match(T__28);
					setState(288);
					arithmeticOp(0);
				}
				break;
				case 7:
					_localctx = new InequivalenceRelationalContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(290);
					arithmeticOp(0);
					setState(291);
					match(T__29);
					setState(292);
					arithmeticOp(0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditional;
		}

		public ConditionalContext() {
		}

		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}

	private LogicalOpContext logicalOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
		LogicalOpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicalOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(306);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
					case 1: {
						_localctx = new ParanthesesLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(297);
						match(T__2);
						setState(298);
						logicalOp(0);
						setState(299);
						match(T__3);
					}
					break;
					case 2: {
						_localctx = new NegationLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(301);
						match(T__30);
						setState(302);
						logicalOp(8);
					}
					break;
					case 3: {
						_localctx = new RelationalOpLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(303);
						relationalOp();
					}
					break;
					case 4: {
						_localctx = new VariableLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(304);
						match(ID);
					}
					break;
					case 5: {
						_localctx = new BooleanConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(305);
						match(BoolConstant);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(320);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
								case 1: {
									_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(308);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(309);
									match(T__31);
									setState(310);
									logicalOp(8);
								}
								break;
								case 2: {
									_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(311);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(312);
									match(T__32);
									setState(313);
									logicalOp(7);
								}
								break;
								case 3: {
									_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(314);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(315);
									match(T__33);
									setState(316);
									logicalOp(6);
								}
								break;
								case 4: {
									_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(317);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(318);
									match(T__34);
									setState(319);
									logicalOp(5);
								}
								break;
							}
						}
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 18:
				return arithmeticOp_sempred((ArithmeticOpContext) _localctx, predIndex);
			case 20:
				return logicalOp_sempred((LogicalOpContext) _localctx, predIndex);
		}
		return true;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseIf;
		}

		public ElseIfContext() {
		}

		public void copyFrom(ElseIfContext ctx) {
			super.copyFrom(ctx);
		}
	}

	private boolean arithmeticOp_sempred(ArithmeticOpContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 8);
			case 1:
				return precpred(_ctx, 7);
			case 2:
				return precpred(_ctx, 6);
			case 3:
				return precpred(_ctx, 5);
			case 4:
				return precpred(_ctx, 4);
		}
		return true;
	}

	private boolean logicalOp_sempred(LogicalOpContext _localctx, int predIndex) {
		switch (predIndex) {
			case 5:
				return precpred(_ctx, 7);
			case 6:
				return precpred(_ctx, 6);
			case 7:
				return precpred(_ctx, 5);
			case 8:
				return precpred(_ctx, 4);
		}
		return true;
	}

	public static class FinaElseContext extends ParserRuleContext {
		public FinaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_finaElse;
		}

		public FinaElseContext() {
		}

		public void copyFrom(FinaElseContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() {
			return getToken(ExprParser.EOF, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public ProgramContext(ProgContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class, 0);
		}

		public AssertedConditionalContext assertedConditional() {
			return getRuleContext(AssertedConditionalContext.class, 0);
		}

		public FunctionContext function() {
			return getRuleContext(FunctionContext.class, 0);
		}

		public LoopContext loop() {
			return getRuleContext(LoopContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class VariableInitializationConstantContext extends DeclarationContext {
		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(ExprParser.SEMICOLON, 0);
		}

		public VariableInitializationConstantContext(DeclarationContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterVariableInitializationConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitVariableInitializationConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitVariableInitializationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LoopContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_loop;
		}

		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class LoopStatementContext extends LoopContext {
		public LoopStatementContext(LoopContext ctx) {
			copyFrom(ctx);
		}

		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}

		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class, i);
		}

		public MultAssigSimpleContext multAssigSimple() {
			return getRuleContext(MultAssigSimpleContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterLoopStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitLoopStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MultAssigContext extends ParserRuleContext {
		public MultAssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multAssig;
		}

		public MultAssigContext() {
		}

		public void copyFrom(MultAssigContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public FunctionContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_function;
		}

		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FunctionConditionalContext extends FunctionContext {
		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}

		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class, 0);
		}

		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}

		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class, i);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(ExprParser.SEMICOLON, 0);
		}

		public FunctionConditionalContext(FunctionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitFunctionConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		public AssignmentContext() {
		}

		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpressionContext extends AssignmentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public AssignExpressionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDExpressionContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public IDExpressionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIDExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIDExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public AssignAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParameterEmptyContext extends ParametersContext {
		public ParameterEmptyContext(ParametersContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParameterEmpty(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParameterEmpty(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitParameterEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParameterArgumentVariableContext extends ParameterVariableContext {
		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ParameterArgumentVariableContext(ParameterVariableContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParameterArgumentVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParameterArgumentVariable(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParameterArgumentVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		public ExpressionContext() {
		}

		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionReturnOperationContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionReturnOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionReturnOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunctionReturnOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunctionReturnOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalOperationContext extends ExpressionContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public RelationalOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticOperationContext extends ExpressionContext {
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public ArithmeticOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParanthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParanthesesExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParanthesesExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParanthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FunctionCallStatmentContext extends FunctionCallContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public FunctionCallParameterContext functionCallParameter() {
			return getRuleContext(FunctionCallParameterContext.class, 0);
		}

		public FunctionCallStatmentContext(FunctionCallContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionCallStatment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionCallStatment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitFunctionCallStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FunctionCallParametersContext extends FunctionCallParameterContext {
		public List<SingleParameterContext> singleParameter() {
			return getRuleContexts(SingleParameterContext.class);
		}

		public SingleParameterContext singleParameter(int i) {
			return getRuleContext(SingleParameterContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(ExprParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}

		public FunctionCallParametersContext(FunctionCallParameterContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionCallParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionCallParameters(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitFunctionCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ArithmeticOpContext extends ParserRuleContext {
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOp; }
	 
		public ArithmeticOpContext() { }
		public void copyFrom(ArithmeticOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public DivisionArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDivisionArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDivisionArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDivisionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableArithmeticContext extends ArithmeticOpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public ModuloArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterModuloArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitModuloArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitModuloArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public MultiplicationArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiplicationArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiplicationArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultiplicationArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesArithmeticContext extends ArithmeticOpContext {
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public ParanthesesArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParanthesesArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParanthesesArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParanthesesArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationIntegerConstantContext extends ArithmeticOpContext {
		public TerminalNode IntConstant() { return getToken(ExprParser.IntConstant, 0); }
		public NegationIntegerConstantContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNegationIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNegationIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNegationIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public AdditionArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdditionArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdditionArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAdditionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public SubtractionArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSubtractionArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitSubtractionArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitSubtractionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SingleParameterIDContext extends SingleParameterContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public SingleParameterIDContext(SingleParameterContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterSingleParameterID(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitSingleParameterID(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitSingleParameterID(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConditionalAssertionStatementContext extends AssertedConditionalContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}

		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class, i);
		}

		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class, 0);
		}

		public ConditionalAssertionStatementContext(AssertedConditionalContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterConditionalAssertionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitConditionalAssertionStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitConditionalAssertionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IfConditionalContext extends ConditionalContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}

		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class, i);
		}

		public FinaElseContext finaElse() {
			return getRuleContext(FinaElseContext.class, 0);
		}

		public IfConditionalContext(ConditionalContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterIfConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitIfConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIfConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
	 
		public RelationalOpContext() { }
		public void copyFrom(RelationalOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public EqualityRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEqualityRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEqualityRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEqualityRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public LessRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLessRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLessRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLessRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public GreaterRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGreaterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGreaterRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGreaterRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public GreaterEqualRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGreaterEqualRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGreaterEqualRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGreaterEqualRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesRelationalContext extends RelationalOpContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public ParanthesesRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParanthesesRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParanthesesRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParanthesesRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InequivalenceRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public InequivalenceRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInequivalenceRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitInequivalenceRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitInequivalenceRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ElseIfConditionalContext extends ElseIfContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public ElseIfConditionalContext(ElseIfContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterElseIfConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitElseIfConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitElseIfConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ElseConditionalContext extends FinaElseContext {
		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public ElseConditionalContext(FinaElseContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterElseConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitElseConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitElseConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LogicalOpContext extends ParserRuleContext {
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_logicalOp;
		}

		public LogicalOpContext() {
		}

		public void copyFrom(LogicalOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DisjunctionLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public DisjunctionLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDisjunctionLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDisjunctionLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDisjunctionLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicationLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ImplicationLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterImplicationLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitImplicationLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitImplicationLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableLogicalContext extends LogicalOpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquivalenceLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public EquivalenceLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEquivalenceLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEquivalenceLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEquivalenceLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationLogicalContext extends LogicalOpContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public NegationLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNegationLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNegationLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNegationLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjunctionLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ConjunctionLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConjunctionLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConjunctionLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConjunctionLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesLogicalContext extends LogicalOpContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public ParanthesesLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParanthesesLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParanthesesLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParanthesesLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanConstantContext extends LogicalOpContext {
		public TerminalNode BoolConstant() { return getToken(ExprParser.BoolConstant, 0); }
		public BooleanConstantContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalOpLogicalContext extends LogicalOpContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public RelationalOpLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRelationalOpLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRelationalOpLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitRelationalOpLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		return logicalOp(0);
	}

	public static class MultAssigSimpleContext extends ParserRuleContext {
		public MultAssigSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MultAssigSimpleContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_multAssigSimple;
		}

		public void copyFrom(MultAssigSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class MultipleAssignmentsSimpleContext extends MultAssigSimpleContext {
		public MultipleAssignmentsSimpleContext(MultAssigSimpleContext ctx) {
			copyFrom(ctx);
		}

		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterMultipleAssignmentsSimple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitMultipleAssignmentsSimple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitMultipleAssignmentsSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MultipleAssignmentsContext extends MultAssigContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
		}

		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}

		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class, i);
		}

		public MultipleAssignmentsContext(MultAssigContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterMultipleAssignments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitMultipleAssignments(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitMultipleAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IDAssignmentContext extends AssignmentContext {
		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}

		public TerminalNode SEMICOLON() {
			return getToken(ExprParser.SEMICOLON, 0);
		}

		public IDAssignmentContext(AssignmentContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterIDAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitIDAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIDAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LogicalOpterationContext extends ExpressionContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public LogicalOpterationContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterLogicalOpteration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitLogicalOpteration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitLogicalOpteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IntegerConstantContext extends ArithmeticOpContext {
		public TerminalNode IntConstant() {
			return getToken(ExprParser.IntConstant, 0);
		}

		public IntegerConstantContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterIntegerConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitIntegerConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LessEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public LessEqualRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterLessEqualRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitLessEqualRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitLessEqualRelational(this);
			else return visitor.visitChildren(this);
		}
	}
}