package model;

import java.util.ArrayList;
import java.util.List;

import model.statement.assignment.expression.FunctionConditional;
import model.statement.conditional.AssertedConditional;

/*
 * ExpressionProcessor class to process given expression
 */
public class InstructionProcessor {
	private List<Instruction> instructions; // list of statements

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public InstructionProcessor(List<Instruction> instructions, List<String> vars) {
		this.instructions = instructions;
	}


	/*
	 * calculates and returns list representing the evaluation results
	 */
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<String>();
		Translator tr = new Translator();
		for (Instruction inst : instructions) {
			if(inst instanceof AssertedConditional){
				inst.accept(tr);
				evaluations.add(tr.getFinalResult());				
		 	} else if (inst instanceof FunctionConditional) {
				inst.accept(tr);
				evaluations.add(tr.getFinalResult());		 		
		 	}
		}
		return evaluations;
	}

}
