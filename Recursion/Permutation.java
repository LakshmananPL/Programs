package com.codes.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        // findPermutations("abc","");
        System.out.println(findPermutationsList("abc",""));
        //System.out.println(findPermutationsCount("abc",""));
        // System.out.println(findPermutationsOfAllSubsequence("abc",""));
    }

    private static void findPermutations(String input, String processed) {
        if(input.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = input.charAt(0);
        for (int i = 0; i < processed.length()+1; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            findPermutations(input.substring(1), first + ch + second);
        }
    }

    private static ArrayList<String> findPermutationsList(String input, String processed) {
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = input.charAt(0);
        Set<String> uniqueSet = new HashSet<>();
        for (int i = 0; i < processed.length()+1; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            uniqueSet.addAll(findPermutationsList(input.substring(1), first + ch + second));
        }
        return new ArrayList<>(uniqueSet);
    }

    private static int findPermutationsCount(String input, String processed) {
        if(input.isEmpty()){
            //System.out.println(processed);
            return 1;
        }
        char ch = input.charAt(0);
        int count = 0;
        for (int i = 0; i < processed.length()+1; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            count = count + findPermutationsCount(input.substring(1), first + ch + second);
        }
        return count;
    }

    private static ArrayList<String> findPermutationsOfAllSubsequence(String input, String processed) {
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!processed.isEmpty())
                list.add(processed);
            return list;
        }
        char ch = input.charAt(0);
        Set<String> uniqueSet = new HashSet<>();
        for (int i = 0; i < processed.length()+1; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            uniqueSet.addAll(findPermutationsOfAllSubsequence(input.substring(1), first + ch + second));
            uniqueSet.addAll(findPermutationsOfAllSubsequence(input.substring(1), processed));
        }
        return new ArrayList<>(uniqueSet);
    }
}
