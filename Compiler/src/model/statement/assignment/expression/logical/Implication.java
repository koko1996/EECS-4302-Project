package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;


/*
 * Implication Class that represents implication expression
 */
public class Implication extends LogicalComposite {

    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the left expression
     */
    public Implication(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImplicationLogical(this);
    }
    
    @Override
	public Expression clone() {
		return new Implication(((Expression) left).clone(),((Expression) right).clone());
	}
}
