package model.statement.assignment.expression.logical;
import java.util.HashMap;
import java.util.Map;

import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBooleanConstant(this);
    }


	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		return result;
	}


	@Override
	public Expression clone() {
		return new BooleanConstant(value);
	}
}
