package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class Equality extends Relational{

	public Equality (Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}