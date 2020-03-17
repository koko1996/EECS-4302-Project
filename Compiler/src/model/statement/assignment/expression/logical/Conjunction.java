package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;

/*
 * Conjunction Class that represents conjunction expression
 */
public class Conjunction extends LogicalComposite {
	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the left expression
	 */
	public Conjunction(Logical left, Logical right) {
		super(left, right);
	}
}
