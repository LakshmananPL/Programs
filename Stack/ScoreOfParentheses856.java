package com.codes.Stack;

public class ScoreOfParentheses856 {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("()(()((())))(()())"));
    }


    public static int scoreOfParentheses(String s) {
        return scoreHelper(s, 0, s.length() - 1);
    }

    private static int scoreHelper(String s, int start, int end) {

        if (start > end) {
            return 0;
        }

        int balance = 0;
        int result = 0;
        int i = start;

        for (int j = start; j <= end; j++) {
            if (s.charAt(j) == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                if (j == i + 1) {
                    result += 1;
                } else {
                    result += 2 * scoreHelper(s, i + 1, j - 1);
                }
                i = j + 1;
            }
        }
        return result;
    }
}
