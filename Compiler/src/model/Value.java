package model;

import model.statement.assignment.Expression;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private String type;
	private boolean isArray;
    protected List<Expression> value;

    public Value(Value other) {
        this.isArray = other.isArray;
        this.value = new ArrayList<>();
        this.type = other.type;
        other.value.forEach(each -> this.value.add(each.clone()));
    }
    
    public Value(Expression value, String type) {
        this.value = new ArrayList<>();
        this.type = type;
        this.value.add(value);
        this.isArray = false;
    }

    public Value(List<Expression> value, String type) {
        this.value = new ArrayList<>();
        this.type = type;
        this.value = value;
        this.isArray = true;
    }

    public Expression getValue() {
        if (this.isArray) {
            throw new IllegalStateException("This is an array! Perhaps you meant getValues()?");
        } else {
            return this.value.get(0);
        }
    }

    public void setValue(Expression value) {
        if (this.isArray) {
            throw new IllegalStateException("This is an array! Perhaps you meant getValues()?");
        } else {
            this.value.add(value);
        }
    }

    public List<Expression> getValues() {
        if (!this.isArray) {
            throw new IllegalStateException("This is not an array! Perhaps you meant getValue()?");
        } else {
            return this.value;
        }
    }

    public void setValues(List<Expression> value) {
        if (!this.isArray) {
            throw new IllegalStateException("This is not an array! Perhaps you meant getValue()?");
        } else {
            this.value = value;
        }
    }

    public String getType() {
        return type.substring(0, 1).toUpperCase() + type.substring(1) + (this.isArray ? "[]" : "");
    }

    public String getPrimitiveType() {
        return type.substring(0, 1).toUpperCase() + type.substring(1);
    }

    public String getAlloyType() {
        return (this.isArray() ? "seq " : "") + this.getPrimitiveType();
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isArray() {
        return isArray;
    }

    public void addValue(Expression value) {
        if (!this.isArray) {
            throw new IllegalStateException("This is not an array!");
        } else {
            this.value.add(value);
        }

    }
}
