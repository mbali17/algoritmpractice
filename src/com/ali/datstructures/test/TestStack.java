package com.ali.datstructures.test;

import com.ali.datstructures.exceptions.StackOverFlowException;
import com.ali.datstructures.exceptions.StackUnderFlowException;
import com.ali.datstructures.stack.Stack;
import com.ali.datstructures.stack.problems.ReverseStringUsingStack;

import java.util.Scanner;

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
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Enter the String to reverse:");
            String inputToReverse = inputScanner.nextLine();
            ReverseStringUsingStack.reverseString(inputToReverse);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        } catch (StackUnderFlowException e) {
            e.printStackTrace();
        }
    }
}
