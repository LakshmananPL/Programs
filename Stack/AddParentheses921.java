package com.codes.Stack;

import java.util.Stack;

public class AddParentheses921 {
    public static void main(String[] args) {
        System.out.println(findMinTime("())"));
    }

    private static int findMinTime(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch == '(')
                stack.push(ch);
            else{
                if (!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        System.out.println(Math.pow(1,10)*2);
        return stack.size();
    }
}
