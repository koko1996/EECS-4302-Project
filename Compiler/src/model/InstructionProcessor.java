package model;

import java.util.ArrayList;
import java.util.List;

/*
 * ExpressionProcessor class to process given expression
 */
public class InstructionProcessor {
	private List<Instruction> instructions; // list of statements
	private List<String> vars; // list of variables

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public InstructionProcessor(List<Instruction> instructions, List<String> vars) {
		this.instructions = instructions;
		this.vars = vars;
	}


	/*
	 * calculates and returns list representing the evaluation results
	 */
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<String>();
		for (Instruction inst : instructions) {
			evaluations.add(inst.toString());
		}
		return evaluations;
	}

}
