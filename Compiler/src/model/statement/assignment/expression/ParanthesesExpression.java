package model.statement.assignment.expression;

import model.statement.assignment.Expression;

public abstract class ParanthesesExpression extends Expression{
	private Expression expr;

	/*
	 * Constructor
	 * 
	 * @param expr the underlying expression
	 */
	public ParanthesesExpression(Expression expr) {
		this.expr = expr;
	}

	/*
	 * retrieve the underlying expression
	 * 
	 * @return the underlying expression (without the negation)
	 */
	public Expression getExpression() {
		return this.expr;
	}


}
