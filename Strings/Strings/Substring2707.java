package com.codes.Strings;

public class Substring2707 {
    public static void main(String[] args) {
        String[] strings = {"leet","code","leetcode"};
        System.out.println(findCount("leetscode", strings));
    }

    public static int findCount(String string , String[] strings){
        int[] count = new int[26];
        int counter = 0;
        for (String string1 : strings) {
            isSubsequence(string, string1, count);
        }
        for (int i = 0; i < string.length(); i++) {
            if(count[string.charAt(i) - 'a' ] == 0)
                counter++;
        }
        return counter;
    }

    public static void isSubsequence(String mainString, String subString, int[] count) {
        int mainIndex = 0, subIndex = 0;
        while (mainIndex < mainString.length() && subIndex < subString.length()) {
            if (mainString.charAt(mainIndex) == subString.charAt(subIndex)) {
                count[mainString.charAt(mainIndex) - 'a']++;
                subIndex++;
            }
            mainIndex++;
        }
    }
}
