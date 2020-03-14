package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class LessThan extends Relational{

	public LessThan(Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}
