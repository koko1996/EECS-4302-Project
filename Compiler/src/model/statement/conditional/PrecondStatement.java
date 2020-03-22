package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Value;
import model.Visitor;
import model.statement.assignment.expression.Logical;

import java.util.Map;

public class PrecondStatement extends Statement {

    private Logical logicalCondition;

    public Instruction getLogicalCondition() {
        return logicalCondition;
    }

    public void setLogicalCondition(Logical logicalCondition) {
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