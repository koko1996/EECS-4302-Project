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
            T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36, T__36 = 37, T__37 = 38,
            T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, VARIABLE = 44, IntConstant = 45,
            BoolConstant = 46, ConstantValue = 47, ID = 48, COMMENT = 49, WS = 50, SEMICOLON = 51,
            COMMA = 52;
    public static final int
            RULE_prog = 0, RULE_statement = 1, RULE_declaration = 2, RULE_loop = 3,
            RULE_function = 4, RULE_parameters = 5, RULE_parameterVariable = 6, RULE_functionCall = 7,
            RULE_functionCallParameter = 8, RULE_singleParameter = 9, RULE_assertedConditional = 10,
            RULE_conditional = 11, RULE_elseIf = 12, RULE_finaElse = 13, RULE_multAssigSimple = 14,
            RULE_multAssig = 15, RULE_assignment = 16, RULE_expression = 17, RULE_lambdaOp = 18,
            RULE_arrayOp = 19, RULE_arithmeticOp = 20, RULE_relationalOp = 21, RULE_logicalOp = 22,
            RULE_constant = 23;

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "statement", "declaration", "loop", "function", "parameters",
                "parameterVariable", "functionCall", "functionCallParameter", "singleParameter",
                "assertedConditional", "conditional", "elseIf", "finaElse", "multAssigSimple",
                "multAssig", "assignment", "expression", "lambdaOp", "arrayOp", "arithmeticOp",
                "relationalOp", "logicalOp", "constant"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'='", "'['", "']'", "'loop_require'", "'('", "')'", "'loop_init'",
                "'{'", "'}'", "'loop'", "'loop_invariant'", "'loop_variant'", "'loop_ensure'",
                "'fun'", "'fun_require'", "'return'", "'fun_ensure'", "'if_require'",
                "'if_ensure'", "'if'", "'else'", "'.'", "'add'", "'remove'", "'all'",
                "'some'", "'*'", "'/'", "'%'", "'+'", "'-'", "'each'", "'<'", "'<='",
                "'>'", "'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", "'=>'", "'<=>'",
                null, null, null, null, null, null, null, "';'", "','"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, "VARIABLE", "IntConstant",
                "BoolConstant", "ConstantValue", "ID", "COMMENT", "WS", "SEMICOLON",
                "COMMA"
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
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ExprParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            _localctx = new ProgramContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(49);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(48);
                            statement();
                        }
                    }
                    setState(51);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__13) | (1L << T__17) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__38) | (1L << VARIABLE) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
                setState(53);
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

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(61);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VARIABLE:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(55);
                    declaration();
                }
                break;
                case T__4:
                case T__30:
                case T__31:
                case T__38:
                case IntConstant:
                case BoolConstant:
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(56);
                    assignment();
                }
                break;
                case T__19:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(57);
                    conditional();
                }
                break;
                case T__17:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(58);
                    assertedConditional();
                }
                break;
                case T__13:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(59);
                    function();
                }
                break;
                case T__3:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(60);
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

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
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

    public static class VariableDeclarationContext extends DeclarationContext {
        public TerminalNode VARIABLE() {
            return getToken(ExprParser.VARIABLE, 0);
        }

        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
        }

        public VariableDeclarationContext(DeclarationContext ctx) {
            copyFrom(ctx);
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

    public static class VariableArrayDeclarationContext extends DeclarationContext {
        public TerminalNode VARIABLE() {
            return getToken(ExprParser.VARIABLE, 0);
        }

        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
        }

        public VariableArrayDeclarationContext(DeclarationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterVariableArrayDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitVariableArrayDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitVariableArrayDeclaration(this);
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

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_declaration);
        try {
            setState(82);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    _localctx = new VariableDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(63);
                    match(VARIABLE);
                    setState(64);
                    match(ID);
                    setState(65);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    _localctx = new VariableInitializationConstantCopyContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(66);
                    match(VARIABLE);
                    setState(67);
                    match(ID);
                    setState(68);
                    match(T__0);
                    setState(69);
                    match(ID);
                    setState(70);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    _localctx = new VariableInitializationConstantContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(71);
                    match(VARIABLE);
                    setState(72);
                    match(ID);
                    setState(73);
                    match(T__0);
                    setState(74);
                    expression();
                    setState(75);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    _localctx = new VariableArrayDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(77);
                    match(VARIABLE);
                    setState(78);
                    match(T__1);
                    setState(79);
                    match(T__2);
                    setState(80);
                    match(ID);
                    setState(81);
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

    public static class LoopContext extends ParserRuleContext {
        public LoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loop;
        }

        public LoopContext() {
        }

        public void copyFrom(LoopContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class LoopStatementContext extends LoopContext {
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

        public LoopStatementContext(LoopContext ctx) {
            copyFrom(ctx);
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

    public final LoopContext loop() throws RecognitionException {
        LoopContext _localctx = new LoopContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_loop);
        try {
            _localctx = new LoopStatementContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(84);
                match(T__3);
                setState(85);
                match(T__4);
                setState(86);
                logicalOp(0);
                setState(87);
                match(T__5);
                setState(88);
                match(T__6);
                setState(89);
                match(T__7);
                setState(90);
                multAssigSimple();
                setState(91);
                match(T__8);
                setState(92);
                match(T__9);
                setState(93);
                match(T__4);
                setState(94);
                logicalOp(0);
                setState(95);
                match(T__5);
                setState(96);
                match(T__7);
                setState(97);
                match(T__10);
                setState(98);
                match(T__4);
                setState(99);
                expression();
                setState(100);
                match(T__5);
                setState(101);
                match(T__11);
                setState(102);
                match(T__4);
                setState(103);
                match(ID);
                setState(104);
                match(T__5);
                setState(105);
                multAssig();
                setState(106);
                match(T__8);
                setState(107);
                match(T__12);
                setState(108);
                match(T__4);
                setState(109);
                logicalOp(0);
                setState(110);
                match(T__5);
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

    public final FunctionContext function() throws RecognitionException {
        FunctionContext _localctx = new FunctionContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_function);
        try {
            _localctx = new FunctionConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                match(T__13);
                setState(113);
                match(VARIABLE);
                setState(114);
                match(ID);
                setState(115);
                match(T__4);
                setState(116);
                parameters();
                setState(117);
                match(T__5);
                setState(118);
                match(T__7);
                setState(119);
                match(T__14);
                setState(120);
                match(T__4);
                setState(121);
                logicalOp(0);
                setState(122);
                match(T__5);
                setState(123);
                multAssig();
                setState(124);
                match(T__15);
                setState(125);
                match(ID);
                setState(126);
                match(SEMICOLON);
                setState(127);
                match(T__16);
                setState(128);
                match(T__4);
                setState(129);
                logicalOp(0);
                setState(130);
                match(T__5);
                setState(131);
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

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameters);
        try {
            int _alt;
            setState(143);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VARIABLE:
                    _localctx = new ParameterArgumentsContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(133);
                                    parameterVariable();
                                    setState(134);
                                    match(COMMA);
                                }
                            }
                        }
                        setState(140);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                    }
                    setState(141);
                    parameterVariable();
                }
                break;
                case T__5:
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

    public final ParameterVariableContext parameterVariable() throws RecognitionException {
        ParameterVariableContext _localctx = new ParameterVariableContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_parameterVariable);
        try {
            _localctx = new ParameterArgumentVariableContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(145);
                match(VARIABLE);
                setState(146);
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

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_functionCall);
        try {
            _localctx = new FunctionCallStatmentContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(148);
                match(ID);
                setState(149);
                match(T__4);
                setState(150);
                functionCallParameter();
                setState(151);
                match(T__5);
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

    public final FunctionCallParameterContext functionCallParameter() throws RecognitionException {
        FunctionCallParameterContext _localctx = new FunctionCallParameterContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_functionCallParameter);
        try {
            int _alt;
            setState(163);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__4:
                case T__30:
                case T__31:
                case T__38:
                case IntConstant:
                case BoolConstant:
                case ID:
                    _localctx = new FunctionCallParametersContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(158);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(153);
                                        singleParameter();
                                        setState(154);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(160);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        }
                        setState(161);
                        singleParameter();
                    }
                }
                break;
                case T__5:
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

    public final SingleParameterContext singleParameter() throws RecognitionException {
        SingleParameterContext _localctx = new SingleParameterContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_singleParameter);
        try {
            setState(167);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    _localctx = new SingleParameterIDContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(165);
                    match(ID);
                }
                break;
                case 2:
                    _localctx = new SingleParameterExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(166);
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

    public final AssertedConditionalContext assertedConditional() throws RecognitionException {
        AssertedConditionalContext _localctx = new AssertedConditionalContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_assertedConditional);
        try {
            _localctx = new ConditionalAssertionStatementContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(169);
                match(T__17);
                setState(170);
                match(T__4);
                setState(171);
                logicalOp(0);
                setState(172);
                match(T__5);
                setState(173);
                conditional();
                setState(174);
                match(T__18);
                setState(175);
                match(T__4);
                setState(176);
                logicalOp(0);
                setState(177);
                match(T__5);
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

    public final ConditionalContext conditional() throws RecognitionException {
        ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_conditional);
        int _la;
        try {
            int _alt;
            _localctx = new IfConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(T__19);
                setState(180);
                match(T__4);
                setState(181);
                logicalOp(0);
                setState(182);
                match(T__5);
                setState(183);
                match(T__7);
                setState(184);
                multAssig();
                setState(185);
                match(T__8);
                setState(189);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(186);
                                elseIf();
                            }
                        }
                    }
                    setState(191);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
                setState(193);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(192);
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

    public final ElseIfContext elseIf() throws RecognitionException {
        ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_elseIf);
        try {
            _localctx = new ElseIfConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                match(T__20);
                setState(196);
                match(T__19);
                setState(197);
                match(T__4);
                setState(198);
                logicalOp(0);
                setState(199);
                match(T__5);
                setState(200);
                match(T__7);
                setState(201);
                multAssig();
                setState(202);
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

    public final FinaElseContext finaElse() throws RecognitionException {
        FinaElseContext _localctx = new FinaElseContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_finaElse);
        try {
            _localctx = new ElseConditionalContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(204);
                match(T__20);
                setState(205);
                match(T__7);
                setState(206);
                multAssig();
                setState(207);
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

    public static class MultAssigSimpleContext extends ParserRuleContext {
        public MultAssigSimpleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multAssigSimple;
        }

        public MultAssigSimpleContext() {
        }

        public void copyFrom(MultAssigSimpleContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class MultipleAssignmentsSimpleContext extends MultAssigSimpleContext {
        public List<AssignmentContext> assignment() {
            return getRuleContexts(AssignmentContext.class);
        }

        public AssignmentContext assignment(int i) {
            return getRuleContext(AssignmentContext.class, i);
        }

        public MultipleAssignmentsSimpleContext(MultAssigSimpleContext ctx) {
            copyFrom(ctx);
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

    public final MultAssigSimpleContext multAssigSimple() throws RecognitionException {
        MultAssigSimpleContext _localctx = new MultAssigSimpleContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_multAssigSimple);
        int _la;
        try {
            _localctx = new MultipleAssignmentsSimpleContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(209);
                            assignment();
                        }
                    }
                    setState(212);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__30) | (1L << T__31) | (1L << T__38) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
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

	public final MultAssigContext multAssig() throws RecognitionException {
        MultAssigContext _localctx = new MultAssigContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_multAssig);
        int _la;
        try {
            _localctx = new MultipleAssignmentsContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(216);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case T__4:
                            case T__30:
                            case T__31:
                            case T__38:
                            case IntConstant:
                            case BoolConstant:
                            case ID: {
                                setState(214);
                                assignment();
                            }
                            break;
                            case T__19: {
                                setState(215);
                                conditional();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(218);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__38) | (1L << IntConstant) | (1L << BoolConstant) | (1L << ID))) != 0));
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

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
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

    public static class IDExpressionContext extends AssignmentContext {
        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
        }

        public IDExpressionContext(AssignmentContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterIDExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitIDExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIDExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssignPropertyContext extends AssignmentContext {
        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public ArrayOpContext arrayOp() {
            return getRuleContext(ArrayOpContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
        }

        public AssignPropertyContext(AssignmentContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignProperty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignProperty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignProperty(this);
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

        public TerminalNode SEMICOLON() {
            return getToken(ExprParser.SEMICOLON, 0);
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

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_assignment);
        try {
            setState(239);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    _localctx = new IDExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(220);
                    match(ID);
                    setState(221);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    _localctx = new IDAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(222);
                    match(ID);
                    setState(223);
                    match(T__0);
                    setState(224);
                    match(ID);
                    setState(225);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    _localctx = new AssignAssignmentContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(226);
                    match(ID);
                    setState(227);
                    match(T__0);
                    setState(228);
                    expression();
                    setState(229);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    _localctx = new AssignPropertyContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(231);
                    match(ID);
                    setState(232);
                    match(T__21);
                    setState(233);
                    arrayOp();
                    setState(234);
                    match(SEMICOLON);
                }
                break;
                case 5:
                    _localctx = new AssignExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(236);
                    expression();
                    setState(237);
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
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public FunctionReturnOperationContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionReturnOperation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionReturnOperation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitFunctionReturnOperation(this);
            else return visitor.visitChildren(this);
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

    public static class LambdaOperationContext extends ExpressionContext {
        public LambdaOpContext lambdaOp() {
            return getRuleContext(LambdaOpContext.class, 0);
        }

        public LambdaOperationContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterLambdaOperation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitLambdaOperation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitLambdaOperation(this);
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

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_expression);
        try {
            setState(250);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    _localctx = new ArithmeticOperationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(241);
                    arithmeticOp(0);
                }
                break;
                case 2:
                    _localctx = new LogicalOpterationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(242);
                    logicalOp(0);
                }
                break;
                case 3:
                    _localctx = new RelationalOperationContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(243);
                    relationalOp();
                }
                break;
                case 4:
                    _localctx = new LambdaOperationContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(244);
                    lambdaOp();
                }
                break;
                case 5:
                    _localctx = new FunctionReturnOperationContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(245);
                    functionCall();
                }
                break;
                case 6:
                    _localctx = new ParanthesesExpressionContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(246);
                    match(T__4);
                    setState(247);
                    expression();
                    setState(248);
                    match(T__5);
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

    public static class LambdaOpContext extends ParserRuleContext {
        public RelationalOpContext relationalOp() {
            return getRuleContext(RelationalOpContext.class, 0);
        }

        public LogicalOpContext logicalOp() {
            return getRuleContext(LogicalOpContext.class, 0);
        }

        public LambdaOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lambdaOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterLambdaOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitLambdaOp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitLambdaOp(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LambdaOpContext lambdaOp() throws RecognitionException {
        LambdaOpContext _localctx = new LambdaOpContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_lambdaOp);
        try {
            setState(254);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(252);
                    relationalOp();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(253);
                    logicalOp(0);
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

    public static class ArrayOpContext extends ParserRuleContext {
        public ArrayOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayOp;
        }

        public ArrayOpContext() {
        }

        public void copyFrom(ArrayOpContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ForSomeArrayContext extends ArrayOpContext {
        public LambdaOpContext lambdaOp() {
            return getRuleContext(LambdaOpContext.class, 0);
        }

        public ForSomeArrayContext(ArrayOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterForSomeArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitForSomeArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitForSomeArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddToArrayContext extends ArrayOpContext {
        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public AddToArrayContext(ArrayOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterAddToArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitAddToArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAddToArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RemoveFromArrayContext extends ArrayOpContext {
        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public RemoveFromArrayContext(ArrayOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterRemoveFromArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitRemoveFromArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitRemoveFromArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForAllArrayContext extends ArrayOpContext {
        public LambdaOpContext lambdaOp() {
            return getRuleContext(LambdaOpContext.class, 0);
        }

        public ForAllArrayContext(ArrayOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterForAllArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitForAllArray(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitForAllArray(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayOpContext arrayOp() throws RecognitionException {
        ArrayOpContext _localctx = new ArrayOpContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_arrayOp);
        try {
            setState(276);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__22:
                    _localctx = new AddToArrayContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(256);
                    match(T__22);
                    setState(257);
                    match(T__4);
                    setState(258);
                    constant();
                    setState(259);
                    match(T__5);
                }
                break;
                case T__23:
                    _localctx = new RemoveFromArrayContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(261);
                    match(T__23);
                    setState(262);
                    match(T__4);
                    setState(263);
                    constant();
                    setState(264);
                    match(T__5);
                }
                break;
                case T__24:
                    _localctx = new ForAllArrayContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(266);
                    match(T__24);
                    setState(267);
                    match(T__4);
                    setState(268);
                    lambdaOp();
                    setState(269);
                    match(T__5);
                }
                break;
                case T__25:
                    _localctx = new ForSomeArrayContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(271);
                    match(T__25);
                    setState(272);
                    match(T__4);
                    setState(273);
                    lambdaOp();
                    setState(274);
                    match(T__5);
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
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDivisionArithmetic(this);
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

    public static class EachArithmeticContext extends ArithmeticOpContext {
        public EachArithmeticContext(ArithmeticOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterEachArithmetic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitEachArithmetic(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitEachArithmetic(this);
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
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitParenthesisArithmetic(this);
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

    public static class ConstantArithmeticContext extends ArithmeticOpContext {
        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public ConstantArithmeticContext(ArithmeticOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterConstantArithmetic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitConstantArithmetic(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitConstantArithmetic(this);
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
        int _startState = 40;
        enterRecursionRule(_localctx, 40, RULE_arithmeticOp, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__4: {
                        _localctx = new ParanthesesArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(279);
                        match(T__4);
                        setState(280);
                        arithmeticOp(0);
                        setState(281);
                        match(T__5);
                    }
                    break;
                    case T__31: {
                        _localctx = new EachArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(283);
                        match(T__31);
                    }
                    break;
                    case ID: {
                        _localctx = new VariableArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(284);
                        match(ID);
                    }
                    break;
                    case T__30:
                    case IntConstant:
                    case BoolConstant: {
                        _localctx = new ConstantArithmeticContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(285);
                        constant();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(305);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(303);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                                case 1: {
                                    _localctx = new MultiplicationArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(288);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(289);
                                    match(T__26);
                                    setState(290);
                                    arithmeticOp(9);
                                }
                                break;
                                case 2: {
                                    _localctx = new DivisionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(291);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(292);
                                    match(T__27);
                                    setState(293);
                                    arithmeticOp(8);
                                }
                                break;
                                case 3: {
                                    _localctx = new ModuloArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(294);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(295);
                                    match(T__28);
                                    setState(296);
                                    arithmeticOp(7);
                                }
                                break;
                                case 4: {
                                    _localctx = new AdditionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(297);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(298);
                                    match(T__29);
                                    setState(299);
                                    arithmeticOp(6);
                                }
                                break;
                                case 5: {
                                    _localctx = new SubtractionArithmeticContext(new ArithmeticOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOp);
                                    setState(300);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(301);
                                    match(T__30);
                                    setState(302);
                                    arithmeticOp(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(307);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
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
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitParenthesisRelational(this);
            else return visitor.visitChildren(this);
        }
	}
	public static class InequivalenceRelationalContext extends RelationalOpContext {
		public List<ArithmeticOpContext> arithmeticOp() {
			return getRuleContexts(ArithmeticOpContext.class);
        }

        public ArithmeticOpContext arithmeticOp(int i) {
            return getRuleContext(ArithmeticOpContext.class, i);
        }

        public InequivalenceRelationalContext(RelationalOpContext ctx) {
            copyFrom(ctx);
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

    public final RelationalOpContext relationalOp() throws RecognitionException {
        RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_relationalOp);
        try {
            setState(336);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    _localctx = new ParanthesesRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(308);
                    match(T__4);
                    setState(309);
                    relationalOp();
                    setState(310);
                    match(T__5);
                }
                break;
                case 2:
                    _localctx = new LessRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(312);
                    arithmeticOp(0);
                    setState(313);
                    match(T__32);
                    setState(314);
                    arithmeticOp(0);
                }
                break;
                case 3:
                    _localctx = new LessEqualRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(316);
                    arithmeticOp(0);
                    setState(317);
                    match(T__33);
                    setState(318);
                    arithmeticOp(0);
                }
                break;
                case 4:
                    _localctx = new GreaterRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(320);
                    arithmeticOp(0);
                    setState(321);
                    match(T__34);
                    setState(322);
                    arithmeticOp(0);
                }
                break;
                case 5:
                    _localctx = new GreaterEqualRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(324);
                    arithmeticOp(0);
                    setState(325);
                    match(T__35);
                    setState(326);
                    arithmeticOp(0);
                }
                break;
                case 6:
                    _localctx = new EqualityRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(328);
                    arithmeticOp(0);
                    setState(329);
                    match(T__36);
                    setState(330);
                    arithmeticOp(0);
                }
                break;
                case 7:
                    _localctx = new InequivalenceRelationalContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(332);
                    arithmeticOp(0);
                    setState(333);
                    match(T__37);
                    setState(334);
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
            return getRuleContext(LogicalOpContext.class, i);
        }

        public DisjunctionLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterDisjunctionLogical(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitDisjunctionLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitDisjunctionLogical(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EachLogicalContext extends LogicalOpContext {
        public EachLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterEachLogical(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitEachLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitEachLogical(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ImplicationLogicalContext extends LogicalOpContext {
        public List<LogicalOpContext> logicalOp() {
            return getRuleContexts(LogicalOpContext.class);
        }

        public LogicalOpContext logicalOp(int i) {
            return getRuleContext(LogicalOpContext.class, i);
        }

        public ImplicationLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterImplicationLogical(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitImplicationLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor)
                return ((ExprVisitor<? extends T>) visitor).visitImplicationLogical(this);
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
            if (listener instanceof ExprListener) ((ExprListener) listener).exitVariableLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitVariableLogical(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EquivalenceLogicalContext extends LogicalOpContext {
        public List<LogicalOpContext> logicalOp() {
            return getRuleContexts(LogicalOpContext.class);
        }

        public LogicalOpContext logicalOp(int i) {
            return getRuleContext(LogicalOpContext.class, i);
        }

        public EquivalenceLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterEquivalenceLogical(this);
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

    public static class ConstantLogicalContext extends LogicalOpContext {
        public ConstantContext constant() {
            return getRuleContext(ConstantContext.class, 0);
        }

        public ConstantLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterConstantLogical(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitConstantLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitConstantLogical(this);
            else return visitor.visitChildren(this);
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
            return getRuleContext(LogicalOpContext.class, 0);
        }

        public ParanthesesLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
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
                return ((ExprVisitor<? extends T>) visitor).visitParenthesisLogical(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArrayOpLogicalContext extends LogicalOpContext {
        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public ArrayOpContext arrayOp() {
            return getRuleContext(ArrayOpContext.class, 0);
        }

        public ArrayOpLogicalContext(LogicalOpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterArrayOpLogical(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitArrayOpLogical(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitArrayOpLogical(this);
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

    public final LogicalOpContext logicalOp() throws RecognitionException {
        return logicalOp(0);
    }

    private LogicalOpContext logicalOp(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        LogicalOpContext _localctx = new LogicalOpContext(_ctx, _parentState);
        LogicalOpContext _prevctx = _localctx;
        int _startState = 44;
        enterRecursionRule(_localctx, 44, RULE_logicalOp, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(352);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        _localctx = new ParanthesesLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(339);
                        match(T__4);
                        setState(340);
                        logicalOp(0);
                        setState(341);
                        match(T__5);
                    }
                    break;
                    case 2: {
                        _localctx = new NegationLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(343);
                        match(T__38);
                        setState(344);
                        logicalOp(10);
                    }
                    break;
                    case 3: {
                        _localctx = new RelationalOpLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(345);
                        relationalOp();
                    }
                    break;
                    case 4: {
                        _localctx = new ArrayOpLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(346);
                        match(ID);
                        setState(347);
                        match(T__21);
                        setState(348);
                        arrayOp();
                    }
                    break;
                    case 5: {
                        _localctx = new EachLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(349);
                        match(T__31);
                    }
                    break;
                    case 6: {
                        _localctx = new VariableLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(350);
                        match(ID);
                    }
                    break;
                    case 7: {
                        _localctx = new ConstantLogicalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(351);
                        constant();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(368);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(366);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                                case 1: {
                                    _localctx = new ConjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(354);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(355);
                                    match(T__39);
                                    setState(356);
                                    logicalOp(10);
                                }
                                break;
                                case 2: {
                                    _localctx = new DisjunctionLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(357);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(358);
                                    match(T__40);
                                    setState(359);
                                    logicalOp(9);
                                }
                                break;
                                case 3: {
                                    _localctx = new ImplicationLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(360);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(361);
                                    match(T__41);
                                    setState(362);
                                    logicalOp(8);
                                }
                                break;
                                case 4: {
                                    _localctx = new EquivalenceLogicalContext(new LogicalOpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_logicalOp);
                                    setState(363);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(364);
                                    match(T__42);
                                    setState(365);
                                    logicalOp(7);
                                }
                                break;
                            }
                        }
                    }
                    setState(370);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
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

    public static class ConstantContext extends ParserRuleContext {
        public ConstantContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_constant;
        }

        public ConstantContext() {
        }

        public void copyFrom(ConstantContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BooleanConstantContext extends ConstantContext {
        public TerminalNode BoolConstant() {
            return getToken(ExprParser.BoolConstant, 0);
        }

        public BooleanConstantContext(ConstantContext ctx) {
            copyFrom(ctx);
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

    public static class NegationIntegerConstantContext extends ConstantContext {
        public TerminalNode IntConstant() {
            return getToken(ExprParser.IntConstant, 0);
        }

        public NegationIntegerConstantContext(ConstantContext ctx) {
            copyFrom(ctx);
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

    public static class IntegerConstantContext extends ConstantContext {
        public TerminalNode IntConstant() {
            return getToken(ExprParser.IntConstant, 0);
        }

        public IntegerConstantContext(ConstantContext ctx) {
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

    public final ConstantContext constant() throws RecognitionException {
        ConstantContext _localctx = new ConstantContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_constant);
        try {
            setState(375);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IntConstant:
                    _localctx = new IntegerConstantContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(371);
                    match(IntConstant);
                }
                break;
                case T__30:
                    _localctx = new NegationIntegerConstantContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(372);
                    match(T__30);
                    setState(373);
                    match(IntConstant);
                }
                break;
                case BoolConstant:
                    _localctx = new BooleanConstantContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(374);
                    match(BoolConstant);
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

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 20:
                return arithmeticOp_sempred((ArithmeticOpContext) _localctx, predIndex);
            case 22:
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
                return precpred(_ctx, 9);
            case 6:
                return precpred(_ctx, 8);
            case 7:
                return precpred(_ctx, 7);
            case 8:
                return precpred(_ctx, 6);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u017c\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\3\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\7\3\7\5\7\u0092\n\7\3" +
                    "\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2" +
                    "\13\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00be\n\r" +
                    "\f\r\16\r\u00c1\13\r\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00d5\n\20\r\20\16\20" +
                    "\u00d6\3\21\3\21\6\21\u00db\n\21\r\21\16\21\u00dc\3\22\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\5\22\u00f2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23" +
                    "\u00fd\n\23\3\24\3\24\5\24\u0101\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3" +
                    "\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5" +
                    "\25\u0117\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0121\n\26" +
                    "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\7\26\u0132\n\26\f\26\16\26\u0135\13\26\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0153\n\27\3\30\3\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0163" +
                    "\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30" +
                    "\u0171\n\30\f\30\16\30\u0174\13\30\3\31\3\31\3\31\3\31\5\31\u017a\n\31" +
                    "\3\31\2\4*.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2" +
                    "\2\u019d\2\63\3\2\2\2\4?\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nr\3\2\2\2\f\u0091" +
                    "\3\2\2\2\16\u0093\3\2\2\2\20\u0096\3\2\2\2\22\u00a5\3\2\2\2\24\u00a9\3" +
                    "\2\2\2\26\u00ab\3\2\2\2\30\u00b5\3\2\2\2\32\u00c5\3\2\2\2\34\u00ce\3\2" +
                    "\2\2\36\u00d4\3\2\2\2 \u00da\3\2\2\2\"\u00f1\3\2\2\2$\u00fc\3\2\2\2&\u0100" +
                    "\3\2\2\2(\u0116\3\2\2\2*\u0120\3\2\2\2,\u0152\3\2\2\2.\u0162\3\2\2\2\60" +
                    "\u0179\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2" +
                    "\65\66\3\2\2\2\66\67\3\2\2\2\678\7\2\2\38\3\3\2\2\29@\5\6\4\2:@\5\"\22" +
                    "\2;@\5\30\r\2<@\5\26\f\2=@\5\n\6\2>@\5\b\5\2?9\3\2\2\2?:\3\2\2\2?;\3\2" +
                    "\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\7.\2\2BC\7\62\2\2CU\7" +
                    "\65\2\2DE\7.\2\2EF\7\62\2\2FG\7\3\2\2GH\7\62\2\2HU\7\65\2\2IJ\7.\2\2J" +
                    "K\7\62\2\2KL\7\3\2\2LM\5$\23\2MN\7\65\2\2NU\3\2\2\2OP\7.\2\2PQ\7\4\2\2" +
                    "QR\7\5\2\2RS\7\62\2\2SU\7\65\2\2TA\3\2\2\2TD\3\2\2\2TI\3\2\2\2TO\3\2\2" +
                    "\2U\7\3\2\2\2VW\7\6\2\2WX\7\7\2\2XY\5.\30\2YZ\7\b\2\2Z[\7\t\2\2[\\\7\n" +
                    "\2\2\\]\5\36\20\2]^\7\13\2\2^_\7\f\2\2_`\7\7\2\2`a\5.\30\2ab\7\b\2\2b" +
                    "c\7\n\2\2cd\7\r\2\2de\7\7\2\2ef\5$\23\2fg\7\b\2\2gh\7\16\2\2hi\7\7\2\2" +
                    "ij\7\62\2\2jk\7\b\2\2kl\5 \21\2lm\7\13\2\2mn\7\17\2\2no\7\7\2\2op\5.\30" +
                    "\2pq\7\b\2\2q\t\3\2\2\2rs\7\20\2\2st\7.\2\2tu\7\62\2\2uv\7\7\2\2vw\5\f" +
                    "\7\2wx\7\b\2\2xy\7\n\2\2yz\7\21\2\2z{\7\7\2\2{|\5.\30\2|}\7\b\2\2}~\5" +
                    " \21\2~\177\7\22\2\2\177\u0080\7\62\2\2\u0080\u0081\7\65\2\2\u0081\u0082" +
                    "\7\23\2\2\u0082\u0083\7\7\2\2\u0083\u0084\5.\30\2\u0084\u0085\7\b\2\2" +
                    "\u0085\u0086\7\13\2\2\u0086\13\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u0089" +
                    "\7\66\2\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2" +
                    "\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c" +
                    "\3\2\2\2\u008f\u0092\5\16\b\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2" +
                    "\u0091\u0090\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094\7.\2\2\u0094\u0095\7" +
                    "\62\2\2\u0095\17\3\2\2\2\u0096\u0097\7\62\2\2\u0097\u0098\7\7\2\2\u0098" +
                    "\u0099\5\22\n\2\u0099\u009a\7\b\2\2\u009a\21\3\2\2\2\u009b\u009c\5\24" +
                    "\13\2\u009c\u009d\7\66\2\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f" +
                    "\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2" +
                    "\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\5\24\13\2\u00a4\u00a6\3\2\2\2\u00a5" +
                    "\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00aa\7\62\2" +
                    "\2\u00a8\u00aa\5$\23\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\25" +
                    "\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\5.\30\2" +
                    "\u00ae\u00af\7\b\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2" +
                    "\7\7\2\2\u00b2\u00b3\5.\30\2\u00b3\u00b4\7\b\2\2\u00b4\27\3\2\2\2\u00b5" +
                    "\u00b6\7\26\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\7" +
                    "\b\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bf\7\13\2\2\u00bc" +
                    "\u00be\5\32\16\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3" +
                    "\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2" +
                    "\u00c4\5\34\17\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\31\3\2" +
                    "\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\7\7\2\2\u00c8" +
                    "\u00c9\5.\30\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\5 " +
                    "\21\2\u00cc\u00cd\7\13\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf" +
                    "\u00d0\7\n\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\13\2\2\u00d2\35\3\2\2" +
                    "\2\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6" +
                    "\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\37\3\2\2\2\u00d8\u00db\5\"\22" +
                    "\2\u00d9\u00db\5\30\r\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db" +
                    "\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd!\3\2\2\2" +
                    "\u00de\u00df\7\62\2\2\u00df\u00f2\7\65\2\2\u00e0\u00e1\7\62\2\2\u00e1" +
                    "\u00e2\7\3\2\2\u00e2\u00e3\7\62\2\2\u00e3\u00f2\7\65\2\2\u00e4\u00e5\7" +
                    "\62\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7\65\2\2\u00e8" +
                    "\u00f2\3\2\2\2\u00e9\u00ea\7\62\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\5" +
                    "(\25\2\u00ec\u00ed\7\65\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00ef\5$\23\2\u00ef" +
                    "\u00f0\7\65\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00de\3\2\2\2\u00f1\u00e0\3" +
                    "\2\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2" +
                    "#\3\2\2\2\u00f3\u00fd\5*\26\2\u00f4\u00fd\5.\30\2\u00f5\u00fd\5,\27\2" +
                    "\u00f6\u00fd\5&\24\2\u00f7\u00fd\5\20\t\2\u00f8\u00f9\7\7\2\2\u00f9\u00fa" +
                    "\5$\23\2\u00fa\u00fb\7\b\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc" +
                    "\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2" +
                    "\2\2\u00fc\u00f8\3\2\2\2\u00fd%\3\2\2\2\u00fe\u0101\5,\27\2\u00ff\u0101" +
                    "\5.\30\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\'\3\2\2\2\u0102" +
                    "\u0103\7\31\2\2\u0103\u0104\7\7\2\2\u0104\u0105\5\60\31\2\u0105\u0106" +
                    "\7\b\2\2\u0106\u0117\3\2\2\2\u0107\u0108\7\32\2\2\u0108\u0109\7\7\2\2" +
                    "\u0109\u010a\5\60\31\2\u010a\u010b\7\b\2\2\u010b\u0117\3\2\2\2\u010c\u010d" +
                    "\7\33\2\2\u010d\u010e\7\7\2\2\u010e\u010f\5&\24\2\u010f\u0110\7\b\2\2" +
                    "\u0110\u0117\3\2\2\2\u0111\u0112\7\34\2\2\u0112\u0113\7\7\2\2\u0113\u0114" +
                    "\5&\24\2\u0114\u0115\7\b\2\2\u0115\u0117\3\2\2\2\u0116\u0102\3\2\2\2\u0116" +
                    "\u0107\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u0111\3\2\2\2\u0117)\3\2\2\2" +
                    "\u0118\u0119\b\26\1\2\u0119\u011a\7\7\2\2\u011a\u011b\5*\26\2\u011b\u011c" +
                    "\7\b\2\2\u011c\u0121\3\2\2\2\u011d\u0121\7\"\2\2\u011e\u0121\7\62\2\2" +
                    "\u011f\u0121\5\60\31\2\u0120\u0118\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e" +
                    "\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0133\3\2\2\2\u0122\u0123\f\n\2\2\u0123" +
                    "\u0124\7\35\2\2\u0124\u0132\5*\26\13\u0125\u0126\f\t\2\2\u0126\u0127\7" +
                    "\36\2\2\u0127\u0132\5*\26\n\u0128\u0129\f\b\2\2\u0129\u012a\7\37\2\2\u012a" +
                    "\u0132\5*\26\t\u012b\u012c\f\7\2\2\u012c\u012d\7 \2\2\u012d\u0132\5*\26" +
                    "\b\u012e\u012f\f\6\2\2\u012f\u0130\7!\2\2\u0130\u0132\5*\26\7\u0131\u0122" +
                    "\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012b\3\2\2\2\u0131" +
                    "\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2" +
                    "\2\2\u0134+\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\7\2\2\u0137\u0138" +
                    "\5,\27\2\u0138\u0139\7\b\2\2\u0139\u0153\3\2\2\2\u013a\u013b\5*\26\2\u013b" +
                    "\u013c\7#\2\2\u013c\u013d\5*\26\2\u013d\u0153\3\2\2\2\u013e\u013f\5*\26" +
                    "\2\u013f\u0140\7$\2\2\u0140\u0141\5*\26\2\u0141\u0153\3\2\2\2\u0142\u0143" +
                    "\5*\26\2\u0143\u0144\7%\2\2\u0144\u0145\5*\26\2\u0145\u0153\3\2\2\2\u0146" +
                    "\u0147\5*\26\2\u0147\u0148\7&\2\2\u0148\u0149\5*\26\2\u0149\u0153\3\2" +
                    "\2\2\u014a\u014b\5*\26\2\u014b\u014c\7\'\2\2\u014c\u014d\5*\26\2\u014d" +
                    "\u0153\3\2\2\2\u014e\u014f\5*\26\2\u014f\u0150\7(\2\2\u0150\u0151\5*\26" +
                    "\2\u0151\u0153\3\2\2\2\u0152\u0136\3\2\2\2\u0152\u013a\3\2\2\2\u0152\u013e" +
                    "\3\2\2\2\u0152\u0142\3\2\2\2\u0152\u0146\3\2\2\2\u0152\u014a\3\2\2\2\u0152" +
                    "\u014e\3\2\2\2\u0153-\3\2\2\2\u0154\u0155\b\30\1\2\u0155\u0156\7\7\2\2" +
                    "\u0156\u0157\5.\30\2\u0157\u0158\7\b\2\2\u0158\u0163\3\2\2\2\u0159\u015a" +
                    "\7)\2\2\u015a\u0163\5.\30\f\u015b\u0163\5,\27\2\u015c\u015d\7\62\2\2\u015d" +
                    "\u015e\7\30\2\2\u015e\u0163\5(\25\2\u015f\u0163\7\"\2\2\u0160\u0163\7" +
                    "\62\2\2\u0161\u0163\5\60\31\2\u0162\u0154\3\2\2\2\u0162\u0159\3\2\2\2" +
                    "\u0162\u015b\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160" +
                    "\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0172\3\2\2\2\u0164\u0165\f\13\2\2" +
                    "\u0165\u0166\7*\2\2\u0166\u0171\5.\30\f\u0167\u0168\f\n\2\2\u0168\u0169" +
                    "\7+\2\2\u0169\u0171\5.\30\13\u016a\u016b\f\t\2\2\u016b\u016c\7,\2\2\u016c" +
                    "\u0171\5.\30\n\u016d\u016e\f\b\2\2\u016e\u016f\7-\2\2\u016f\u0171\5.\30" +
                    "\t\u0170\u0164\3\2\2\2\u0170\u0167\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016d" +
                    "\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173" +
                    "/\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u017a\7/\2\2\u0176\u0177\7!\2\2\u0177" +
                    "\u017a\7/\2\2\u0178\u017a\7\60\2\2\u0179\u0175\3\2\2\2\u0179\u0176\3\2" +
                    "\2\2\u0179\u0178\3\2\2\2\u017a\61\3\2\2\2\33\65?T\u008c\u0091\u00a0\u00a5" +
                    "\u00a9\u00bf\u00c3\u00d6\u00da\u00dc\u00f1\u00fc\u0100\u0116\u0120\u0131" +
                    "\u0133\u0152\u0162\u0170\u0172\u0179";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}