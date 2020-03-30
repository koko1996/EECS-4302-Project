package app;

import antlr.ExprLexer;
import antlr.ExprParser;
import model.AntlrToProgram;
import model.InstructionProcessor;
import model.Program;
import model.errorHandler.MyErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class ExpressionApp {

	/*
	 * Here the types of parser and lexer are specific to the grammar name
	 * Expr.g4.
	 */
	private static ExprParser getParser(String fileName) {
		ExprParser parser = null;

		try {
			CharStream input = CharStreams.fromFileName(fileName);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ExprParser(tokens);

			// syntax error handling
			parser.removeErrorListeners();
			parser.addErrorListener(new MyErrorListener());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return parser;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: file name " + args.length);
		} else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);

			// tell Antlr to build a parse tree
			// parse from the start symbol 'prog'
			ParseTree antlrAST = parser.prog();

			if (MyErrorListener.hasError) {
				/* let the user fix it */
			} else {
				// Create a visitor for converting the parse tree
				// into Program/Expression object
				AntlrToProgram progVisitor = new AntlrToProgram();
				Program prog = progVisitor.visit(antlrAST);
				if (progVisitor.semanticErrors.isEmpty()) {
					InstructionProcessor ep = new InstructionProcessor(prog.getStatments(), prog.getVariables());
					System.out.println("open logicFuncs\n"); // This imports our Alloy file for logical operations.
					for (String evlauation : ep.getEvaluationResults()) {
						System.out.println(evlauation);
					}
				} else {
					for (String err : progVisitor.semanticErrors) {
						System.out.println(err);
					}
				}
			}

		}
	}

}