package model.declaration;

import model.Declaration;

/*
 * VariableInitialization Class that represents initialization of a variable
 */
public class VariableInitializationCopy extends Declaration {
    private String id;
    private boolean value;
    private String type;

    /*
     * Constructor
     *
     * @param id the id of the variable
     *
     * @param type the type of the variable (not important in this project)
     *
     * @param value the assigned value of the variable
     */
    public VariableInitializationCopy(VariableInitializationCopy other) {
        this.id = other.id;
        this.type = other.type;
        this.value = other.value;
    }

    /*
     * retrieve the id of the variable
     *
     * @return retrieve the id of the variable
     */
    public String getID() {
        return this.id;
    }

    /*
     * retrieve the type of the variable
     *
     * @return retrieve the type of the variable
     */
    public String getType() {
        return this.type;
    }

    /*
     * retrieve the value of the variable
     *
     * @return retrieve the value of the variable
     */
    public boolean getValue() {
        return this.value;
    }
}