package com.codes.Strings;

public class WordsReverse {
    public static void main(String[] args) {
        String string = "a good   example";
        System.out.println(reverseWords(string));
    }

    private static String reverseWords(String string) {
        String[] strings = string.split("\\s+");
        StringBuilder string1 = new StringBuilder();
        for (int i = strings.length-1 ; i>=0 ;  i--) {
            string1.append(strings[i]).append(" ");
        }
        /*for (String string2 : strings)
            string1.append(string2);*/
        return string1.toString();
    }
}
