package com.ali.datstructures.stack.problems;

import com.ali.datstructures.exceptions.StackOverFlowException;
import com.ali.datstructures.exceptions.StackUnderFlowException;
import com.ali.datstructures.stack.Stack;

public class ReverseStringUsingStack {
    public static void reverseString(String inputString) throws StackOverFlowException, StackUnderFlowException {
        if(inputString != null && !"".equals(inputString)){
            //TODO: To implement the string reversal logic using stack.
            int stringLength = inputString.length();
            Stack <Character>stringReversalStack = new Stack<>(stringLength);
            for(int i=0;i<stringLength;i++){
                stringReversalStack.push(inputString.charAt(i));
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<stringLength;i++){
                stringBuilder.append(stringReversalStack.pop());
            }
            System.out.println(stringBuilder.toString());
        }else
            throw new IllegalArgumentException("String passed is either blank or null");
    }
}
