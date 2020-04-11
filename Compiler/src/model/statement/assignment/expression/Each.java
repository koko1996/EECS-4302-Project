package model.statement.assignment.expression;

import model.values.Value;
import model.Visitor;
import model.statement.assignment.Expression;

import java.util.HashMap;
import java.util.Map;

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