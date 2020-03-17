package model.statement.assignment.expression.logical;
import model.Visitor;
import model.statement.assignment.expression.Logical;

public class BooleanVariable extends Logical{
	private String id;
	private boolean value;

	/*
	 * Constructor
	 * 
	 * @param id the id of the variable in the expression
	 * 
	 * @param value the assigned value of the variable in the expression
	 */
	public BooleanVariable(String id, boolean value) {
		this.id = id;
		this.value = value;
	}

	/*
	 * retrieve the id of the variable expression
	 * 
	 * @return retrieve the id of the variable expression
	 */
	public String getID() {
		return this.id;
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
        //TODO
    }
}
