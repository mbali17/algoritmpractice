package com.ali.exceptions;

/**
 * Exception thrown when the stack is full;
 */
public class StackOverFlowException extends Exception{
    public StackOverFlowException(String message){
        super(message);
    }
}
