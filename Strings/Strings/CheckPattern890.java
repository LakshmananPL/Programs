package com.codes.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CheckPattern890 {
    static int staticVariables = 20;

    CheckPattern890(){

    }
    public static void main(String[] args) {
        String[] words = {"dkk","deq","mee","aqh","dkd","cbb"};
        String pattern = "abb";
        System.out.println(findValidStrings(words,pattern));
    }

   /* private static ArrayList<String> findValidStrings(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern))
                res.add(word);
        }
        return res;
    }
    private static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i)))
                return false;
        }
        return true;
    }*/

    private static ArrayList<String> findValidStrings(String[] words, String pattern) {
        ArrayList<String> result = new ArrayList<>();

        //staticVariables++;
        for (String word : words) {
            Character[] map = new Character[256];
            Set<Character> set = new HashSet<>();
            boolean match = true;
            for (int i = 0; i < word.length(); i++) {
                Character character = map[pattern.charAt(i) - '0'];
                if (character != null) {
                    if (map[pattern.charAt(i) - '0'] != word.charAt(i)) {
                        match = false;
                        break;
                    }
                } else {
                    if (!set.add(word.charAt(i))) {
                        match = false;
                        break;
                    }
                    map[pattern.charAt(i) - '0'] = word.charAt(i);
                }
            }
            if (match)
                result.add(word);
        }
        return result;
    }
}
