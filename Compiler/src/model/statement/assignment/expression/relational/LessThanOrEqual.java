package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class LessThanOrEqual extends Relational{

	public LessThanOrEqual(Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}
