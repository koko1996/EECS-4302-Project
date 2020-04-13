package model;

import model.statement.Loop;
import model.statement.assignment.expression.FunctionConditional;
import model.statement.conditional.AssertedConditional;

import java.util.ArrayList;
import java.util.List;

/*
 * ExpressionProcessor class to process given expression
 */
public class InstructionProcessor {
	private List<Instruction> instructions; // list of statements

	/**
	 * Constructor
	 *
	 * @param instructions,
	 * @param vars
	 */
	public InstructionProcessor(List<Instruction> instructions, List<String> vars) {
		this.instructions = instructions;
	}


	/**
	 * calculates and returns list representing the evaluation results
	 */
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<String>();
		Translator tr = new Translator();
		for (Instruction inst : instructions) {
			if (inst instanceof AssertedConditional) {
				inst.accept(tr);
				evaluations.add(tr.getFinalResult());
			} else if (inst instanceof FunctionConditional) {
				inst.accept(tr);
				evaluations.add(tr.getFinalResult());
			} else if (inst instanceof Loop) {
				inst.accept(tr);
				evaluations.add(tr.getFinalResult());
			}
		}
		return evaluations;
	}

}
