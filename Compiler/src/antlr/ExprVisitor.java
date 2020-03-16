// Generated from Expr.g4 by ANTLR 4.8

        package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
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
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableInitializationConstantCopy}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableInitializationConstant}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExprParser.StatementContext ctx);

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
	 * labeled alternative in {@link ExprParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseConditional(ExprParser.ElseConditionalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code EpsilonConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilonConditional(ExprParser.EpsilonConditionalContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MultipleAssignments}
	 * labeled alternative in {@link ExprParser#multAssig}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
	 *
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(ExprParser.AssignExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAssignment(ExprParser.AssignAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperation(ExprParser.RelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOpteration(ExprParser.LogicalOpterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArithmetic(ExprParser.VariableArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuloArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloArithmetic(ExprParser.ModuloArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationArithmetic(ExprParser.MultiplicationArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(ExprParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
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
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterRelational(ExprParser.GreaterRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityRelational(ExprParser.EqualityRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationLogical(ExprParser.ImplicationLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableLogical(ExprParser.VariableLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationLogical(ExprParser.NegationLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionLogical(ExprParser.ConjunctionLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(ExprParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);
}