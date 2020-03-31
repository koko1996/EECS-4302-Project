package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.values.Value;
import model.Visitor;

import java.util.Map;

public class PrecondStatement extends Statement {

    private Instruction logicalCondition; // See if we can restrict the static type here TODO

    public Instruction getLogicalCondition() {
        return logicalCondition;
    }

    public void setLogicalCondition(Instruction logicalCondition) {
        this.logicalCondition = logicalCondition;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitPrecondStatement(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        return logicalCondition.getVariables();
    }
}