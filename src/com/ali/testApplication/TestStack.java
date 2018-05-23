package com.ali.testApplication;

import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;
import com.ali.stack.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack <Integer>priorityList =  new Stack<Integer>(5);
        try {
            //We can pass the primitive value directly and autoboxing would handle the conversion.
            priorityList.push(new Integer(5));
            priorityList.push(new Integer(4));
            priorityList.push(new Integer(3));
            priorityList.push(new Integer(2));
            priorityList.push(new Integer(1));
            //Uncommenting the following statement leads to stack overflow exception.
            //priorityList.push(new Integer(0));
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            //Incommmenting the following statement leads to stack underflow exception.
            //priorityList.pop();
            System.out.println(priorityList.isEmpty());
            System.out.println(priorityList.getTop());
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        } catch (StackUnderFlowException e) {
            e.printStackTrace();
        }
    }
}
