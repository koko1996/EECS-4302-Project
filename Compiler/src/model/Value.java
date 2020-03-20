package model;

import model.statement.assignment.Expression;

public class Value {
    public Expression value;
    public String type;

    public Value(Expression value, String type) {
        this.value = value;
        this.type = type;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public String getType() {
        return type.substring(0, 1).toUpperCase() + type.substring(1);
    }

    public void setType(String type) {
        this.type = type;
    }
}
