package model.statement.assignment.expression.lambda;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Lambda;

import java.util.Map;

public class ForAll extends Lambda {

    public ForAll (Instruction lambdaStatement) {
        super((Expression) lambdaStatement);
    }

    @Override //TODO
    public Expression clone() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForAllLambda(this);
    }

    @Override //TODO
    public Map<String, Value> getVariables() {
        return null;
    }
}
