package model.statement.assignment.expression.arithmetic;

import java.util.HashMap;
import java.util.Map;

import model.Instruction;
import model.Value;
import model.Visitor;

public class Addition extends ArithmeticComposite {

	public Addition(Instruction left, Instruction right) {
		super(left, right);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAdditionArithmetic(this);
	}

}