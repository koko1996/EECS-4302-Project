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
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
			T__24 = 25, VARIABLE = 26, IntConstant = 27, BoolConstant = 28, ConstantValue = 29,
			ID = 30, COMMENT = 31, WS = 32;
	public static final int
			RULE_prog = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assertedConditional = 3,
			RULE_conditional = 4, RULE_elseIf = 5, RULE_finaElse = 6, RULE_multAssig = 7,
			RULE_assignment = 8, RULE_expression = 9, RULE_arithmeticOp = 10, RULE_relationalOp = 11,
			RULE_logicalOp = 12;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3" +
					"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
					"\6\7\6H\n\6\f\6\16\6K\13\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
					"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t_\n\t\r\t\16\t`\3\n\3\n\3\n\3\n\3\n" +
					"\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13" +
					"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\f\3\f\3\f\3\f\3\f" +
					"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094" +
					"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r" +
					"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\16\3" +
					"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\16\3\16" +
					"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16" +
					"\16\16\u00cf\13\16\3\16\2\4\26\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32" +
					"\2\2\2\u00e9\2\35\3\2\2\2\4\'\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n?\3\2" +
					"\2\2\fO\3\2\2\2\16X\3\2\2\2\20^\3\2\2\2\22k\3\2\2\2\24t\3\2\2\2\26\177" +
					"\3\2\2\2\30\u00b1\3\2\2\2\32\u00bd\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2" +
					"\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2" +
					"\2\2#(\5\6\4\2$(\5\22\n\2%(\5\n\6\2&(\5\b\5\2\'#\3\2\2\2\'$\3\2\2\2\'" +
					"%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\34\2\2*\64\7 \2\2+,\7\34\2\2,-\7 " +
					"\2\2-.\7\3\2\2.\64\7 \2\2/\60\7\34\2\2\60\61\7 \2\2\61\62\7\3\2\2\62\64" +
					"\5\24\13\2\63)\3\2\2\2\63+\3\2\2\2\63/\3\2\2\2\64\7\3\2\2\2\65\66\7\4" +
					"\2\2\66\67\7\5\2\2\678\5\32\16\289\7\6\2\29:\5\n\6\2:;\7\7\2\2;<\7\5\2" +
					"\2<=\5\32\16\2=>\7\6\2\2>\t\3\2\2\2?@\7\b\2\2@A\7\5\2\2AB\5\32\16\2BC" +
					"\7\6\2\2CD\7\t\2\2DE\5\20\t\2EI\7\n\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2\2" +
					"IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\16\b\2ML\3\2\2\2MN\3\2\2" +
					"\2N\13\3\2\2\2OP\7\13\2\2PQ\7\b\2\2QR\7\5\2\2RS\5\32\16\2ST\7\6\2\2TU" +
					"\7\t\2\2UV\5\20\t\2VW\7\n\2\2W\r\3\2\2\2XY\7\13\2\2YZ\7\t\2\2Z[\5\20\t" +
					"\2[\\\7\n\2\2\\\17\3\2\2\2]_\5\22\n\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a" +
					"\3\2\2\2a\21\3\2\2\2bl\5\24\13\2cd\7 \2\2de\7\3\2\2el\7 \2\2fg\7 \2\2" +
					"gh\7\3\2\2hl\5\24\13\2il\5\n\6\2jl\5\b\5\2kb\3\2\2\2kc\3\2\2\2kf\3\2\2" +
					"\2ki\3\2\2\2kj\3\2\2\2l\23\3\2\2\2mu\5\26\f\2nu\5\30\r\2ou\5\32\16\2p" +
					"q\7\5\2\2qr\5\24\13\2rs\7\6\2\2su\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2" +
					"\2tp\3\2\2\2u\25\3\2\2\2vw\b\f\1\2wx\7\5\2\2xy\5\26\f\2yz\7\6\2\2z\u0080" +
					"\3\2\2\2{\u0080\7 \2\2|\u0080\7\35\2\2}~\7\20\2\2~\u0080\7\35\2\2\177" +
					"v\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\u0080\u0092\3\2\2\2\u0081" +
					"\u0082\f\n\2\2\u0082\u0083\7\f\2\2\u0083\u0091\5\26\f\13\u0084\u0085\f" +
					"\t\2\2\u0085\u0086\7\r\2\2\u0086\u0091\5\26\f\n\u0087\u0088\f\b\2\2\u0088" +
					"\u0089\7\16\2\2\u0089\u0091\5\26\f\t\u008a\u008b\f\7\2\2\u008b\u008c\7" +
					"\17\2\2\u008c\u0091\5\26\f\b\u008d\u008e\f\6\2\2\u008e\u008f\7\20\2\2" +
					"\u008f\u0091\5\26\f\7\u0090\u0081\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0087" +
					"\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092" +
					"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2\2\u0094\u0092\3\2\2" +
					"\2\u0095\u0096\7\5\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\6\2\2\u0098" +
					"\u00b2\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\21\2\2\u009b\u009c\5" +
					"\26\f\2\u009c\u00b2\3\2\2\2\u009d\u009e\5\26\f\2\u009e\u009f\7\22\2\2" +
					"\u009f\u00a0\5\26\f\2\u00a0\u00b2\3\2\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3" +
					"\7\23\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00b2\3\2\2\2\u00a5\u00a6\5\26\f" +
					"\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00b2\3\2\2\2\u00a9" +
					"\u00aa\5\26\f\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00b2" +
					"\3\2\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\7\26\2\2\u00af\u00b0\5\26\f" +
					"\2\u00b0\u00b2\3\2\2\2\u00b1\u0095\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1\u009d" +
					"\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1" +
					"\u00ad\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\b\16\1\2\u00b4\u00b5\7\5\2" +
					"\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\6\2\2\u00b7\u00be\3\2\2\2\u00b8" +
					"\u00b9\7\27\2\2\u00b9\u00be\5\32\16\n\u00ba\u00be\5\30\r\2\u00bb\u00be" +
					"\7 \2\2\u00bc\u00be\7\36\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd" +
					"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00cd\3\2" +
					"\2\2\u00bf\u00c0\f\t\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00cc\5\32\16\n\u00c2" +
					"\u00c3\f\b\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00cc\5\32\16\t\u00c5\u00c6" +
					"\f\7\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00cc\5\32\16\b\u00c8\u00c9\f\6\2" +
					"\2\u00c9\u00ca\7\33\2\2\u00ca\u00cc\5\32\16\7\u00cb\u00bf\3\2\2\2\u00cb" +
					"\u00c2\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2" +
					"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00cd" +
					"\3\2\2\2\21\37\'\63IM`kt\177\u0090\u0092\u00b1\u00bd\u00cb\u00cd";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	public static final String[] ruleNames = makeRuleNames();
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, "VARIABLE", "IntConstant", "BoolConstant", "ConstantValue",
				"ID", "COMMENT", "WS"
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

	private static String[] makeRuleNames() {
		return new String[]{
				"prog", "statement", "declaration", "assertedConditional", "conditional",
				"elseIf", "finaElse", "multAssig", "assignment", "expression", "arithmeticOp",
				"relationalOp", "logicalOp"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'='", "'if_require'", "'('", "')'", "'if_ensure'", "'if'", "'{'",
				"'}'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'",
				"'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'"
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
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(26);
							statement();
						}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__13) | (1L << T__20) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
				setState(31);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(33);
					declaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(34);
					assignment();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(35);
					conditional();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(36);
					assertedConditional();
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
	public static class VariableInitializationConstantCopyContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
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
		public VariableInitializationConstantContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableInitializationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableInitializationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableInitializationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					_localctx = new VariableDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(39);
					match(VARIABLE);
					setState(40);
					match(ID);
				}
				break;
				case 2:
					_localctx = new VariableInitializationConstantCopyContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(41);
					match(VARIABLE);
					setState(42);
					match(ID);
					setState(43);
					match(T__0);
					setState(44);
					match(ID);
				}
				break;
				case 3:
					_localctx = new VariableInitializationConstantContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(45);
					match(VARIABLE);
					setState(46);
					match(ID);
					setState(47);
					match(T__0);
					setState(48);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConditionalAssertionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConditionalAssertionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertedConditionalContext assertedConditional() throws RecognitionException {
		AssertedConditionalContext _localctx = new AssertedConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assertedConditional);
		try {
			_localctx = new ConditionalAssertionStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			match(T__2);
			setState(53);
			logicalOp(0);
			setState(54);
			match(T__3);
			setState(55);
			conditional();
			setState(56);
			match(T__4);
			setState(57);
			match(T__2);
			setState(58);
			logicalOp(0);
			setState(59);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		int _la;
		try {
			int _alt;
			_localctx = new IfConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
			setState(62);
			match(T__2);
			setState(63);
			logicalOp(0);
			setState(64);
			match(T__3);
			setState(65);
			match(T__6);
			setState(66);
			multAssig();
			setState(67);
			match(T__7);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					elseIf();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(74);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseIfConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitElseIfConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIf);
		try {
			_localctx = new ElseIfConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__8);
			setState(78);
			match(T__5);
			setState(79);
			match(T__2);
			setState(80);
			logicalOp(0);
			setState(81);
			match(T__3);
			setState(82);
			match(T__6);
			setState(83);
			multAssig();
			setState(84);
			match(T__7);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitElseConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinaElseContext finaElse() throws RecognitionException {
		FinaElseContext _localctx = new FinaElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_finaElse);
		try {
			_localctx = new ElseConditionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__8);
			setState(87);
			match(T__6);
			setState(88);
			multAssig();
			setState(89);
			match(T__7);
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
		public MultipleAssignmentsContext(MultAssigContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultipleAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultipleAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMultipleAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultAssigContext multAssig() throws RecognitionException {
		MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multAssig);
		int _la;
		try {
			_localctx = new MultipleAssignmentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
				do {
					{
						{
							setState(91);
							assignment();
						}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__13) | (1L << T__20) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
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

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					_localctx = new AssignExpressionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(96);
					expression();
				}
				break;
			case 2:
				_localctx = new IDAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ID);
				setState(98);
				match(T__0);
				setState(99);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AssignAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
			{
				setState(100);
				match(ID);
				setState(101);
				match(T__0);
				setState(102);
				expression();
			}
			break;
				case 4:
					_localctx = new AssignConditionalContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(103);
					conditional();
				}
				break;
				case 5:
					_localctx = new AssignAssertedConditionalContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(104);
					assertedConditional();
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

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
				case 1:
					_localctx = new ArithmeticOperationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(107);
					arithmeticOp(0);
				}
				break;
			case 2:
				_localctx = new RelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
			{
				setState(108);
				relationalOp();
			}
				break;
			case 3:
				_localctx = new LogicalOpterationContext(_localctx);
				enterOuterAlt(_localctx, 3);
			{
				setState(109);
				logicalOp(0);
			}
				break;
			case 4:
				_localctx = new ParanthesesExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
			{
				setState(110);
				match(T__2);
				setState(111);
				expression();
				setState(112);
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

	public static class IDAssignmentContext extends AssignmentContext {
		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
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

	private ArithmeticOpContext arithmeticOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, _parentState);
		ArithmeticOpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T__2: {
						_localctx = new ParanthesesArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(117);
						match(T__2);
						setState(118);
						arithmeticOp(0);
						setState(119);
						match(T__3);
					}
					break;
					case ID: {
						_localctx = new VariableArithmeticContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(121);
						match(ID);
					}
					break;
					case IntConstant: {
						_localctx = new IntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(122);
						match(IntConstant);
					}
					break;
					case T__13: {
						_localctx = new NegationIntegerConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(123);
						match(T__13);
						setState(124);
						match(IntConstant);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(142);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
								case 1: {
									_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(127);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(128);
									match(T__9);
									setState(129);
									arithmeticOp(9);
								}
								break;
								case 2: {
									_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(130);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(131);
									match(T__10);
									setState(132);
									arithmeticOp(8);
								}
								break;
								case 3: {
									_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(133);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(134);
									match(T__11);
									setState(135);
									arithmeticOp(7);
								}
								break;
								case 4: {
									_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(136);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(137);
									match(T__12);
									setState(138);
									arithmeticOp(6);
								}
								break;
								case 5: {
									_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
									setState(139);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(140);
									match(T__13);
									setState(141);
									arithmeticOp(5);
								}
								break;
							}
						}
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
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
		enterRule(_localctx, 22, RULE_relationalOp);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1:
					_localctx = new ParanthesesRelationalContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(147);
					match(T__2);
					setState(148);
					relationalOp();
					setState(149);
					match(T__3);
				}
				break;
				case 2:
					_localctx = new LessRelationalContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(151);
					arithmeticOp(0);
					setState(152);
					match(T__14);
					setState(153);
					arithmeticOp(0);
				}
				break;
				case 3:
					_localctx = new LessEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(155);
					arithmeticOp(0);
					setState(156);
					match(T__15);
					setState(157);
					arithmeticOp(0);
				}
				break;
				case 4:
					_localctx = new GreaterRelationalContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(159);
					arithmeticOp(0);
					setState(160);
					match(T__16);
					setState(161);
					arithmeticOp(0);
				}
				break;
				case 5:
					_localctx = new GreaterEqualRelationalContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(163);
					arithmeticOp(0);
					setState(164);
					match(T__17);
					setState(165);
					arithmeticOp(0);
				}
				break;
				case 6:
					_localctx = new EqualityRelationalContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(167);
					arithmeticOp(0);
					setState(168);
					match(T__18);
					setState(169);
					arithmeticOp(0);
				}
				break;
				case 7:
					_localctx = new InequivalenceRelationalContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(171);
					arithmeticOp(0);
					setState(172);
					match(T__19);
					setState(173);
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

	private LogicalOpContext logicalOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
		LogicalOpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(187);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						_localctx = new ParanthesesLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(178);
						match(T__2);
						setState(179);
						logicalOp(0);
						setState(180);
						match(T__3);
					}
					break;
					case 2: {
						_localctx = new NegationLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(182);
						match(T__20);
						setState(183);
						logicalOp(8);
					}
					break;
					case 3: {
						_localctx = new RelationalOpLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(184);
						relationalOp();
					}
					break;
					case 4: {
						_localctx = new VariableLogicalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(185);
						match(ID);
					}
					break;
					case 5: {
						_localctx = new BooleanConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(186);
						match(BoolConstant);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(201);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(189);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(190);
									match(T__21);
									setState(191);
									logicalOp(8);
								}
								break;
								case 2: {
									_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(192);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(193);
									match(T__22);
									setState(194);
									logicalOp(7);
								}
								break;
								case 3: {
									_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(195);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(196);
									match(T__23);
									setState(197);
									logicalOp(6);
								}
								break;
								case 4: {
									_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
									setState(198);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(199);
									match(T__24);
									setState(200);
									logicalOp(5);
								}
								break;
							}
						}
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public DivisionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
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

	public static class VariableArithmeticContext extends ArithmeticOpContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public VariableArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 10:
				return arithmeticOp_sempred((ArithmeticOpContext) _localctx, predIndex);
			case 12:
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

	public static class AdditionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public AdditionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
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
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public SubtractionArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
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

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
	}

	public static class AssignAssertedConditionalContext extends AssignmentContext {
		public AssignAssertedConditionalContext(AssignmentContext ctx) {
			copyFrom(ctx);
		}

		public AssertedConditionalContext assertedConditional() {
			return getRuleContext(AssertedConditionalContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignAssertedConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignAssertedConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitAssignAssertedConditional(this);
			else return visitor.visitChildren(this);
		}
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
			if (listener instanceof ExprListener) ((ExprListener) listener).exitGreaterRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitGreaterRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignConditionalContext extends AssignmentContext {
		public AssignConditionalContext(AssignmentContext ctx) {
			copyFrom(ctx);
		}

		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitAssignConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ModuloArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class, i);
		}

		public ModuloArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterModuloArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitModuloArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitModuloArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MultiplicationArithmeticContext extends ArithmeticOpContext {
		public MultiplicationArithmeticContext(ArithmeticOpContext ctx) {
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
			if (listener instanceof ExprListener) ((ExprListener) listener).enterMultiplicationArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitMultiplicationArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitMultiplicationArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParanthesesArithmeticContext extends ArithmeticOpContext {
		public ParanthesesArithmeticContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParanthesesArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParanthesesArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParanthesesArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NegationIntegerConstantContext extends ArithmeticOpContext {
		public NegationIntegerConstantContext(ArithmeticOpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IntConstant() {
			return getToken(ExprParser.IntConstant, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterNegationIntegerConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitNegationIntegerConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitNegationIntegerConstant(this);
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

	public static class DisjunctionLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}

		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class, i);
		}

		public DisjunctionLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}
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
			if (listener instanceof ExprListener) ((ExprListener) listener).exitEquivalenceLogical(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitEquivalenceLogical(this);
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

	public static class ParanthesesRelationalContext extends RelationalOpContext {
		public ParanthesesRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
		}

		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParanthesesRelational(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParanthesesRelational(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParanthesesRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InequivalenceRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}

		public InequivalenceRelationalContext(RelationalOpContext ctx) {
			copyFrom(ctx);
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

	public final LogicalOpContext logicalOp() throws RecognitionException {
		return logicalOp(0);
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

	public static class NegationLogicalContext extends LogicalOpContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		public NegationLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterNegationLogical(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitNegationLogical(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitNegationLogical(this);
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

	public static class ParanthesesLogicalContext extends LogicalOpContext {
		public ParanthesesLogicalContext(LogicalOpContext ctx) {
			copyFrom(ctx);
		}

		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParanthesesLogical(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParanthesesLogical(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor)
				return ((ExprVisitor<? extends T>) visitor).visitParanthesesLogical(this);
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