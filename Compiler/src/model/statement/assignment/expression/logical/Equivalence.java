package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

/*
 * Equivalence Class that represents equivalence expression
 */
public class Equivalence extends LogicalComposite {
    /*
     * Constructor
     *
     * @param left the left expression
     * @param right the right expression
     */
    public Equivalence(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEquivalenceLogical(this);
    }
    
    @Override
	public Expression clone() {
		return new Equivalence(((Expression) left).clone(),((Expression) right).clone());
	}

}
