package model;

import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;

public class Evaluator implements Visitor {

    public Instruction result;

    public static int getIntVal(Evaluator child) {
        IntegerConstant childCasted = (IntegerConstant) child.result;
        return childCasted.getValue();
    }

    public static boolean getBoolVal(Evaluator child) {
        BooleanConstant childCasted = (BooleanConstant) child.result;
        return childCasted.getValue();
    }

    @Override
    public void visitConditionalAssertionStatement(Instruction exp) {
        //TODO
    }

    @Override
    public void visitIfConditional(Instruction exp) {
        //TODO
    }

    @Override
    public void visitElseIfConditional(Instruction exp) {
        //TODO
    }

    @Override
    public void visitElseConditional(Instruction exp) {
        //TODO
    }

    @Override
    public void visitEpsilonConditional(Instruction exp) {
        //TODO
    }

    @Override
    public void visitMultipleAssignments(Instruction exp) {
        //TODO
    }

    @Override
    public void visitAssignExpression(Instruction exp) {
        //TODO
    }

    @Override
    public void visitAssignAssignment(Instruction exp) {
        //TODO
    }

    @Override
    public void visitArithmeticOperation(Instruction exp) {
        //TODO
    }

    @Override
    public void visitRelationalOperation(Relational exp) {
        //TODO
    }

    @Override
    public void visitLogicalOpteration(Logical exp) {
        //TODO
    }

    @Override
    public void visitParanthesesExpression(Instruction exp) {
        //TODO
    }

    @Override
    public void visitDivisionArithmetic(Division exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new IntegerConstant(getIntVal(evalLeft) / getIntVal(evalRight));
    }

    @Override
    public void visitVariableArithmetic(Instruction exp) {
        //TODO
    }

    @Override
    public void visitModuloArithmetic(Modulo exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new IntegerConstant(getIntVal(evalLeft) % getIntVal(evalRight));
    }

    @Override
    public void visitMultiplicationArithmetic(Multiplication exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new IntegerConstant(getIntVal(evalLeft) * getIntVal(evalRight));
    }

    @Override
    public void visitNegationIntegerConstant(Instruction exp) {
        //TODO
    }

    @Override
    public void visitAdditionArithmetic(Addition exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new IntegerConstant(getIntVal(evalLeft) + getIntVal(evalRight));
    }

    @Override
    public void visitSubtractionArithmetic(Subtraction exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new IntegerConstant(getIntVal(evalLeft) - getIntVal(evalRight));
    }

    @Override
    public void visitIntegerConstant(IntegerConstant exp) {
        result = exp;
    }

    @Override
    public void visitLessRelational(LessThan exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) < getIntVal(evalRight));
    }

    @Override
    public void visitLessEqualRelational(LessThanOrEqual exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) <= getIntVal(evalRight));
    }

    @Override
    public void visitGreaterRelational(GreaterThan exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) > getIntVal(evalRight));
    }

    @Override
    public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) >= getIntVal(evalRight));
    }

    @Override
    public void visitEqualityRelational(Equality exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) == getIntVal(evalRight));
    }

    @Override
    public void visitInequivalenceRelational(Inequality exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getIntVal(evalLeft) != getIntVal(evalRight));
    }

    @Override
    public void visitDisjunctionLogical(Disjunction exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getBoolVal(evalLeft) && getBoolVal(evalRight));
    }

    @Override
    public void visitImplicationLogical(Implication exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getBoolVal(evalLeft) && getBoolVal(evalRight));
    }

    @Override
    public void visitVariableLogical(Instruction exp) {

    }

    @Override
    public void visitEquivalenceLogical(Equivalence exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getBoolVal(evalLeft) == getBoolVal(evalRight));
    }

    @Override
    public void visitNegationLogical(Negation exp) {
        Evaluator eval = new Evaluator();

        exp.getExpression().accept(eval);

        result = new BooleanConstant(!getBoolVal(eval));
    }

    @Override
    public void visitConjunctionLogical(Conjunction exp) {
        Evaluator evalLeft = new Evaluator();
        Evaluator evalRight = new Evaluator();

        exp.getLeftExpr().accept(evalLeft);
        exp.getRightExpr().accept(evalRight);

        result = new BooleanConstant(getBoolVal(evalLeft) && getBoolVal(evalRight));
    }

    @Override
    public void visitBooleanConstant(BooleanConstant exp) {
        result = exp;
    }

    @Override
    public void visitRelationalOpLogical(Instruction exp) {
        //TODO
    }
}
