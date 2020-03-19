package model;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import model.declaration.VariableDeclaration;
import model.declaration.VariableInitialization;
import model.statement.MultiAssignment;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.IfElseIfStatement;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToInstruction extends ExprBaseVisitor<Instruction> {
	/*
	 * Given that all visit_* methods are called in a top-down fashion, we can
	 * be sure that the order in which we add declare variables into the list
	 * `vars` is identical to how they are declared in the input program.
	 */
	private List<String> vars; // stores all the variables declared in the
	// program so far
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
		vars = new ArrayList<>();
		values = Values.getInstance();
		this.semanticErrors = semanticErrors;
	}

	/*
	 * getter function to retrieve list of variables defined in the input file
	 *
	 * @param list of strings representing the variable names in the input
	 * program
	 */
	public List<String> getVars() {
		return vars;
	}

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
		String id = ctx.ID().getText();

		if (values.containsKey(id)) {
			semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
		} else {
			vars.add(id);
			values.put(id, null, type);
		}

		return new VariableDeclaration(id, type);
	}


	@Override
	public Instruction visitVariableInitializationConstant(ExprParser.VariableInitializationConstantContext ctx) {
		Token idToken = ctx.ID().getSymbol(); // equivalent to:
		// ctx.getChild(0).getSymbol()
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		String id = ctx.ID().getText();
		String type = ctx.VARIABLE().getText();

		// Maintaining the vars list for semantic error reporting
		if (values.containsKey(id)) {
			semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
		}

		Evaluator evaluator = new Evaluator();
		Instruction inst = visit(ctx.expression());
		inst.accept(evaluator);

		try {
			if (type.toLowerCase().equals("int")) {
				int value = Evaluator.getIntVal(evaluator);
				if (!values.containsKey(id)) {
					values.put(id, value, type);
					vars.add(id);
				}
				return new VariableInitialization(id, type, values.getValue(id));
			} else if (type.toLowerCase().equals("bool")) {
				boolean value = Evaluator.getBoolVal(evaluator);
				if (!values.containsKey(id)) {
					values.put(id, value, type);
					vars.add(id);
				}
				return new VariableInitialization(id, type, values.getValue(id));
			}
		} catch (ClassCastException e) {
			semanticErrors.add("Error: Type error at " + "line " + line);
		}
		return null;
	}

	@Override
	public Instruction visitVariableInitializationConstantCopy(ExprParser.VariableInitializationConstantCopyContext ctx) {
		Token lhsIDToken = ctx.ID().get(0).getSymbol();
		int lhsIDLine = lhsIDToken.getLine();
		int lhsColumnLine = lhsIDToken.getCharPositionInLine() + 1;
		String lhsID = ctx.ID().get(0).getText();
		String lhsType = ctx.VARIABLE().getText();

		Token rhsIDToken = ctx.ID().get(1).getSymbol();
		int rhsIDLine = rhsIDToken.getLine();
		int rhsColumnLine = rhsIDToken.getCharPositionInLine() + 1;
		String rhsID = ctx.ID().get(1).getText();
		String rhsType = this.values.getType(rhsID);
		if (!rhsType.equals(lhsType)) {
			semanticErrors.add(String.format("Variable %s at (%d,%d) has type %s. Expected: %s",
					rhsID, rhsIDLine, rhsColumnLine, rhsType, lhsType));
			return new VariableInitialization(lhsID, lhsType);
		} else {
			values.put(lhsID, values.getValue(rhsID).value, rhsType);
		}
		return new VariableInitialization(lhsID, lhsType, values.getValue(lhsID));
	}

	@Override
	public Instruction visitMultipleAssignments(ExprParser.MultipleAssignmentsContext ctx) {
		List<Instruction> assignments = new ArrayList<>();
		ctx.children.forEach(each -> assignments.add(visit(each)));
		return new MultiAssignment(assignments);
	}

	@Override
	public Instruction visitAssignExpression(ExprParser.AssignExpressionContext ctx) {
		return super.visitAssignExpression(ctx);
	}

	@Override
	public Instruction visitAssignAssignment(ExprParser.AssignAssignmentContext ctx) {
		String id = ctx.ID().getText();
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		Value value;
		// What should this do if variable not declared? Should it resume or break?
		try {
			value = this.values.getValue(id);
		} catch (IllegalStateException e) {
			// Add a semantic error if lhs variable is not declared.
			semanticErrors.add(e.getMessage());
			return null; // to be fixed
		}

		Instruction exp = visit(ctx.getChild(2));
		if (exp instanceof ParanthesesExpression) {
			exp = ((ParanthesesExpression) exp).getExpression();
		}

		if (exp instanceof Arithmetic) {
			Arithmetic expArithmetic = (Arithmetic) exp;
			if (!value.getType().equals("int")) {
				semanticErrors.add(String.format("Variable %s at (%d,%d) has type %s. Expected: %s",
						id, line, column, "bool", value.getType()));
			} else {
				Evaluator ev = new Evaluator();
				expArithmetic.accept(ev);
				values.getValue(id).setValue(Evaluator.getIntVal(ev));
				return new ExpressionAssignment(id, expArithmetic);
			}
		} else if (exp instanceof Relational) {
			Relational expRelational = (Relational) exp;
			if (!value.getType().equals("bool")) {
				semanticErrors.add(String.format("Variable %s at (%d,%d) has type %s. Expected: %s",
						id, line, column, "int", value.getType()));
			} else {
				Evaluator ev = new Evaluator();
				expRelational.accept(ev);
				values.getValue(id).setValue(Evaluator.getIntVal(ev));
				return new ExpressionAssignment(id, expRelational);
			}
		} else if (exp instanceof Logical) {
			Logical expLogical = (Logical) exp;
			if (!value.getType().equals("bool")) {
				semanticErrors.add(String.format("Variable %s at (%d,%d) has type %s. Expected: %s",
						id, line, column, "int", value.getType()));
			} else {
				Evaluator ev = new Evaluator();
				expLogical.accept(ev);
				values.getValue(id).setValue(Evaluator.getIntVal(ev));
				return new ExpressionAssignment(id, expLogical);
			}
		}
		return null;
	}

	@Override
	public Instruction visitArithmeticOperation(ExprParser.ArithmeticOperationContext ctx) {
		return visit(ctx.getChild(0));
	}

	@Override
	public Instruction visitRelationalOperation(ExprParser.RelationalOperationContext ctx) {
		return super.visitRelationalOperation(ctx);
	}

	@Override
	public Instruction visitLogicalOpteration(ExprParser.LogicalOpterationContext ctx) {
		return super.visitLogicalOpteration(ctx);
	}

	@Override
	public Instruction visitParanthesesExpression(ExprParser.ParanthesesExpressionContext ctx) {
		return super.visitParanthesesExpression(ctx);
	}

	@Override
	public Instruction visitDivisionArithmetic(ExprParser.DivisionArithmeticContext ctx) {
		Instruction left = visit(ctx.getChild(0));
		Instruction right = visit(ctx.getChild(2));
		return new Division(left, right);
	}

	@Override
	public Instruction visitVariableArithmetic(ExprParser.VariableArithmeticContext ctx) {
		// TODO

		return super.visitVariableArithmetic(ctx);
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
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		num = num * (-1);
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
		return super.visitVariableLogical(ctx);
	}

	@Override
	public Instruction visitEquivalenceLogical(ExprParser.EquivalenceLogicalContext ctx) {
		Instruction left = visit(ctx.getChild(0));
		Instruction right = visit(ctx.getChild(2));
		return new Equivalence(left, right);
	}

	@Override
	public Instruction visitNegationLogical(ExprParser.NegationLogicalContext ctx) {
		return new Negation(visit(ctx.getChild(0)));
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
		// TODO
		return super.visitConditionalAssertionStatement(ctx);
	}

	@Override
	public Instruction visitIfConditional(ExprParser.IfConditionalContext ctx) {
		return new IfElseIfStatement(visit(ctx.getChild(2)), visit(ctx.getChild(5)), new ArrayList<>());
	}
	@Override
	public Instruction visitElseIfConditional(ExprParser.ElseIfConditionalContext ctx) {
		return new IfElseIfStatement(visit(ctx.getChild(2)), visit(ctx.getChild(5)), new ArrayList<>());
	}

	@Override
	public Instruction visitElseConditional(ExprParser.ElseConditionalContext ctx) {
		return super.visitElseConditional(ctx);
	}
}
