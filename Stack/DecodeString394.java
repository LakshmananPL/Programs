package com.codes.Stack;

import java.util.Stack;

public class DecodeString394 {
    public static void main(String[] args) {
        System.out.println(findvalidString("2[5[bc]5[xy]]xd2[rt]"));
    }

    private static String findvalidString(String string) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch!=']')
                stack.push(String.valueOf(string.charAt(i)));
            String string1 = "";
            if (string.charAt(i) == ']') {
                while (!stack.peek().equals("[")) {
                    string1 = stack.pop() + string1;
                }
                stack.pop();
                int count = Integer.parseInt(stack.pop());
                for (int j = 1; j < 3; j++) {
                    if(stack.isEmpty() || !stack.peek().matches("\\d"))
                        break;
                    count = (int) ((Math.pow(10, j) * Integer.parseInt(stack.pop())) + count);
                }
                for (int j = 0; j < count; j++) {
                    stack.push(string1);
                }
            }
        }
        String ans = "";
        for (String string1 : stack)
            ans = ans + string1;
        return ans;
    }
}
