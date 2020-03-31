package model.statement.assignment.expression.array;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;

import java.util.HashMap;
import java.util.Map;

public class ForSome extends ArrayComposite {

    public ForSome(Instruction array, Instruction inside) {
        super(array, inside);
    }

    @Override //TODO
    public Expression clone() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForSome(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        result.putAll(this.array.getVariables());
        result.putAll(this.inside.getVariables());
        return result;
    }
}
