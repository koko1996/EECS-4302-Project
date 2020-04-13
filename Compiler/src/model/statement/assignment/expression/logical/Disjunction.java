package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

/*
 * Disjunction Class that represents disjunction expression
 */
public class Disjunction extends LogicalComposite {

    /*
     * Constructor
     *
     * @param left the left expression
     * @param right the left expression
     */
    public Disjunction(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDisjunctionLogical(this);
    }
    
    @Override
	public Expression clone() {
		return new Disjunction(((Expression) left).clone(),((Expression) right).clone());
	}
}
