package com.codes.Recursion;

public class skipApple {
    public static void main(String[] args) {
        System.out.println(createArray("bacapplecad", ""));
    }

    private static String createArray(String input, String ans) {
        if(input.isEmpty()){
            return ans;
        }
        if (input.startsWith("apple")){
            return createArray(input.substring(5),ans);
        }else {
            return createArray(input.substring(1), ans+input.charAt(0));
        }
    }

    private static String createArray(String input) {
        if(input.isEmpty()){
            return "";
        }
        char ch = input.charAt(0);
        if (input.startsWith("apple")){
            return createArray(input.substring(5));
        }
        return ch + createArray(input.substring(1));
    }
}
