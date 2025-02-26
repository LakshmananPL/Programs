package com.codes.Strings;

public class CanStringMadeFromAnother {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println(canConstruct(a,b));
    }

    public static boolean canConstruct(String s1, String s2) {
        int[] letterCount = new int[26];

        for (char c : s2.toCharArray()) {
            letterCount[c - 'a']++;
        }

        for (char c : s1.toCharArray()) {
            letterCount[c - 'a']--;
            if (letterCount[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
