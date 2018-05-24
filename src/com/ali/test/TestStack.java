package com.ali.test;

import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;
import com.ali.stack.Stack;
import com.ali.stack.problems.ReverseStringUsingStack;

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
            priorityList.printCurrentStackstate();
            //Uncommenting the following statement leads to stack overflow exception for size 5;
            //priorityList.push(new Integer(0));
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            priorityList.pop();
            //commmenting the following statement leads to stack underflow exception for size 5;.
            //priorityList.pop();
            System.out.println(priorityList.isEmpty());
            System.out.println(priorityList.getTop());
            //Reverse the string using stack.
            ReverseStringUsingStack.reverseString("hello");
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        } catch (StackUnderFlowException e) {
            e.printStackTrace();
        }
    }
}
