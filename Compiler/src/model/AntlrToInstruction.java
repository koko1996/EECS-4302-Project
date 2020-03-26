package model;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import model.declaration.VariableInitialization;
import model.statement.MultiAssignment;
import model.statement.assignment.Expression;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.*;
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

	/*
	 * Constructor
	 *
	 * @param semanticErrors list of semantic errors observed in the input file
	 */
	public AntlrToInstruction(List<String> semanticErrors) {
		values = Values.getInstance();
		this.semanticErrors = semanticErrors;
	}

	private boolean checkDefined(String id, int line, int column) {
		if (!values.containsKey(id)) {
			semanticErrors.add("Error: variable " + id + " has not been declared (" + line + ", " + column + ")");
			return false;
		}
		return true;
	}

	private boolean checkNotDefined(String id, int line, int column) {
		if (values.containsKey(id)) {
			semanticErrors.add("Error: variable " + id + " has already been declared (" + line + ", " + column + ")");
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
		if (type.equals("Bool")) {
			value = new Value(new BooleanConstant(false), type);
		} else if (type.equals("Int")) {
			value = new Value(new IntegerConstant(0), type);
		}

		checkNotDefined(id, line, column);
		values.put(id, value);
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
		checkNotDefined(id, line, column);

		Instruction rhs = visit(ctx.expression());

		if ((rhs instanceof BooleanConstant && !type.equals("Bool"))
				| (rhs instanceof IntegerConstant && !type.equals("Int"))) {
			semanticErrors.add("Error: Right hand side of expression at line " + line + " is not a " + type);
		}

		Value value = new Value((Expression) rhs, type);
		values.put(id, value);
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
		checkNotDefined(lhsID, lhsIDLine, lhsColumnLine);

		Token rhsIDToken = ctx.ID().get(1).getSymbol();
		int rhsIDLine = rhsIDToken.getLine();
		int rhsColumnLine = rhsIDToken.getCharPositionInLine() + 1;
		String rhsID = ctx.ID().get(1).getText();
		String rhsType = this.values.getType(rhsID);
		rhsType = rhsType.substring(0, 1).toUpperCase() + rhsType.substring(1);
		checkDefined(rhsID, rhsIDLine, rhsColumnLine);

		if (!rhsType.equals(lhsType)) {
			semanticErrors.add("Error: Right hand side of expression at line " + rhsIDLine + " has type " + rhsType
					+ " but the left hand side has type " + lhsType);
		}

		Value value = new Value(values.getValue(rhsID));
		values.put(lhsID, value);
		return new VariableInitialization(lhsID, lhsType, value);
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
	public Instruction visitIDAssignment(ExprParser.IDAssignmentContext ctx) {
		Token lhsIDToken = ctx.ID().get(0).getSymbol();
		int lhsIDLine = lhsIDToken.getLine();
		int lhsColumnLine = lhsIDToken.getCharPositionInLine() + 1;
		String lhsID = ctx.ID().get(0).getText();
		System.out.println("visitIDAssignment: "+lhsIDLine);
		Token rhsIDToken = ctx.ID().get(1).getSymbol();
		int rhsIDLine = rhsIDToken.getLine();
		int rhsColumnLine = rhsIDToken.getCharPositionInLine() + 1;
		String rhsID = ctx.ID().get(1).getText();
		Value newValue = null;
		
		if (checkDefined(lhsID, lhsIDLine, lhsColumnLine) & (checkDefined(rhsID, rhsIDLine, rhsColumnLine))) {
			String lhsType = this.values.getType(lhsID);
			String rhsType = this.values.getType(rhsID);
			if (!rhsType.equals(lhsType)) {
				semanticErrors.add("Error: Right hand side of expression at line " + rhsIDLine + " has type " + rhsType
						+ " but the left hand side has type " + lhsType);
			} else if(lhsType.equals("Int")){
				newValue = new Value(new IntegerVariable(rhsID, values.getValue(rhsID).getValue().clone()),lhsType);	
			} else if(lhsType.equals("Bool")){
				newValue = new Value(new BooleanVariable(rhsID, values.getValue(rhsID).getValue().clone()),lhsType);
			}
		}

		values.put(lhsID, newValue);

		return new ExpressionAssignment(lhsID, values.getValue(rhsID).getValue());
	}

	@Override
	public Instruction visitAssignAssignment(ExprParser.AssignAssignmentContext ctx) {
		String id = ctx.ID().getText();
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		checkDefined(id, line, column);

		String lhsType = values.getType(id);
		Value oldValue = values.getValue(id);

		Expression exp = (Expression) visit(ctx.getChild(2));

		if (exp instanceof BooleanConstant | exp instanceof Relational | exp instanceof Logical) {
			if (!lhsType.equals("Bool")) {
				semanticErrors.add("Error: The given lhs ID has type " + lhsType + " but the expceted type is " + "bool"
						+ "(" + line + ", " + column + ")");
			}
		} else if (exp instanceof IntegerConstant | exp instanceof Arithmetic) {
			if (!lhsType.equals("Int")) {
				semanticErrors.add("Error: The given lhs ID has type " + lhsType + " but the expceted type is " + "int"
						+ "(" + line + ", " + column + ")");
			}
		} else {
			throw new IllegalArgumentException("You probably should not get this exception."); // We  will delete this branch later.
		}

		Value newValue = new Value(exp, oldValue.getType());
		values.put(id, newValue);

		return new ExpressionAssignment(id, exp);
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

		String id = ctx.ID().getText();

		if (checkDefined(id, line, column) && !values.getType(id).equals("Int")) {
			semanticErrors.add("Error: The given ID has type " + values.getType(id) + " but the expceted type is "
					+ "int" + "(" + line + ", " + column + ")");
		}
		return new IntegerVariable(ctx.ID().getText(), values.getValue(ctx.ID().getText()).getValue());
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
		ctx.children.forEach(numTextSB::append);
		String numText = numTextSB.toString();
		int num = Integer.parseInt(numText); // negative sign is in the string
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

		String id = ctx.ID().getText();
		if (checkDefined(id, line, column) && !values.getType(id).equals("Bool")) {
			semanticErrors.add("Error: The given ID has type " + values.getType(id) + " but the expceted type is "
					+ "bool" + "(" + line + ", " + column + ")");
		}
		return new BooleanVariable(id, values.getValue(ctx.ID().getText()).getValue());
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
		return new AssertedConditional(visit(ctx.getChild(2)), visit(ctx.getChild(7)), visit(ctx.getChild(4)));
	}

	@Override
	public Instruction visitIfConditional(ExprParser.IfConditionalContext ctx) {
		
		Instruction ifStatement = visit(ctx.getChild(5));
		List<Instruction> elseIfStatments = new ArrayList<>();
		ctx.elseIf().forEach(each -> elseIfStatments.add(visit(each)));
		Instruction finalElse = null;
		if(ctx.finaElse() != null ){
			finalElse = visit(ctx.finaElse());
		}
		
		return new IfElseIfStatement(visit(ctx.getChild(2)),ifStatement ,elseIfStatments,finalElse);
	}

	@Override
	public Instruction visitElseIfConditional(ExprParser.ElseIfConditionalContext ctx) {
		return new ElseIfStatement(visit(ctx.getChild(3)), visit(ctx.getChild(6)));
	}

	@Override
	public Instruction visitElseConditional(ExprParser.ElseConditionalContext ctx) {
		return new IfElseIfStatement(new BooleanConstant(true), visit(ctx.getChild(2)), new ArrayList<>(),null);
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

}
