package com.codes.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("ta()usa(ab(cv))()"));
    }
    public static String reverseParentheses(String s) {
        Stack<Character> strings = new Stack<>();
        Queue<Character> characterQueue1 = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                do{
                    strings.push(s.charAt(i));
                    if(s.charAt(i)==')')
                        rotateStack(strings,characterQueue1);
                    i++;
                } while (!strings.isEmpty());
                i--;
            }else {
                characterQueue1.add(s.charAt(i));
            }
        }

        return characterQueue1.toString();
    }

   /* private static String makeString(Queue<Character> characterQueue1) {
        String ans = "";

        while (!characterQueue1.isEmpty()){
            ans = ans + characterQueue1.poll();
        }
        return ans;
    }*/

    private static void rotateStack(Stack<Character> stack, Queue<Character> queue) {
        Queue<Character> characterQueue = new LinkedList<>();

        while (stack.peek()!='('){
            if (stack.peek()!=')')
                characterQueue.add(stack.peek());
            stack.pop();
        }
        stack.pop();
        if(stack.isEmpty()){
            while (!characterQueue.isEmpty()){
                queue.add(characterQueue.poll());
            }
        }else {
            while (!characterQueue.isEmpty()){
                stack.push(characterQueue.poll());
            }
        }
    }
}
