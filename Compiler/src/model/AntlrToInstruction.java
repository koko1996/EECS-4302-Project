package model;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import model.declaration.VariableInitialization;
import model.statement.MultiAssignment;
import model.statement.assignment.Expression;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.*;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.array.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.AssertedConditional;
import model.statement.conditional.ElseIfStatement;
import model.statement.conditional.IfElseIfStatement;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToInstruction extends ExprBaseVisitor<Instruction> {
    private Values values; // Symbol table for storing values of
    // variables
    private List<String> semanticErrors; // 1. duplicate declaration 2.
    // reference to undeclared variable
    // Note that semantic errors are different from syntax errors.

    private String oldSyntax;

    private boolean isEnsure;

    private Token arrayToken;


    /*
     * Constructor
     *
     * @param semanticErrors list of semantic errors observed in the input file
     */
    public AntlrToInstruction(List<String> semanticErrors) {
        values = Values.getInstance();
        this.semanticErrors = semanticErrors;
        this.oldSyntax = "_old";
        this.isEnsure = false;
    }

    private boolean checkDefined(String id, int line, int column) {
        if (!values.containsKey(id)) {
            semanticErrors
                    .add("Error: variable " + id + " has not been declared (line:" + line + ", column:" + column + ")");
            return false;
        }
        return true;
    }

    private boolean checkDefined(String id, String type, int line, int column) {
        if (!values.containsKey(id)) {
            semanticErrors.add("Error: variable " + id + " of type " + type + " has not been declared yet (line:" + line
                    + ", column:" + column + ")");
            return false;
        }
        return true;
    }

    private boolean checkNotDefined(String id, int line, int column) {
        if (values.containsKey(id)) {
            semanticErrors.add(
                    "Error: variable " + id + " has already been declared (line:" + line + ", column:" + column + ")");
            return false;
        }
        return true;
    }

    private boolean checkNotOLD(String id, int line, int column) {
        if (id.contains(this.oldSyntax)) {
            semanticErrors.add("Error: variable name not allowed to have the substring " + this.oldSyntax + " (line:"
                    + line + ", column:" + column + ")");
            return false;
        }
        return true;
    }

    /*
     * getter function to retrieve list of variables defined in the input file
     *
     * @param list of strings representing the variable names in the input
     * program
     */
    @Override
    public Instruction visitStatement(ExprParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Instruction visitVariableDeclaration(ExprParser.VariableDeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String type = ctx.VARIABLE().getText();
        type = type.substring(0, 1).toUpperCase() + type.substring(1);
        String id = ctx.ID().getText();
        Value value = null;

        if (checkNotOLD(id, line, column)) {
            if (checkNotDefined(id, line, column)) {
                if (type.equals("Bool")) {
                    value = new Value(new BooleanVariable(id, new BooleanConstant(false)), type);
                } else if (type.equals("Int")) {
                    value = new Value(new IntegerVariable(id, new IntegerConstant(0)), type);
                } else {
                    throw new IllegalArgumentException("You probably should not get this exception.");
                }
                values.put(id, value);
            }
        }

        return new VariableInitialization(id, type, value);
    }

    @Override
    public Instruction visitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.ID().getText();
        String type = ctx.VARIABLE().getText();
        type = type.substring(0, 1).toUpperCase() + type.substring(1);

        Value value = null;

        if (checkNotOLD(id, line, column)) { // check that it's name does not
            // have "_old" in it
            if (checkNotDefined(id, line, column)) {
                Instruction rhs = visit(ctx.expression());
                if ((rhs instanceof Logical && !type.equals("Bool"))
                        | (rhs instanceof Arithmetic && !type.equals("Int"))) {
                    semanticErrors
                            .add("Error: The type of the right hand side of the exprxpression does not match the type of the left hand side variable (line:"
                                    + line + ", column:" + column + ")");
                } else {
                    if (type.equals("Bool")) {
                        value = new Value(new BooleanVariable(id, (Expression) rhs), type);
                    } else if (type.equals("Int")) {
                        value = new Value(new IntegerVariable(id, (Expression) rhs), type);
                    } else {
                        throw new IllegalArgumentException("You probably should not get this exception.");
                    }
                    values.put(id, value);
                }
            }
        }

        return new VariableInitialization(id, type, value);
    }

    @Override
    public Instruction visitVariableInitializationConstantCopy(
            ExprParser.VariableInitializationConstantCopyContext ctx) {

        Token lhsIDToken = ctx.ID().get(0).getSymbol();
        int lhsIDLine = lhsIDToken.getLine();
        int lhsColumnLine = lhsIDToken.getCharPositionInLine() + 1;
        String lhsID = ctx.ID().get(0).getText();
        String lhsType = ctx.VARIABLE().getText();
        lhsType = lhsType.substring(0, 1).toUpperCase() + lhsType.substring(1);

        Token rhsIDToken = ctx.ID().get(1).getSymbol();
        int rhsIDLine = rhsIDToken.getLine();
        int rhsColumnLine = rhsIDToken.getCharPositionInLine() + 1;
        String rhsID = ctx.ID().get(1).getText();
        Value value = null;

        if (checkNotOLD(lhsID, lhsIDLine, lhsColumnLine)) {
            if (checkNotDefined(lhsID, lhsIDLine, lhsColumnLine)) {
                if (checkDefined(rhsID, lhsType, rhsIDLine, rhsColumnLine)) {
                    String rhsType = this.values.getType(rhsID);
                    rhsType = rhsType.substring(0, 1).toUpperCase() + rhsType.substring(1); // should
                    // be
                    // true
                    // anyway
                    if (!rhsType.equals(lhsType)) {
                        semanticErrors.add("Error: Right hand side of the expression has type " + rhsType
                                + " but the left hand side has type " + lhsType + " (line:" + rhsIDLine + ", column:"
                                + rhsColumnLine + ")");
                    } else {
                        value = new Value(values.getValue(rhsID));
                        values.put(lhsID, value);
                    }
                }
            }
        }

        return new VariableInitialization(lhsID, lhsType, value);
    }

    @Override
    public Instruction visitIDAssignment(ExprParser.IDAssignmentContext ctx) {
        Token lhsIDToken = ctx.ID().get(0).getSymbol();
        int lhsIDLine = lhsIDToken.getLine();
        int lhsColumnLine = lhsIDToken.getCharPositionInLine() + 1;
        String lhsID = ctx.ID().get(0).getText();

        Token rhsIDToken = ctx.ID().get(1).getSymbol();
        int rhsIDLine = rhsIDToken.getLine();
        int rhsColumnLine = rhsIDToken.getCharPositionInLine() + 1;
        String rhsID = ctx.ID().get(1).getText();
        Expression expr = null;

        if (checkDefined(lhsID, lhsIDLine, lhsColumnLine) & (checkDefined(rhsID, rhsIDLine, rhsColumnLine))) {
            String lhsType = this.values.getType(lhsID);
            String rhsType = this.values.getType(rhsID);
            expr = values.getValue(rhsID).getValue();

            if (!rhsType.equals(lhsType)) {
                semanticErrors.add(
                        "Error: Right hand side of the expression has type " + rhsType + " but the left hand side has type "
                                + lhsType + " (line:" + rhsIDLine + ", column:" + rhsColumnLine + ")");
            } else {
                Value newValue = new Value(values.getValue(rhsID));
                values.put(lhsID, newValue);
            }
        }

        return new ExpressionAssignment(lhsID, expr);
    }

    @Override
    public Instruction visitAssignAssignment(ExprParser.AssignAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        Expression exp = (Expression) visit(ctx.getChild(2));
        String exprType = "";
        if ((exp instanceof Logical | exp instanceof Relational)) {
            exprType = "bool";
        } else if ((exp instanceof Arithmetic)) {
            exprType = "int";
        }

        if (checkDefined(id, exprType, line, column)) {
            String lhsType = values.getType(id);
            Value oldValue = values.getValue(id);

            if ((exp instanceof Logical | exp instanceof Relational) && !lhsType.equals("Bool")) {
                semanticErrors.add("Error: 1 The given lhs ID has type " + lhsType + " but the expceted type is " + "bool"
                        + "  (line:" + line + ", column:" + column + ")");
            } else if ((exp instanceof Arithmetic) && !lhsType.equals("Int")) {
                semanticErrors.add("Error: 2 The given lhs ID has type " + lhsType + " but the expceted type is " + "int"
                        + "  (line:" + line + ", column:" + column + ")");
            } else {
                Value newValue = new Value(exp, oldValue.getType());
                values.put(id, newValue);
            }
        }

        return new ExpressionAssignment(id, exp);
    }

    @Override
    public Instruction visitIDExpression(ExprParser.IDExpressionContext ctx) {
        String id = ctx.ID().getText();
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        if (checkDefined(id, line, column)) {
            String lhsType = values.getType(id);
            Expression expr = values.getValue(id).getValue();

            if (lhsType.equals("Bool")) {
                return new BooleanVariable(id, expr);
            } else if (!lhsType.equals("Int")) {
                return new IntegerVariable(id, expr);
            }
        }
        return new IntegerVariable(id, new IntegerConstant(0));
    }

    @Override
    public Instruction visitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx) {
        List<Instruction> assignments = new ArrayList<>();
        ctx.children.forEach(each -> assignments.add(visit(each)));
        return new MultiAssignment(assignments);
    }

    @Override
    public Instruction visitAssignExpression(ExprParser.AssignExpressionContext ctx) {
        Instruction exp = visit(ctx.getChild(0));
        return exp;
    }

    @Override
    public Instruction visitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitRelationalOperation(ExprParser.RelationalOperationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitLogicalOpteration(ExprParser.LogicalOpterationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Instruction visitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Division(left, right);
    }

    @Override
    public Instruction visitVariableArithmetic(ExprParser.VariableArithmeticContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String idOrig = ctx.ID().getText();
        String id = idOrig;

        if (id.contains(this.oldSyntax)) {
            id = id.substring(0, id.length() - this.oldSyntax.length());
        }

        if (checkDefined(id, "int", line, column)) {
            if (!values.getType(id).equals("Int")) {
                semanticErrors.add("Error: 3 The given ID has type " + values.getType(id) + " but the expceted type is "
                        + "int" + " (line:" + line + ", column:" + column + ")");
            } else {
                return new IntegerVariable(idOrig, values.getValue(id).getValue());
            }
        }
        return new IntegerVariable(idOrig, new IntegerConstant(0));

    }

    @Override
    public Instruction visitModuloArithmetic(ExprParser.ModuloArithmeticContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Modulo(left, right);
    }

    @Override
    public Instruction visitMultiplicationArithmetic(ExprParser.MultiplicationArithmeticContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Instruction visitNegationIntegerConstant(ExprParser.NegationIntegerConstantContext ctx) {
        StringBuilder numTextSB = new StringBuilder();
        ctx.children.subList(1, ctx.children.size()).forEach(numTextSB::append);
        String numText = numTextSB.toString();
        int num = Integer.parseInt(numText) * (-1);
        return new IntegerConstant(num);
    }

    @Override
    public Instruction visitAdditionArithmetic(ExprParser.AdditionArithmeticContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Instruction visitSubtractionArithmetic(ExprParser.SubtractionArithmeticContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Subtraction(left, right);
    }

    @Override
    public Instruction visitIntegerConstant(ExprParser.IntegerConstantContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new IntegerConstant(num);
    }

    @Override
    public Instruction visitLessRelational(ExprParser.LessRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new LessThan(left, right);
    }

    @Override
    public Instruction visitLessEqualRelational(ExprParser.LessEqualRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new LessThanOrEqual(left, right);
    }

    @Override
    public Instruction visitGreaterRelational(ExprParser.GreaterRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new GreaterThan(left, right);
    }

    @Override
    public Instruction visitGreaterEqualRelational(ExprParser.GreaterEqualRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new GreaterThanOrEqual(left, right);
    }

    @Override
    public Instruction visitEqualityRelational(ExprParser.EqualityRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Equality(left, right);
    }

    @Override
    public Instruction visitInequivalenceRelational(ExprParser.InequivalenceRelationalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Inequality(left, right);
    }

    @Override
    public Instruction visitDisjunctionLogical(ExprParser.DisjunctionLogicalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Disjunction(left, right);
    }

    @Override
    public Instruction visitImplicationLogical(ExprParser.ImplicationLogicalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Implication(left, right);
    }

    @Override
    public Instruction visitVariableLogical(ExprParser.VariableLogicalContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String idOrig = ctx.ID().getText();
        String id = idOrig;

        if (id.contains(this.oldSyntax)) {
            id = id.substring(0, id.length() - this.oldSyntax.length());
        }

        if (checkDefined(id, "bool", line, column)) {
            if (!values.getType(id).equals("Bool")) {
                semanticErrors.add("Error: 4 The given ID has type " + values.getType(id) + " but the expceted type is "
                        + "bool" + " (line:" + line + ", column:" + column + ")");
            } else {
                return new BooleanVariable(idOrig, values.getValue(id).getValue());
            }
        }

        return new BooleanVariable(idOrig, new BooleanConstant(false));
    }

    @Override
    public Instruction visitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Equivalence(left, right);
    }

    @Override
    public Instruction visitNegationLogical(ExprParser.NegationLogicalContext ctx) {
        return new Negation(visit(ctx.getChild(1)));
    }

    @Override
    public Instruction visitConjunctionLogical(ExprParser.ConjunctionLogicalContext ctx) {
        Instruction left = visit(ctx.getChild(0));
        Instruction right = visit(ctx.getChild(2));
        return new Conjunction(left, right);
    }

    @Override
    public Instruction visitBooleanConstant(ExprParser.BooleanConstantContext ctx) {
        String valText = ctx.getChild(0).getText();
        boolean value = Boolean.parseBoolean(valText);
        return new BooleanConstant(value);
    }

    @Override
    public Instruction visitConditionalAssertionStatement(ExprParser.ConditionalAssertionStatementContext ctx) {
        this.isEnsure = true;
        Instruction inst = visit(ctx.getChild(7));
        this.isEnsure = false;

        return new AssertedConditional(visit(ctx.getChild(2)), inst, visit(ctx.getChild(4)));
    }

    @Override
    public Instruction visitIfConditional(ExprParser.IfConditionalContext ctx) {
        Instruction ifStatement = visit(ctx.getChild(5));
        List<Instruction> elseIfStatments = new ArrayList<>();
        ctx.elseIf().forEach(each -> elseIfStatments.add(visit(each)));
        Instruction finalElse = null;
        if (ctx.finaElse() != null) {
            finalElse = visit(ctx.finaElse());
        }
        return new IfElseIfStatement(visit(ctx.getChild(2)), ifStatement, elseIfStatments, finalElse);
    }

    @Override
    public Instruction visitElseIfConditional(ExprParser.ElseIfConditionalContext ctx) {
        return new ElseIfStatement(visit(ctx.getChild(3)), visit(ctx.getChild(6)));
    }

    @Override
    public Instruction visitElseConditional(ExprParser.ElseConditionalContext ctx) {
        return new IfElseIfStatement(new BooleanConstant(true), visit(ctx.getChild(2)), new ArrayList<>(), null);
    }

    @Override
    public Instruction visitParanthesesArithmetic(ExprParser.ParanthesesArithmeticContext ctx) {
        return new ParanthesesExpression((Expression) visit(ctx.getChild(1)));
    }

    @Override
    public Instruction visitParanthesesRelational(ExprParser.ParanthesesRelationalContext ctx) {
        return new ParanthesesExpression((Expression) visit(ctx.getChild(1)));
    }

    @Override
    public Instruction visitParanthesesLogical(ExprParser.ParanthesesLogicalContext ctx) {
        return new ParanthesesExpression((Expression) visit(ctx.getChild(1)));
    }

    @Override
    public Instruction visitVariableArrayDeclaration(ExprParser.VariableArrayDeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String type = ctx.VARIABLE().getText();
        type = type.substring(0, 1).toUpperCase() + type.substring(1);
        String id = ctx.ID().getText();
        Value value = null;

        if (checkNotOLD(id, line, column)) {
            if (checkNotDefined(id, line, column)) {
                value = new Value(new ArrayList<>(), type);
                values.put(id, value);
            }
        }
        return new VariableInitialization(id, type, value);
    }

    @Override
    public Instruction visitLambdaOperation(ExprParser.LambdaOperationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitForAllArray(ExprParser.ForAllArrayContext ctx) {
        Token idToken = this.arrayToken;
        String lhsID = idToken.getText();
        int lhsIDLine = idToken.getLine();
        int lhsColumnLine = idToken.getCharPositionInLine() + 1;
        String lhsType = values.getPrimitiveType(lhsID);

        Instruction array = new Array(lhsID, lhsType, values.getValue(lhsID).getValues());
        Instruction inside = visit(ctx.getChild(2));

        if (!checkDefined(lhsID, lhsIDLine, lhsColumnLine)) {
            if ((inside instanceof Logical && !lhsType.equals("Bool"))
                    | (inside instanceof Arithmetic && !lhsType.equals("Int"))) {
                semanticErrors
                        .add("Error: The type of the right hand side of the exprxpression does not match the type of the left hand side variable (line:"
                                + lhsIDLine + ", column:" + lhsColumnLine + ")");
            }
        }

        return new ForAll(array, inside);
    }

    @Override
    public Instruction visitForSomeArray(ExprParser.ForSomeArrayContext ctx) {
        Token idToken = this.arrayToken;
        String lhsID = idToken.getText();
        int lhsIDLine = idToken.getLine();
        int lhsColumnLine = idToken.getCharPositionInLine() + 1;
        String lhsType = values.getPrimitiveType(lhsID);

        Instruction array = new Array(lhsID, lhsType, values.getValue(lhsID).getValues());
        Instruction inside = visit(ctx.getChild(2));

        if (!checkDefined(lhsID, lhsIDLine, lhsColumnLine)) {
            if ((inside instanceof Logical && !lhsType.equals("Bool"))
                    | (inside instanceof Arithmetic && !lhsType.equals("Int"))) {
                semanticErrors
                        .add("Error: The type of the right hand side of the exprxpression does not match the type of the left hand side variable (line:"
                                + lhsIDLine + ", column:" + lhsColumnLine + ")");
            }
        }

        return new ForSome(array, inside);
    }

    @Override
    public Instruction visitAssignProperty(ExprParser.AssignPropertyContext ctx) {
        this.arrayToken = ctx.ID().getSymbol();
        return visit(ctx.getChild(2));
    }

    @Override
    public Instruction visitAddToArray(ExprParser.AddToArrayContext ctx) {
        Token idToken = this.arrayToken;
        String lhsID = idToken.getText();
        int lhsIDLine = idToken.getLine();
        int lhsColumnLine = idToken.getCharPositionInLine() + 1;
        String lhsType = values.getPrimitiveType(lhsID);

        Instruction array = new Array(lhsID, lhsType, values.getValue(lhsID).getValues());
        Instruction inside = visit(ctx.getChild(2));

        if (!checkDefined(lhsID, lhsIDLine, lhsColumnLine)) {
            String insideType = (inside instanceof BooleanConstant) ? "Bool" : "Int";
            if (!insideType.equals(lhsType)) {
                semanticErrors.add("Error: Inside constant of the expression has type " + insideType
                        + " but the array has type" + lhsType + " (line:" + lhsIDLine + ", column:"
                        + lhsColumnLine + ")");
            } else {
                values.getValue(lhsID).addValue((Expression) inside);
            }
        }
        return new AddToArray(array, inside);
    }

    @Override
    public Instruction visitRemoveFromArray(ExprParser.RemoveFromArrayContext ctx) {
        Token idToken = this.arrayToken;
        String lhsID = idToken.getText();
        int lhsIDLine = idToken.getLine();
        int lhsColumnLine = idToken.getCharPositionInLine() + 1;
        String lhsType = values.getPrimitiveType(lhsID);

        Array array = new Array(lhsID, lhsType, values.getValue(lhsID).getValues());
        Instruction inside = visit(ctx.getChild(2));

        if (!checkDefined(lhsID, lhsIDLine, lhsColumnLine)) {
            String insideType = (inside instanceof BooleanConstant) ? "Bool" : "Int";
            if (!insideType.equals(lhsType)) {
                semanticErrors.add("Error: Inside constant of the expression has type " + insideType
                        + " but the array has type" + lhsType + " (line:" + lhsIDLine + ", column:"
                        + lhsColumnLine + ")");
            } else {
                boolean didDelete = values.getValue(lhsID).removeValue((Expression) inside);
                if (!didDelete) {
                    semanticErrors.add("Error: The item you are trying to remove does not exist in array " + lhsID + " (line:" + lhsIDLine + ")");
                }
            }
        }
        return new RemoveFromArray(array, inside);
    }

    @Override
    public Instruction visitConstantArithmetic(ExprParser.ConstantArithmeticContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitConstantLogical(ExprParser.ConstantLogicalContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Instruction visitEachArithmetic(ExprParser.EachArithmeticContext ctx) {
        return new Each();
    }

    @Override
    public Instruction visitEachLogical(ExprParser.EachLogicalContext ctx) {
        return new Each();
    }

}
