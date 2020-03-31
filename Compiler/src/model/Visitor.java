package model;

import model.statement.MultiAssignment;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.FunctionCall;
import model.statement.assignment.expression.FunctionConditional;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.Addition;
import model.statement.assignment.expression.arithmetic.Division;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.arithmetic.IntegerVariable;
import model.statement.assignment.expression.arithmetic.Modulo;
import model.statement.assignment.expression.arithmetic.Multiplication;
import model.statement.assignment.expression.arithmetic.Subtraction;
import model.statement.assignment.expression.logical.BooleanConstant;
import model.statement.assignment.expression.logical.BooleanVariable;
import model.statement.assignment.expression.logical.Conjunction;
import model.statement.assignment.expression.logical.Disjunction;
import model.statement.assignment.expression.logical.Equivalence;
import model.statement.assignment.expression.logical.Implication;
import model.statement.assignment.expression.logical.Negation;
import model.statement.assignment.expression.relational.Equality;
import model.statement.assignment.expression.relational.GreaterThan;
import model.statement.assignment.expression.relational.GreaterThanOrEqual;
import model.statement.assignment.expression.relational.Inequality;
import model.statement.assignment.expression.relational.LessThan;
import model.statement.assignment.expression.relational.LessThanOrEqual;
import model.statement.conditional.AssertedConditional;
import model.statement.conditional.ElseIfStatement;
import model.statement.conditional.IfElseIfStatement;
import model.statement.conditional.PostcondStatement;
import model.statement.conditional.PrecondStatement;

public interface Visitor {
	void visitFucntionConditional(FunctionConditional exp);
	
    void visitConditionalAssertionStatement(AssertedConditional exp); 

    void visitIfConditional(IfElseIfStatement exp);
    
    void visitElseIfConditional(ElseIfStatement exp);

    void visitAssignExpression(ExpressionAssignment exp); 

    void visitAssignAssignment(Instruction exp); //TODO

    void visitArithmeticOperation(Instruction exp); //?

    void visitRelationalOperation(Relational exp);

    void visitLogicalOpteration(Logical exp);

    void visitParanthesesExpression(ParanthesesExpression exp);

    void visitDivisionArithmetic(Division exp);

    void visitVariableArithmetic(Instruction exp); //?

    void visitModuloArithmetic(Modulo exp);

    void visitMultiplicationArithmetic(Multiplication exp);

    void visitNegationIntegerConstant(IntegerConstant exp); // SHOULDNT EXIST

    void visitAdditionArithmetic(Addition exp);

    void visitSubtractionArithmetic(Subtraction exp);

    void visitIntegerConstant(IntegerConstant exp);

    void visitIntegerVariable(IntegerVariable exp);
    
    void visitLessRelational(LessThan exp);

    void visitLessEqualRelational(LessThanOrEqual exp);

    void visitGreaterRelational(GreaterThan exp);

    void visitGreaterEqualRelational(GreaterThanOrEqual exp);

    void visitEqualityRelational(Equality exp);

    void visitInequivalenceRelational(Inequality exp);

    void visitDisjunctionLogical(Disjunction exp);

    void visitImplicationLogical(Implication exp);

    void visitVariableLogical(Instruction exp); //TODO

    void visitEquivalenceLogical(Equivalence exp);

    void visitNegationLogical(Negation exp);

    void visitConjunctionLogical(Conjunction exp);

    void visitBooleanConstant(BooleanConstant exp);
    
    void visitBooleanVariable(BooleanVariable exp);

    void visitRelationalOpLogical(Instruction exp); //TODO

    void visitPrecondStatement(PrecondStatement exp);

    void visitPostcondStatement(PostcondStatement exp);

	void visitMultipleAssignments(MultiAssignment exp);

	void visitFunctionCall(FunctionCall functionCall);
}
