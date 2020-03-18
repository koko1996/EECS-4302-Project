package model;

import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.AssertedConditional;
import model.statement.conditional.PostcondStatement;
import model.statement.conditional.PrecondStatement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Translator implements Visitor {

    public int statementsTranslated = 0;

    public List<String> result;

    @Override
    public void visitConditionalAssertionStatement(AssertedConditional exp) {
        String stateName = "state";
        String funName = "funStatement";
        String predName = "predStatement";
        String assertName = "assertStatement";
        Map<String, Value> vars = exp.getVariables();
        StringBuilder sb = new StringBuilder();
        sb.append("sig").append(stateName).append("{");

        Map<String, String> alloyToOriginalVars = new HashMap<>();

        int counter = 1;
        for (String each : vars.keySet()) {
            String alloyVar = "arg" + (counter + 1);
            String originalVar = each;
            String varType = vars.get(originalVar).getType();
            alloyToOriginalVars.put(alloyVar, originalVar);
            sb.append("\n\t");
            sb.append(alloyVar).append(":").append(varType).append(",");
        }

        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("\n}");

        String sigResult = sb.toString();

        sb = new StringBuilder();

        sb.append("fun ").append(funName).append(statementsTranslated).
                append(" (").append("param : ").append(stateName).append(") : ").append(stateName).append("{\n");

        Translator tr = new Translator();
        exp.getIfStatment().getAssignments().accept(tr);
        List<String> assignments = tr.result;


        Translator precondTranslator = new Translator();
        exp.getPreCond().accept(precondTranslator);
        List<String> precondTranslated = precondTranslator.result;
        StringBuilder precondSB = new StringBuilder();
        precondTranslated.forEach(precondSB::append);
        String precondTranslatedString = precondSB.toString();

        Translator postcondTranslator = new Translator();
        exp.getPreCond().accept(postcondTranslator);
        List<String> postcondTranslated = postcondTranslator.result;
        StringBuilder postcondSB = new StringBuilder();
        postcondTranslated.forEach(postcondSB::append);
        String postcondTranslatedString = postcondSB.toString();

        sb.append("pred ").append(predName).append(statementsTranslated).append(" [");

        for (String alloyVar : alloyToOriginalVars.keySet()) {
            String type = vars.get(alloyVar).getType();
//            sb.append(alloyVar).append("_pre : ").append(type);
            sb.append(alloyVar).append("_pre,").append(alloyVar).append("_post : ").append(type);
        }
        sb.append("] {\n");

        sb.append("{v:").append(stateName).append(" | ");

        for (String alloyVar : alloyToOriginalVars.keySet()) {
            sb.append("v.").append(alloyVar).append(" = ").append(alloyVar).append("_post").append(" and ");
        }

        sb.delete(sb.lastIndexOf(" and "), sb.length());
        sb.append("} = ").append(funName).append(statementsTranslated).append("[");

        for (String alloyVar : alloyToOriginalVars.keySet()) {
            String type = vars.get(alloyVar).getType();
            sb.append(alloyVar).append("_pre,");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]\n}\n");

        sb.append("assert ").append(assertName).append(statementsTranslated).append(" {\n");
        sb.append("\tall n: (").append(stateName).append(") => ")

        statementsTranslated++;
    }

    @Override
    public void visitIfConditional(Instruction exp) {

    }

    @Override
    public void visitElseIfConditional(Instruction exp) {

    }

    @Override
    public void visitElseConditional(Instruction exp) {

    }

    @Override
    public void visitEpsilonConditional(Instruction exp) {

    }

    @Override
    public void visitMultipleAssignments(Instruction exp) {

    }

    @Override
    public void visitAssignExpression(Instruction exp) {

    }

    @Override
    public void visitAssignAssignment(Instruction exp) {

    }

    @Override
    public void visitArithmeticOperation(Instruction exp) {

    }

    @Override
    public void visitRelationalOperation(Relational exp) {

    }

    @Override
    public void visitLogicalOpteration(Logical exp) {

    }

    @Override
    public void visitParanthesesExpression(Instruction exp) {

    }

    @Override
    public void visitDivisionArithmetic(Division exp) {

    }

    @Override
    public void visitVariableArithmetic(Instruction exp) {

    }

    @Override
    public void visitModuloArithmetic(Modulo exp) {

    }

    @Override
    public void visitMultiplicationArithmetic(Multiplication exp) {

    }

    @Override
    public void visitNegationIntegerConstant(Instruction exp) {

    }

    @Override
    public void visitAdditionArithmetic(Addition exp) {

    }

    @Override
    public void visitSubtractionArithmetic(Subtraction exp) {

    }

    @Override
    public void visitIntegerConstant(IntegerConstant exp) {

    }

    @Override
    public void visitLessRelational(LessThan exp) {

    }

    @Override
    public void visitLessEqualRelational(LessThanOrEqual exp) {

    }

    @Override
    public void visitGreaterRelational(GreaterThan exp) {

    }

    @Override
    public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {

    }

    @Override
    public void visitEqualityRelational(Equality exp) {

    }

    @Override
    public void visitInequivalenceRelational(Inequality exp) {

    }

    @Override
    public void visitDisjunctionLogical(Disjunction exp) {

    }

    @Override
    public void visitImplicationLogical(Implication exp) {

    }

    @Override
    public void visitVariableLogical(Instruction exp) {

    }

    @Override
    public void visitEquivalenceLogical(Equivalence exp) {

    }

    @Override
    public void visitNegationLogical(Negation exp) {

    }

    @Override
    public void visitConjunctionLogical(Conjunction exp) {

    }

    @Override
    public void visitBooleanConstant(BooleanConstant exp) {

    }

    @Override
    public void visitRelationalOpLogical(Instruction exp) {

    }

    @Override
    public void visitPrecondStatement(PrecondStatement exp) {
        Logical precondLogical = (Logical) exp.getLogicalCondition();
        Translator tr = new Translator();
        precondLogical.accept(tr);
        result = tr.result;
    }

    @Override
    public void visitPostcondStatement(PostcondStatement exp) {
        Logical postcondLogical = (Logical) exp.getLogicalCondition();
        Translator tr = new Translator();
        postcondLogical.accept(tr);
        result = tr.result;
    }
}
