package com.codes.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortVowelsInString2785 {
    public static void main(String[] args) {
        System.out.println(sortVowelsInString("LQRamBOHfq"));
    }

    private static String sortVowelsInString(String string) {
        List<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) > 0) {
                arrayList.add(ch);
            }
        }
        arrayList = arrayList.stream().sorted().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        int charCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                stringBuilder.append(ch);
            }
            else {
                stringBuilder.append(arrayList.get(charCount));
                charCount++;
            }
        }
        return stringBuilder.toString();
    }
}
