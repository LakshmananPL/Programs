package com.codes.Recursion;

import java.util.ArrayList;

public class CountOfSubSequence792 {
    public static void main(String[] args) {
        String[] words = {"a","bb","acd","ace"};
        System.out.println(numMatchingSubseq("abcde", words));
    }

    public static int numMatchingSubseq(String s, String[] words) {
        ArrayList<String> arrayList = findSubSequence(s,"");
        int count = 0;
        for (String string : words)
            if(arrayList.contains(string))
                count++;
        return count;
    }

    public static ArrayList<String> findSubSequence(String s, String s1) {
        if(s.isEmpty()){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(s1);
            return arrayList;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = findSubSequence(s.substring(1), s1+ch);
        ArrayList<String> right = findSubSequence(s.substring(1), s1);
        left.addAll(right);
        return left;
    }
}
