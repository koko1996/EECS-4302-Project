// Generated from Expr.g4 by ANTLR 4.8

        package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExprParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableInitializationConstantCopy}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableInitializationConstant}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableArrayDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayDeclaration(ExprParser.VariableArrayDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link ExprParser#loop}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(ExprParser.LoopStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionConditional}
	 * labeled alternative in {@link ExprParser#function}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionConditional(ExprParser.FunctionConditionalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParameterArguments}
	 * labeled alternative in {@link ExprParser#parameters}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterArguments(ExprParser.ParameterArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterEmpty}
	 * labeled alternative in {@link ExprParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterEmpty(ExprParser.ParameterEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterArgumentVariable}
	 * labeled alternative in {@link ExprParser#parameterVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterArgumentVariable(ExprParser.ParameterArgumentVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStatment}
	 * labeled alternative in {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatment(ExprParser.FunctionCallStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallParameters}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParameters(ExprParser.FunctionCallParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallParametersEpsilon}
	 * labeled alternative in {@link ExprParser#functionCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParametersEpsilon(ExprParser.FunctionCallParametersEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleParameterID}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParameterID(ExprParser.SingleParameterIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleParameterExpression}
	 * labeled alternative in {@link ExprParser#singleParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParameterExpression(ExprParser.SingleParameterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalAssertionStatement}
	 * labeled alternative in {@link ExprParser#assertedConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAssertionStatement(ExprParser.ConditionalAssertionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditional}
	 * labeled alternative in {@link ExprParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditional(ExprParser.IfConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfConditional(ExprParser.ElseIfConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseConditional}
	 * labeled alternative in {@link ExprParser#finaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseConditional(ExprParser.ElseConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleAssignmentsSimple}
	 * labeled alternative in {@link ExprParser#multAssigSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssignmentsSimple(ExprParser.MultipleAssignmentsSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleAssignments}
	 * labeled alternative in {@link ExprParser#multAssig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code IDExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExpression(ExprParser.IDExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDAssignment(ExprParser.IDAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAssignment(ExprParser.AssignAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AssignProperty}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignProperty(ExprParser.AssignPropertyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(ExprParser.AssignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOpteration(ExprParser.LogicalOpterationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperation(ExprParser.RelationalOperationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LambdaOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaOperation(ExprParser.LambdaOperationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FunctionReturnOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnOperation(ExprParser.FunctionReturnOperationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#lambdaOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaOp(ExprParser.LambdaOpContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AddToArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToArray(ExprParser.AddToArrayContext ctx);

	/**
	 * Visit a parse tree produced by the {@code RemoveFromArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFromArray(ExprParser.RemoveFromArrayContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ForAllArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAllArray(ExprParser.ForAllArrayContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ForSomeArray}
	 * labeled alternative in {@link ExprParser#arrayOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSomeArray(ExprParser.ForSomeArrayContext ctx);

	/**
	 * Visit a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArithmetic(ExprParser.VariableArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code EachArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachArithmetic(ExprParser.EachArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ModuloArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloArithmetic(ExprParser.ModuloArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MultiplicationArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationArithmetic(ExprParser.MultiplicationArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParanthesesArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisArithmetic(ExprParser.ParanthesesArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstantArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantArithmetic(ExprParser.ConstantArithmeticContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParanthesesRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisRelational(ExprParser.ParanthesesRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LessRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessRelational(ExprParser.LessRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualRelational(ExprParser.LessEqualRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code GreaterRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterRelational(ExprParser.GreaterRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code GreaterEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityRelational(ExprParser.EqualityRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code EachLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachLogical(ExprParser.EachLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationLogical(ExprParser.ImplicationLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableLogical(ExprParser.VariableLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstantLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantLogical(ExprParser.ConstantLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationLogical(ExprParser.NegationLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionLogical(ExprParser.ConjunctionLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParanthesesLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisLogical(ExprParser.ParanthesesLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ArrayOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOpLogical(ExprParser.ArrayOpLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(ExprParser.IntegerConstantContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);

	/**
	 * Visit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(ExprParser.BooleanConstantContext ctx);
}