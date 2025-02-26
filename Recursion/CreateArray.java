package com.codes.Recursion;

public class CreateArray {
    public static void main(String[] args) {
        String input = "baccad";
        String ans = "";
        System.out.println(createArray(input, ans));
        //System.out.println(createArray(input));
    }

    private static String createArray(String input, String ans) {
        if(input.isEmpty()){
            return ans;
        }
        if (input.charAt(0) != 'a'){
            return createArray(input.substring(1),ans + input.charAt(0));
        }
        return createArray(input.substring(1), ans);
    }

    private static String createArray(String input) {
        if(input.isEmpty()){
            return "";
        }
        char ch = input.charAt(0);
        if (ch == 'a'){
            return createArray(input.substring(1));
        }
        return ch + createArray(input.substring(1));
    }
}
