package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;


public class LogicalComposite extends Logical{
	protected Logical left;
	protected Logical right;

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public LogicalComposite(Logical left, Logical right) {
		this.left = left;
		this.right = right;
	}

	/*
	 * getter for the left expression
	 * 
	 * @return Expression representing the left expression
	 */
	public Logical getLeftExpr() {
		return this.left;
	}

	/*
	 * getter for the left expression
	 * 
	 * @return Expression representing the left expression
	 */
	public Logical getRightExpr() {
		return this.right;
	}

}
