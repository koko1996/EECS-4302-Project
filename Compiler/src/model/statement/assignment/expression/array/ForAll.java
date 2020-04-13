package model.statement.assignment.expression.array;

import model.Instruction;
import model.Visitor;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

public class ForAll extends ArrayComposite {
    /**
     * Constructor
     *
     * @param array
     * @param inside
     */
    public ForAll(Instruction array, Instruction inside) {
        super(array, inside);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForAll(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        result.putAll(this.array.getVariables());
        result.putAll(this.inside.getVariables());
        return result;
    }
}