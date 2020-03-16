package model.statement.assignment.expression.relational;

import model.Instruction;
import model.statement.assignment.expression.Relational;

public class LessThan extends Relational {

    public LessThan(Instruction left, Instruction right) {
        super(left, right);
    }

}
