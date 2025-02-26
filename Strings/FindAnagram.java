package com.codes.Strings;

public class FindAnagram {
    public static void main(String[] args) {
        String a = "bab";
        String b = "aba";
        System.out.println(findAnagram(a,b));
    }

    private static int findAnagram(String a, String b) {
        /*LinkedList<Character> arrayList = new LinkedList<>();
        for (int i = 0; i < b.length(); i++) {
            arrayList.add(b.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(arrayList.contains(ch))
                arrayList.removeFirstOccurrence(ch);
        }
        return arrayList.size();*/
        for (int i = 0; i < a.length(); i++) {
            String string = String.valueOf( a.charAt(i));
            if(b.contains(string))
                b = b.replaceFirst(string,"");
        }
        return b.length();

        /*int[] countA = new int[26];
        int[] countB = new int[26];

        for (int i = 0; i < s.length(); i++) {
            countA[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            countB[t.charAt(i) - 'a']++;
        }
        int unmatchedCount = 0;
        for (int i = 0; i < 26; i++) {
            if (countB[i] > countA[i]) {
                unmatchedCount += countB[i] - countA[i];
            }
        }
        return unmatchedCount;*/
    }
}
