package model;

public abstract class Instruction {

    public abstract void accept(Visitor visitor);

}
