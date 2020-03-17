package model.statement.assignment.expression.arithmetic;

import model.statement.assignment.expression.Arithmetic;


public class ArithmeticComposite extends Arithmetic{
	protected Arithmetic left;
	protected Arithmetic right;

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public ArithmeticComposite(Arithmetic left, Arithmetic right) {
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
