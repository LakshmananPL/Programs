package com.codes.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationNumber784 {
    public static void main(String[] args) {
        System.out.println(findPermutation("a1b2"));
    }

    private static List<String> findPermutation(String string) {
        return permutationHelper("",string);
    }

    private static ArrayList<String> permutationHelper(String processed, String string) {
        if(string.isEmpty()){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(processed);
            return arrayList;
        }
        char ch = string.charAt(0);
        HashSet<String> hashSet = new HashSet<>();
        if (Character.isDigit(ch)) {
            hashSet.addAll(permutationHelper(processed + ch, string.substring(1)));
        }else {
            hashSet.addAll(permutationHelper(processed + Character.toLowerCase(ch), string.substring(1)));
            hashSet.addAll(permutationHelper(processed + Character.toUpperCase(ch), string.substring(1)));
        }
        return new ArrayList<>(hashSet);
    }
}
