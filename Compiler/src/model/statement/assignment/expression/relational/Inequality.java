package model.statement.assignment.expression.relational;

import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Relational;

public class Inequality extends Relational{

	public Inequality(Arithmetic left, Arithmetic right) {
		super(left, right);
	}

}
