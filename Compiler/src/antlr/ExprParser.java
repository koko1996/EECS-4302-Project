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

	protected static final DFA[] _decisionToDFA;
	public static final int
			RULE_prog = 0, RULE_declaration = 1, RULE_statement = 2, RULE_assertedConditional = 3,
			RULE_conditional = 4, RULE_elseIf = 5, RULE_multAssig = 6, RULE_assignment = 7,
			RULE_expression = 8, RULE_arithmeticOp = 9, RULE_relationalOp = 10, RULE_logicalOp = 11;
	public static final String[] ruleNames = makeRuleNames();
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c7\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3" +
					"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6D\n\6\r\6\16" +
					"\6E\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7R\n\7\r\7\16\7S\3\7\3\7" +
					"\3\7\3\7\3\7\3\7\6\7\\\n\7\r\7\16\7]\3\7\3\7\3\7\5\7c\n\7\3\b\6\bf\n\b" +
					"\r\b\16\bg\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nw\n" +
					"\n\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3" +
					"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16\13" +
					"\u0092\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3" +
					"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\r\3" +
					"\r\3\r\5\r\u00b4\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7" +
					"\r\u00c2\n\r\f\r\16\r\u00c5\13\r\3\r\2\4\24\30\16\2\4\6\b\n\f\16\20\22" +
					"\24\26\30\2\2\2\u00dd\2\33\3\2\2\2\4+\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2" +
					"\2\n=\3\2\2\2\fb\3\2\2\2\16e\3\2\2\2\20m\3\2\2\2\22v\3\2\2\2\24}\3\2\2" +
					"\2\26\u00ab\3\2\2\2\30\u00b3\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\35" +
					"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2" +
					"\2\2!\"\7\34\2\2\",\7 \2\2#$\7\34\2\2$%\7 \2\2%&\7\3\2\2&,\7 \2\2\'(\7" +
					"\34\2\2()\7 \2\2)*\7\3\2\2*,\5\22\n\2+!\3\2\2\2+#\3\2\2\2+\'\3\2\2\2," +
					"\5\3\2\2\2-\62\5\4\3\2.\62\5\20\t\2/\62\5\n\6\2\60\62\5\b\5\2\61-\3\2" +
					"\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\7\4\2\2" +
					"\64\65\7\5\2\2\65\66\5\22\n\2\66\67\7\6\2\2\678\5\n\6\289\7\7\2\29:\7" +
					"\5\2\2:;\5\22\n\2;<\7\6\2\2<\t\3\2\2\2=>\7\b\2\2>?\7\5\2\2?@\5\30\r\2" +
					"@A\7\6\2\2AC\7\t\2\2BD\5\20\t\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2" +
					"\2FG\3\2\2\2GH\7\n\2\2HI\5\f\7\2I\13\3\2\2\2JK\7\13\2\2KL\7\b\2\2LM\7" +
					"\5\2\2MN\5\30\r\2NO\7\6\2\2OQ\7\t\2\2PR\5\20\t\2QP\3\2\2\2RS\3\2\2\2S" +
					"Q\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\n\2\2VW\5\f\7\2Wc\3\2\2\2XY\7\13\2\2" +
					"Y[\7\t\2\2Z\\\5\20\t\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2" +
					"\2\2_`\7\n\2\2`c\3\2\2\2ac\3\2\2\2bJ\3\2\2\2bX\3\2\2\2ba\3\2\2\2c\r\3" +
					"\2\2\2df\5\20\t\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\17\3\2\2\2" +
					"in\5\22\n\2jk\7 \2\2kl\7\3\2\2ln\5\22\n\2mi\3\2\2\2mj\3\2\2\2n\21\3\2" +
					"\2\2ow\5\24\13\2pw\5\26\f\2qw\5\30\r\2rs\7\5\2\2st\5\22\n\2tu\7\6\2\2" +
					"uw\3\2\2\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2w\23\3\2\2\2xy\b\13" +
					"\1\2y~\7 \2\2z~\7\35\2\2{|\7\20\2\2|~\7\35\2\2}x\3\2\2\2}z\3\2\2\2}{\3" +
					"\2\2\2~\u0090\3\2\2\2\177\u0080\f\n\2\2\u0080\u0081\7\f\2\2\u0081\u008f" +
					"\5\24\13\13\u0082\u0083\f\t\2\2\u0083\u0084\7\r\2\2\u0084\u008f\5\24\13" +
					"\n\u0085\u0086\f\b\2\2\u0086\u0087\7\16\2\2\u0087\u008f\5\24\13\t\u0088" +
					"\u0089\f\7\2\2\u0089\u008a\7\17\2\2\u008a\u008f\5\24\13\b\u008b\u008c" +
					"\f\6\2\2\u008c\u008d\7\20\2\2\u008d\u008f\5\24\13\7\u008e\177\3\2\2\2" +
					"\u008e\u0082\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b" +
					"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091" +
					"\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\21" +
					"\2\2\u0095\u0096\5\24\13\2\u0096\u00ac\3\2\2\2\u0097\u0098\5\24\13\2\u0098" +
					"\u0099\7\22\2\2\u0099\u009a\5\24\13\2\u009a\u00ac\3\2\2\2\u009b\u009c" +
					"\5\24\13\2\u009c\u009d\7\23\2\2\u009d\u009e\5\24\13\2\u009e\u00ac\3\2" +
					"\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2\5\24\13\2" +
					"\u00a2\u00ac\3\2\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\7\25\2\2\u00a5" +
					"\u00a6\5\24\13\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9" +
					"\7\26\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ac\3\2\2\2\u00ab\u0093\3\2\2" +
					"\2\u00ab\u0097\3\2\2\2\u00ab\u009b\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a3" +
					"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\b\r\1\2\u00ae" +
					"\u00af\7\27\2\2\u00af\u00b4\5\30\r\n\u00b0\u00b4\5\26\f\2\u00b1\u00b4" +
					"\7 \2\2\u00b2\u00b4\7\36\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3" +
					"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00c3\3\2\2\2\u00b5\u00b6\f\t" +
					"\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00c2\5\30\r\n\u00b8\u00b9\f\b\2\2\u00b9" +
					"\u00ba\7\31\2\2\u00ba\u00c2\5\30\r\t\u00bb\u00bc\f\7\2\2\u00bc\u00bd\7" +
					"\32\2\2\u00bd\u00c2\5\30\r\b\u00be\u00bf\f\6\2\2\u00bf\u00c0\7\33\2\2" +
					"\u00c0\u00c2\5\30\r\7\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bb" +
					"\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3" +
					"\u00c4\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c3\3\2\2\2\23\35+\61ES]bgmv}" +
					"\u008e\u0090\u00ab\u00b3\u00c1\u00c3";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declaration;
		}

		public DeclarationContext() {
		}

		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
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
	public static class VariableDeclarationContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
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
		int _la;
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
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(64);
							assignment();
						}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__20) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
				setState(69);
				match(T__7);
				setState(70);
				elseIf();
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

	public static class ConditionalAssertionStatementContext extends AssertedConditionalContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
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

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIf);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					_localctx = new ElseIfConditionalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(72);
					match(T__8);
					setState(73);
					match(T__5);
					setState(74);
					match(T__2);
					setState(75);
					logicalOp(0);
					setState(76);
					match(T__3);
					setState(77);
					match(T__6);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(78);
								assignment();
							}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__20) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
					setState(83);
					match(T__7);
					setState(84);
					elseIf();
				}
				break;
				case 2:
					_localctx = new ElseConditionalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(86);
					match(T__8);
					setState(87);
					match(T__6);
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(88);
								assignment();
							}
						}
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__13) | (1L << T__20) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
					setState(93);
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

	public final MultAssigContext multAssig() throws RecognitionException {
		MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multAssig);
		int _la;
		try {
			_localctx = new MultipleAssignmentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(98);
							assignment();
						}
					}
					setState(101);
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
			setState(107);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
				case 1:
					_localctx = new AssignExpressionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(103);
					expression();
				}
				break;
				case 2:
					_localctx = new AssignAssignmentContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(104);
					match(ID);
					setState(105);
					match(T__0);
					setState(106);
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
			setState(116);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
				case 1:
					_localctx = new ArithmeticOperationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(109);
					arithmeticOp(0);
				}
				break;
				case 2:
					_localctx = new RelationalOperationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(110);
					relationalOp();
				}
				break;
				case 3:
					_localctx = new LogicalOpterationContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(111);
					logicalOp(0);
				}
				break;
				case 4:
					_localctx = new ParanthesesExpressionContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(112);
					match(T__2);
					setState(113);
					expression();
					setState(114);
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
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case ID: {
						_localctx = new VariableArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(119);
						match(ID);
					}
					break;
					case IntConstant: {
						_localctx = new IntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(120);
						match(IntConstant);
					}
					break;
					case T__13: {
						_localctx = new NegationIntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(121);
						match(T__13);
						setState(122);
						match(IntConstant);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(140);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
								case 1: {
									_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(125);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(126);
									match(T__9);
									setState(127);
									arithmeticOp(9);
								}
								break;
								case 2: {
									_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(128);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(129);
									match(T__10);
									setState(130);
									arithmeticOp(8);
								}
								break;
								case 3: {
									_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(131);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(132);
									match(T__11);
									setState(133);
									arithmeticOp(7);
								}
								break;
								case 4: {
									_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(134);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(135);
									match(T__12);
									setState(136);
									arithmeticOp(6);
								}
								break;
								case 5: {
									_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(137);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(138);
									match(T__13);
									setState(139);
									arithmeticOp(5);
								}
								break;
							}
						}
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
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
			setState(169);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1:
					_localctx = new LessRelationalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(145);
					arithmeticOp(0);
					setState(146);
					match(T__14);
					setState(147);
					arithmeticOp(0);
				}
				break;
				case 2:
					_localctx = new LessEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(149);
					arithmeticOp(0);
					setState(150);
					match(T__15);
					setState(151);
					arithmeticOp(0);
				}
				break;
				case 3:
					_localctx = new GreaterRelationalContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(153);
					arithmeticOp(0);
					setState(154);
					match(T__16);
					setState(155);
					arithmeticOp(0);
				}
				break;
				case 4:
					_localctx = new GreaterEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(157);
					arithmeticOp(0);
					setState(158);
					match(T__17);
					setState(159);
					arithmeticOp(0);
				}
				break;
				case 5:
					_localctx = new EqualityRelationalContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(161);
					arithmeticOp(0);
					setState(162);
					match(T__18);
					setState(163);
					arithmeticOp(0);
				}
				break;
				case 6:
					_localctx = new InequivalenceRelationalContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(165);
					arithmeticOp(0);
					setState(166);
					match(T__19);
					setState(167);
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
				setState(177);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
					case 1: {
						_localctx = new NegationLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(172);
						match(T__20);
						setState(173);
						logicalOp(8);
					}
					break;
					case 2: {
						_localctx = new RelationalOpLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(174);
						relationalOp();
					}
					break;
					case 3: {
						_localctx = new VariableLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(175);
						match(ID);
					}
					break;
					case 4: {
						_localctx = new BooleanConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(176);
						match(BoolConstant);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(191);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
								case 1: {
									_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(179);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(180);
									match(T__21);
									setState(181);
									logicalOp(8);
								}
								break;
								case 2: {
									_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(182);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(183);
									match(T__22);
									setState(184);
									logicalOp(7);
								}
								break;
								case 3: {
									_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(185);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(186);
									match(T__23);
									setState(187);
									logicalOp(6);
								}
								break;
								case 4: {
									_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(188);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(189);
									match(T__24);
									setState(190);
									logicalOp(5);
								}
								break;
							}
						}
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
			}
		}
		catch (RecognitionException re) {
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

	public static class VariableInitializationConstantCopyContext extends DeclarationContext {
		public TerminalNode VARIABLE() {
			return getToken(ExprParser.VARIABLE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}

		public VariableInitializationConstantCopyContext(DeclarationContext ctx) {
			copyFrom(ctx);
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
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignExpressionContext(AssignmentContext ctx) {
			copyFrom(ctx);
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

	public static class RelationalOperationContext extends ExpressionContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class, 0);
		}

		public RelationalOperationContext(ExpressionContext ctx) {
			copyFrom(ctx);
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
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class, 0);
		}

		public ArithmeticOperationContext(ExpressionContext ctx) {
			copyFrom(ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ParanthesesExpressionContext(ExpressionContext ctx) {
			copyFrom(ctx);
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

	public static class IfConditionalContext extends ConditionalContext {
		public IfConditionalContext(ConditionalContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class, 0);
		}

		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
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

	public static class ArithmeticOpContext extends ParserRuleContext {
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arithmeticOp;
		}

		public ArithmeticOpContext() {
		}

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

	public static class ElseIfConditionalContext extends ElseIfContext {
		public ElseIfConditionalContext(ElseIfContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class, 0);
		}

		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
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

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
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

		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}

		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class, i);
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

	public static class EqualityRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public EqualityRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}
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
	public static class BooleanConstantContext extends LogicalOpContext {
		public TerminalNode BoolConstant() { return getToken(ExprParser.BoolConstant, 0); }
		public BooleanConstantContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleanConstant(this);
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

	public static class AssignAssignmentContext extends AssignmentContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignAssignmentContext(AssignmentContext ctx) {
			copyFrom(ctx);
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

	public final LogicalOpContext logicalOp() throws RecognitionException {
		return logicalOp(0);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalOp;
		}

		public RelationalOpContext() {
		}

		public void copyFrom(RelationalOpContext ctx) {
			super.copyFrom(ctx);
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

	public static class RelationalOpLogicalContext extends LogicalOpContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class, 0);
		}

		public RelationalOpLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
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