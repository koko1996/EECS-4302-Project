package model;

import model.declaration.VariableInitialization;
import model.statement.Loop;
import model.statement.MultiAssignment;
import model.statement.assignment.Expression;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.*;
import model.statement.assignment.expression.arithmetic.*;
import model.statement.assignment.expression.array.*;
import model.statement.assignment.expression.logical.*;
import model.statement.assignment.expression.relational.*;
import model.statement.conditional.*;
import model.values.Value;
import model.values.Values;
import model.values.ValuesGlobal;
import utils.Pair;

import java.util.*;

/*
 * Translator visitor class to translate from input language to Alloy
 * Each visitor method visited here will cause output in the output language.
 * Some functions are protected for TranslatorTest to be able to unit test them
 */
public class Translator implements Visitor {

    private int functionsTranslated;                // current number of functions translated

    private int loopsTranslated;                    // current number of loops translated

    private int ifStatementsTranslated;                // current number of if statements translated

    protected Map<String, String> functionsDefined;    // Mapping from original function names to their
    // Alloy counterpart
    private Map<String, String> originalToAlloy;    // container to hold the variable name mapping
    // from  original name to alloy name
    private Map<String, String> lhsOfUpdates;        // container to hold the variable name mapping from
    // original alloy name to next available alloy name
    private Map<String, String> rhsOfUpdates;        // container to hold the variable name mapping from
    // original alloy name to last used alloy name that
    // appeared on the lhs of an assignment
    private Values values;                            // Singleton instance that has all the variable values

    final private String trueInAlloy;                // Simply "True"

    final private String falseInAlloy;                // Simply "False"

    private String finalResult;                        // Contains the result of translation

    private List<String> result;                    // Container to store the results after a visit

    private Map<String, String> resultMap;            // Container to store the assignments results after a visit

    private Map<String, String> resultMaxUsed;        // Container to store the mapping after a visit from original alloy name to last used alloy name

    /**
     * Default constructor for Translator class
     */
    public Translator() {
        finalResult = "";
        falseInAlloy = "False";
        trueInAlloy = "True";
        ifStatementsTranslated = 0;
        functionsTranslated = 0;
        loopsTranslated = 0;
        values = ValuesGlobal.getInstance();
        result = new ArrayList<>();
        resultMap = new HashMap<>();
        resultMaxUsed = new HashMap<>();
        functionsDefined = new HashMap<>();
        originalToAlloy = new HashMap<>();
        lhsOfUpdates = new HashMap<>();
        rhsOfUpdates = new HashMap<>();
    }

    /**
     * Constructor for Translator with the parameters initialized as attributes
     *
     * @param originalToAlloy
     * @param functionsDefined
     * @param lhsOfUpdates
     * @param rhsOfUpdates
     */
    public Translator(Map<String, String> originalToAlloy, Map<String, String> functionsDefined, Map<String, String> lhsOfUpdates, Map<String, String> rhsOfUpdates) {
        finalResult = "";
        falseInAlloy = "False";
        trueInAlloy = "True";
        ifStatementsTranslated = 0;
        functionsTranslated = 0;
        loopsTranslated = 0;
        values = ValuesGlobal.getInstance();
        result = new ArrayList<>();
        resultMap = new HashMap<>();
        resultMaxUsed = new HashMap<>();
        this.functionsDefined = functionsDefined;
        this.originalToAlloy = originalToAlloy;
        this.lhsOfUpdates = lhsOfUpdates;
        this.rhsOfUpdates = rhsOfUpdates;
    }

    /**
     * Constructor for Translator with the parameters initialized as attributes
     *
     * @param originalToAlloy
     */
    public Translator(Map<String, String> originalToAlloy) {
        finalResult = "";
        falseInAlloy = "False";
        trueInAlloy = "True";
        ifStatementsTranslated = 0;
        result = new ArrayList<>();
        resultMap = new HashMap<>();
        resultMaxUsed = new HashMap<>();
        functionsDefined = new HashMap<>();
        lhsOfUpdates = new HashMap<>();
        rhsOfUpdates = new HashMap<>();
        this.originalToAlloy = originalToAlloy;
        values = ValuesGlobal.getInstance();
    }

    // ************************************* VISITOR IMPLEMENTATIONS **********************************************
    // ************************************* VISITOR IMPLEMENTATIONS **********************************************
    // ************************************* VISITOR IMPLEMENTATIONS **********************************************
    // ************************************* VISITOR IMPLEMENTATIONS **********************************************
    // ************************************* VISITOR IMPLEMENTATIONS **********************************************
    @Override
    public void visitFunctionCall(FunctionCall exp) {
        FunctionConditional actualFunction = (FunctionConditional) values.getValue(exp.getId()).getValue();
        List<Instruction> expectedParameters = actualFunction.getParameters();
        List<Instruction> passedParameters = exp.getParameters();
        Map<String, Instruction> actualFunctionToFunctionCall = new HashMap<>();

        for (int i = 0; i < expectedParameters.size(); i++) {
            actualFunctionToFunctionCall.put(((VariableInitialization) expectedParameters.get(i)).getID(), passedParameters.get(i));
        }

        Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(actualFunction.getVariables().keySet());
        Map<String, Integer> originalParamCount = functionParamCount(actualFunction);

        this.result.add(exp.getId());
        this.result.add("[");

        for (String key : preOriginalToAlloy.keySet()) {
            String alloyVar = preOriginalToAlloy.get(key);
            // Get instructions for the function and get the translation for them.
            Instruction res = actualFunctionToFunctionCall.get(key);
            Translator tr = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
            res.accept(tr);
            for (int i = 0; i < originalParamCount.get(alloyVar); i++) {
                this.result.addAll(tr.getResult());
                this.result.add(",");
            }
        }
        // Cleans the extraneous comma at the end.
        if (this.result.lastIndexOf(",") != -1) {
            this.result.remove(this.result.lastIndexOf(","));
        }
        this.result.add("] ");
    }

