// Generated from Expr.g4 by ANTLR 4.8

        package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExprParser.VariableDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableInitializationConstantCopy}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void enterVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableInitializationConstantCopy}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);

    /**
     * Enter a parse tree produced by the {@code VariableInitializationConstant}
     * labeled alternative in {@link ExprParser#declaration}.
     *
     * @param ctx the parse tree
	 */
	void enterVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableInitializationConstant}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void enterVariableArrayDeclaration(ExprParser.VariableArrayDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableArrayDeclaration(ExprParser.VariableArrayDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link ExprParser#loop}.
	 *
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(ExprParser.LoopStatementContext ctx);

    /**
     * Exit a parse tree produced by the {@code LoopStatement}
     * labeled alternative in {@link ExprParser#loop}.
     *
     * @param ctx the parse tree
     */
    void exitLoopStatement(ExprParser.LoopStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code FunctionConditional}
     * labeled alternative in {@link ExprParser#function}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionConditional(ExprParser.FunctionConditionalContext ctx);

    /**
     * Exit a parse tree produced by the {@code FunctionConditional}
     * labeled alternative in {@link ExprParser#function}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionConditional(ExprParser.FunctionConditionalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParameterArguments}
	 * labeled alternative in {@link ExprParser#parameters}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParameterArguments(ExprParser.ParameterArgumentsContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParameterArguments}
	 * labeled alternative in {@link ExprParser#parameters}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParameterArguments(ExprParser.ParameterArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParameterEmpty}
	 * labeled alternative in {@link ExprParser#parameters}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParameterEmpty(ExprParser.ParameterEmptyContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParameterEmpty}
	 * labeled alternative in {@link ExprParser#parameters}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParameterEmpty(ExprParser.ParameterEmptyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParameterArgumentVariable}
	 * labeled alternative in {@link ExprParser#parameterVariable}.
	 * @param ctx the parse tree
	 */
	void enterParameterArgumentVariable(ExprParser.ParameterArgumentVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterArgumentVariable}
	 * labeled alternative in {@link ExprParser#parameterVariable}.
	 * @param ctx the parse tree
	 */
	void exitParameterArgumentVariable(ExprParser.ParameterArgumentVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStatment}
	 * labeled alternative in {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatment(ExprParser.FunctionCallStatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStatment}
	 * labeled alternative in {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatment(ExprParser.FunctionCallStatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallParameters}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParameters(ExprParser.FunctionCallParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallParameters}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParameters(ExprParser.FunctionCallParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallParametersEpsilon}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParametersEpsilon(ExprParser.FunctionCallParametersEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallParametersEpsilon}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParametersEpsilon(ExprParser.FunctionCallParametersEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleParameterID}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void enterSingleParameterID(ExprParser.SingleParameterIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleParameterID}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void exitSingleParameterID(ExprParser.SingleParameterIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleParameterExpression}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void enterSingleParameterExpression(ExprParser.SingleParameterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleParameterExpression}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 */
	void exitSingleParameterExpression(ExprParser.SingleParameterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalAssertionStatement}
	 * labeled alternative in {@link ExprParser#assertedConditional}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAssertionStatement(ExprParser.ConditionalAssertionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalAssertionStatement}
	 * labeled alternative in {@link ExprParser#assertedConditional}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAssertionStatement(ExprParser.ConditionalAssertionStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IfConditional}
	 * labeled alternative in {@link ExprParser#conditional}.
	 *
	 * @param ctx the parse tree
	 */
	void enterIfConditional(ExprParser.IfConditionalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code IfConditional}
	 * labeled alternative in {@link ExprParser#conditional}.
	 *
	 * @param ctx the parse tree
	 */
	void exitIfConditional(ExprParser.IfConditionalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ElseIfConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 *
	 * @param ctx the parse tree
	 */
	void enterElseIfConditional(ExprParser.ElseIfConditionalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ElseIfConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 *
	 * @param ctx the parse tree
	 */
	void exitElseIfConditional(ExprParser.ElseIfConditionalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ElseConditional}
	 * labeled alternative in {@link ExprParser#finaElse}.
	 *
	 * @param ctx the parse tree
	 */
	void enterElseConditional(ExprParser.ElseConditionalContext ctx);

    /**
     * Exit a parse tree produced by the {@code ElseConditional}
     * labeled alternative in {@link ExprParser#finaElse}.
     *
     * @param ctx the parse tree
     */
    void exitElseConditional(ExprParser.ElseConditionalContext ctx);

    /**
     * Enter a parse tree produced by the {@code MultipleAssignmentsSimple}
     * labeled alternative in {@link ExprParser#multAssigSimple}.
     *
     * @param ctx the parse tree
     */
    void enterMultipleAssignmentsSimple(ExprParser.MultipleAssignmentsSimpleContext ctx);

    /**
     * Exit a parse tree produced by the {@code MultipleAssignmentsSimple}
     * labeled alternative in {@link ExprParser#multAssigSimple}.
     *
     * @param ctx the parse tree
     */
    void exitMultipleAssignmentsSimple(ExprParser.MultipleAssignmentsSimpleContext ctx);

    /**
     * Enter a parse tree produced by the {@code MultipleAssignments}
     * labeled alternative in {@link ExprParser#multAssig}.
     *
     * @param ctx the parse tree
     */
    void enterMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);

	/**
	 * Exit a parse tree produced by the {@code MultipleAssignments}
	 * labeled alternative in {@link ExprParser#multAssig}.
	 *
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IDExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIDExpression(ExprParser.IDExpressionContext ctx);

	/**
	 * Exit a parse tree produced by the {@code IDExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitIDExpression(ExprParser.IDExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterIDAssignment(ExprParser.IDAssignmentContext ctx);

	/**
	 * Exit a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitIDAssignment(ExprParser.IDAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterAssignAssignment(ExprParser.AssignAssignmentContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitAssignAssignment(ExprParser.AssignAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AssignProperty}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterAssignProperty(ExprParser.AssignPropertyContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AssignProperty}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void exitAssignProperty(ExprParser.AssignPropertyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(ExprParser.AssignExpressionContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(ExprParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterLogicalOpteration(ExprParser.LogicalOpterationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitLogicalOpteration(ExprParser.LogicalOpterationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterRelationalOperation(ExprParser.RelationalOperationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitRelationalOperation(ExprParser.RelationalOperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LambdaOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterLambdaOperation(ExprParser.LambdaOperationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code LambdaOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitLambdaOperation(ExprParser.LambdaOperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FunctionReturnOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnOperation(ExprParser.FunctionReturnOperationContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FunctionReturnOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnOperation(ExprParser.FunctionReturnOperationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#lambdaOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterLambdaOp(ExprParser.LambdaOpContext ctx);

	/**
	 * Exit a parse tree produced by {@link ExprParser#lambdaOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitLambdaOp(ExprParser.LambdaOpContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AddToArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterAddToArray(ExprParser.AddToArrayContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AddToArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitAddToArray(ExprParser.AddToArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code RemoveFromArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterRemoveFromArray(ExprParser.RemoveFromArrayContext ctx);

	/**
	 * Exit a parse tree produced by the {@code RemoveFromArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitRemoveFromArray(ExprParser.RemoveFromArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ForAllArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterForAllArray(ExprParser.ForAllArrayContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ForAllArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitForAllArray(ExprParser.ForAllArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ForSomeArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterForSomeArray(ExprParser.ForSomeArrayContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ForSomeArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitForSomeArray(ExprParser.ForSomeArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterVariableArithmetic(ExprParser.VariableArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableArithmetic(ExprParser.VariableArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code EachArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterEachArithmetic(ExprParser.EachArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code EachArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitEachArithmetic(ExprParser.EachArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ModuloArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterModuloArithmetic(ExprParser.ModuloArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ModuloArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitModuloArithmetic(ExprParser.ModuloArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationArithmetic(ExprParser.MultiplicationArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code MultiplicationArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitMultiplicationArithmetic(ExprParser.MultiplicationArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParanthesesArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParanthesesArithmetic(ExprParser.ParanthesesArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParanthesesArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParanthesesArithmetic(ExprParser.ParanthesesArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConstantArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterConstantArithmetic(ExprParser.ConstantArithmeticContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ConstantArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitConstantArithmetic(ExprParser.ConstantArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParanthesesRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterParanthesesRelational(ExprParser.ParanthesesRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanthesesRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitParanthesesRelational(ExprParser.ParanthesesRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterLessRelational(ExprParser.LessRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitLessRelational(ExprParser.LessRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualRelational(ExprParser.LessEqualRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualRelational(ExprParser.LessEqualRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterGreaterRelational(ExprParser.GreaterRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterRelational(ExprParser.GreaterRelationalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code GreaterEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code GreaterEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterEqualityRelational(ExprParser.EqualityRelationalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitEqualityRelational(ExprParser.EqualityRelationalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code EachLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterEachLogical(ExprParser.EachLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code EachLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitEachLogical(ExprParser.EachLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterImplicationLogical(ExprParser.ImplicationLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitImplicationLogical(ExprParser.ImplicationLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterVariableLogical(ExprParser.VariableLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitVariableLogical(ExprParser.VariableLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConstantLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterConstantLogical(ExprParser.ConstantLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ConstantLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitConstantLogical(ExprParser.ConstantLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterNegationLogical(ExprParser.NegationLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitNegationLogical(ExprParser.NegationLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterConjunctionLogical(ExprParser.ConjunctionLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ConjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitConjunctionLogical(ExprParser.ConjunctionLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParanthesesLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParanthesesLogical(ExprParser.ParanthesesLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParanthesesLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParanthesesLogical(ExprParser.ParanthesesLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ArrayOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterArrayOpLogical(ExprParser.ArrayOpLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ArrayOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitArrayOpLogical(ExprParser.ArrayOpLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(ExprParser.IntegerConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(ExprParser.IntegerConstantContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 */
	void enterNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 */
	void exitNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(ExprParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(ExprParser.BooleanConstantContext ctx);
}