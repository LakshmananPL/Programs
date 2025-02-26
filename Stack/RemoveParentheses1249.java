package com.codes.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveParentheses1249 {
    public static void main(String[] args) {
        System.out.println(removeParentheses("())()((("));
    }
    public static String removeParentheses(String string){
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch == '(') {
                deque1.add(i);
            }
            if(ch == ')'){
                if (!deque1.isEmpty())
                    deque1.pop();
                else
                    deque2.add(i);
            }
        }
        while (!deque1.isEmpty()){
            deque2.add(deque1.pop());
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if(!deque2.contains(i))
                stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }
}
