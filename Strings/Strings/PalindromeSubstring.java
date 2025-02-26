package com.codes.Strings;

public class PalindromeSubstring {
    public static void main(String[] args) {
        System.out.println(findPalindromeCount("madam"));
    }

    private static int findPalindromeCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            count += ExpandFromCenter(string, i, i);
            //count += ExpandFromCenter(string, i, i + 1);
        }
        return count;
    }

    private static int ExpandFromCenter(String string, int start, int end) {
        int count = 0;
        while (start>=0 && end<string.length() && string.charAt(start) == string.charAt(end)){
            start--;
            end++;
            count++;
        }
        return count;
    }
}
