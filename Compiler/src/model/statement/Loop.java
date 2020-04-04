package model.statement;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Loop extends Statement {

    private Instruction precondition;
    private Instruction postcondition;
    private Instruction exitCondition;
    private Instruction loopInvariant;
    private Instruction loopVariant;

    public Loop(Instruction precondition, Instruction postcondition, Instruction exitCondition, Instruction loopInvariant, Instruction loopVariant) {
        this.precondition = precondition;
        this.postcondition = postcondition;
        this.exitCondition = exitCondition;
        this.loopInvariant = loopInvariant;
        this.loopVariant = loopVariant;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitLoop(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        Arrays.asList(precondition, postcondition, exitCondition, loopInvariant, loopVariant).forEach(each -> result.putAll(each.getVariables()));
        return result;
    }
}
