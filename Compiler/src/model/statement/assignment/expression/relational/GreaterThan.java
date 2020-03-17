package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class GreaterThan extends Relational {

	public GreaterThan (Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}
