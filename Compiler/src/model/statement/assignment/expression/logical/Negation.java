package model.statement.assignment.expression.logical;

import java.util.HashMap;
import java.util.Map;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Logical;
import model.values.Value;


public class Negation extends Logical {
    private Instruction expr;

    /*
     * Constructor
     *
     * @param expr the underlying expression
     */
    public Negation(Instruction expr) {
        this.expr = expr;
    }

    /*
     * retrieve the underlying expression
     *
     * @return the underlying expression (without the negation)
     */
    public Instruction getExpression() {
        return this.expr;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNegationLogical(this);
    }

	@Override
	public Map<String, Value> getVariables() {
        return new HashMap<>(this.expr.getVariables());
	}
	
    @Override
	public Expression clone() {
		return new Negation(((Expression) expr).clone());
	}
}
