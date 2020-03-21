package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Logical;

import java.util.HashMap;
import java.util.Map;

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
        return new HashMap<>(this.expr.getVariables());
	}
	
	@Override
	public Expression clone() {
		return new BooleanRelation(((Expression) expr).clone());
	}
}
