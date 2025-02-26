package com.codes.Strings;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        System.out.println(findLPS("abcbabdmaddamxyz"));
    }

    private static String findLPS(String string) {
        int subStringLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    if (isPalindrome(string, i, j)) {
                        if (subStringLength <= j - i) {
                            subStringLength = j - i;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
        return string.substring(start,++end);
    }

    public static String findLPS1(String string) {
        if (string == null || string.length() < 2) {
            return string;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < string.length(); i++) {
            int len1 = expandAroundCenter(string, i, i);
            int len2 = expandAroundCenter(string, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return string.substring(start, start + maxLength);
    }

    private static int expandAroundCenter(String string, int left, int right) {
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    private static boolean isPalindrome(String string, int i, int j){
        while (i<=j){
            if(string.charAt(i)!=string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
