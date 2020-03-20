package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Value;
import model.Visitor;
import model.statement.MultiAssignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IfElseIfStatement extends Statement {
	private Instruction logicalCondition;
	private Instruction assignments;
	private List<IfElseIfStatement> elseIfStatments;
	private IfElseIfStatement elseStatment;


	public IfElseIfStatement(Instruction condition, Instruction assignments, List<IfElseIfStatement> elseIfStatments,IfElseIfStatement elseStatment ) {
		this.logicalCondition = condition;
		this.assignments = assignments;
		this.elseIfStatments = elseIfStatments;
		this.elseStatment = elseStatment;
	}

	/**
	 * @return the logicalCondition
	 */
	public Instruction getCondition() {
		return logicalCondition;
	}

	/**
	 * @return the assignments
	 */
	public Instruction getAssignments() {
		return assignments;
	}

	/**
	 * @return the elseIfStatments
	 */
	public List<IfElseIfStatement> getElseIfStatments() {
		return elseIfStatments;
    }


    /**
     * @return the elseStatment
     */
    public IfElseIfStatement getElseStatment() {
        return elseStatment;
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		MultiAssignment assignments = (MultiAssignment) this.assignments;
		assignments.getAssignments().forEach(each -> sb.append("\n\t").append(each));
		sb.append("else");
		sb.append(elseStatment);
		return sb.toString();
	}

	@Override
	public void accept(Visitor visitor) {
        visitor.visitIfConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> logicalConditionVars = logicalCondition.getVariables();
        System.out.println("logicalConditionVars "+logicalConditionVars.size());
        System.out.println("logicalConditionVars "+logicalConditionVars.toString());
		Map<String, Value> assignmentsVars = assignments.getVariables();
        System.out.println("assignmentsVars "+assignmentsVars.size());
        System.out.println("assignmentsVars "+assignmentsVars.toString());
		Map<String, Value> ifElseIfVars = new HashMap<>();
        System.out.println("ifElseIfVars "+ifElseIfVars.size());
        System.out.println("ifElseIfVars "+ifElseIfVars.toString());
		elseIfStatments.forEach(each -> ifElseIfVars.putAll(each.getVariables()));
		Map<String, Value> elseVars =new HashMap<>();
		if (elseStatment != null){
			elseVars = elseStatment.getVariables();	
		}
		
		return this.combineVariables(logicalConditionVars, assignmentsVars, ifElseIfVars, elseVars);
	}

}
