package model;

import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.AssertedConditional;
import model.statement.conditional.PostcondStatement;
import model.statement.conditional.PrecondStatement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Translator implements Visitor {

    public int statementsTranslated = 0;

    public List<String> result;

    public Map<String, String> varMap;

    public Map<String, String> resultMap;

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
        this.varMap = new HashMap<>();

        int counter = 1;
        for (String each : vars.keySet()) {
            String alloyVar = "arg" + (counter + 1);
            String originalVar = each;
            String varType = vars.get(originalVar).getType();
            alloyToOriginalVars.put(alloyVar, originalVar);
            this.varMap.put(originalVar, alloyVar);
            this.varMap.put(originalVar + "_old", alloyVar);
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
        sb.append("\tall n: ").append(stateName).append(" | (").append(precondTranslatedString).append(") => (").append();

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
    public void visitAssignExpression(ExpressionAssignment exp) {
        result = new ArrayList<>();
        result.add(exp.getID());

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getExpr().accept(rhsTranslator);

        result.addAll(rhsTranslator.result);

        resultMap = new HashMap<>();
        resultMap.put(exp.getID(), rhsTranslator.result.toString());
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
    public void visitParanthesesExpression(ParanthesesExpression exp) {
        Translator innerTranslator = new Translator();
        innerTranslator.varMap = this.varMap;
        exp.getExpression().accept(innerTranslator);
        result = innerTranslator.result;
    }

    @Override
    public void visitDivisionArithmetic(Division exp) {
        Translator lhsTranslator = new Translator();
        lhsTranslator.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTranslator);

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTranslator);

        result.addAll(lhsTranslator.result);
        result.add(".div[");
        result.addAll(rhsTranslator.result);
        result.add("]");
    }

    @Override
    public void visitVariableArithmetic(Instruction exp) {

    }

    @Override
    public void visitModuloArithmetic(Modulo exp) {
        Translator lhsTranslator = new Translator();
        lhsTranslator.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTranslator);

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTranslator);

        result.addAll(lhsTranslator.result);
        result.add(".rem[");
        result.addAll(rhsTranslator.result);
        result.add("]");
    }

    @Override
    public void visitMultiplicationArithmetic(Multiplication exp) {
        Translator lhsTranslator = new Translator();
        lhsTranslator.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTranslator);

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTranslator);

        result.addAll(lhsTranslator.result);
        result.add(".mul[");
        result.addAll(rhsTranslator.result);
        result.add("]");
    }

    @Override
    public void visitNegationIntegerConstant(IntegerConstant exp) {
        String value = String.valueOf(exp.getValue());
        result = new ArrayList<>();
        result.add(value);
    }

    @Override
    public void visitAdditionArithmetic(Addition exp) {
        Translator lhsTranslator = new Translator();
        lhsTranslator.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTranslator);

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTranslator);

        result.addAll(lhsTranslator.result);
        result.add(".add[");
        result.addAll(rhsTranslator.result);
        result.add("]");
    }

    @Override
    public void visitSubtractionArithmetic(Subtraction exp) {
        Translator lhsTranslator = new Translator();
        lhsTranslator.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTranslator);

        Translator rhsTranslator = new Translator();
        rhsTranslator.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTranslator);

        result.addAll(lhsTranslator.result);
        result.add(".sub[");
        result.addAll(rhsTranslator.result);
        result.add("]");
    }

    @Override
    public void visitIntegerConstant(IntegerConstant exp) {
        String value = String.valueOf(exp.getValue());
        result = new ArrayList<>();
        result.add(value);
    }

    @Override
    public void visitIntegerVariable(IntegerVariable exp) {
        result = new ArrayList<>();
        String alloyVarName = this.varMap.get(exp.getID());
        alloyVarName = "n." + alloyVarName;
        result.add(alloyVarName);
    }

    @Override
    public void visitLessRelational(LessThan exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" < ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitLessEqualRelational(LessThanOrEqual exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" <= ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitGreaterRelational(GreaterThan exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" > ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" >= ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitEqualityRelational(Equality exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" = ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitInequivalenceRelational(Inequality exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" != ");
        this.result.addAll(rhsTrans.result);
    }

    @Override
    public void visitDisjunctionLogical(Disjunction exp) {
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" or ");
        this.result.addAll(rhsTrans.result);
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
        Translator lhsTrans = new Translator();
        lhsTrans.varMap = this.varMap;
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator();
        rhsTrans.varMap = this.varMap;
        exp.getRightExpr().accept(rhsTrans);
        this.result.addAll(lhsTrans.result);
        this.result.add(" and ");
        this.result.addAll(rhsTrans.result);
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
