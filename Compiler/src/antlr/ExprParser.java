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
			T__24 = 25, VARIABLE = 26, IntConstant = 27, BoolConstant = 28, ConstantValue = 29,
			ID = 30, COMMENT = 31, WS = 32;
	public static final int
			RULE_prog = 0, RULE_declaration = 1, RULE_statement = 2, RULE_assertedConditional = 3,
			RULE_conditional = 4, RULE_elseIf = 5, RULE_multAssig = 6, RULE_assignment = 7,
			RULE_expression = 8, RULE_arithmeticOp = 9, RULE_relationalOp = 10, RULE_logicalOp = 11;
	public static final String[] ruleNames = makeRuleNames();
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00bb\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3" +
					"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7" +
					"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7W\n\7" +
					"\3\b\6\bZ\n\b\r\b\16\b[\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\n\3\n\3\n\3" +
					"\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\13\3\13\3\13\3\13" +
					"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0083\n\13" +
					"\f\13\16\13\u0086\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3" +
					"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3" +
					"\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3" +
					"\r\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\r\2\4\24\30\16\2\4\6\b" +
					"\n\f\16\20\22\24\26\30\2\2\2\u00ce\2\33\3\2\2\2\4+\3\2\2\2\6\61\3\2\2" +
					"\2\b\63\3\2\2\2\n=\3\2\2\2\fV\3\2\2\2\16Y\3\2\2\2\20a\3\2\2\2\22j\3\2" +
					"\2\2\24q\3\2\2\2\26\u009f\3\2\2\2\30\u00a7\3\2\2\2\32\34\5\6\4\2\33\32" +
					"\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7" +
					"\2\2\3 \3\3\2\2\2!\"\7\34\2\2\",\7 \2\2#$\7\34\2\2$%\7 \2\2%&\7\3\2\2" +
					"&,\7 \2\2\'(\7\34\2\2()\7 \2\2)*\7\3\2\2*,\5\22\n\2+!\3\2\2\2+#\3\2\2" +
					"\2+\'\3\2\2\2,\5\3\2\2\2-\62\5\4\3\2.\62\5\20\t\2/\62\5\n\6\2\60\62\5" +
					"\b\5\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2" +
					"\63\64\7\4\2\2\64\65\7\5\2\2\65\66\5\22\n\2\66\67\7\6\2\2\678\5\n\6\2" +
					"89\7\7\2\29:\7\5\2\2:;\5\22\n\2;<\7\6\2\2<\t\3\2\2\2=>\7\b\2\2>?\7\5\2" +
					"\2?@\5\30\r\2@A\7\6\2\2AB\7\t\2\2BC\5\16\b\2CD\7\n\2\2DE\5\f\7\2E\13\3" +
					"\2\2\2FG\7\13\2\2GH\7\b\2\2HI\7\5\2\2IJ\5\30\r\2JK\7\6\2\2KL\7\t\2\2L" +
					"M\5\16\b\2MN\7\n\2\2NO\5\f\7\2OW\3\2\2\2PQ\7\13\2\2QR\7\t\2\2RS\5\16\b" +
					"\2ST\7\n\2\2TW\3\2\2\2UW\3\2\2\2VF\3\2\2\2VP\3\2\2\2VU\3\2\2\2W\r\3\2" +
					"\2\2XZ\5\20\t\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2" +
					"]b\5\22\n\2^_\7 \2\2_`\7\3\2\2`b\5\22\n\2a]\3\2\2\2a^\3\2\2\2b\21\3\2" +
					"\2\2ck\5\24\13\2dk\5\26\f\2ek\5\30\r\2fg\7\5\2\2gh\5\22\n\2hi\7\6\2\2" +
					"ik\3\2\2\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2k\23\3\2\2\2lm\b\13" +
					"\1\2mr\7 \2\2nr\7\35\2\2op\7\20\2\2pr\7\35\2\2ql\3\2\2\2qn\3\2\2\2qo\3" +
					"\2\2\2r\u0084\3\2\2\2st\f\n\2\2tu\7\f\2\2u\u0083\5\24\13\13vw\f\t\2\2" +
					"wx\7\r\2\2x\u0083\5\24\13\nyz\f\b\2\2z{\7\16\2\2{\u0083\5\24\13\t|}\f" +
					"\7\2\2}~\7\17\2\2~\u0083\5\24\13\b\177\u0080\f\6\2\2\u0080\u0081\7\20" +
					"\2\2\u0081\u0083\5\24\13\7\u0082s\3\2\2\2\u0082v\3\2\2\2\u0082y\3\2\2" +
					"\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3" +
					"\2\2\2\u0084\u0085\3\2\2\2\u0085\25\3\2\2\2\u0086\u0084\3\2\2\2\u0087" +
					"\u0088\5\24\13\2\u0088\u0089\7\21\2\2\u0089\u008a\5\24\13\2\u008a\u00a0" +
					"\3\2\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\22\2\2\u008d\u008e\5\24\13" +
					"\2\u008e\u00a0\3\2\2\2\u008f\u0090\5\24\13\2\u0090\u0091\7\23\2\2\u0091" +
					"\u0092\5\24\13\2\u0092\u00a0\3\2\2\2\u0093\u0094\5\24\13\2\u0094\u0095" +
					"\7\24\2\2\u0095\u0096\5\24\13\2\u0096\u00a0\3\2\2\2\u0097\u0098\5\24\13" +
					"\2\u0098\u0099\7\25\2\2\u0099\u009a\5\24\13\2\u009a\u00a0\3\2\2\2\u009b" +
					"\u009c\5\24\13\2\u009c\u009d\7\26\2\2\u009d\u009e\5\24\13\2\u009e\u00a0" +
					"\3\2\2\2\u009f\u0087\3\2\2\2\u009f\u008b\3\2\2\2\u009f\u008f\3\2\2\2\u009f" +
					"\u0093\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\27\3\2\2" +
					"\2\u00a1\u00a2\b\r\1\2\u00a2\u00a3\7\27\2\2\u00a3\u00a8\5\30\r\n\u00a4" +
					"\u00a8\5\26\f\2\u00a5\u00a8\7 \2\2\u00a6\u00a8\7\36\2\2\u00a7\u00a1\3" +
					"\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8" +
					"\u00b7\3\2\2\2\u00a9\u00aa\f\t\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00b6\5" +
					"\30\r\n\u00ac\u00ad\f\b\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b6\5\30\r\t" +
					"\u00af\u00b0\f\7\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b6\5\30\r\b\u00b2\u00b3" +
					"\f\6\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b6\5\30\r\7\u00b5\u00a9\3\2\2\2" +
					"\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9" +
					"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\31\3\2\2\2\u00b9" +
					"\u00b7\3\2\2\2\20\35+\61V[ajq\u0082\u0084\u009f\u00a7\u00b5\u00b7";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	static {
		RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"prog", "declaration", "statement", "assertedConditional", "conditional",
				"elseIf", "multAssig", "assignment", "expression", "arithmeticOp", "relationalOp",
				"logicalOp"
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

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'='", "'if_require'", "'('", "')'", "'if_ensure'", "'if'", "'{'",
				"'}'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'",
				"'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, "VARIABLE", "IntConstant", "BoolConstant", "ConstantValue",
				"ID", "COMMENT", "WS"
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
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(24);
							statement();
						}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__13) | (1L << T__20) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
				setState(29);
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

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1:
					_localctx = new VariableDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(31);
					match(VARIABLE);
					setState(32);
					match(ID);
				}
				break;
				case 2:
					_localctx = new VariableInitializationConstantCopyContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(33);
					match(VARIABLE);
					setState(34);
					match(ID);
					setState(35);
					match(T__0);
					setState(36);
					match(ID);
				}
				break;
				case 3:
					_localctx = new VariableInitializationConstantContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(37);
					match(VARIABLE);
					setState(38);
					match(ID);
					setState(39);
					match(T__0);
					setState(40);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case VARIABLE:
					enterOuterAlt(_localctx, 1);
				{
					setState(43);
					declaration();
				}
				break;
				case T__2:
				case T__13:
				case T__20:
				case IntConstant:
				case BoolConstant:
				case ID:
					enterOuterAlt(_localctx, 2);
				{
					setState(44);
					assignment();
				}
				break;
				case T__5:
					enterOuterAlt(_localctx, 3);
				{
					setState(45);
					conditional();
				}
				break;
				case T__1:
					enterOuterAlt(_localctx, 4);
				{
					setState(46);
					assertedConditional();
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

	public final AssertedConditionalContext assertedConditional() throws RecognitionException {
		AssertedConditionalContext _localctx = new AssertedConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assertedConditional);
		try {
			_localctx = new ConditionalAssertionStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(49);
				match(T__1);
				setState(50);
				match(T__2);
				setState(51);
				expression();
				setState(52);
				match(T__3);
				setState(53);
				conditional();
				setState(54);
				match(T__4);
				setState(55);
				match(T__2);
				setState(56);
				expression();
				setState(57);
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

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		try {
			_localctx = new IfConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(59);
				match(T__5);
				setState(60);
				match(T__2);
				setState(61);
				logicalOp(0);
				setState(62);
				match(T__3);
				setState(63);
				match(T__6);
				setState(64);
				multAssig();
				setState(65);
				match(T__7);
				setState(66);
				elseIf();
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
		enterRule(_localctx, 10, RULE_elseIf);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
				case 1:
					_localctx = new ElseIfConditionalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(68);
					match(T__8);
					setState(69);
					match(T__5);
					setState(70);
					match(T__2);
					setState(71);
					logicalOp(0);
					setState(72);
					match(T__3);
					setState(73);
					match(T__6);
					setState(74);
					multAssig();
					setState(75);
					match(T__7);
					setState(76);
					elseIf();
				}
				break;
				case 2:
					_localctx = new ElseConditionalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(78);
					match(T__8);
					setState(79);
					match(T__6);
					setState(80);
					multAssig();
					setState(81);
					match(T__7);
				}
				break;
				case 3:
					_localctx = new EpsilonConditionalContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
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

	public final MultAssigContext multAssig() throws RecognitionException {
		MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multAssig);
		int _la;
		try {
			_localctx = new MultipleAssignmentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(86);
							assignment();
						}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__20) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
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
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
				case 1:
					_localctx = new AssignExpressionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(91);
					expression();
				}
				break;
				case 2:
					_localctx = new AssignAssignmentContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(92);
					match(ID);
					setState(93);
					match(T__0);
					setState(94);
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

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					_localctx = new ArithmeticOperationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(97);
					arithmeticOp(0);
				}
				break;
				case 2:
					_localctx = new RelationalOperationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(98);
					relationalOp();
				}
				break;
				case 3:
					_localctx = new LogicalOpterationContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(99);
					logicalOp(0);
				}
				break;
				case 4:
					_localctx = new ParanthesesExpressionContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(100);
					match(T__2);
					setState(101);
					expression();
					setState(102);
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

	private ArithmeticOpContext arithmeticOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, _parentState);
		ArithmeticOpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmeticOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case ID: {
						_localctx = new VariableArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(107);
						match(ID);
					}
					break;
					case IntConstant: {
						_localctx = new IntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(108);
						match(IntConstant);
					}
					break;
					case T__13: {
						_localctx = new NegationIntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(109);
						match(T__13);
						setState(110);
						match(IntConstant);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(128);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
								case 1: {
									_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(113);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(114);
									match(T__9);
									setState(115);
									arithmeticOp(9);
								}
								break;
								case 2: {
									_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(116);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(117);
									match(T__10);
									setState(118);
									arithmeticOp(8);
								}
								break;
								case 3: {
									_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(119);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(120);
									match(T__11);
									setState(121);
									arithmeticOp(7);
								}
								break;
								case 4: {
									_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(122);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(123);
									match(T__12);
									setState(124);
									arithmeticOp(6);
								}
								break;
								case 5: {
									_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(125);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(126);
									match(T__13);
									setState(127);
									arithmeticOp(5);
								}
								break;
							}
						}
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
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

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalOp);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
				case 1:
					_localctx = new LessRelationalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(133);
					arithmeticOp(0);
					setState(134);
					match(T__14);
					setState(135);
					arithmeticOp(0);
				}
				break;
				case 2:
					_localctx = new LessEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(137);
					arithmeticOp(0);
					setState(138);
					match(T__15);
					setState(139);
					arithmeticOp(0);
				}
				break;
				case 3:
					_localctx = new GreaterRelationalContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(141);
					arithmeticOp(0);
					setState(142);
					match(T__16);
					setState(143);
					arithmeticOp(0);
				}
				break;
				case 4:
					_localctx = new GreaterEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(145);
					arithmeticOp(0);
					setState(146);
					match(T__17);
					setState(147);
					arithmeticOp(0);
				}
				break;
				case 5:
					_localctx = new EqualityRelationalContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(149);
					arithmeticOp(0);
					setState(150);
					match(T__18);
					setState(151);
					arithmeticOp(0);
				}
				break;
				case 6:
					_localctx = new InequivalenceRelationalContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(153);
					arithmeticOp(0);
					setState(154);
					match(T__19);
					setState(155);
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

	public final LogicalOpContext logicalOp() throws RecognitionException {
		return logicalOp(0);
	}

	private LogicalOpContext logicalOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
		LogicalOpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicalOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(165);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
					case 1: {
						_localctx = new NegationLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(160);
						match(T__20);
						setState(161);
						logicalOp(8);
					}
					break;
					case 2: {
						_localctx = new RelationalOpLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(162);
						relationalOp();
					}
					break;
					case 3: {
						_localctx = new VariableLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(163);
						match(ID);
					}
					break;
					case 4: {
						_localctx = new BooleanConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(164);
						match(BoolConstant);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(179);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
								case 1: {
									_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(167);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(168);
									match(T__21);
									setState(169);
									logicalOp(8);
								}
								break;
								case 2: {
									_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(170);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(171);
									match(T__22);
									setState(172);
									logicalOp(7);
								}
								break;
								case 3: {
									_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(173);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(174);
									match(T__23);
									setState(175);
									logicalOp(6);
								}
								break;
								case 4: {
									_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(176);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(177);
									match(T__24);
									setState(178);
									logicalOp(5);
								}
								break;
							}
						}
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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
			case 9:
				return arithmeticOp_sempred((ArithmeticOpContext) _localctx, predIndex);
			case 11:
				return logicalOp_sempred((LogicalOpContext) _localctx, predIndex);
		}
		return true;
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

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ProgContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ProgramContext extends ProgContext {
		public ProgramContext(ProgContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode EOF() {
			return getToken(ExprParser.EOF, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public DeclarationContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_declaration;
		}

		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
	}

	public static class VariableInitializationConstantCopyContext extends DeclarationContext {
		public VariableInitializationConstantCopyContext(DeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener)
				((ExprListener) listener).enterVariableInitializationConstantCopy(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener)
				((ExprListener) listener).exitVariableInitializationConstantCopy(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitVariableInitializationConstantCopy(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class VariableInitializationConstantContext extends DeclarationContext {
		public VariableInitializationConstantContext(DeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class AssertedConditionalContext extends ParserRuleContext {
		public AssertedConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AssertedConditionalContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_assertedConditional;
		}

		public void copyFrom(AssertedConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ConditionalAssertionStatementContext extends AssertedConditionalContext {
		public ConditionalAssertionStatementContext(AssertedConditionalContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class, 0);
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

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConditionalContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditional;
		}

		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IfConditionalContext extends ConditionalContext {
		public IfConditionalContext(ConditionalContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class, 0);
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

	public static class ElseIfContext extends ParserRuleContext {
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ElseIfContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseIf;
		}

		public void copyFrom(ElseIfContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ElseIfConditionalContext extends ElseIfContext {
		public ElseIfConditionalContext(ElseIfContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
		}

		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class, 0);
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

	public static class EpsilonConditionalContext extends ElseIfContext {
		public EpsilonConditionalContext(ElseIfContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterEpsilonConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitEpsilonConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitEpsilonConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ElseConditionalContext extends ElseIfContext {
		public ElseConditionalContext(ElseIfContext ctx) {
			copyFrom(ctx);
		}

		public MultAssigContext multAssig() {
			return getRuleContext(MultAssigContext.class, 0);
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

	public static class MultAssigContext extends ParserRuleContext {
		public MultAssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MultAssigContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_multAssig;
		}

		public void copyFrom(MultAssigContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class MultipleAssignmentsContext extends MultAssigContext {
		public MultipleAssignmentsContext(MultAssigContext ctx) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AssignmentContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class VariableDeclarationContext extends DeclarationContext {
		public VariableDeclarationContext(DeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterVariableDeclaration(this);
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

	public static class AssignExpressionContext extends AssignmentContext {
		public AssignExpressionContext(AssignmentContext ctx) {
			copyFrom(ctx);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignAssignmentContext extends AssignmentContext {
		public AssignAssignmentContext(AssignmentContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignAssignment(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class VariableArithmeticContext extends ArithmeticOpContext {
		public VariableArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterVariableArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitVariableArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitVariableArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RelationalOperationContext extends ExpressionContext {
		public RelationalOperationContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterRelationalOperation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ArithmeticOperationContext extends ExpressionContext {
		public ArithmeticOperationContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterArithmeticOperation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitArithmeticOperation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParanthesesExpressionContext extends ExpressionContext {
		public ParanthesesExpressionContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParanthesesExpression(this);
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

	public static class LessRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public LessRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}
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

		public GreaterRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterGreaterRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitGreaterRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitGreaterRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LogicalOpterationContext extends ExpressionContext {
		public LogicalOpterationContext(ExpressionContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
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

	public static class ArithmeticOpContext extends ParserRuleContext {
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ArithmeticOpContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_arithmeticOp;
		}

		public void copyFrom(ArithmeticOpContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class DivisionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public DivisionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterDivisionArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitDivisionArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitDivisionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AdditionArithmeticContext extends ArithmeticOpContext {
		public AdditionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAdditionArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAdditionArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitAdditionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SubtractionArithmeticContext extends ArithmeticOpContext {
		public SubtractionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterSubtractionArithmetic(this);
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

	public static class IntegerConstantContext extends ArithmeticOpContext {
		public IntegerConstantContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IntConstant() {
			return getToken(ExprParser.IntConstant, 0);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public RelationalOpContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalOp;
		}

		public void copyFrom(RelationalOpContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class EqualityRelationalContext extends RelationalOpContext {
		public EqualityRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterEqualityRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitEqualityRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitEqualityRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GreaterEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public GreaterEqualRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterGreaterEqualRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitGreaterEqualRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitGreaterEqualRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InequivalenceRelationalContext extends RelationalOpContext {
		public InequivalenceRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterInequivalenceRelational(this);
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

	public static class LessEqualRelationalContext extends RelationalOpContext {
		public LessEqualRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
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

	public static class LogicalOpContext extends ParserRuleContext {
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LogicalOpContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_logicalOp;
		}

		public void copyFrom(LogicalOpContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ConjunctionLogicalContext extends LogicalOpContext {
		public ConjunctionLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}

		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}

		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterConjunctionLogical(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitConjunctionLogical(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitConjunctionLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BooleanConstantContext extends LogicalOpContext {
		public BooleanConstantContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BoolConstant() {
			return getToken(ExprParser.BoolConstant, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterBooleanConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitBooleanConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RelationalOpLogicalContext extends LogicalOpContext {
		public RelationalOpLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}

		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterRelationalOpLogical(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitRelationalOpLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitRelationalOpLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}