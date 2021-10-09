package com.kelaniya.uni.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    //Constructors of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getId(){
        String id = args[0];
        return id;
    }
}
