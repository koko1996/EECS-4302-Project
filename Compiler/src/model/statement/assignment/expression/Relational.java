package model.statement.assignment.expression;

import model.statement.assignment.Expression;

public abstract class Relational extends Expression {
	protected Arithmetic left;
	protected Arithmetic right;

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public Relational(Arithmetic left, Arithmetic right) {
		this.left = left;
		this.right = right;
	}

	/*
	 * getter for the left expression
	 * 
	 * @return Expression representing the left expression
	 */
	public Arithmetic getLeftExpr() {
		return this.left;
	}

	/*
	 * getter for the left expression
	 * 
	 * @return Expression representing the left expression
	 */
	public Arithmetic getRightExpr() {
		return this.right;
	}

}
