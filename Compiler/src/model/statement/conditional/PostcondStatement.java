package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.Map;

/**
 * A class for Postconditions.
 */
public class PostcondStatement extends Statement {

    private Instruction logicalCondition; // A logical statement for the postcondition

    /**
     * Getter for logicalCondition
     *
     * @return
     */
    public Instruction getLogicalCondition() {
        return logicalCondition;
    }

    /**
     * Setter for logicalCondition
     *
     * @param logicalCondition
     */
    public void setLogicalCondition(Instruction logicalCondition) {
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
