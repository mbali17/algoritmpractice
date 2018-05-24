package com.ali.stack;

import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;

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

    /**
     *
     * @return The element on the top of th stack.
     * @throws StackUnderFlowException
     */
    public T pop() throws StackUnderFlowException {
        if(isEmpty()){
            throw new StackUnderFlowException("Stack is empty,no elements to remove");
        }
        return elements[top--];
    }

    /**
     * Check if the stack is empty
     * @return {@code true} if the top is -1 otherwise {@code false}
     */
    public boolean isEmpty(){
        return (top == -1);
    }

    /**
     * Checks if the stack is full
     * @return {@code true} if the top = size-1 otherwise {@code false}
     */
    public boolean isFull(){
        return (top == size-1);
    }

    public void printCurrentStackstate(){
        //System.out.println("printing current stack state"+top);
        for(int i=top;i>=0;i--){
            System.out.print(elements[i]+",");
        }
    }


    public int getTop(){
        return top;
    }
}