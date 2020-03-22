package model.statement.conditional;

import model.Statement;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Logical;

import java.util.Map;

public class PostcondStatement extends Statement {

    private Logical logicalCondition;

    public Expression getLogicalCondition() {
        return logicalCondition;
    }

    public void setLogicalCondition(Logical logicalCondition) {
        this.logicalCondition = logicalCondition;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitPostcondStatement(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        return logicalCondition.getVariables();
    }
}
