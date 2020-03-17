package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;

/*
 * Disjunction Class that represents disjunction expression
 */
public class Disjunction extends LogicalComposite {

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the left expression
	 */
	public Disjunction(Logical left, Logical right) {
		super(left, right);
	}


}
