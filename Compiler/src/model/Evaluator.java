package model;

import model.statement.MultiAssignment;
import model.statement.assignment.ExpressionAssignment;
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
import model.statement.conditional.IfElseIfStatement;
import model.statement.conditional.PostcondStatement;
import model.statement.conditional.PrecondStatement;

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
    public void visitAssignExpression(ExpressionAssignment exp) {
        Values values = Values.getInstance();
        String lhsID = exp.getID();

        Evaluator ev = new Evaluator();
        exp.getExpr().accept(ev);

        if (!values.containsKey(lhsID)) {
            // Value doesnt exist semantic errors
        }

        String lhsType = values.getType(lhsID);
        if (ev.result instanceof IntegerConstant) {
            int value = ((IntegerConstant) ev.result).getValue();
            // type check
        } else if (ev.result instanceof BooleanConstant) {
            boolean value = ((BooleanConstant) ev.result).getValue();
            // type check
        }

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
	public void visitConditionalAssertionStatement(AssertedConditional exp) {
		
	}

	@Override
	public void visitIfConditional(IfElseIfStatement exp) {		
	}

	@Override
	public void visitEpsilonConditional(Instruction exp) {
	}

	@Override
	public void visitAssignAssignment(Instruction exp) {
	}

	@Override
	public void visitArithmeticOperation(Instruction exp) {
		
	}

	@Override
	public void visitRelationalOperation(Relational exp) {
		// TODO 
		
	}

	@Override
	public void visitLogicalOpteration(Logical exp) {
		// TODO 
		
	}

	@Override
	public void visitParanthesesExpression(ParanthesesExpression exp) {
		// TODO 
		
	}

	@Override
	public void visitVariableArithmetic(Instruction exp) {
		// TODO 
		
	}

	@Override
	public void visitNegationIntegerConstant(IntegerConstant exp) {
		// TODO 
		
	}

	@Override
	public void visitIntegerVariable(IntegerVariable exp) {
		// TODO 
		
	}

	@Override
	public void visitVariableLogical(Instruction exp) {
		// TODO 
		
	}

	@Override
	public void visitRelationalOpLogical(Instruction exp) {
		// TODO 
		
	}

	@Override
	public void visitPrecondStatement(PrecondStatement exp) { 
		
	}

	@Override
	public void visitPostcondStatement(PostcondStatement exp) {
		
	}

	@Override
	public void visitMultipleAssignments(MultiAssignment exp) {
	}

}
