package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;


public class Negation extends Logical{
	private Logical expr;

	/*
	 * Constructor
	 * 
	 * @param expr the underlying expression
	 */
	public Negation(Logical expr) {
		this.expr = expr;
	}

	/*
	 * retrieve the underlying expression
	 * 
	 * @return the underlying expression (without the negation)
	 */
	public Logical getExpression() {
		return this.expr;
	}

}
