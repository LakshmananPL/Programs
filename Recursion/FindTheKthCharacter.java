package com.codes.Recursion;

public class FindTheKthCharacter {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    public static char kthCharacter(int k) {
        return helper(k, "a");
    }

    public static char helper(int k, String string){
        if(string.length()>=k)
            return string.charAt(k-1);
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append((char) (string.charAt(i)+1));
        }
        return helper(k,stringBuilder.toString());
    }
}

/*
Initially, word = "a". We need to do the operation three times:
Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".*/
