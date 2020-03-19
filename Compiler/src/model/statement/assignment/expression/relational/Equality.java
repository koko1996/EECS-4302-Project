package model.statement.assignment.expression.relational;

import java.util.HashMap;
import java.util.Map;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.expression.Relational;

public class Equality extends Relational {

    public Equality(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEqualityRelational(this);
    }

}