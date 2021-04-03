package com.junittest;

public class ExceptionForUserInputs extends Exception {
    exceptionType type;
    //Initializing the exception
    public ExceptionForUserInputs(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    enum exceptionType {
        //Null pointer exception's variable
        given_null_input,
        //Empty parameter exception's variable
        given_empty_input
    }
}

