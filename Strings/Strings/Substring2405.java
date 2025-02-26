package com.codes.Strings;

import java.util.HashSet;

public class Substring2405 {
    public static void main(String[] args) {
        System.out.println(findCount("abacaba"));
    }
    public static int findCount(String s){
        HashSet<Character> characters = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!characters.add(s.charAt(i))) {
                count++;
                characters.clear();
                characters.add(s.charAt(i));
            }
        }
        return count;
    }

    //hdklq kcs sgxlveh va
}
