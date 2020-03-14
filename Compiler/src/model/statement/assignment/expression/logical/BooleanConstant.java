package model.statement.assignment.expression.logical;
import model.statement.assignment.expression.Logical;

public class BooleanConstant extends Logical{
	private boolean value;

	/*
	 * Constructor
	 * 
	 * @param value the assigned value of the variable in the expression
	 */
	public BooleanConstant(boolean value) {
		this.value = value;
	}


	/*
	 * retrieve the value of the variable expression
	 * 
	 * @return retrieve the value of the variable expression
	 */
	public boolean getValue() {
		return this.value;
	}

}
