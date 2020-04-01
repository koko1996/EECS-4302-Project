package model.statement.assignment.expression.array;

import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.ArrayOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array extends ArrayOperations {
    private String id;
    private String type;
    private List<Expression> value;

    public Array(String id, String type, List<Expression> value) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public String getID() {
        return id;
    }

    public List<Expression> getValue() {
        return value;
    }

    @Override
    public Expression clone() {
        List<Expression> clonedExpressions = new ArrayList<>();
        value.forEach(each -> clonedExpressions.add(each.clone()));
        return new Array(id, type, clonedExpressions);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitArray(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        value.forEach(each -> result.putAll(each.getVariables()));
        Value val = new Value(value, type);
        result.put(id, val);
        return result;
    }
}
