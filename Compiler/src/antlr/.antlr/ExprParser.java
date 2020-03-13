// Generated from c:\Users\Koko\workspace\Compiler\src\antlr\Expr.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, VARIABLE=26, IntID=27, IntConstant=28, BoolID=29, BoolConstant=30, 
		ConstantValue=31, ID=32, COMMENT=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_statement = 2, RULE_assertedConditional = 3, 
		RULE_conditional = 4, RULE_withElse = 5, RULE_elseIf = 6, RULE_assignment = 7, 
		RULE_expression = 8, RULE_arithmeticOp = 9, RULE_relationalOp = 10, RULE_logicalOp = 11;
	public static final String[] ruleNames = {
		"prog", "declaration", "statement", "assertedConditional", "conditional", 
		"withElse", "elseIf", "assignment", "expression", "arithmeticOp", "relationalOp", 
		"logicalOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'if_require'", "'('", "')'", "'if_ensure'", "'if'", "'{'", 
		"'}'", "'else'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'", null, 
		"'int'", null, "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "VARIABLE", "IntID", "IntConstant", "BoolID", "BoolConstant", 
		"ConstantValue", "ID", "COMMENT", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(24);
					declaration();
					}
					break;
				case T__1:
				case T__2:
				case T__5:
				case T__13:
				case T__20:
				case IntConstant:
				case BoolConstant:
				case ID:
					{
					setState(25);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__13) | (1L << T__20) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0) );
			setState(30);
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
	}
	public static class VariableInitializationConstantContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ConstantValue() { return getToken(ExprParser.ConstantValue, 0); }
		public VariableInitializationConstantContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableInitializationIDContext extends DeclarationContext {
		public TerminalNode VARIABLE() { return getToken(ExprParser.VARIABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public VariableInitializationIDContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(VARIABLE);
				setState(33);
				match(ID);
				}
				break;
			case 2:
				_localctx = new VariableInitializationConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(VARIABLE);
				setState(35);
				match(ID);
				setState(36);
				match(T__0);
				setState(37);
				match(ConstantValue);
				}
				break;
			case 3:
				_localctx = new VariableInitializationIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(VARIABLE);
				setState(39);
				match(ID);
				setState(40);
				match(T__0);
				setState(41);
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
	}
	public static class AssertedConditionalStatementContext extends StatementContext {
		public AssertedConditionalContext assertedConditional() {
			return getRuleContext(AssertedConditionalContext.class,0);
		}
		public AssertedConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalStatementContext extends StatementContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssertedConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				assertedConditional();
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				}
				break;
			case 3:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				conditional();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalAssertionStatementContext(AssertedConditionalContext ctx) { copyFrom(ctx); }
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfElseIfConditionalContext(_localctx);
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
				conditional();
				setState(65);
				match(T__7);
				setState(66);
				elseIf();
				}
				break;
			case 2:
				_localctx = new IfElseIfElseConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__5);
				setState(69);
				match(T__2);
				setState(70);
				logicalOp(0);
				setState(71);
				match(T__3);
				setState(72);
				match(T__6);
				setState(73);
				withElse();
				setState(74);
				match(T__7);
				setState(75);
				elseIf();
				setState(76);
				match(T__8);
				setState(77);
				match(T__6);
				setState(78);
				conditional();
				setState(79);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfElseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
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
	}

	public final WithElseContext withElse() throws RecognitionException {
		WithElseContext _localctx = new WithElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_withElse);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new WithElseConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__5);
				setState(85);
				match(T__2);
				setState(86);
				logicalOp(0);
				setState(87);
				match(T__3);
				setState(88);
				match(T__6);
				setState(89);
				withElse();
				setState(90);
				match(T__7);
				setState(91);
				match(T__8);
				setState(92);
				match(T__6);
				setState(93);
				withElse();
				setState(94);
				match(T__7);
				}
				break;
			case T__2:
			case T__13:
			case T__20:
			case IntConstant:
			case BoolConstant:
			case ID:
				_localctx = new WithElseAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public ElseIfConditionalContext(ElseIfContext ctx) { copyFrom(ctx); }
	}
	public static class EpsilonConditionalContext extends ElseIfContext {
		public EpsilonConditionalContext(ElseIfContext ctx) { copyFrom(ctx); }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIf);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ElseIfConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__8);
				setState(100);
				match(T__5);
				setState(101);
				match(T__2);
				setState(102);
				logicalOp(0);
				setState(103);
				match(T__3);
				setState(104);
				match(T__6);
				setState(105);
				assignment();
				setState(106);
				match(T__7);
				setState(107);
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
	}
	public static class AssignAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ID);
				setState(114);
				match(T__0);
				setState(115);
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
	}
	public static class ArithmeticOperationContext extends ExpressionContext {
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public ArithmeticOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParanthesesExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParanthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOpterationContext extends ExpressionContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public LogicalOpterationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ArithmeticOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				arithmeticOp(0);
				}
				break;
			case 2:
				_localctx = new RelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				relationalOp();
				}
				break;
			case 3:
				_localctx = new LogicalOpterationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				logicalOp(0);
				}
				break;
			case 4:
				_localctx = new ParanthesesExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__2);
				setState(122);
				expression();
				setState(123);
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
	}
	public static class VariableArithmeticContext extends ArithmeticOpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class NegativeIntegerConstantContext extends ArithmeticOpContext {
		public TerminalNode IntConstant() { return getToken(ExprParser.IntConstant, 0); }
		public NegativeIntegerConstantContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class ModuloArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public ModuloArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public MultiplicationArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public AdditionArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionArithmeticContext extends ArithmeticOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public SubtractionArithmeticContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerConstantContext extends ArithmeticOpContext {
		public TerminalNode IntConstant() { return getToken(ExprParser.IntConstant, 0); }
		public IntegerConstantContext(ArithmeticOpContext ctx) { copyFrom(ctx); }
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		return arithmeticOp(0);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableArithmeticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				match(ID);
				}
				break;
			case IntConstant:
				{
				_localctx = new IntegerConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(IntConstant);
				}
				break;
			case T__13:
				{
				_localctx = new NegativeIntegerConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__13);
				setState(131);
				match(IntConstant);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(135);
						match(T__9);
						setState(136);
						arithmeticOp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(138);
						match(T__10);
						setState(139);
						arithmeticOp(8);
						}
						break;
					case 3:
						{
						_localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						match(T__11);
						setState(142);
						arithmeticOp(7);
						}
						break;
					case 4:
						{
						_localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(143);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(144);
						match(T__12);
						setState(145);
						arithmeticOp(6);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
						setState(146);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(147);
						match(T__13);
						setState(148);
						arithmeticOp(5);
						}
						break;
					}
					} 
				}
				setState(153);
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
	}
	public static class LessRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public LessRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public GreaterRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public GreaterEqualRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
	}
	public static class InequivalenceRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public InequivalenceRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
	}
	public static class LessEqualRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
		}
		public ArithmeticOpContext arithmeticOp(int i) {
			return getRuleContext(ArithmeticOpContext.class,i);
		}
		public LessEqualRelationalContext(RelationalOpContext ctx) { copyFrom(ctx); }
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalOp);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LessRelationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				arithmeticOp(0);
				setState(155);
				match(T__14);
				setState(156);
				arithmeticOp(0);
				}
				break;
			case 2:
				_localctx = new LessEqualRelationalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				arithmeticOp(0);
				setState(159);
				match(T__15);
				setState(160);
				arithmeticOp(0);
				}
				break;
			case 3:
				_localctx = new GreaterRelationalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				arithmeticOp(0);
				setState(163);
				match(T__16);
				setState(164);
				arithmeticOp(0);
				}
				break;
			case 4:
				_localctx = new GreaterEqualRelationalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				arithmeticOp(0);
				setState(167);
				match(T__17);
				setState(168);
				arithmeticOp(0);
				}
				break;
			case 5:
				_localctx = new EqualityRelationalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				arithmeticOp(0);
				setState(171);
				match(T__18);
				setState(172);
				arithmeticOp(0);
				}
				break;
			case 6:
				_localctx = new InequivalenceRelationalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				arithmeticOp(0);
				setState(175);
				match(T__19);
				setState(176);
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
	}
	public static class DisjunctionLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public DisjunctionLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class ImplicationLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ImplicationLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class VariableLogicalContext extends LogicalOpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class EquivalenceLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public EquivalenceLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class NegationLogicalContext extends LogicalOpContext {
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public NegationLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class ConjunctionLogicalContext extends LogicalOpContext {
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ConjunctionLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanConstantContext extends LogicalOpContext {
		public TerminalNode BoolConstant() { return getToken(ExprParser.BoolConstant, 0); }
		public BooleanConstantContext(LogicalOpContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalOpLogicalContext extends LogicalOpContext {
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public RelationalOpLogicalContext(LogicalOpContext ctx) { copyFrom(ctx); }
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NegationLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(T__20);
				setState(182);
				logicalOp(9);
				}
				break;
			case 2:
				{
				_localctx = new ParenthesesLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__2);
				setState(184);
				logicalOp(0);
				setState(185);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new RelationalOpLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				relationalOp();
				}
				break;
			case 4:
				{
				_localctx = new VariableLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new BooleanConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(BoolConstant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						match(T__21);
						setState(194);
						logicalOp(8);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						match(T__22);
						setState(197);
						logicalOp(7);
						}
						break;
					case 3:
						{
						_localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(199);
						match(T__23);
						setState(200);
						logicalOp(6);
						}
						break;
					case 4:
						{
						_localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(202);
						match(T__24);
						setState(203);
						logicalOp(5);
						}
						break;
					}
					} 
				}
				setState(208);
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
		case 9:
			return arithmeticOp_sempred((ArithmeticOpContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\5\tw\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0087"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cf\n\r\f\r"+
		"\16\r\u00d2\13\r\3\r\2\4\24\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2"+
		"\u00e9\2\34\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\nT\3\2\2\2\f"+
		"c\3\2\2\2\16p\3\2\2\2\20v\3\2\2\2\22\177\3\2\2\2\24\u0086\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\u00c0\3\2\2\2\32\35\5\4\3\2\33\35\5\6\4\2\34\32\3\2\2\2\34"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7"+
		"\2\2\3!\3\3\2\2\2\"#\7\34\2\2#-\7\"\2\2$%\7\34\2\2%&\7\"\2\2&\'\7\3\2"+
		"\2\'-\7!\2\2()\7\34\2\2)*\7\"\2\2*+\7\3\2\2+-\7\"\2\2,\"\3\2\2\2,$\3\2"+
		"\2\2,(\3\2\2\2-\5\3\2\2\2.\62\5\b\5\2/\62\5\20\t\2\60\62\5\n\6\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\7\4\2\2\64\65\7\5"+
		"\2\2\65\66\5\22\n\2\66\67\7\6\2\2\678\5\n\6\289\7\7\2\29:\7\5\2\2:;\5"+
		"\22\n\2;<\7\6\2\2<\t\3\2\2\2=>\7\b\2\2>?\7\5\2\2?@\5\30\r\2@A\7\6\2\2"+
		"AB\7\t\2\2BC\5\n\6\2CD\7\n\2\2DE\5\16\b\2EU\3\2\2\2FG\7\b\2\2GH\7\5\2"+
		"\2HI\5\30\r\2IJ\7\6\2\2JK\7\t\2\2KL\5\f\7\2LM\7\n\2\2MN\5\16\b\2NO\7\13"+
		"\2\2OP\7\t\2\2PQ\5\n\6\2QR\7\n\2\2RU\3\2\2\2SU\5\20\t\2T=\3\2\2\2TF\3"+
		"\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\7\b\2\2WX\7\5\2\2XY\5\30\r\2YZ\7\6\2\2"+
		"Z[\7\t\2\2[\\\5\f\7\2\\]\7\n\2\2]^\7\13\2\2^_\7\t\2\2_`\5\f\7\2`a\7\n"+
		"\2\2ad\3\2\2\2bd\5\20\t\2cV\3\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\7\13\2\2fg"+
		"\7\b\2\2gh\7\5\2\2hi\5\30\r\2ij\7\6\2\2jk\7\t\2\2kl\5\20\t\2lm\7\n\2\2"+
		"mn\5\16\b\2nq\3\2\2\2oq\3\2\2\2pe\3\2\2\2po\3\2\2\2q\17\3\2\2\2rw\5\22"+
		"\n\2st\7\"\2\2tu\7\3\2\2uw\5\22\n\2vr\3\2\2\2vs\3\2\2\2w\21\3\2\2\2x\u0080"+
		"\5\24\13\2y\u0080\5\26\f\2z\u0080\5\30\r\2{|\7\5\2\2|}\5\22\n\2}~\7\6"+
		"\2\2~\u0080\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2"+
		"\2\u0080\23\3\2\2\2\u0081\u0082\b\13\1\2\u0082\u0087\7\"\2\2\u0083\u0087"+
		"\7\36\2\2\u0084\u0085\7\20\2\2\u0085\u0087\7\36\2\2\u0086\u0081\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0099\3\2\2\2\u0088\u0089"+
		"\f\n\2\2\u0089\u008a\7\f\2\2\u008a\u0098\5\24\13\13\u008b\u008c\f\t\2"+
		"\2\u008c\u008d\7\r\2\2\u008d\u0098\5\24\13\n\u008e\u008f\f\b\2\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0098\5\24\13\t\u0091\u0092\f\7\2\2\u0092\u0093"+
		"\7\17\2\2\u0093\u0098\5\24\13\b\u0094\u0095\f\6\2\2\u0095\u0096\7\20\2"+
		"\2\u0096\u0098\5\24\13\7\u0097\u0088\3\2\2\2\u0097\u008b\3\2\2\2\u0097"+
		"\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\7\21\2\2\u009e\u009f\5\24\13"+
		"\2\u009f\u00b5\3\2\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7\22\2\2\u00a2"+
		"\u00a3\5\24\13\2\u00a3\u00b5\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00b5\3\2\2\2\u00a8\u00a9\5\24\13"+
		"\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00b5\3\2\2\2\u00ac"+
		"\u00ad\5\24\13\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\5\24\13\2\u00af\u00b5"+
		"\3\2\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5\24\13"+
		"\2\u00b3\u00b5\3\2\2\2\u00b4\u009c\3\2\2\2\u00b4\u00a0\3\2\2\2\u00b4\u00a4"+
		"\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b7\b\r\1\2\u00b7\u00b8\7\27\2\2\u00b8\u00c1\5\30"+
		"\r\13\u00b9\u00ba\7\5\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7\6\2\2\u00bc"+
		"\u00c1\3\2\2\2\u00bd\u00c1\5\26\f\2\u00be\u00c1\7\"\2\2\u00bf\u00c1\7"+
		" \2\2\u00c0\u00b6\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\f\t"+
		"\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00cf\5\30\r\n\u00c5\u00c6\f\b\2\2\u00c6"+
		"\u00c7\7\31\2\2\u00c7\u00cf\5\30\r\t\u00c8\u00c9\f\7\2\2\u00c9\u00ca\7"+
		"\32\2\2\u00ca\u00cf\5\30\r\b\u00cb\u00cc\f\6\2\2\u00cc\u00cd\7\33\2\2"+
		"\u00cd\u00cf\5\30\r\7\u00ce\u00c2\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c8"+
		"\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d0\3\2\2\2\22\34\36,\61Tcpv\177"+
		"\u0086\u0097\u0099\u00b4\u00c0\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}