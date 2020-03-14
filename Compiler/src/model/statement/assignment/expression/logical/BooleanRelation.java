package model.statement.assignment.expression.logical;

import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.Relational;

public class BooleanRelation extends Logical {
	private Relational expr;

	/*
	 * Constructor
	 * 
	 * @param value the assigned value of the variable in the expression
	 */
	public BooleanRelation(Relational expr) {
		this.expr = expr;
	}

	/*
	 * retrieve the value of the variable expression
	 * 
	 * @return retrieve the value of the variable expression
	 */
	public Relational getValue() {
		return this.expr;
	}

}
