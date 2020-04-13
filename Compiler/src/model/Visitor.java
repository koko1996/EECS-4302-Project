package model;

import model.statement.Loop;
import model.statement.MultiAssignment;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.Each;
import model.statement.assignment.expression.FunctionCall;
import model.statement.assignment.expression.FunctionConditional;
import model.statement.assignment.expression.ParenthesisExpression;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.array.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.*;

/**
 * Interface for the visitor classes.
 */
public interface Visitor {
    /**
     * Visitor class for FunctionConditional
     *
     * @param exp
     */
    void visitFunctionConditional(FunctionConditional exp);

    /**
     * Visitor class for AssertedConditional
     *
     * @param exp
     */
    void visitConditionalAssertionStatement(AssertedConditional exp);

    /**
     * Visitor class for IfElseIfStatement
     *
     * @param exp
     */
    void visitIfConditional(IfElseIfStatement exp);

    /**
     * Visitor class for ElseIfStatement
     *
     * @param exp
     */
    void visitElseIfConditional(ElseIfStatement exp);

    /**
     * Visitor class for ExpressionAssignment
     *
     * @param exp
     */
    void visitAssignExpression(ExpressionAssignment exp);

    /**
     * Visitor class for ParanthesisExpression
     *
     * @param exp
     */
    void visitParenthesisExpression(ParenthesisExpression exp);

    /**
     * Visitor class for Division
     *
     * @param exp
     */
    void visitDivisionArithmetic(Division exp);

    /**
     * Visitor class for Modulo
     *
     * @param exp
     */
    void visitModuloArithmetic(Modulo exp);

    /**
     * Visitor class for Multiplication
     *
     * @param exp
     */
    void visitMultiplicationArithmetic(Multiplication exp);

    /**
     * Visitor class for Addition
     *
     * @param exp
     */
    void visitAdditionArithmetic(Addition exp);

    /**
     * Visitor class for Subtraction
     *
     * @param exp
     */
    void visitSubtractionArithmetic(Subtraction exp);

    /**
     * Visitor class for IntegerConstant
     *
     * @param exp
     */
    void visitIntegerConstant(IntegerConstant exp);

    /**
     * Visitor class for IntegerVariable
     *
     * @param exp
     */
    void visitIntegerVariable(IntegerVariable exp);

    /**
     * Visitor class for LessThan
     *
     * @param exp
     */
    void visitLessRelational(LessThan exp);

    /**
     * Visitor class for LessThanOrEqual
     *
     * @param exp
     */
    void visitLessEqualRelational(LessThanOrEqual exp);

    /**
     * Visitor class for GreaterThan
     *
     * @param exp
     */
    void visitGreaterRelational(GreaterThan exp);

    /**
     * Visitor class for GreaterThanOrEqual
     *
     * @param exp
     */
    void visitGreaterEqualRelational(GreaterThanOrEqual exp);

    /**
     * Visitor class for Equality
     *
     * @param exp
     */
    void visitEqualityRelational(Equality exp);

    /**
     * Visitor class for Inequality
     *
     * @param exp
     */
    void visitInequivalenceRelational(Inequality exp);

    /**
     * Visitor class for Disjunction
     *
     * @param exp
     */
    void visitDisjunctionLogical(Disjunction exp);

    /**
     * Visitor class for Implication
     *
     * @param exp
     */
    void visitImplicationLogical(Implication exp);

    /**
     * Visitor class for Equivalence
     *
     * @param exp
     */
    void visitEquivalenceLogical(Equivalence exp);

    /**
     * Visitor class for Negation
     *
     * @param exp
     */
    void visitNegationLogical(Negation exp);

    /**
     * Visitor class for Conjunction
     *
     * @param exp
     */
    void visitConjunctionLogical(Conjunction exp);

    /**
     * Visitor class for BooleanConstant
     *
     * @param exp
     */
    void visitBooleanConstant(BooleanConstant exp);

    /**
     * Visitor class for BooleanVariable
     *
     * @param exp
     */
    void visitBooleanVariable(BooleanVariable exp);

    /**
     * Visitor class for PrecondStatement
     *
     * @param exp
     */
    void visitPrecondStatement(PrecondStatement exp);

    /**
     * Visitor class for PostcondStatement
     *
     * @param exp
     */
    void visitPostcondStatement(PostcondStatement exp);

    /**
     * Visitor class for MultiAssignment
     *
     * @param exp
     */
    void visitMultipleAssignments(MultiAssignment exp);

    /**
     * Visitor class for FunctionCall
     *
     * @param exp
     */
    void visitFunctionCall(FunctionCall functionCall);

    /**
     * Visitor class for Loop
     *
     * @param exp
     */
    void visitLoop(Loop exp);

    /**
     * Visitor class for ForAll
     *
     * @param exp
     */
    void visitForAll(ForAll exp);

    /**
     * Visitor class for ForSome
     *
     * @param exp
     */
    void visitForSome(ForSome exp);

    /**
     * Visitor class for Each
     *
     * @param exp
     */
    void visitEach(Each exp);

    /**
     * Visitor class for AddToArray
     *
     * @param exp
     */
    void visitAddToArray(AddToArray exp);

    /**
     * Visitor class for RemoveFromArray
     *
     * @param exp
     */
    void visitRemoveFromArray(RemoveFromArray exp);

    /**
     * Visitor class for Array
     *
     * @param exp
     */
    void visitArray(Array exp);
}
