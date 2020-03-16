package model.statement.assignment.expression.relational;

import model.Instruction;
import model.statement.assignment.expression.Relational;

public class Inequality extends Relational {

    public Inequality(Instruction left, Instruction right) {
        super(left, right);
    }

}
