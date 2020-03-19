package model.statement.assignment.expression.logical;

import java.util.HashMap;
import java.util.Map;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.expression.Logical;

public class BooleanRelation extends Logical {
    private Instruction expr;

    /*
     * Constructor
     *
     * @param value the assigned value of the variable in the expression
     */
    public BooleanRelation(Instruction expr) {
        this.expr = expr;
    }

    /*
     * retrieve the value of the variable expression
     *
     * @return retrieve the value of the variable expression
     */
    public Instruction getValue() {
        return this.expr;
    }

    @Override
    public void accept(Visitor visitor) {
//        visitor.visitBooleanRelation(this);  // TODO
    }

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		result.putAll(this.expr.getVariables());
		return result;
	}
}
