// Generated from Expr.g4 by ANTLR 4.8

        package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, VARIABLE=26, IntID=27, ConstantValue=28, IntConstant=29, BoolID=30, 
		BoolConstant=31, ID=32, COMMENT=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_statement = 2, RULE_conditional = 3, 
		RULE_withElse = 4, RULE_elseIf = 5, RULE_assignment = 6, RULE_expression = 7, 
		RULE_arithmeticOp = 8, RULE_relationalOp = 9, RULE_logicalOp = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "statement", "conditional", "withElse", "elseIf", 
			"assignment", "expression", "arithmeticOp", "relationalOp", "logicalOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if_require'", "'('", "')'", "'if_ensure'", "'if'", "'{'", 
			"'}'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'", null, 
			"'int'", null, null, "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "VARIABLE", "IntID", "ConstantValue", "IntConstant", "BoolID", 
			"BoolConstant", "ID", "COMMENT", "WS"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(22);
					declaration();
					}
					break;
				case T__1:
				case T__2:
				case T__5:
				case T__20:
				case IntConstant:
				case BoolConstant:
				case ID:
					{
					setState(23);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__20) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0) );
			setState(28);
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
		public TerminalNode ConstantValue() { return getToken(ExprParser.ConstantValue, 0); }
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
	public static class VariableInitializationIDContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public VariableInitializationIDContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableInitializationID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableInitializationID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableInitializationID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(VARIABLE);
				setState(31);
				match(ID);
				}
				break;
			case 2:
				_localctx = new VariableInitializationConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(VARIABLE);
				setState(33);
				match(ID);
				setState(34);
				match(T__0);
				setState(35);
				match(ConstantValue);
				}
				break;
			case 3:
				_localctx = new VariableInitializationIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(VARIABLE);
				setState(37);
				match(ID);
				setState(38);
				match(T__0);
				setState(39);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalStatementContext extends StatementContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalAssertionStatementContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalAssertionStatementContext(StatementContext ctx) { copyFrom(ctx); }
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ConditionalAssertionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__1);
				setState(43);
				match(T__2);
				setState(44);
				expression();
				setState(45);
				match(T__3);
				setState(46);
				conditional();
				setState(47);
				match(T__4);
				setState(48);
				match(T__2);
				setState(49);
				expression();
				setState(50);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				conditional();
				}
				break;
			case 3:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				assignment();
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
	public static class IfElseAssignmentContext extends ConditionalContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfElseAssignmentContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfElseAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfElseAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfElseAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseIfConditionalContext extends ConditionalContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public IfElseIfConditionalContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfElseIfConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfElseIfConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfElseIfConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseIfElseConditionalContext extends ConditionalContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public WithElseContext withElse() {
			return getRuleContext(WithElseContext.class,0);
		}
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public IfElseIfElseConditionalContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfElseIfElseConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfElseIfElseConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfElseIfElseConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfElseIfConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__5);
				setState(57);
				match(T__2);
				setState(58);
				logicalOp(0);
				setState(59);
				match(T__3);
				setState(60);
				match(T__6);
				setState(61);
				conditional();
				setState(62);
				match(T__7);
				setState(63);
				elseIf();
				}
				break;
			case 2:
				_localctx = new IfElseIfElseConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__5);
				setState(66);
				match(T__2);
				setState(67);
				logicalOp(0);
				setState(68);
				match(T__3);
				setState(69);
				match(T__6);
				setState(70);
				withElse();
				setState(71);
				match(T__7);
				setState(72);
				elseIf();
				setState(73);
				match(T__8);
				setState(74);
				match(T__6);
				setState(75);
				conditional();
				setState(76);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfElseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				assignment();
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

	public static class WithElseContext extends ParserRuleContext {
		public WithElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withElse; }
	 
		public WithElseContext() { }
		public void copyFrom(WithElseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithElseAssignmentContext extends WithElseContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WithElseAssignmentContext(WithElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWithElseAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWithElseAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWithElseAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithElseConditionalContext extends WithElseContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public List<WithElseContext> withElse() {
			return getRuleContexts(WithElseContext.class);
		}
		public WithElseContext withElse(int i) {
			return getRuleContext(WithElseContext.class,i);
		}
		public WithElseConditionalContext(WithElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWithElseConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWithElseConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWithElseConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithElseContext withElse() throws RecognitionException {
		WithElseContext _localctx = new WithElseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_withElse);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new WithElseConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__5);
				setState(82);
				match(T__2);
				setState(83);
				logicalOp(0);
				setState(84);
				match(T__3);
				setState(85);
				match(T__6);
				setState(86);
				withElse();
				setState(87);
				match(T__7);
				setState(88);
				match(T__8);
				setState(89);
				match(T__6);
				setState(90);
				withElse();
				setState(91);
				match(T__7);
				}
				break;
			case T__2:
			case T__20:
			case IntConstant:
			case BoolConstant:
			case ID:
				_localctx = new WithElseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				assignment();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
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
	public static class EpsilonConditionalContext extends ElseIfContext {
		public EpsilonConditionalContext(ElseIfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEpsilonConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEpsilonConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEpsilonConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseIf);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ElseIfConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__8);
				setState(97);
				match(T__5);
				setState(98);
				match(T__6);
				setState(99);
				assignment();
				setState(100);
				match(T__7);
				setState(101);
				elseIf();
				}
				break;
			case 2:
				_localctx = new EpsilonConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
	public static class AssignAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__0);
				setState(109);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogicalOpteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLogicalOpteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ArithmeticOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				arithmeticOp(0);
				}
				break;
			case 2:
				_localctx = new RelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				relationalOp();
				}
				break;
			case 3:
				_localctx = new LogicalOpterationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				logicalOp(0);
				}
				break;
			case 4:
				_localctx = new ParanthesesExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(T__2);
				setState(116);
				expression();
				setState(117);
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
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
	}

	private ArithmeticOpContext arithmeticOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, _parentState);
		ArithmeticOpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmeticOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new ParanthesesArithmeticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(T__2);
				setState(123);
				arithmeticOp(0);
				setState(124);
				match(T__3);
				}
				break;
			case ID:
				{
				_localctx = new VariableArithmeticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(ID);
				}
				break;
			case IntConstant:
				{
				_localctx = new IntegerConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(IntConstant);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						match(T__9);
						setState(132);
						arithmeticOp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						match(T__10);
						setState(135);
						arithmeticOp(8);
						}
						break;
					case 3:
						{
						_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						match(T__11);
						setState(138);
						arithmeticOp(7);
						}
						break;
					case 4:
						{
						_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(T__12);
						setState(141);
						arithmeticOp(6);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(T__13);
						setState(144);
						arithmeticOp(5);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLessEqualRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLessEqualRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationalOp);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LessRelationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				arithmeticOp(0);
				setState(151);
				match(T__14);
				setState(152);
				arithmeticOp(0);
				}
				break;
			case 2:
				_localctx = new LessEqualRelationalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				arithmeticOp(0);
				setState(155);
				match(T__15);
				setState(156);
				arithmeticOp(0);
				}
				break;
			case 3:
				_localctx = new GreaterRelationalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				arithmeticOp(0);
				setState(159);
				match(T__16);
				setState(160);
				arithmeticOp(0);
				}
				break;
			case 4:
				_localctx = new GreaterEqualRelationalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				arithmeticOp(0);
				setState(163);
				match(T__17);
				setState(164);
				arithmeticOp(0);
				}
				break;
			case 5:
				_localctx = new EqualityRelationalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				arithmeticOp(0);
				setState(167);
				match(T__18);
				setState(168);
				arithmeticOp(0);
				}
				break;
			case 6:
				_localctx = new InequivalenceRelationalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				arithmeticOp(0);
				setState(171);
				match(T__19);
				setState(172);
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
	public static class ParenthesesLogicalContext extends LogicalOpContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public ParenthesesLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParenthesesLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParenthesesLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParenthesesLogical(this);
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

	private LogicalOpContext logicalOp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
		LogicalOpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logicalOp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NegationLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(T__20);
				setState(178);
				logicalOp(9);
				}
				break;
			case 2:
				{
				_localctx = new ParenthesesLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__2);
				setState(180);
				logicalOp(0);
				setState(181);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new RelationalOpLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				relationalOp();
				}
				break;
			case 4:
				{
				_localctx = new VariableLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new BooleanConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(BoolConstant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(188);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(189);
						match(T__21);
						setState(190);
						logicalOp(8);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192);
						match(T__22);
						setState(193);
						logicalOp(7);
						}
						break;
					case 3:
						{
						_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						match(T__23);
						setState(196);
						logicalOp(6);
						}
						break;
					case 4:
						{
						_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(T__24);
						setState(199);
						logicalOp(5);
						}
						break;
					}
					} 
				}
				setState(204);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return arithmeticOp_sempred((ArithmeticOpContext)_localctx, predIndex);
		case 10:
			return logicalOp_sempred((LogicalOpContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"z\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f"+
		"\2\4\22\26\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00e6\2\32\3\2\2\2\4*\3"+
		"\2\2\2\68\3\2\2\2\bQ\3\2\2\2\n`\3\2\2\2\fj\3\2\2\2\16p\3\2\2\2\20y\3\2"+
		"\2\2\22\u0082\3\2\2\2\24\u00b0\3\2\2\2\26\u00bc\3\2\2\2\30\33\5\4\3\2"+
		"\31\33\5\6\4\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 !\7\34\2\2!+\7"+
		"\"\2\2\"#\7\34\2\2#$\7\"\2\2$%\7\3\2\2%+\7\36\2\2&\'\7\34\2\2\'(\7\"\2"+
		"\2()\7\3\2\2)+\7\"\2\2* \3\2\2\2*\"\3\2\2\2*&\3\2\2\2+\5\3\2\2\2,-\7\4"+
		"\2\2-.\7\5\2\2./\5\20\t\2/\60\7\6\2\2\60\61\5\b\5\2\61\62\7\7\2\2\62\63"+
		"\7\5\2\2\63\64\5\20\t\2\64\65\7\6\2\2\659\3\2\2\2\669\5\b\5\2\679\5\16"+
		"\b\28,\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\7\b\2\2;<\7\5\2\2"+
		"<=\5\26\f\2=>\7\6\2\2>?\7\t\2\2?@\5\b\5\2@A\7\n\2\2AB\5\f\7\2BR\3\2\2"+
		"\2CD\7\b\2\2DE\7\5\2\2EF\5\26\f\2FG\7\6\2\2GH\7\t\2\2HI\5\n\6\2IJ\7\n"+
		"\2\2JK\5\f\7\2KL\7\13\2\2LM\7\t\2\2MN\5\b\5\2NO\7\n\2\2OR\3\2\2\2PR\5"+
		"\16\b\2Q:\3\2\2\2QC\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\b\2\2TU\7\5\2\2U"+
		"V\5\26\f\2VW\7\6\2\2WX\7\t\2\2XY\5\n\6\2YZ\7\n\2\2Z[\7\13\2\2[\\\7\t\2"+
		"\2\\]\5\n\6\2]^\7\n\2\2^a\3\2\2\2_a\5\16\b\2`S\3\2\2\2`_\3\2\2\2a\13\3"+
		"\2\2\2bc\7\13\2\2cd\7\b\2\2de\7\t\2\2ef\5\16\b\2fg\7\n\2\2gh\5\f\7\2h"+
		"k\3\2\2\2ik\3\2\2\2jb\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lq\5\20\t\2mn\7\"\2"+
		"\2no\7\3\2\2oq\5\20\t\2pl\3\2\2\2pm\3\2\2\2q\17\3\2\2\2rz\5\22\n\2sz\5"+
		"\24\13\2tz\5\26\f\2uv\7\5\2\2vw\5\20\t\2wx\7\6\2\2xz\3\2\2\2yr\3\2\2\2"+
		"ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2z\21\3\2\2\2{|\b\n\1\2|}\7\5\2\2}~\5\22"+
		"\n\2~\177\7\6\2\2\177\u0083\3\2\2\2\u0080\u0083\7\"\2\2\u0081\u0083\7"+
		"\37\2\2\u0082{\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0095"+
		"\3\2\2\2\u0084\u0085\f\n\2\2\u0085\u0086\7\f\2\2\u0086\u0094\5\22\n\13"+
		"\u0087\u0088\f\t\2\2\u0088\u0089\7\r\2\2\u0089\u0094\5\22\n\n\u008a\u008b"+
		"\f\b\2\2\u008b\u008c\7\16\2\2\u008c\u0094\5\22\n\t\u008d\u008e\f\7\2\2"+
		"\u008e\u008f\7\17\2\2\u008f\u0094\5\22\n\b\u0090\u0091\f\6\2\2\u0091\u0092"+
		"\7\20\2\2\u0092\u0094\5\22\n\7\u0093\u0084\3\2\2\2\u0093\u0087\3\2\2\2"+
		"\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\21\2\2\u009a\u009b\5"+
		"\22\n\2\u009b\u00b1\3\2\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\22\2\2"+
		"\u009e\u009f\5\22\n\2\u009f\u00b1\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2"+
		"\7\23\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00b1\3\2\2\2\u00a4\u00a5\5\22\n"+
		"\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00b1\3\2\2\2\u00a8"+
		"\u00a9\5\22\n\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00b1"+
		"\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\5\22\n"+
		"\2\u00af\u00b1\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0\u009c\3\2\2\2\u00b0\u00a0"+
		"\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"\25\3\2\2\2\u00b2\u00b3\b\f\1\2\u00b3\u00b4\7\27\2\2\u00b4\u00bd\5\26"+
		"\f\13\u00b5\u00b6\7\5\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\6\2\2\u00b8"+
		"\u00bd\3\2\2\2\u00b9\u00bd\5\24\13\2\u00ba\u00bd\7\"\2\2\u00bb\u00bd\7"+
		"!\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00cc\3\2\2\2\u00be\u00bf\f\t"+
		"\2\2\u00bf\u00c0\7\30\2\2\u00c0\u00cb\5\26\f\n\u00c1\u00c2\f\b\2\2\u00c2"+
		"\u00c3\7\31\2\2\u00c3\u00cb\5\26\f\t\u00c4\u00c5\f\7\2\2\u00c5\u00c6\7"+
		"\32\2\2\u00c6\u00cb\5\26\f\b\u00c7\u00c8\f\6\2\2\u00c8\u00c9\7\33\2\2"+
		"\u00c9\u00cb\5\26\f\7\u00ca\u00be\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c4"+
		"\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00cc\3\2\2\2\22\32\34*8Q`jpy\u0082"+
		"\u0093\u0095\u00b0\u00bc\u00ca\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}