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

import java.io.FileWriter;
import java.io.IOException;

/*
 * Main class for the application.
 */
public class ExpressionApp {
	/**
	 * Returns the parser for the input file.
	 *
	 * @param fileName - Name of the input file that has the input programming language code.
	 * @return parser
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

	/**
	 * Entry point for the application.
	 *
	 * @param args - User args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			// Print usage message.
			System.err.println("Usage: file name " + args.length);
		} else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);
			StringBuilder outputBuilder = new StringBuilder();

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
					outputBuilder.append("open logicFuncs\n\n");// This imports our Alloy file for logical operations.
					for (String evlauation : ep.getEvaluationResults()) {
						outputBuilder.append(evlauation).append("\n");
					}
				} else {
					for (String err : progVisitor.semanticErrors) {
						System.out.println(err);
					}
					return;
				}
			}
			// Saves output into a file.
			try {
				FileWriter fileWriter = new FileWriter("output.ke");
				fileWriter.write(outputBuilder.toString());
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}