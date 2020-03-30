package model;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

import java.util.ArrayList;
import java.util.List;

/*
 * AntlrToProgram class to represent the input file in internal structure
 */
public class AntlrToProgram extends ExprBaseVisitor<Program> {
	public List<String> semanticErrors; // to be accessed by the main
										// application program

	/*
	 * visitor function for ProgramContext
	 *
	 * @param ctx representing ProgramContext
	 */
	@Override
	public Program visitProgram(ExprParser.ProgramContext ctx) {
		Program prog = new Program();
		this.semanticErrors = new ArrayList<>();
		// a helper visitor for transforming each subtree into an Instruction
		// Object
		AntlrToInstruction exprVisitor = new AntlrToInstruction(semanticErrors);

		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			prog.addInstructions(exprVisitor.visit(ctx.getChild(i)));
		}
		return prog;

	}

}
