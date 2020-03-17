package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;


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
	public Implication(Logical left, Logical right) {
		super(left, right);
	}

}
