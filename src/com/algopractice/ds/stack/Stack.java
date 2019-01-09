package com.algopractice.ds.stack;

public class Stack {

    private int top;
    private int maxSize;
    private long [] stackArray;

    public Stack(int size){
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long element){
        if(!isFull()) {
            top++;
            stackArray[top] = element;
        }
        else{
            System.out.println("The stack is full, the following element : "+ element+" is not added");
        }
    }

    public long pop(){
        if(!isEmpty()) {
            int lastTop = top;
            top--;
            return stackArray[lastTop];
        }
        return -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public long peek(){
        return isEmpty()? -1:stackArray[top];
    }
}
