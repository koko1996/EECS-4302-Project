package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class GreaterThanOrEqual extends Relational {

	public GreaterThanOrEqual(Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}
