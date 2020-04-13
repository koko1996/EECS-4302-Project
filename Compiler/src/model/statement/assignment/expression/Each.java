package model.statement.assignment.expression;

import model.Visitor;
import model.statement.assignment.Expression;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * A class for Each
 */
public class Each extends Expression {
    @Override
    public Expression clone() {
        return new Each();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEach(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        return new HashMap<>();
    }
}