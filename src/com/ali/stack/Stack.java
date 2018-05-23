package com.ali.stack;

import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;

import java.util.Arrays;

public class Stack<T> {

    private int top;
    private T[] elements;
    private int size;
    public Stack(int size) {
        this.size = size;
        elements = (T[]) new Object[size];
        this.top = -1;
    }
    /**
     * pushes element to the top of the stack.
     * @param element - the element to be pushed on top of the stack.
     */
    public void push (T element) throws StackOverFlowException {
        if(isFull()){
            throw new StackOverFlowException("Stack is full unable to add the element");
        }
        elements[++top] = element;
    }
    public T pop() throws StackUnderFlowException {
        if(isEmpty()){
            throw new StackUnderFlowException("Stack is empty,no elements to remove");
        }
        return elements[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size-1);
    }

    public void printCurrentStackstate(){
        Arrays.stream(elements).forEach(element ->{
                System.out.println(element);
        });
    }
    public int getTop(){
        return top;
    }
}