    @Override
    public void visitFunctionConditional(FunctionConditional exp) {
        String functionName = "funFunction" + functionsTranslated;
        String predName = "predFunction" + functionsTranslated;
        String assertName = "assertFunction" + functionsTranslated;
        Map<String, Value> vars = exp.getVariables();
        String returnType = exp.getReturnType();
        String returnVariableName = exp.getReturnVariable();
        String returnVariableNameInAlloy = "return";

        Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
        Map<String, String> postOriginalToAlloy = new HashMap<>();

        // Clean up the lhs and rhs updates because this must be the highest level of visit calls
        lhsOfUpdates = new HashMap<>();
        rhsOfUpdates = new HashMap<>();

        // prepare the lhs and rhs updates for visiting multiassignment
        preOriginalToAlloy.keySet().forEach(key -> lhsOfUpdates.put(key, preOriginalToAlloy.get(key) + "'"));
        preOriginalToAlloy.keySet().forEach(key -> rhsOfUpdates.put(key, preOriginalToAlloy.get(key)));

        // Visiting the precondition statement
        // Which must be a logical expression
        // lhsUpdates and rhsUpdates will not be used in this section
        Translator precondTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPreCond().accept(precondTranslator);
        String precondTranslatedString = addPrecondHelper(precondTranslator.getResult()).toString();

        Map<String, String> tempPreOriginalToAlloy = preOriginalToAlloy;
        Translator assignmentsTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getAssignments().accept(assignmentsTranslator);
        assert (tempPreOriginalToAlloy.equals(preOriginalToAlloy));
        this.resultMaxUsed.putAll(assignmentsTranslator.getResultMaxUsed());

        // update the post OriginalToAlloy map so that we use the latest
        // version of a variable in Alloy (i.e. use arg1' instead of arg1)
        // if there has been an assignment to arg1 in the multiassignment body
        for (String key : preOriginalToAlloy.keySet()) {
            postOriginalToAlloy.put(key + "_old", preOriginalToAlloy.get(key));
            postOriginalToAlloy.put(key, rhsOfUpdates.get(key));
        }

        String assignmentsTranslatedString = assignmentsToString(assignmentsTranslator.getResultMap()).toString();

        StringBuilder assignmentsOfFunctionInAlloySB = new StringBuilder();
        assignmentsOfFunctionInAlloySB.append("\t{ ").append(returnVariableNameInAlloy).append(" : ").append(returnType);
        assignmentsOfFunctionInAlloySB.append(" | ").append(assignmentsTranslatedString).append(" and ");
        assignmentsOfFunctionInAlloySB.append(returnVariableNameInAlloy).append(" = ").append(postOriginalToAlloy.get(returnVariableName));
        assignmentsOfFunctionInAlloySB.append("}\n");
        String assignmentsOfFunctionInAlloyString = assignmentsOfFunctionInAlloySB.toString();

        // Translate postcondition
        Translator postcondTranslator = new Translator(postOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPostCond().accept(postcondTranslator);
        String postcondTranslatedString = addPostcondHelper(postcondTranslator.getResult()).toString();

        StringBuilder predParamSB = new StringBuilder();
        StringBuilder forAllParamSB = new StringBuilder();
        StringBuilder forSomeParamSB = new StringBuilder();
        StringBuilder predInputParamSB = new StringBuilder();

        alloyParametersCalculator(preOriginalToAlloy, this.resultMaxUsed, vars, predParamSB,
                forAllParamSB, forSomeParamSB, predInputParamSB);

        // Generate predicate block
        StringBuilder predSignatureSB = addPredBlockHelper(predName, predParamSB, assignmentsTranslatedString, postcondTranslatedString);

        // Generate function block
        StringBuilder funSignatureSB = new StringBuilder();
        funSignatureSB.append("fun ").append(functionName);
        funSignatureSB.append(" [").append(predParamSB).append("] : ");
        funSignatureSB.append(returnType).append(" {\n");
        funSignatureSB.append(assignmentsOfFunctionInAlloyString);
        funSignatureSB.append("}\n\n");

        // Generate check block
        StringBuilder assertSB = addCheckBlockHelper(predName, assertName, precondTranslatedString, forAllParamSB, forSomeParamSB, predInputParamSB);

        this.finalResult = predSignatureSB.append(funSignatureSB).append(assertSB).toString();
        functionsDefined.put(exp.getName(), functionName);
        this.incrementFunctionsTranslated();
    }

    @Override
    public void visitConditionalAssertionStatement(AssertedConditional exp) {
        String predName = "predIfStatement";
        String assertName = "assertIfStatement";
        Map<String, Value> vars = exp.getVariables();

        Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
        Map<String, String> postOriginalToAlloy = new HashMap<>();

        // Clean up the lhs and rhs updates because this must be the highest level of visit calls
        lhsOfUpdates = new HashMap<>();
        rhsOfUpdates = new HashMap<>();

        // prepare the lhs and rhs updates for visiting multiassignment
        preOriginalToAlloy.keySet().forEach(key -> lhsOfUpdates.put(key, preOriginalToAlloy.get(key) + "'"));
        preOriginalToAlloy.keySet().forEach(key -> rhsOfUpdates.put(key, preOriginalToAlloy.get(key)));

        // Visiting the precondition statement
        // Which must be a logical expression
        // lhsUpdates and rhsUpdates will not be used in this section
        Translator precondTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPreCond().accept(precondTranslator);
        String precondTranslatedString = addPrecondHelper(precondTranslator.getResult()).toString();

        Map<String, String> tempPreOriginalToAlloy = preOriginalToAlloy;
        Translator ifStatementTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates); // might change map values
        exp.getIfStatement().accept(ifStatementTranslator);
        assert (tempPreOriginalToAlloy.equals(preOriginalToAlloy));
        this.resultMaxUsed.putAll(ifStatementTranslator.getResultMaxUsed());

        // update the post OriginalToAlloy map so that we use the latest
        // version of a variable in Alloy (i.e. use arg1' instead of arg1)
        // if there has been an assignment to arg1 in the multiassignment body
        for (String key : preOriginalToAlloy.keySet()) {
            postOriginalToAlloy.put(key + "_old", preOriginalToAlloy.get(key));
            postOriginalToAlloy.put(key, rhsOfUpdates.get(key));
        }

        List<String> ifStatementTranslated = ifStatementTranslator.getResult();
        StringBuilder ifStatementSB = new StringBuilder();
        ifStatementTranslated.forEach(ifStatementSB::append);
        String ifStatementTranslatedString = ifStatementSB.toString();

        // Translate post condition
        Translator postcondTranslator = new Translator(postOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPostCond().accept(postcondTranslator);
        String postcondTranslatedString = addPostcondHelper(postcondTranslator.getResult()).toString();

        StringBuilder predParamSB = new StringBuilder();
        StringBuilder forAllParamSB = new StringBuilder();
        StringBuilder forSomeParamSB = new StringBuilder();
        StringBuilder predInputParamSB = new StringBuilder();
        alloyParametersCalculator(preOriginalToAlloy, this.resultMaxUsed, vars, predParamSB, forAllParamSB, forSomeParamSB, predInputParamSB);

        // Generate predicate block
        StringBuilder predSignatureSB = addPredBlockHelper(predName + ifStatementsTranslated, predParamSB, ifStatementTranslatedString, postcondTranslatedString);

        // Generate check block
        StringBuilder assertSB = addCheckBlockHelper(predName + ifStatementsTranslated,
                assertName + ifStatementsTranslated, precondTranslatedString, forAllParamSB,
                forSomeParamSB, predInputParamSB);

        this.finalResult = predSignatureSB.append(assertSB).toString();

        this.incrementStatementsTranslated();
    }


    @Override
    public void visitIfConditional(IfElseIfStatement exp) {
        // Translate condition
        Translator conditionTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getCondition().accept(conditionTranslator);

        Map<String, String> origRhsOfUpdates = new HashMap<>(rhsOfUpdates);
        Map<String, String> ifRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
        Translator ifTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, ifRhsOfUpdates);
        exp.getAssignments().accept(ifTranslator);
        this.resultMaxUsed.putAll(ifTranslator.getResultMaxUsed());
        updateToLargestMapping(rhsOfUpdates, ifRhsOfUpdates);

        // Parse ElseIf if there is any
        List<List<String>> elseIfConditions = new ArrayList<>();
        List<Map<String, String>> elseIfAssignments = new ArrayList<>();
        List<Map<String, String>> elseIfRhsOfUpdatesList = new ArrayList<>();
        for (ElseIfStatement stmt : exp.getElseIfStatements()) {
            Map<String, String> elseIfRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
            Translator elseIfTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, elseIfRhsOfUpdates);
            stmt.accept(elseIfTranslator);
            elseIfConditions.add(elseIfTranslator.getResult());
            elseIfAssignments.add(elseIfTranslator.getResultMap());
            elseIfRhsOfUpdatesList.add(elseIfRhsOfUpdates);
            updateToLargestMapping(this.resultMaxUsed, elseIfTranslator.getResultMaxUsed());
            updateToLargestMapping(rhsOfUpdates, elseIfRhsOfUpdates);
        }
        assert (elseIfAssignments.size() == elseIfConditions.size());

