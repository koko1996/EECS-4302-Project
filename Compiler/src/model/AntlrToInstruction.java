package model;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import model.declaration.VariableDeclaration;
import model.declaration.VariableInitialization;
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

		if (type.toLowerCase().equals("int")) {
			int value = Integer.parseInt(ctx.ConstantValue().getText());
			if (!values.containsKey(id)) {
				values.put(id, value, type);
				vars.add(id);
			}
			return new VariableInitialization(id, type, values.getValue(id));
		} else if (type.toLowerCase().equals("bool")) {
			boolean value = Boolean.parseBoolean(ctx.ConstantValue().getText());
			if (!values.containsKey(id)) {
				values.put(id, value, type);
				vars.add(id);
			}
			return new VariableInitialization(id, type, values.getValue(id));
		} else {
			throw new IllegalArgumentException("How did you even get here?");
		}
	}

	@Override
	public Instruction visitVariableInitializationCopy(ExprParser.VariableInitializationCopyContext ctx) {
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
			return new VariableInitialization(lhsID, lhsType, null);
		} else {
			values.put(lhsID, values.getValue(rhsID).value, rhsType);
		}
		return new VariableInitialization(lhsID, lhsType, values.getValue(lhsID));
	}
}
