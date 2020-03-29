package model.statement.assignment.expression;

import model.statement.assignment.Expression;

public abstract class Lambda extends Expression{
    public Expression lambdaStatement;

    public Lambda (Expression lambdaStatement) {
        this.lambdaStatement = lambdaStatement;
    }

}
