package model.statement.assignment.expression.arithmetic;

import model.Visitor;
import model.statement.assignment.expression.Arithmetic;

public class IntegerConstant extends Arithmetic {
	private int value;

	/*
	 * Constructor
	 * 
	 * @param value the assigned value of the variable in the expression
	 */
	public IntegerConstant(int value) {
		this.value = value;
	}


    /*
     * retrieve the value of the variable expression
     *
     * @return retrieve the value of the variable expression
     */
    public int getValue() {
        return this.value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitIntegerConstant(this);
    }
}

