package com.ali.datstructures.exceptions;

/**
 * Exception thrown when there are operations performed on empty stack.
 */
public class StackUnderFlowException extends Exception {
    public StackUnderFlowException(String message){
        super(message);
    }
}
