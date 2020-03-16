package model.statement.assignment.expression.relational;

import model.Instruction;
import model.statement.assignment.expression.Relational;

public class Equality extends Relational {

    public Equality(Instruction left, Instruction right) {
        super(left, right);
    }

}