package com.codes.Strings;

public class SubsquenceCount {
    public static void main(String[] args) {
        String s = "z";
        String t = "abcde";
        System.out.println(findMissingCount(s,t));
    }

    private static int findMissingCount(String s, String t) {
        int p = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(p)) {
                count++;
                p++;
            }
            if(t.length()==p)
                break;
        }
        return t.length()-count;
    }

}
