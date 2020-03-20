package model;


import model.statement.assignment.Expression;
import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.logical.BooleanConstant;

import java.util.HashMap;
import java.util.Map;

public class Values {
    private static Values singletonInstance;
    private Map<String, Value> values;

    private Values() {
        this.values = new HashMap<>();
    }

    public static Values getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Values();
        }
        return singletonInstance;
    }

    public Value getValue(String id) {
        if (this.values.containsKey(id)) {
            return this.values.get(id);
        } else {
            throw new IllegalStateException(String.format("Variable %s is not declared yet!", id));
        }
    }

    public boolean containsKey(String id) {
        return this.values.containsKey(id);
    }

    public void put(String id, Expression value) {
        while (value instanceof ParanthesesExpression) {
            value = ((ParanthesesExpression) value).getExpression();
        }

        if (value instanceof BooleanConstant | value instanceof Relational | value instanceof Logical) {
            values.put(id, new Value(value, "Bool"));
        } else if (value instanceof IntegerConstant | value instanceof Arithmetic) {
            values.put(id, new Value(value, "Int"));
        } else {
            throw new IllegalArgumentException("You probably should not get this exception.");
        }
    }

    public String getType(String id) {
        return this.values.get(id).getType();
    }

    public void declareVariable(String id, String type) {
        this.values.put(id, new Value(null, type));
    }


}
