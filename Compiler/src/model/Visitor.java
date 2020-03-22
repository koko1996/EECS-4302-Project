package model;

import model.statement.MultiAssignment;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.*;

public interface Visitor {

    void visitConditionalAssertionStatement(AssertedConditional exp); 

    void visitIfConditional(IfElseIfStatement exp);
    
    void visitElseIfConditional(ElseIfStatement exp);

    void visitAssignExpression(ExpressionAssignment exp);

//    void visitRelationalOperation(Relational exp);

//    void visitLogicalOpteration(Logical exp);

    void visitParanthesesExpression(ParanthesesExpression exp);

    void visitDivisionArithmetic(Division exp);

    void visitModuloArithmetic(Modulo exp);

    void visitMultiplicationArithmetic(Multiplication exp);

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

    void visitEquivalenceLogical(Equivalence exp);

    void visitNegationLogical(Negation exp);

    void visitConjunctionLogical(Conjunction exp);

    void visitBooleanConstant(BooleanConstant exp);

    void visitBooleanVariable(BooleanVariable exp);

    void visitPrecondStatement(PrecondStatement exp);

    void visitPostcondStatement(PostcondStatement exp);

    void visitMultipleAssignments(MultiAssignment exp);

//    void visitAssignAssignment(Instruction exp); 
//
//    void visitArithmeticOperation(Instruction exp); 
//	
//    void visitVariableArithmetic(Instruction exp); 
//	
//    void visitVariableLogical(Instruction exp); 
//	
//	void visitRelationalOpLogical(Instruction exp); 
//	
//    void visitNegationIntegerConstant(IntegerConstant exp); 
}
