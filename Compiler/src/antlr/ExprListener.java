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
	 *
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 *
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 *
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
	 * @param ctx the parse tree
	 */
	void enterVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInitializationConstantCopy}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInitializationConstant}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInitializationConstant}
	 * labeled alternative in {@link ExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx);
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
	 * @param ctx the parse tree
	 */
	void enterIfConditional(ExprParser.IfConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfConditional}
	 * labeled alternative in {@link ExprParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfConditional(ExprParser.IfConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIfConditional(ExprParser.ElseIfConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfConditional}
	 * labeled alternative in {@link ExprParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIfConditional(ExprParser.ElseIfConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseConditional}
	 * labeled alternative in {@link ExprParser#finaElse}.
	 * @param ctx the parse tree
	 */
	void enterElseConditional(ExprParser.ElseConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseConditional}
	 * labeled alternative in {@link ExprParser#finaElse}.
	 * @param ctx the parse tree
	 */
	void exitElseConditional(ExprParser.ElseConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleAssignments}
	 * labeled alternative in {@link ExprParser#multAssig}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleAssignments}
	 * labeled alternative in {@link ExprParser#multAssig}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link ExprParser#assignment}.
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
	 * Enter a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIDAssignment(ExprParser.IDAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIDAssignment(ExprParser.IDAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignAssignment(ExprParser.AssignAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignAssignment}
	 * labeled alternative in {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignAssignment(ExprParser.AssignAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperation(ExprParser.RelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperation(ExprParser.RelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOpteration(ExprParser.LogicalOpterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOpteration}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOpteration(ExprParser.LogicalOpterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParanthesesExpression}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterVariableArithmetic(ExprParser.VariableArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitVariableArithmetic(ExprParser.VariableArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
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
	 * Enter a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code NegationIntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionArithmetic}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(ExprParser.IntegerConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link ExprParser#arithmeticOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(ExprParser.IntegerConstantContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParanthesesRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void enterParanthesesRelational(ExprParser.ParanthesesRelationalContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParanthesesRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
	 * @param ctx the parse tree
	 */
	void exitParanthesesRelational(ExprParser.ParanthesesRelationalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LessRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 *
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
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityRelational(ExprParser.EqualityRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityRelational(ExprParser.EqualityRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InequivalenceRelational}
	 * labeled alternative in {@link ExprParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctionLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterImplicationLogical(ExprParser.ImplicationLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitImplicationLogical(ExprParser.ImplicationLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterVariableLogical(ExprParser.VariableLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitVariableLogical(ExprParser.VariableLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquivalenceLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterNegationLogical(ExprParser.NegationLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
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
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(ExprParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(ExprParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalOpLogical}
	 * labeled alternative in {@link ExprParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOpLogical(ExprParser.RelationalOpLogicalContext ctx);
}