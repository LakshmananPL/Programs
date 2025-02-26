package com.codes.Stack;

import java.util.Stack;

public class ReverseString1190 {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("abc()ab(ab((ab)b))(b)"));
    }
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(ans);
                ans = new StringBuilder();
            } else if (c == ')') {
                ans.reverse();
                ans = st.pop().append(ans);
            } else ans.append(c);
        }
        return ans.toString();
    }
}
