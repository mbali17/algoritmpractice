package com.algopractice.test;

import com.algopractice.ds.stack.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack myStack =new Stack(10);
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(10);
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.peek());

    }
}
