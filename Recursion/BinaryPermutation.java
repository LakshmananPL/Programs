package com.codes.Recursion;

import java.util.ArrayList;

public class BinaryPermutation {
    public static void main(String[] args) {
        //findAllBinaryPermutation("01", "",3);
        System.out.println(findAllBinaryPermutationList("01","",3));
    }

    private static void findAllBinaryPermutation(String binary,String unProcessed, int key) {
        if(unProcessed.length() == key){
            System.out.println(unProcessed);
            return;
        }
        if(unProcessed.isEmpty() || unProcessed.charAt(unProcessed.length() - 1) != '0')
            findAllBinaryPermutation(binary,unProcessed + binary.charAt(0),key);
        findAllBinaryPermutation(binary, unProcessed + binary.charAt(1), key);
    }

    private static ArrayList<String> findAllBinaryPermutationList(String binary, String unProcessed, int key) {
        if(unProcessed.length() == key){
            ArrayList<String> list = new ArrayList<>();
            list.add(unProcessed);
            return list;
        }
        ArrayList<String> left = new ArrayList<>();
        if(unProcessed.isEmpty() || unProcessed.charAt(unProcessed.length() - 1) != '0')
            left = findAllBinaryPermutationList(binary,unProcessed + binary.charAt(0),key);
        ArrayList<String> right = findAllBinaryPermutationList(binary, unProcessed + binary.charAt(1), key);
        left.addAll(right);
        return left;
    }
}
