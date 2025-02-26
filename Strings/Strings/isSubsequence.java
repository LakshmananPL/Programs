package com.codes.Strings;

import java.util.Arrays;
import java.util.List;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");
        System.out.println(findLongestWord(s, dictionary));
    }
    public static String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for (String string : dictionary) {
            if (isSubSequence(s, string)) {
                if (ans.length() < string.length()
                        || (ans.length() == string.length() && string.compareTo(ans) < 0))
                    ans = string;
            }
        }
        return ans;
    }
    public static boolean isSubSequence(String mainString, String subString) {
        int mainIndex = 0, subIndex = 0;
        while (mainIndex < mainString.length() && subIndex < subString.length()) {
            if (mainString.charAt(mainIndex) == subString.charAt(subIndex)) {
                subIndex++;
            }
            mainIndex++;
        }
        return subIndex == subString.length();
    }

    public static boolean isSubSeq(String main, String sub){
        int i = 0;
        int j = 0;
        while (i<main.length() && j<sub.length()){
            if(main.charAt(i) == sub.charAt(j)){
                j++;
            }
            i++;
        }
        return  j==sub.length();
    }
}
