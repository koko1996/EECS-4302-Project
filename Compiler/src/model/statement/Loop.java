package model.statement;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loop extends Statement {

    private Instruction precondition;
    private Instruction postcondition;
    private Instruction exitCondition;
    private Instruction loopInvariant;
    private Instruction loopVariant;
    private Instruction assignments;
    private Instruction initAssignments;

    public Loop(Instruction precondition, Instruction postcondition, Instruction exitCondition, Instruction loopInvariant, Instruction loopVariant, Instruction assignments, List<Instruction> initAssignments) {
        this.precondition = precondition;
        this.postcondition = postcondition;
        this.exitCondition = exitCondition;
        this.loopInvariant = loopInvariant;
        this.loopVariant = loopVariant;
        this.assignments = assignments;
        this.initAssignments = new MultiAssignment(initAssignments);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitLoop(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        Arrays.asList(precondition, postcondition, exitCondition, loopInvariant, loopVariant, assignments, initAssignments).forEach(each -> result.putAll(each.getVariables()));
        return result;
    }

    public Instruction getAssignments() {
        return assignments;
    }

    public Instruction getPreCond() {
        return precondition;
    }

    public Instruction getPostCond() {
        return postcondition;
    }

    public Instruction getExitCond() {
        return exitCondition;
    }

    public Instruction getLoopInvariant() {
        return loopInvariant;
    }

    public Instruction getLoopVariant() {
        return loopVariant;
    }

    public Instruction getInitAssignments() {
        return initAssignments;
    }
}
