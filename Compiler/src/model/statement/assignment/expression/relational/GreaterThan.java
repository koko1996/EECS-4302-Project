package model.statement.assignment.expression.relational;

import model.Instruction;
import model.statement.assignment.expression.Relational;

public class GreaterThan extends Relational {

    public GreaterThan(Instruction left, Instruction right) {
        super(left, right);
    }

}