        // Translate else
        Map<String, String> elseRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
        Translator elseTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, elseRhsOfUpdates);
        if (exp.getElseStatement() != null) {
            exp.getElseStatement().getAssignments().accept(elseTranslator);
            updateToLargestMapping(this.resultMaxUsed, elseTranslator.getResultMaxUsed());
            updateToLargestMapping(rhsOfUpdates, elseRhsOfUpdates);
        }

        // Add everything necessary to result including the assignments
        this.result.add("((");
        this.result.addAll(conditionTranslator.getResult());
        this.result.add(") in True) => \n\t\t");
        this.result.add(" ((" + trueInAlloy + ") in True)");
        assignmentsToString(this.result, ifTranslator.getResultMap());
        Map<String, String> missingAssignments = largestValueMap(ifRhsOfUpdates, rhsOfUpdates);
        assignmentsToString(this.result, missingAssignments);

        for (int i = 0; i < elseIfConditions.size(); i++) {
            this.result.add("\n\telse (( ");
            this.result.addAll(elseIfConditions.get(i));
            this.result.add(" ) in True) => \n\t\t");
            this.result.add(" ((" + trueInAlloy + ") in True)");
            assignmentsToString(this.result, elseIfAssignments.get(i));
            missingAssignments = largestValueMap(elseIfRhsOfUpdatesList.get(i), rhsOfUpdates);
            assignmentsToString(this.result, missingAssignments);
        }

        if (exp.getElseStatement() != null) {
            this.result.add("\n\telse \n\t\t");
            this.result.add(" ((" + trueInAlloy + ") in True)");
            assignmentsToString(this.result, elseTranslator.getResultMap());
            missingAssignments = largestValueMap(elseRhsOfUpdates, rhsOfUpdates);
            assignmentsToString(this.result, missingAssignments);
        }
    }

    @Override
    public void visitElseIfConditional(ElseIfStatement exp) {
        // Translate condition
        Translator conditionTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getCondition().accept(conditionTranslator);
        this.result.addAll(conditionTranslator.getResult());

        // Translate assignments
        Translator assignmentTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getAssignments().accept(assignmentTranslator);
        this.resultMap.putAll(assignmentTranslator.getResultMap());
        this.resultMaxUsed.putAll(assignmentTranslator.getResultMaxUsed());
    }

    @Override
    public void visitMultipleAssignments(MultiAssignment exp) {
        // Must be in the body of if/else statement
        // originalToOriginal is needed so that the visitors that get
        // called in this method don't do any mapping to Alloy
        // because for assignments and if statements the mapping is
        // done in this method

        Map<String, String> originalToOriginal = new HashMap<>();
        for (String key : originalToAlloy.keySet()) {
            originalToOriginal.put(key, key);
        }
        // fill in with original mapping
        this.resultMaxUsed.putAll(rhsOfUpdates);
        for (Instruction inst : exp.getAssignments()) {
            if (!(inst instanceof ArrayOperations) && inst instanceof Expression) {
                // Skip non assignments as they don't mean anything in Alloy
                // if not skipped then this translation will be converted to
                // be a fact in Alloy due to "and"ing
                continue;
            }

            // Translate each instruction if not skipped
            Translator instTranslator;
            if (inst instanceof IfElseIfStatement) {
                Map<String, String> newOriginalToAlloy = new HashMap<>(rhsOfUpdates);
                instTranslator = new Translator(newOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
                inst.accept(instTranslator);
                StringBuilder res = new StringBuilder();
                res.append(" ( ");
                for (String str : instTranslator.getResult()) {
                    res.append(str);
                }
                res.append(" ) ");
                this.resultMap.put(res.toString(), null);
                updateToLargestMapping(this.resultMaxUsed, instTranslator.getResultMaxUsed());
            } else {
                instTranslator = new Translator(originalToOriginal, functionsDefined, lhsOfUpdates, rhsOfUpdates);
                inst.accept(instTranslator);
                List<String> lhsList = new ArrayList<>();
                lhsList.add(instTranslator.getResult().get(0));
                List<String> rhsList = new ArrayList<>();

                // This loop variant change allows array name to be included.
                for (int i = inst instanceof ArrayOperations ? 0 : 1; i < instTranslator.getResult().size(); i++) {
                    rhsList.add(instTranslator.getResult().get(i));
                }
                assert (lhsList.size() == 1);

                String lhs = updateToString(lhsList, lhsOfUpdates, rhsOfUpdates, this.resultMaxUsed);
                lhsOfUpdates.put(lhsList.get(0), lhsOfUpdates.get(lhsList.get(0)) + "'");
                String rhs = updateToString(rhsList, rhsOfUpdates, lhsOfUpdates, this.resultMaxUsed);
                rhsOfUpdates.put(lhsList.get(0), lhs);
                updateMaxUsed(this.resultMaxUsed, lhsList.get(0), lhs);
                this.resultMap.put(lhs, rhs);
            }
        }
        for (String key : originalToAlloy.keySet()) {
            if (key.equals("True") || key.equals("False") || key.matches("-?\\d+")) {
                this.resultMap.put(originalToAlloy.get(key), key);
            }
        }
    }

    public void visitAssignExpression(ExpressionAssignment exp) {
        // Add the alloy variable name
        String alloyVarName = this.originalToAlloy.get(exp.getID());
        this.result.add(alloyVarName);
        // Translate and add the rhs of assignment
        Translator rhsTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getExpr().accept(rhsTranslator);
        this.result.addAll(rhsTranslator.getResult());
    }


    @Override
    public void visitParenthesisExpression(ParenthesisExpression exp) {
        // Translate inside the parenthesis.
        Translator innerTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getExpression().accept(innerTranslator);
        result = innerTranslator.getResult();
    }

    @Override
    public void visitDivisionArithmetic(Division exp) {
        arithmeticHelper(exp, "div");
    }

    @Override
    public void visitModuloArithmetic(Modulo exp) {
        arithmeticHelper(exp, "rem");
    }

    @Override
    public void visitMultiplicationArithmetic(Multiplication exp) {
        arithmeticHelper(exp, "mul");
    }

    @Override
    public void visitAdditionArithmetic(Addition exp) {
        arithmeticHelper(exp, "add");
    }

    @Override
    public void visitSubtractionArithmetic(Subtraction exp) {
        arithmeticHelper(exp, "sub");
    }

    @Override
    public void visitLessRelational(LessThan exp) {
        relationalHelper(exp, "<");
    }

    @Override
    public void visitLessEqualRelational(LessThanOrEqual exp) {
        relationalHelper(exp, "<=");
    }

    @Override
    public void visitGreaterRelational(GreaterThan exp) {
        relationalHelper(exp, ">");
    }

    @Override
    public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
        relationalHelper(exp, ">=");
    }

    @Override
    public void visitEqualityRelational(Equality exp) {
        relationalHelper(exp, "=");
    }

    @Override
    public void visitInequivalenceRelational(Inequality exp) {
        relationalHelper(exp, "!=");
    }

    @Override
    public void visitConjunctionLogical(Conjunction exp) {
        logicalHelper(exp, "andGate");
    }

    @Override
    public void visitDisjunctionLogical(Disjunction exp) {
        logicalHelper(exp, "orGate");
    }

    @Override
    public void visitImplicationLogical(Implication exp) {
        // Translate lhs of the implication
        Translator lhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getLeftExpr().accept(lhsTrans);
        // Translate rhs of the implication
        Translator rhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getRightExpr().accept(rhsTrans);
        // Combine and add the results
        this.result.add("((((");
        this.result.addAll(lhsTrans.getResult());
        this.result.add(") in True)");
        this.result.add(" => ");
        this.result.add("((");
        this.result.addAll(rhsTrans.getResult());
        this.result.add(") in True))");
        this.result.add(" => True else False");
        this.result.add(")");
    }

    @Override
    public void visitEquivalenceLogical(Equivalence exp) {
        // Translate lhs of the equivalence
        Translator lhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getLeftExpr().accept(lhsTrans);
        // Translate rhs of the equivalence
        Translator rhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getRightExpr().accept(rhsTrans);
        // Combine and add the results
        this.result.add("((");
        this.result.addAll(lhsTrans.getResult());
        this.result.add(" in ");
        this.result.addAll(rhsTrans.getResult());
        this.result.add(") => True else False)");
    }

    @Override
    public void visitNegationLogical(Negation exp) {
        // Translate the expression to be negated then add the result with a not gate prepended
        Translator lhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getExpression().accept(lhsTrans);
        result.add("notGate[");
        this.result.addAll(lhsTrans.getResult());
        result.add("]");
    }

    @Override
    public void visitIntegerConstant(IntegerConstant exp) {
        String value = String.valueOf(exp.getValue());
        result.add(value);
    }

    @Override
    public void visitIntegerVariable(IntegerVariable exp) {
        String alloyVarName = this.originalToAlloy.get(exp.getID());
        result.add(alloyVarName);
    }

    @Override
    public void visitBooleanConstant(BooleanConstant exp) {
        // Return true or false depending on the input
        boolean value = exp.getValue();
        if (value) {
            result.add(this.trueInAlloy);
        } else {
            result.add(this.falseInAlloy);
        }
    }

    @Override
    public void visitBooleanVariable(BooleanVariable exp) {
        String alloyVarName = this.originalToAlloy.get(exp.getID());
        result.add(alloyVarName);
    }

    @Override
    public void visitArray(Array exp) {
        String alloyVarName = this.originalToAlloy.get(exp.getID());
        result.add(alloyVarName);
    }

    @Override
    public void visitPrecondStatement(PrecondStatement exp) {
        // Translate and add the precondition
        Logical precondLogical = (Logical) exp.getLogicalCondition();
        Translator tr = new Translator();
        precondLogical.accept(tr);
        result = tr.getResult();
    }

    @Override
    public void visitPostcondStatement(PostcondStatement exp) {
        // Translate and add the postcondition
        Logical postcondLogical = (Logical) exp.getLogicalCondition();
        Translator tr = new Translator();
        postcondLogical.accept(tr);
        result = tr.getResult();
    }

    @Override
    public void visitLoop(Loop exp) {
        String predName = "predForStatement" + this.loopsTranslated;
        String assertName = "assertForStatement" + this.loopsTranslated;
        Map<String, Value> vars = exp.getVariables();
        Instruction invariant = exp.getLoopInvariant();
        Instruction variant = exp.getLoopVariant();
        Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
        Map<String, String> postOriginalToAlloy = new HashMap<>();

        // Clean up the lhs and rhs updates because this must be the highest level of visit calls
        lhsOfUpdates = new HashMap<>();
        rhsOfUpdates = new HashMap<>();

        // prepare the lhs and rhs updates for visiting multiassignment
        preOriginalToAlloy.keySet().forEach(key -> lhsOfUpdates.put(key, preOriginalToAlloy.get(key) + "'"));
        preOriginalToAlloy.keySet().forEach(key -> rhsOfUpdates.put(key, preOriginalToAlloy.get(key)));

        this.resultMaxUsed.putAll(rhsOfUpdates);

        // Visiting the precondition statement
        // Which must be a logical expression
        // lhsUpdates and rhsUpdates will not be used in this section
        Translator precondTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPreCond().accept(precondTranslator);
        String precondTranslatedString = addPrecondHelper(precondTranslator.getResult()).toString();

        // Translate post condition
        Translator postcondTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getPostCond().accept(postcondTranslator);
        String postcondTranslatedString = addPostcondHelper(postcondTranslator.getResult()).toString();

        // Translate init
        Translator initializationTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        Instruction initialization = exp.getInitAssignments();
        initialization.accept(initializationTranslator);
        updateToLargestMapping(this.resultMaxUsed, initializationTranslator.getResultMaxUsed());
        StringBuilder initializationSB = assignmentsToString(initializationTranslator.getResultMap());
        String initializationResult = initializationSB.toString();
        postOriginalToAlloy.putAll(rhsOfUpdates);

        // Translate invariant post init
        Translator invariantPostInitializationTranslator = new Translator(postOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        invariant.accept(invariantPostInitializationTranslator);
        String invariantPostInitResult = "( " + listToStringBuilderHelper(invariantPostInitializationTranslator.result).toString() + " in True )";

        // reset the values in postOriginalToAlloy and rhsOfUpdates
        postOriginalToAlloy = new HashMap<>(preOriginalToAlloy);
        rhsOfUpdates = new HashMap<>(preOriginalToAlloy);

        // Translate exit condition
        Translator exitConditionTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        Instruction exitCondition = exp.getExitCond();
        exitCondition.accept(exitConditionTranslator);
        String exitConditionResult = "( " + listToStringBuilderHelper(exitConditionTranslator.result).toString() + " in True )";

        // Translate invariant pre assignment
        Translator invariantPreAssignmentTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        invariant.accept(invariantPreAssignmentTranslator);
        String invariantPreAssignmentResult = "( " + listToStringBuilderHelper(invariantPreAssignmentTranslator.result).toString() + " in True )";

        // Translate variant pre assignment
        Translator variantPreAssignmentTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        variant.accept(variantPreAssignmentTranslator);
        String variantPreAssignmentResult = listToStringBuilderHelper(variantPreAssignmentTranslator.result).toString();

        // Translate assignments translator
        Translator assignmentsTranslator = new Translator(preOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getAssignments().accept(assignmentsTranslator);
        updateToLargestMapping(this.resultMaxUsed, assignmentsTranslator.getResultMaxUsed());
        StringBuilder assignmentsSB = assignmentsToString(assignmentsTranslator.getResultMap());
        String assignmentsTranslatedString = assignmentsSB.toString();
        postOriginalToAlloy = new HashMap<>(rhsOfUpdates);

        // Translate variant post assignment
        Translator variantPostAssignmentTranslator = new Translator(postOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        variant.accept(variantPostAssignmentTranslator);
        String variantPostAssignmentResult = listToStringBuilderHelper(variantPostAssignmentTranslator.result).toString();

        // Translate invariant post assignment
        Translator invariantPostAssignmentTranslator = new Translator(postOriginalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        invariant.accept(invariantPostAssignmentTranslator);
        String invariantPostAssignmentResult = listToStringBuilderHelper(invariantPostAssignmentTranslator.result).toString() + " in True";

        StringBuilder predParamSB = new StringBuilder();
        StringBuilder forAllParamSB = new StringBuilder();
        StringBuilder forSomeParamSB = new StringBuilder();
        StringBuilder predInputParamSB = new StringBuilder();
        alloyParametersCalculator(preOriginalToAlloy, this.resultMaxUsed, vars, predParamSB,
                forAllParamSB, forSomeParamSB, predInputParamSB);

        StringBuilder predSignatureSB = new StringBuilder();
        predSignatureSB.append("pred ").append(predName);
        predSignatureSB.append(" [").append(predParamSB).append("] {\n");

        predSignatureSB.append("\t(");
        predSignatureSB.append(initializationResult);
        predSignatureSB.append("\n\t=> \n\t");
        predSignatureSB.append(invariantPostInitResult);
        predSignatureSB.append(") ");

        predSignatureSB.append("\n\n");
        predSignatureSB.append("\t(");
        predSignatureSB.append(invariantPreAssignmentResult);
        predSignatureSB.append("\n\t and");
        predSignatureSB.append(exitConditionResult);
        predSignatureSB.append(")");
        predSignatureSB.append("\n\t=> \n\t");
        predSignatureSB.append(assignmentsTranslatedString);
        predSignatureSB.append("\n\t=> \n\t");
        predSignatureSB.append("(");
        predSignatureSB.append(invariantPostAssignmentResult);
        predSignatureSB.append(" and ");
        predSignatureSB.append(" ( ");
        predSignatureSB.append(variantPostAssignmentResult);
        predSignatureSB.append(" >= 0 )");
        predSignatureSB.append(" and ( ");
        predSignatureSB.append(variantPreAssignmentResult);
        predSignatureSB.append(" > ");
        predSignatureSB.append(variantPostAssignmentResult);
        predSignatureSB.append(")");
        predSignatureSB.append(")");

        predSignatureSB.append("\n\n\t");
        predSignatureSB.append("(");
        predSignatureSB.append(invariantPreAssignmentResult);
        predSignatureSB.append(" and ");
        predSignatureSB.append("not(");
        predSignatureSB.append(exitConditionResult);
        predSignatureSB.append(")");
        predSignatureSB.append("\n\t => \n\t");
        predSignatureSB.append(postcondTranslatedString).append(") \t\t\t // post condition\n}\n\n");

        // Generate check block
        StringBuilder assertSB = addCheckBlockHelper(predName, assertName, precondTranslatedString, forAllParamSB, forSomeParamSB, predInputParamSB);
        this.finalResult = predSignatureSB.append(assertSB).toString();
        this.incrementLoopsTranslated();
    }

    @Override
    public void visitForAll(ForAll exp) {
        Translator tr = new Translator(this.originalToAlloy);
        Instruction inside = exp.getInside();
        inside.accept(tr);
        quantificationHelper(tr.result, "all", (Array) exp.getArray());
    }

    @Override
    public void visitForSome(ForSome exp) {
        Translator tr = new Translator(this.originalToAlloy);
        Instruction inside = exp.getInside();
        inside.accept(tr);
        quantificationHelper(tr.result, "some", (Array) exp.getArray());
    }

    @Override
    public void visitAddToArray(AddToArray exp) {
        Translator tr = new Translator(this.originalToAlloy);
        Instruction inside = exp.getInside();
        inside.accept(tr);
        arrayOpHelper(tr.result, "add", (Array) exp.getArray());
    }

    @Override
    public void visitRemoveFromArray(RemoveFromArray exp) {
        Translator tr = new Translator(this.originalToAlloy);
        Instruction inside = exp.getInside();
        inside.accept(tr);
        arrayOpHelper(tr.result, "delete", (Array) exp.getArray());
    }

    @Override
    public void visitEach(Each exp) {
        result.add("each");
    }

    // ************************************* HELPER METHODS *******************************************************
    // ************************************* HELPER METHODS *******************************************************
    // ************************************* HELPER METHODS *******************************************************
    // ************************************* HELPER METHODS *******************************************************
    // ************************************* HELPER METHODS *******************************************************

    /**
     * Helper function to map the given names of variables to their alloy names
     * It skips the variables that contain "_old" in their original names
     *
     * @param vars Set of variable names (original names)
     * @return Map that maps original name to alloy name
     * <p>
     * For Example: vars={"x","x_old","y"}, return={"x":"arg1","y":"arg2"}
     **/
    private Map<String, String> originalToAlloyCalculator(Set<String> vars) {
        Map<String, String> result = new HashMap<>();
        int counter = 1;
        for (String each : vars) {
            if (!each.contains("_old")) {
                String alloyVar = "arg" + (counter);
                String originalVar = each;
                result.put(originalVar, alloyVar);
                counter++;
            }
        }
        return result;
    }

    /**
     * Helper function that removes the last appearance of symbol in sb if there is any
     *
     * @param sb     StringBuilder to remove from the symbol
     * @param symbol String representing the symbol to remove
     **/
    private void removeLastAppearanceOfSymbol(StringBuilder sb, String symbol) {
        if (sb.lastIndexOf(symbol) != -1) {
            sb.deleteCharAt(sb.lastIndexOf(symbol));
        }
    }

    /**
     * Helper function to update the value of the keys in the givenMapping map based
     * on their largest updated values in the newMapping map
     *
     * @param resultMaxUsed Map<String,String> the map to be updates
     * @param key           the key for which the value will be updated
     * @param newValue      the newValue
     * <p>
     * For Example: resultMaxUsed={"x":"arg1","y":"arg2"}, key="x", newValue="arg1'''"
     * => (After updateMaxUsed is done) resultMaxUsed={"x":"arg1'''","y":"arg2"}
     **/
    private void updateMaxUsed(Map<String, String> resultMaxUsed, String key, String newValue) {
        if (resultMaxUsed.containsKey(key)) {
            if (newValue.startsWith(resultMaxUsed.get(key)) && resultMaxUsed.get(key).length() < newValue.length()) {
                resultMaxUsed.put(key, newValue);
            }
        }
    }

    /**
     * Helper function to create a StringBuilder instance consisting of the
     * assignments in the given assignments Map
     *
     * @param assignments Map that indicates assignments (i.e. key=value)
     * @return StringBuilder which represents parsing of this assignments
     * <p>
     * For Example: assignments{"arg1'":"arg2.add[2]","arg2'":"1"}
     * return= "arg1'=arg2.add[2] and arg2'=1"
     **/
    private StringBuilder assignmentsToString(Map<String, String> assignments) {
        StringBuilder result = new StringBuilder();
        result.append("((").append(trueInAlloy).append(") in True)");
        for (String key : assignments.keySet()) {
            result.append(" and ");
            result.append(key);
            if (assignments.get(key) != null) {
                result.append("=");
                result.append(assignments.get(key));
            }
        }
        return result;
    }

    /**
     * Helper function to add the assignments in the given assignments
     * Map into the result array passed as an argument
     *
     * @param assignments Map that indicates assignments (i.e. key=value)
     * <p>
     * For Example: assignments{"arg1'":"arg2.add[2]","arg2'":"1"}
     * result=result + ["arg1'", "=", "arg2.add[2]", " and ", "arg2'", "=", "1"]
     **/
    private void assignmentsToString(List<String> result, Map<String, String> assignments) {
        for (String key : assignments.keySet()) {
            this.result.add(" and ");
            this.result.add(key);
            if (assignments.get(key) != null) {
                this.result.add("=");
                this.result.add(assignments.get(key));
            }
        }
    }

    /**
     * Helper function that updates the passed StringBuilders to contained parameters
     *
     * @param preOriginalToAlloy  Map<String,String> maps the original names to their alloy counterpart before assignments
     * @param postOriginalToAlloy Map<String,String> maps the original names to their alloy counterparts after the assignments
     * @param vars                Map<String,Value> list variables to use
     * @param predParamSB         StringBuilder that will contain the parameters for alloy predicate
     * @param forAllParamSB       StringBuilder that will contain the parameters for alloy for all statement
     * @param forSomeParamSB      StringBuilder that will contain the parameters for alloy for some statement
     * @param predInputParamSB    StringBuilder that will contain the parameters for alloy predicate call (i.e. predParamSB)
     **/
    private void alloyParametersCalculator(Map<String, String> preOriginalToAlloy,
                                           Map<String, String> postOriginalToAlloy,
                                           Map<String, Value> vars,
                                           StringBuilder predParamSB,
                                           StringBuilder forAllParamSB,
                                           StringBuilder forSomeParamSB,
                                           StringBuilder predInputParamSB) {
        for (String key : preOriginalToAlloy.keySet()) {
            String alloyVar = preOriginalToAlloy.get(key);
            String varType = vars.get(key).getAlloyType();
            List<String> remainingVars = listOfVariablesUsed(alloyVar, postOriginalToAlloy.get(key));

            predParamSB.append(alloyVar);
            remainingVars.forEach(each -> predParamSB.append(",").append(each));
            predParamSB.append(":").append(varType).append(",");
            forAllParamSB.append(alloyVar).append(":").append(varType).append(",");
            remainingVars.forEach(each -> forSomeParamSB.append(each).append(":").append(varType).append(","));
            predInputParamSB.append(alloyVar).append(",");
            remainingVars.forEach(each -> predInputParamSB.append(each).append(","));
        }
        removeLastAppearanceOfSymbol(predParamSB, ",");
        removeLastAppearanceOfSymbol(forAllParamSB, ",");
        removeLastAppearanceOfSymbol(forSomeParamSB, ",");
        removeLastAppearanceOfSymbol(predInputParamSB, ",");
    }


    /**
     * Helper function to get the names of all additional variables used in Alloy
     * that correspond to a specific variable in the input language. It calculates
     * the result by finding all possible variable names between names of parameter
     * val and parameter largestVal
     *
     * @param val        String representing the initial corresponding name for a variable
     * @param largestVal representing the final version of the name for the corresponding variable
     * @return List of String that represent the names of the variables in Alloy
     * <p>
     * For Example: val="arg1", largestVal="arg1'''" return=["arg1'","arg1''","arg1'''"]
     **/
    protected List<String> listOfVariablesUsed(String val, String largestVal) {
        List<String> result = new ArrayList<>();
        if (largestVal.equals(val)) {
            return result;
        }
        while (largestVal.startsWith(val) && !largestVal.equals(val)) {
            val += "'";
            result.add(val);
        }
        return result;
    }

    /**
     * formerly named updateMaxUsed
     * Helper function to update the values in the lhsResultMaxUsed
     * with values in rhsResultMaxUsed (if rhsResultMaxUsed has higher values)
     *
     * @param lhsResultMaxUsed Map<String,String> to be updated
     * @param rhsResultMaxUsed Map<String,String> to use the values for the update
     * <p>
     * For Example: lhsResultMaxUsed={"x":"arg1","y":"arg2'"}, rhsResultMaxUsed={"x":"arg1''","y":"arg2"}
     * => (After updateMaxUsed is done) lhsResultMaxUsed={"x":"arg1''","y":"arg2'"}
     **/
    protected void updateToLargestMapping(Map<String, String> lhsResultMaxUsed, Map<String, String> rhsResultMaxUsed) {
        for (String key : lhsResultMaxUsed.keySet()) {
            if (rhsResultMaxUsed.containsKey(key)) {
                if (rhsResultMaxUsed.get(key).startsWith(lhsResultMaxUsed.get(key)) && lhsResultMaxUsed.get(key).length() < rhsResultMaxUsed.get(key).length()) {
                    lhsResultMaxUsed.put(key, rhsResultMaxUsed.get(key));
                }
            }
        }
    }

    /**
     * Helper function that returns a map containing the missing assignments for variables
     * used in the postcondition statement
     *
     * @param lhsResultMaxUsed Map<String,String> to be updated
     * @param rhsResultMaxUsed Map<String,String> to use the values for the update
     * For Example: originalToAlloy={"x":"arg1","y":"arg2"}, alloyAssignments={"x":"arg1","y":"arg2'"}
     * and originalToLargestAlloy = {"x":"arg1","y":"arg2''"}
     * => result = {"arg2''","arg2'"}
     **/
    protected Map<String, String> largestValueMap(Map<String, String> lhsResultMaxUsed, Map<String, String> rhsResultMaxUsed) {
        Map<String, String> result = new HashMap<>();
        for (String key : lhsResultMaxUsed.keySet()) {
            if (rhsResultMaxUsed.containsKey(key)) {
                if (rhsResultMaxUsed.get(key).startsWith(lhsResultMaxUsed.get(key)) && lhsResultMaxUsed.get(key).length() < rhsResultMaxUsed.get(key).length()) {
                    result.put(rhsResultMaxUsed.get(key), lhsResultMaxUsed.get(key));
                }
            }
        }
        return result;
    }

    /**
     * Helper function to update the values in the given list origOutput with their
     * corresponding keys (which represent their updated values) in the given map
     * and converts it to string
     *
     * @param origOutput    list of strings to be updated
     * @param updates       Map<String,String> that maps keys to their corresponding new values
     * @param otherUpdates  Map<String,String> that maps keys to their corresponding new values
     *                      otherUpdates is only used as an argument to updateFunctionParameters
     * @param resultMaxUsed Map<String,String> that maps keys to their corresponding maximum new values
     *                      resultMaxUsed is only used as an argument to updateFunctionParameters
     * <p>
     * For Example: origOutput=["x","+","y","-","5"] updates={"x":"arg1'",y="arg2''"}
     * result = "arg1'+arg2''-5"
     * <p>
     * Note: If origOutput contains a function call we handle it differently than regular variables
     **/
    protected String updateToString(List<String> origOutput, Map<String, String> updates, Map<String, String> otherUpdates, Map<String, String> resultMaxUsed) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < origOutput.size(); i++) {
            String str = origOutput.get(i);
            // Special case if the str is a function name (i.e it is a function call)
            if (functionsDefined.containsKey(str)) {
                result.append(functionsDefined.get(str));
                i++;
                // Get the parameters of this function call
                // And update the values of this parameters
                // using updateFunctionParameters helper function
                List<String> parameters = new ArrayList<>();
                // since we know that we are parsing a function call
                // the parameters are everything until we hit the first "]"
                // example of a function call in originalOutput
                // is [ "test", "[", "x", "y", "z", "]" ]
                while ((i + 1) < origOutput.size() && !origOutput.get(i).equals("]")) {
                    parameters.add(origOutput.get(i));
                    i++;
                }
                parameters.add(origOutput.get(i)); // add the closing bracket "]"
                result.append(updateFunctionParameters(str, parameters, updates, otherUpdates, resultMaxUsed));
            } else result.append(updates.getOrDefault(str, str));
        }
        return result.toString();
    }


    /**
     * Helper function to map the parameter names to the number of times they get
     * reassigned in the actualFunction body (i.e. sequential composition)
     *
     * @param actualFunction FunctionConditional object to count the parameters
     * @return Map that maps the variable names to their counts
     * <p>
     * For Example: actualFunction["x","x","y"], return={"x":2,"y":1}
     **/
    protected Map<String, Integer> functionParamCount(FunctionConditional actualFunction) {
        Map<String, Value> vars = actualFunction.getVariables();
        Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
        Map<String, String> postOriginalToAlloy = new HashMap<>();    // will hold the mapping after assignments
        Map<String, Integer> originalParamCount = new HashMap<>();    // will hold the function parameter counts
        Map<String, String> tmpLhsOfUpdates = new HashMap<>();
        Map<String, String> tmpRhsOfUpdates = new HashMap<>();

        preOriginalToAlloy.keySet().forEach(each -> originalParamCount.put(preOriginalToAlloy.get(each), 1));
        preOriginalToAlloy.keySet().forEach(key -> tmpLhsOfUpdates.put(key, preOriginalToAlloy.get(key) + "'"));
        preOriginalToAlloy.keySet().forEach(key -> tmpRhsOfUpdates.put(key, preOriginalToAlloy.get(key)));

        // Visit the assignments of the actual function
        Translator assignmentsTranslator = new Translator(preOriginalToAlloy, functionsDefined, tmpLhsOfUpdates, tmpRhsOfUpdates);
        actualFunction.getAssignments().accept(assignmentsTranslator);

        // update the postOriginalToAlloy mapping
        postOriginalToAlloy.putAll(preOriginalToAlloy);
        updateToLargestMapping(postOriginalToAlloy, assignmentsTranslator.getResultMaxUsed());

        // calculate the number of times each parameter has been reassigned (i.e used) in the
        // body of the actual function
        for (String key : preOriginalToAlloy.keySet()) {
            String alloyVar = preOriginalToAlloy.get(key);
            List<String> remainingVars = listOfVariablesUsed(alloyVar, postOriginalToAlloy.get(key));
            remainingVars.forEach(each -> originalParamCount.put(alloyVar, originalParamCount.get(alloyVar) + 1));
        }
        return originalParamCount;
    }


    /**
     * Helper function to update the special case of mapping. Which is mapping a function call expression
     *
     * @param functionName  represents the name of the function that is being called
     * @param origOutput    list of strings to be updated (represents the parameters in function call)
     * @param rhsOfUpdates  Map<String,String> that maps keys to their last used alloy name that appeared on the lhs of an assignment
     * @param lhsOfUpdates  Map<String,String> that maps keys to their next available alloy name
     * @param resultMaxUsed Map<String,String> that maps keys to their maximum used alloy name
     **/
    protected String updateFunctionParameters(String functionName,
                                              List<String> origOutput,
                                              Map<String, String> rhsOfUpdates,
                                              Map<String, String> lhsOfUpdates,
                                              Map<String, String> resultMaxUsed) {
        List<Integer> functionParamCounter = new ArrayList<>();  // Helper counter to know which parameter to update next
        String last = "?";
        int lastIndex = -1;
        for (String s : origOutput) {
            if (rhsOfUpdates.containsKey(s)) { // make sure it is not garbage (for example "," )
                if (s.equals(last)) {
                    functionParamCounter.set(lastIndex, functionParamCounter.get(lastIndex) + 1);
                } else {
                    functionParamCounter.add(1);
                    last = s;
                    lastIndex++;
                }
            }
        }

		/* Pair left represent the current Variable
           Pair right represents the curIndex in that variable
        */
        Pair<Integer, Integer> currIndex = new Pair<>(0, 0);

        StringBuilder result = new StringBuilder();

        for (String str : origOutput) {
            if (rhsOfUpdates.containsKey(str)) {
                if (currIndex.getR() == 0) {
                    // this is the first appearance of str variable
                    // therefore use the mapping in the rhsOfUpdates
                    // because this mapping will contain the alloy variable
                    // that will have a value assigned to it in alloy
                    result.append(rhsOfUpdates.get(str));
                    updateMaxUsed(resultMaxUsed, str, rhsOfUpdates.get(str));
                } else {
                    // this is the not first appearance of str variable
                    // therefore use the mapping in the lhsOfUpdates
                    // because this mapping will contain the alloy variable
                    // that is available to use and no value is assigned to
                    // it in alloy
                    result.append(lhsOfUpdates.get(str));
                    updateMaxUsed(resultMaxUsed, str, lhsOfUpdates.get(str));
                    // update the lhsOfUpdates to move on to the next available
                    // alloy variable name
                    lhsOfUpdates.put(str, lhsOfUpdates.get(str) + "'");
                }
                // update the index so that we know what we parsed so far
                // and how to parse the next str in the origOutput
                currIndex.setR(currIndex.getR() + 1);
                if (currIndex.getR() == functionParamCounter.get(currIndex.getL())) {
                    currIndex.setL(currIndex.getL() + 1);
                    currIndex.setR(0);
                }
            } else {
                result.append(str);
            }
        }
        return result.toString();
    }

    /**
     * A helper method for logical operations to prevent having smelly code.  Gets the translation of left and right
     * expression than adds both to the result along with the operator inputted.
     *
     * @param exp
     * @param operator ie. andGate orGate
     */
    public void logicalHelper(LogicalComposite exp, String operator) {
        Translator lhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getRightExpr().accept(rhsTrans);
        this.result.add(operator + "[");
        this.result.addAll(lhsTrans.getResult());
        this.result.add(", ");
        this.result.addAll(rhsTrans.getResult());
        this.result.add("]");
    }

    /**
     * A helper method for relational operations to prevent having smelly code.  Gets the translation of left and right
     * expression than adds both to the result along with the operator inputted.
     *
     * @param exp
     * @param operator ie. < > <= >=
     */
    public void relationalHelper(Relational exp, String operator) {
        Translator lhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getLeftExpr().accept(lhsTrans);
        Translator rhsTrans = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getRightExpr().accept(rhsTrans);
        this.result.add("((");
        this.result.addAll(lhsTrans.getResult());
        this.result.add(" " + operator + " ");
        this.result.addAll(rhsTrans.getResult());
        this.result.add(") => True else False)");
    }

    /**
     * A helper method for arithmetic operations to prevent having smelly code.  Gets the translation of left and right
     * expression than adds both to the result along with the operator inputted.
     *
     * @param exp
     * @param operator ie. add rem div sub
     */
    public void arithmeticHelper(ArithmeticComposite exp, String operator) {
        Translator lhsTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getLeftExpr().accept(lhsTranslator);
        Translator rhsTranslator = new Translator(originalToAlloy, functionsDefined, lhsOfUpdates, rhsOfUpdates);
        exp.getRightExpr().accept(rhsTranslator);
        result.addAll(lhsTranslator.getResult());
        result.add("." + operator + "[");
        result.addAll(rhsTranslator.getResult());
        result.add("]");
    }

    /**
     * A helper method for generating check block to prevent having smelly code.Generates a check block given the inputs.
     *
     * @param predName
     * @param assertName
     * @param precondTranslatedString
     * @param forAllParamSB
     * @param forSomeParamSB
     * @param predInputParamSB
     * @return assertSB - Instance of StringBuilder that has the result
     */
    private StringBuilder addCheckBlockHelper(String predName, String assertName, String precondTranslatedString, StringBuilder forAllParamSB, StringBuilder forSomeParamSB, StringBuilder predInputParamSB) {
        StringBuilder assertSB = new StringBuilder();
        assertSB.append("check ").append(assertName).append(" {\n");
        assertSB.append("\t { all ").append(forAllParamSB).append(" | ");
        assertSB.append(forSomeParamSB.length() > 0 ? "some " + forSomeParamSB + " | " : "");
        assertSB.append(precondTranslatedString).append(" => ").append(predName).append("[");
        assertSB.append(predInputParamSB).append("] }").append("\n}\n");
        return assertSB;
    }

    /**
     * A helper method for generating pred block. Generates a pred block given the inputs.
     *
     * @param predName
     * @param predParamSB
     * @param translated
     * @param postcondTranslatedString
     * @return predSignatureSB - Instance of StringBuilder that has the result
     */
    private StringBuilder addPredBlockHelper(String predName, StringBuilder predParamSB, String translated, String postcondTranslatedString) {
        StringBuilder predSignatureSB = new StringBuilder();
        predSignatureSB.append("pred ").append(predName);
        predSignatureSB.append(" [").append(predParamSB).append("] {\n");
        predSignatureSB.append("\t").append(translated).append("\n\t");
        predSignatureSB.append(postcondTranslatedString).append("\t\t\t // post condition\n}\n\n");
        return predSignatureSB;
    }

    /**
     * A helper method for generating postconditions. Generates a postcondition given the inputs.
     *
     * @param postcondTranslated
     * @return StringBuilder - Instance of StringBuilder that has the result
     */
    private StringBuilder addPostcondHelper(List<String> postcondTranslated) {
        return contractHelper(postcondTranslated);
    }

    /**
     * A helper method for generating precondition. Generates a precondition given the inputs.
     *
     * @param precondTranslated
     * @return StringBuilder - Instance of StringBuilder that has the result
     */
    private StringBuilder addPrecondHelper(List<String> precondTranslated) {
        return contractHelper(precondTranslated);
    }

    /**
     * A helper method for addPostcondHelper and addPrecondHelper to generate a contract.
     *
     * @param translated
     * @return genericSB - Instance of StringBuilder that has the result
     */
    private StringBuilder contractHelper(List<String> translated) {
        StringBuilder genericSB = new StringBuilder();
        genericSB.append("((");
        translated.forEach(genericSB::append);
        genericSB.append(") in True) ");
        return genericSB;
    }

    /**
     * A helper method for visitForAll and visitForSome to generate a quantification operation.
     *
     * @param translated
     * @param operationType i.e. all some
     * @param array         Instance of Array
     */
    private void quantificationHelper(List<String> translated, String operationType, Array array) {
        StringBuilder insideTranslationSB = new StringBuilder();
        insideTranslationSB.append("(");
        translated.forEach(insideTranslationSB::append);
        insideTranslationSB.append(" in True").append(")");
        String insideTranslation = insideTranslationSB.toString();

        String arrayNameOriginal = array.getID();
        String arrayNameInAlloy = this.getOriginalToAlloy().get(arrayNameOriginal);
        String lambdaType = values.getPrimitiveType(arrayNameOriginal);

        result.add("(");
        result.add("(");
        result.add(operationType + " ");
        result.add("arrayElems: ");
        result.add(arrayNameInAlloy);
        result.add(".elems ");
        result.add("| ");
        result.add("arrayElems ");
        result.add(" in ");
        result.add("{");
        result.add("each: ");
        result.add(lambdaType);
        result.add(" | ");
        result.add(insideTranslation);
        result.add("}");
        result.add(")");
        result.add("=> True else False");
        result.add(")");
    }

    /**
     * A helper method for visifAddToArray and visitRemoveFromArray to translate array operations.
     *
     * @param translated
     * @param opType     add/delete
     * @param array
     */
    private void arrayOpHelper(List<String> translated, String opType, Array array) {
        StringBuilder insideTranslationSB = new StringBuilder();
        translated.forEach(insideTranslationSB::append);
        String insideTranslation = insideTranslationSB.toString();

        String arrayNameOriginal = array.getID();
        String arrayNameInAlloy = this.getOriginalToAlloy().get(arrayNameOriginal);

        result.add(arrayNameInAlloy);
        String suffix = "";
        switch (opType) {
            case "add":
                suffix = ".add[" + insideTranslation + "]";
                break;
            case "delete":
                suffix = ".delete[" + arrayNameInAlloy + ".idxOf[" + insideTranslation + "]]";
                break;
            default:
        }
        result.add(suffix);
    }

    /**
     * A helper method to convert a list of strings into an instance of StringBuilder.
     *
     * @param translatedList
     * @return - Instance of StringBuilder that has the result
     */
    private StringBuilder listToStringBuilderHelper(List<String> translatedList) {
        StringBuilder genericSB = new StringBuilder();
        translatedList.forEach(genericSB::append);
        return genericSB;
    }

    // ************************************* GETTERS *******************************************************
    // ************************************* GETTERS *******************************************************
    // ************************************* GETTERS *******************************************************
    // ************************************* GETTERS *******************************************************
    // ************************************* GETTERS *******************************************************

    /**
     * Getter for result
     *
     * @return result
     */
    private List<String> getResult() {
        return result;
    }

    /**
     * Getter for resultMap
     *
     * @return resultMap
     */
    private Map<String, String> getResultMap() {
        return resultMap;
    }

    /**
     * Getter for originalToAlloy
     *
     * @return originalToAlloy
     */
    private Map<String, String> getOriginalToAlloy() {
        return originalToAlloy;
    }

    /**
     * Getter for finalResult
     *
     * @return finalResult
     */
    public String getFinalResult() {
        return finalResult;
    }

    /**
     * Getter for resultMaxUsed
     *
     * @return resultMaxUsed
     */
    public Map<String, String> getResultMaxUsed() {
        return resultMaxUsed;
    }

    // ************************************* INCREMENTERS *******************************************************
    // ************************************* INCREMENTERS *******************************************************
    // ************************************* INCREMENTERS *******************************************************
    // ************************************* INCREMENTERS *******************************************************
    // ************************************* INCREMENTERS *******************************************************

    /**
     * Increments loopsTranslated
     */
    private void incrementLoopsTranslated() {
        loopsTranslated++;
    }

    /**
     * Increments functionsTranslated
     */
    private void incrementFunctionsTranslated() {
        functionsTranslated++;
    }

    /**
     * Increments ifStatementsTranslated
     */
    private void incrementStatementsTranslated() {
        ifStatementsTranslated++;
    }

}
