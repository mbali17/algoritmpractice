package com.ali.exceptions;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super(message);
    }
}
