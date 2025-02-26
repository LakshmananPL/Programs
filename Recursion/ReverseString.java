package com.codes.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseString(s, 0, s.length-1));
        // System.out.println(reverseString("lakshmanan"));
    }

    private static char[] reverseString(char[] s, int start, int end) {
        if(start>end){
            return s;
        }
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;
        return reverseString(s, ++start, --end);
    }

    public static String reverseString(String string){
        if(string.isEmpty())
            return  "";
        char ch = string.charAt(string.length()-1);
        return ch + reverseString(string.substring(0,string.length()-1));
    }
}
