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
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, T__32 = 33, T__33 = 34, VARIABLE = 35, IntConstant = 36, BoolConstant = 37,
            ConstantValue = 38, ID = 39, COMMENT = 40, WS = 41, SEMICOLON = 42, COMMA = 43;
    public static final int
            RULE_prog = 0, RULE_statement = 1, RULE_declaration = 2, RULE_loop = 3,
            RULE_function = 4, RULE_parameters = 5, RULE_parameterVariable = 6, RULE_functionCall = 7,
            RULE_functionCallParameter = 8, RULE_singleParameter = 9, RULE_assertedConditional = 10,
            RULE_conditional = 11, RULE_elseIf = 12, RULE_finaElse = 13, RULE_multAssig = 14,
            RULE_assignment = 15, RULE_expression = 16, RULE_arithmeticOp = 17, RULE_relationalOp = 18,
            RULE_logicalOp = 19;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u013c\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3" +
                    "\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3" +
                    "\7\7\7y\n\7\f\7\16\7|\13\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\t\3\t\3" +
                    "\t\3\t\3\t\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\n\3\n\5\n\u0094" +
                    "\n\n\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r" +
                    "\5\r\u00b2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17" +
                    "\3\17\3\17\3\17\3\20\3\20\6\20\u00c4\n\20\r\20\16\20\u00c5\3\21\3\21\3" +
                    "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d6" +
                    "\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0\n\22\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00eb\n\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fc\n\23" +
                    "\f\23\16\23\u00ff\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\25\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" +
                    "\3\25\3\25\3\25\3\25\3\25\7\25\u0137\n\25\f\25\16\25\u013a\13\25\3\25" +
                    "\2\4$(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0154\2+" +
                    "\3\2\2\2\4\66\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\n`\3\2\2\2\f\177\3\2\2\2\16" +
                    "\u0081\3\2\2\2\20\u0084\3\2\2\2\22\u0093\3\2\2\2\24\u0097\3\2\2\2\26\u0099" +
                    "\3\2\2\2\30\u00a3\3\2\2\2\32\u00b3\3\2\2\2\34\u00bc\3\2\2\2\36\u00c3\3" +
                    "\2\2\2 \u00d5\3\2\2\2\"\u00df\3\2\2\2$\u00ea\3\2\2\2&\u011c\3\2\2\2(\u0128" +
                    "\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/" +
                    "\60\7\2\2\3\60\3\3\2\2\2\61\67\5\6\4\2\62\67\5 \21\2\63\67\5\30\r\2\64" +
                    "\67\5\26\f\2\65\67\5\n\6\2\66\61\3\2\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66" +
                    "\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\7%\2\29:\7)\2\2:G\7,\2\2;<\7" +
                    "%\2\2<=\7)\2\2=>\7\3\2\2>?\7)\2\2?G\7,\2\2@A\7%\2\2AB\7)\2\2BC\7\3\2\2" +
                    "CD\5\"\22\2DE\7,\2\2EG\3\2\2\2F8\3\2\2\2F;\3\2\2\2F@\3\2\2\2G\7\3\2\2" +
                    "\2HI\7\4\2\2IJ\7\5\2\2JK\5(\25\2KL\7\6\2\2LM\7\7\2\2MN\7\5\2\2NO\5(\25" +
                    "\2OP\7\6\2\2PQ\7\b\2\2QR\7\t\2\2RS\7\5\2\2ST\5\"\22\2TU\7\6\2\2UV\7\n" +
                    "\2\2VW\7\5\2\2WX\7)\2\2XY\7\6\2\2YZ\5\36\20\2Z[\7\13\2\2[\\\7\f\2\2\\" +
                    "]\7\5\2\2]^\5(\25\2^_\7\6\2\2_\t\3\2\2\2`a\7\r\2\2ab\7%\2\2bc\7)\2\2c" +
                    "d\7\5\2\2de\5\f\7\2ef\7\6\2\2fg\7\b\2\2gh\7\16\2\2hi\7\5\2\2ij\5(\25\2" +
                    "jk\7\6\2\2kl\5\36\20\2lm\7\17\2\2mn\7)\2\2no\7,\2\2op\7\20\2\2pq\7\5\2" +
                    "\2qr\5(\25\2rs\7\6\2\2st\7\13\2\2t\13\3\2\2\2uv\5\16\b\2vw\7-\2\2wy\3" +
                    "\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0080" +
                    "\5\16\b\2~\u0080\3\2\2\2\177z\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2\2\u0081" +
                    "\u0082\7%\2\2\u0082\u0083\7)\2\2\u0083\17\3\2\2\2\u0084\u0085\7)\2\2\u0085" +
                    "\u0086\7\5\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\6\2\2\u0088\21\3\2\2" +
                    "\2\u0089\u008a\5\24\13\2\u008a\u008b\7-\2\2\u008b\u008d\3\2\2\2\u008c" +
                    "\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2" +
                    "\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\5\24\13\2\u0092" +
                    "\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2" +
                    "\2\u0095\u0098\7)\2\2\u0096\u0098\5\"\22\2\u0097\u0095\3\2\2\2\u0097\u0096" +
                    "\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u009b\7\5\2\2\u009b" +
                    "\u009c\5(\25\2\u009c\u009d\7\6\2\2\u009d\u009e\5\30\r\2\u009e\u009f\7" +
                    "\22\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\7\6\2\2\u00a2" +
                    "\27\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5(\25" +
                    "\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\5\36\20\2\u00a9" +
                    "\u00ad\7\13\2\2\u00aa\u00ac\5\32\16\2\u00ab\u00aa\3\2\2\2\u00ac\u00af" +
                    "\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af" +
                    "\u00ad\3\2\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3" +
                    "\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\7\23\2\2\u00b5" +
                    "\u00b6\7\5\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\7\b" +
                    "\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\13\2\2\u00bb\33\3\2\2\2\u00bc" +
                    "\u00bd\7\24\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\5\36\20\2\u00bf\u00c0" +
                    "\7\13\2\2\u00c0\35\3\2\2\2\u00c1\u00c4\5 \21\2\u00c2\u00c4\5\30\r\2\u00c3" +
                    "\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2" +
                    "\2\2\u00c5\u00c6\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7)\2\2\u00c8\u00d6" +
                    "\7,\2\2\u00c9\u00ca\7)\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\7)\2\2\u00cc" +
                    "\u00d6\7,\2\2\u00cd\u00ce\7)\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0\5\"\22" +
                    "\2\u00d0\u00d1\7,\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4" +
                    "\7,\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5" +
                    "\u00cd\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6!\3\2\2\2\u00d7\u00e0\5$\23\2" +
                    "\u00d8\u00e0\5(\25\2\u00d9\u00e0\5&\24\2\u00da\u00e0\5\20\t\2\u00db\u00dc" +
                    "\7\5\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\6\2\2\u00de\u00e0\3\2\2\2" +
                    "\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da" +
                    "\3\2\2\2\u00df\u00db\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00e2\b\23\1\2\u00e2" +
                    "\u00e3\7\5\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\7\6\2\2\u00e5\u00eb\3\2" +
                    "\2\2\u00e6\u00eb\7)\2\2\u00e7\u00eb\7&\2\2\u00e8\u00e9\7\31\2\2\u00e9" +
                    "\u00eb\7&\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2" +
                    "\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00fd\3\2\2\2\u00ec\u00ed\f\n\2\2\u00ed" +
                    "\u00ee\7\25\2\2\u00ee\u00fc\5$\23\13\u00ef\u00f0\f\t\2\2\u00f0\u00f1\7" +
                    "\26\2\2\u00f1\u00fc\5$\23\n\u00f2\u00f3\f\b\2\2\u00f3\u00f4\7\27\2\2\u00f4" +
                    "\u00fc\5$\23\t\u00f5\u00f6\f\7\2\2\u00f6\u00f7\7\30\2\2\u00f7\u00fc\5" +
                    "$\23\b\u00f8\u00f9\f\6\2\2\u00f9\u00fa\7\31\2\2\u00fa\u00fc\5$\23\7\u00fb" +
                    "\u00ec\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f5\3\2" +
                    "\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd" +
                    "\u00fe\3\2\2\2\u00fe%\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\5\2\2" +
                    "\u0101\u0102\5&\24\2\u0102\u0103\7\6\2\2\u0103\u011d\3\2\2\2\u0104\u0105" +
                    "\5$\23\2\u0105\u0106\7\32\2\2\u0106\u0107\5$\23\2\u0107\u011d\3\2\2\2" +
                    "\u0108\u0109\5$\23\2\u0109\u010a\7\33\2\2\u010a\u010b\5$\23\2\u010b\u011d" +
                    "\3\2\2\2\u010c\u010d\5$\23\2\u010d\u010e\7\34\2\2\u010e\u010f\5$\23\2" +
                    "\u010f\u011d\3\2\2\2\u0110\u0111\5$\23\2\u0111\u0112\7\35\2\2\u0112\u0113" +
                    "\5$\23\2\u0113\u011d\3\2\2\2\u0114\u0115\5$\23\2\u0115\u0116\7\36\2\2" +
                    "\u0116\u0117\5$\23\2\u0117\u011d\3\2\2\2\u0118\u0119\5$\23\2\u0119\u011a" +
                    "\7\37\2\2\u011a\u011b\5$\23\2\u011b\u011d\3\2\2\2\u011c\u0100\3\2\2\2" +
                    "\u011c\u0104\3\2\2\2\u011c\u0108\3\2\2\2\u011c\u010c\3\2\2\2\u011c\u0110" +
                    "\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0118\3\2\2\2\u011d\'\3\2\2\2\u011e" +
                    "\u011f\b\25\1\2\u011f\u0120\7\5\2\2\u0120\u0121\5(\25\2\u0121\u0122\7" +
                    "\6\2\2\u0122\u0129\3\2\2\2\u0123\u0124\7 \2\2\u0124\u0129\5(\25\n\u0125" +
                    "\u0129\5&\24\2\u0126\u0129\7)\2\2\u0127\u0129\7\'\2\2\u0128\u011e\3\2" +
                    "\2\2\u0128\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128" +
                    "\u0127\3\2\2\2\u0129\u0138\3\2\2\2\u012a\u012b\f\t\2\2\u012b\u012c\7!" +
                    "\2\2\u012c\u0137\5(\25\n\u012d\u012e\f\b\2\2\u012e\u012f\7\"\2\2\u012f" +
                    "\u0137\5(\25\t\u0130\u0131\f\7\2\2\u0131\u0132\7#\2\2\u0132\u0137\5(\25" +
                    "\b\u0133\u0134\f\6\2\2\u0134\u0135\7$\2\2\u0135\u0137\5(\25\7\u0136\u012a" +
                    "\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137" +
                    "\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139)\3\2\2\2" +
                    "\u013a\u0138\3\2\2\2\27-\66Fz\177\u008e\u0093\u0097\u00ad\u00b1\u00c3" +
                    "\u00c5\u00d5\u00df\u00ea\u00fb\u00fd\u011c\u0128\u0136\u0138";
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "statement", "declaration", "loop", "function", "parameters",
                "parameterVariable", "functionCall", "functionCallParameter", "singleParameter",
                "assertedConditional", "conditional", "elseIf", "finaElse", "multAssig",
                "assignment", "expression", "arithmeticOp", "relationalOp", "logicalOp"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'='", "'loop_require'", "'('", "')'", "'loop'", "'{'", "'loop_invariant'",
                "'loop_variant'", "'}'", "'loop_ensure'", "'fun'", "'fun_require'", "'return'",
                "'fun_ensure'", "'if_require'", "'if_ensure'", "'if'", "'else'", "'*'",
                "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='",
                "'!'", "'&&'", "'||'", "'=>'", "'<=>'", null, null, null, null, null,
                null, null, "';'", "','"
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
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
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

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, "VARIABLE",
                "IntConstant", "BoolConstant", "ConstantValue", "ID", "COMMENT", "WS",
                "SEMICOLON", "COMMA"
        };
    }

    public static class StatementContext extends ParserRuleContext {
        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public AssertedConditionalContext assertedConditional() {
			return getRuleContext(AssertedConditionalContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStatement(this);
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

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            _localctx = new ProgramContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(41);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(40);
                            statement();
                        }
                    }
                    setState(43);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__22) | (1L << T__29) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
                setState(45);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableInitializationConstantContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public VariableInitializationConstantContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableInitializationConstant(this);
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

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(52);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VARIABLE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(47);
                    declaration();
                }
                break;
                case T__2:
                case T__22:
                case T__29:
                case IntConstant:
                case BoolConstant:
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(48);
                    assignment();
                }
                break;
                case T__16:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(49);
                    conditional();
                }
                break;
                case T__14:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(50);
                    assertedConditional();
                }
                break;
                case T__10:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(51);
                    function();
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
            setState(68);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    _localctx = new VariableDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(54);
                    match(VARIABLE);
                    setState(55);
                    match(ID);
                    setState(56);
                    match(SEMICOLON);
                }
				break;
			case 2:
				_localctx = new VariableInitializationConstantCopyContext(_localctx);
				enterOuterAlt(_localctx, 2);
            {
                setState(57);
                match(VARIABLE);
                setState(58);
                match(ID);
                setState(59);
                match(T__0);
                setState(60);
                match(ID);
                setState(61);
                match(SEMICOLON);
            }
				break;
			case 3:
				_localctx = new VariableInitializationConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
            {
                setState(62);
                match(VARIABLE);
                setState(63);
                match(ID);
                setState(64);
                match(T__0);
                setState(65);
                expression();
                setState(66);
                match(SEMICOLON);
            }
				break;
			}
		}
		catch (RecognitionException re) {
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
                setState(70);
                match(T__1);
                setState(71);
                match(T__2);
                setState(72);
                logicalOp(0);
                setState(73);
                match(T__3);
                setState(74);
                match(T__4);
                setState(75);
                match(T__2);
                setState(76);
                logicalOp(0);
                setState(77);
                match(T__3);
                setState(78);
                match(T__5);
                setState(79);
                match(T__6);
                setState(80);
                match(T__2);
                setState(81);
                expression();
                setState(82);
                match(T__3);
                setState(83);
                match(T__7);
                setState(84);
                match(T__2);
                setState(85);
                match(ID);
                setState(86);
                match(T__3);
                setState(87);
                multAssig();
                setState(88);
                match(T__8);
                setState(89);
                match(T__9);
                setState(90);
                match(T__2);
                setState(91);
                logicalOp(0);
                setState(92);
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
                setState(94);
                match(T__10);
                setState(95);
                match(VARIABLE);
                setState(96);
                match(ID);
                setState(97);
                match(T__2);
                setState(98);
                parameters();
                setState(99);
                match(T__3);
                setState(100);
                match(T__5);
                setState(101);
                match(T__11);
                setState(102);
                match(T__2);
                setState(103);
                logicalOp(0);
                setState(104);
                match(T__3);
                setState(105);
                multAssig();
                setState(106);
                match(T__12);
                setState(107);
                match(ID);
                setState(108);
                match(SEMICOLON);
                setState(109);
                match(T__13);
                setState(110);
                match(T__2);
                setState(111);
                logicalOp(0);
                setState(112);
                match(T__3);
                setState(113);
                match(T__8);
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

    public static class FunctionContext extends ParserRuleContext {
        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function;
        }

        public FunctionContext() {
        }

        public void copyFrom(FunctionContext ctx) {
            super.copyFrom(ctx);
		}
	}
	public static class FunctionConditionalContext extends FunctionContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public FunctionConditionalContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionConditional(this);
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

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameters);
        try {
            int _alt;
            setState(125);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VARIABLE:
                    _localctx = new ParameterArgumentsContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(120);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(115);
                                    parameterVariable();
                                    setState(116);
                                    match(COMMA);
                                }
                            }
                        }
                        setState(122);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                    }
                    setState(123);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterArgumentsContext extends ParametersContext {
		public List<ParameterVariableContext> parameterVariable() {
			return getRuleContexts(ParameterVariableContext.class);
		}
		public ParameterVariableContext parameterVariable(int i) {
			return getRuleContext(ParameterVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public ParameterArgumentsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParameterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParameterArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParameterArguments(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterEmptyContext extends ParametersContext {
		public ParameterEmptyContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParameterEmpty(this);
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

    public final ParameterVariableContext parameterVariable() throws RecognitionException {
        ParameterVariableContext _localctx = new ParameterVariableContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_parameterVariable);
        try {
            _localctx = new ParameterArgumentVariableContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                match(VARIABLE);
                setState(128);
                match(ID);
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

	public static class ParameterVariableContext extends ParserRuleContext {
		public ParameterVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterVariable; }
	 
		public ParameterVariableContext() { }
		public void copyFrom(ParameterVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterArgumentVariableContext extends ParameterVariableContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ParameterArgumentVariableContext(ParameterVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParameterArgumentVariable(this);
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

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_functionCall);
        try {
            _localctx = new FunctionCallStatmentContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(ID);
                setState(131);
                match(T__2);
                setState(132);
                functionCallParameter();
                setState(133);
                match(T__3);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallStatmentContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public FunctionCallParameterContext functionCallParameter() {
			return getRuleContext(FunctionCallParameterContext.class,0);
		}
		public FunctionCallStatmentContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionCallStatment(this);
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

    public final FunctionCallParameterContext functionCallParameter() throws RecognitionException {
        FunctionCallParameterContext _localctx = new FunctionCallParameterContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_functionCallParameter);
        try {
            int _alt;
            setState(145);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                case T__22:
                case T__29:
                case IntConstant:
                case BoolConstant:
                case ID:
                    _localctx = new FunctionCallParametersContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(140);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(135);
                                        singleParameter();
                                        setState(136);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(142);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        }
                        setState(143);
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

	public static class FunctionCallParameterContext extends ParserRuleContext {
		public FunctionCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParameter; }
	 
		public FunctionCallParameterContext() { }
		public void copyFrom(FunctionCallParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallParametersEpsilonContext extends FunctionCallParameterContext {
		public FunctionCallParametersEpsilonContext(FunctionCallParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionCallParametersEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFunctionCallParametersEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunctionCallParametersEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallParametersContext extends FunctionCallParameterContext {
		public List<SingleParameterContext> singleParameter() {
			return getRuleContexts(SingleParameterContext.class);
		}
		public SingleParameterContext singleParameter(int i) {
			return getRuleContext(SingleParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public FunctionCallParametersContext(FunctionCallParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFunctionCallParameters(this);
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

    public final SingleParameterContext singleParameter() throws RecognitionException {
        SingleParameterContext _localctx = new SingleParameterContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_singleParameter);
        try {
            setState(149);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    _localctx = new SingleParameterIDContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(147);
                    match(ID);
                }
                break;
                case 2:
                    _localctx = new SingleParameterExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(148);
                    expression();
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

	public static class SingleParameterContext extends ParserRuleContext {
		public SingleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleParameter; }
	 
		public SingleParameterContext() { }
		public void copyFrom(SingleParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleParameterExpressionContext extends SingleParameterContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleParameterExpressionContext(SingleParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSingleParameterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSingleParameterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSingleParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleParameterIDContext extends SingleParameterContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public SingleParameterIDContext(SingleParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSingleParameterID(this);
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

    public final AssertedConditionalContext assertedConditional() throws RecognitionException {
        AssertedConditionalContext _localctx = new AssertedConditionalContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_assertedConditional);
        try {
            _localctx = new ConditionalAssertionStatementContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(151);
                match(T__14);
                setState(152);
                match(T__2);
                setState(153);
                logicalOp(0);
                setState(154);
                match(T__3);
                setState(155);
                conditional();
                setState(156);
                match(T__15);
                setState(157);
                match(T__2);
                setState(158);
                logicalOp(0);
                setState(159);
                match(T__3);
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

	public static class AssertedConditionalContext extends ParserRuleContext {
		public AssertedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertedConditional; }
	 
		public AssertedConditionalContext() { }
		public void copyFrom(AssertedConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalAssertionStatementContext extends AssertedConditionalContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalAssertionStatementContext(AssertedConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConditionalAssertionStatement(this);
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

    public final ConditionalContext conditional() throws RecognitionException {
        ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_conditional);
        int _la;
        try {
            int _alt;
            _localctx = new IfConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(161);
                match(T__16);
                setState(162);
                match(T__2);
                setState(163);
                logicalOp(0);
                setState(164);
                match(T__3);
                setState(165);
                match(T__5);
                setState(166);
                multAssig();
                setState(167);
                match(T__8);
                setState(171);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(168);
                                elseIf();
                            }
                        }
                    }
                    setState(173);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
                setState(175);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__17) {
                    {
                        setState(174);
                        finaElse();
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

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfConditionalContext extends ConditionalContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public FinaElseContext finaElse() {
			return getRuleContext(FinaElseContext.class,0);
		}
		public IfConditionalContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfConditional(this);
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

    public final ElseIfContext elseIf() throws RecognitionException {
        ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_elseIf);
        try {
            _localctx = new ElseIfConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                match(T__17);
                setState(178);
                match(T__16);
                setState(179);
                match(T__2);
                setState(180);
                logicalOp(0);
                setState(181);
                match(T__3);
                setState(182);
                match(T__5);
                setState(183);
                multAssig();
                setState(184);
                match(T__8);
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

	public static class ElseIfContext extends ParserRuleContext {
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	 
		public ElseIfContext() { }
		public void copyFrom(ElseIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfConditionalContext extends ElseIfContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class,0);
		}
		public ElseIfConditionalContext(ElseIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseIfConditional(this);
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

    public final FinaElseContext finaElse() throws RecognitionException {
        FinaElseContext _localctx = new FinaElseContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_finaElse);
        try {
            _localctx = new ElseConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                match(T__17);
                setState(187);
                match(T__5);
                setState(188);
                multAssig();
                setState(189);
                match(T__8);
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

	public static class FinaElseContext extends ParserRuleContext {
		public FinaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finaElse; }
	 
		public FinaElseContext() { }
		public void copyFrom(FinaElseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseConditionalContext extends FinaElseContext {
		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class,0);
		}
		public ElseConditionalContext(FinaElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseConditional(this);
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

    public final MultAssigContext multAssig() throws RecognitionException {
        MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_multAssig);
        int _la;
        try {
            _localctx = new MultipleAssignmentsContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(193);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__2:
                            case T__22:
                            case T__29:
                            case IntConstant:
                            case BoolConstant:
                            case ID: {
                                setState(191);
                                assignment();
                            }
                            break;
                            case T__16: {
                                setState(192);
                                conditional();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(195);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__22) | (1L << T__29) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
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

	public static class MultAssigContext extends ParserRuleContext {
		public MultAssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multAssig; }
	 
		public MultAssigContext() { }
		public void copyFrom(MultAssigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleAssignmentsContext extends MultAssigContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public MultipleAssignmentsContext(MultAssigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultipleAssignments(this);
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

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_assignment);
        try {
            setState(211);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    _localctx = new IDExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(197);
                    match(ID);
                    setState(198);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    _localctx = new IDAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(199);
                    match(ID);
                    setState(200);
                    match(T__0);
                    setState(201);
                    match(ID);
                    setState(202);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    _localctx = new AssignAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(203);
                    match(ID);
                    setState(204);
                    match(T__0);
                    setState(205);
                    expression();
                    setState(206);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    _localctx = new AssignExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(208);
                    expression();
                    setState(209);
                    match(SEMICOLON);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDAssignmentContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(ExprParser.SEMICOLON, 0); }
		public IDAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIDAssignment(this);
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

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_expression);
        try {
            setState(221);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    _localctx = new ArithmeticOperationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(213);
                    arithmeticOp(0);
                }
                break;
                case 2:
                    _localctx = new LogicalOpterationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(214);
                    logicalOp(0);
                }
                break;
                case 3:
                    _localctx = new RelationalOperationContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(215);
                    relationalOp();
                }
                break;
                case 4:
                    _localctx = new FunctionReturnOperationContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(216);
                    functionCall();
                }
                break;
                case 5:
                    _localctx = new ParanthesesExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(217);
                    match(T__2);
                    setState(218);
                    expression();
                    setState(219);
                    match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParanthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParanthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOpterationContext extends ExpressionContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public LogicalOpterationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogicalOpteration(this);
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

    private ArithmeticOpContext arithmeticOp(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, _parentState);
        ArithmeticOpContext _prevctx = _localctx;
        int _startState = 34;
        enterRecursionRule(_localctx, 34, RULE_arithmeticOp, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(232);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__2: {
                        _localctx = new ParanthesesArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(224);
                        match(T__2);
                        setState(225);
                        arithmeticOp(0);
                        setState(226);
                        match(T__3);
                    }
                    break;
                    case ID: {
                        _localctx = new VariableArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(228);
                        match(ID);
                    }
                    break;
                    case IntConstant: {
                        _localctx = new IntegerConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(229);
                        match(IntConstant);
                    }
                    break;
                    case T__22: {
                        _localctx = new NegationIntegerConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(230);
                        match(T__22);
                        setState(231);
                        match(IntConstant);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(251);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(249);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                                case 1: {
                                    _localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(234);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(235);
                                    match(T__18);
                                    setState(236);
                                    arithmeticOp(9);
                                }
                                break;
                                case 2: {
                                    _localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(237);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(238);
                                    match(T__19);
                                    setState(239);
                                    arithmeticOp(8);
                                }
                                break;
                                case 3: {
                                    _localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(240);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(241);
                                    match(T__20);
                                    setState(242);
                                    arithmeticOp(7);
                                }
                                break;
                                case 4: {
                                    _localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(243);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(244);
                                    match(T__21);
                                    setState(245);
                                    arithmeticOp(6);
                                }
                                break;
                                case 5: {
                                    _localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(246);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(247);
                                    match(T__22);
                                    setState(248);
                                    arithmeticOp(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(253);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSubtractionArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSubtractionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstantContext extends ArithmeticOpContext {
		public TerminalNode IntConstant() { return getToken(ExprParser.IntConstant, 0); }
		public IntegerConstantContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntegerConstant(this);
		}
		@Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIntegerConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
        return arithmeticOp(0);
    }

    public final RelationalOpContext relationalOp() throws RecognitionException {
        RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_relationalOp);
        try {
            setState(282);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    _localctx = new ParanthesesRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(254);
                    match(T__2);
                    setState(255);
                    relationalOp();
                    setState(256);
                    match(T__3);
                }
                break;
                case 2:
                    _localctx = new LessRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(258);
                    arithmeticOp(0);
                    setState(259);
                    match(T__23);
                    setState(260);
                    arithmeticOp(0);
                }
                break;
                case 3:
                    _localctx = new LessEqualRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(262);
                    arithmeticOp(0);
                    setState(263);
                    match(T__24);
                    setState(264);
                    arithmeticOp(0);
                }
                break;
                case 4:
                    _localctx = new GreaterRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(266);
                    arithmeticOp(0);
                    setState(267);
                    match(T__25);
                    setState(268);
                    arithmeticOp(0);
                }
                break;
                case 5:
                    _localctx = new GreaterEqualRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(270);
                    arithmeticOp(0);
                    setState(271);
                    match(T__26);
                    setState(272);
                    arithmeticOp(0);
                }
                break;
                case 6:
                    _localctx = new EqualityRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(274);
                    arithmeticOp(0);
                    setState(275);
                    match(T__27);
                    setState(276);
                    arithmeticOp(0);
                }
                break;
                case 7:
                    _localctx = new InequivalenceRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(278);
                    arithmeticOp(0);
                    setState(279);
                    match(T__28);
                    setState(280);
                    arithmeticOp(0);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInequivalenceRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInequivalenceRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public LessEqualRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLessEqualRelational(this);
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

    private LogicalOpContext logicalOp(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
        LogicalOpContext _prevctx = _localctx;
        int _startState = 38;
        enterRecursionRule(_localctx, 38, RULE_logicalOp, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(294);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        _localctx = new ParanthesesLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(285);
                        match(T__2);
                        setState(286);
                        logicalOp(0);
                        setState(287);
                        match(T__3);
                    }
				break;
			case 2: {
                _localctx = new NegationLogicalContext(_localctx);
                _ctx = _localctx;
                _prevctx = _localctx;
                setState(289);
                match(T__29);
                setState(290);
                logicalOp(8);
            }
				break;
			case 3: {
                _localctx = new RelationalOpLogicalContext(_localctx);
                _ctx = _localctx;
                _prevctx = _localctx;
                setState(291);
                relationalOp();
            }
				break;
			case 4: {
                _localctx = new VariableLogicalContext(_localctx);
                _ctx = _localctx;
                _prevctx = _localctx;
                setState(292);
                match(ID);
            }
            break;
                    case 5: {
                        _localctx = new BooleanConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(293);
                        match(BoolConstant);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(310);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(308);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                                case 1: {
                                    _localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(296);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(297);
                                    match(T__30);
                                    setState(298);
                                    logicalOp(8);
                                }
                                break;
                                case 2: {
                                    _localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(299);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(300);
                                    match(T__31);
                                    setState(301);
                                    logicalOp(7);
                                }
                                break;
                                case 3: {
                                    _localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(302);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(303);
                                    match(T__32);
                                    setState(304);
                                    logicalOp(6);
                                }
                                break;
                                case 4: {
                                    _localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(305);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(306);
                                    match(T__33);
                                    setState(307);
                                    logicalOp(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(312);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
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

	public static class LogicalOpContext extends ParserRuleContext {
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
	 
		public LogicalOpContext() { }
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
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelationalOpLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		return logicalOp(0);
	}

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 17:
                return arithmeticOp_sempred((ArithmeticOpContext) _localctx, predIndex);
            case 19:
                return logicalOp_sempred((LogicalOpContext) _localctx, predIndex);
        }
        return true;
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

    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}