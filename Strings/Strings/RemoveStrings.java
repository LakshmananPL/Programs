package com.codes.Strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveStrings {
    public static void main(String[] args) {
        String s1 = "s z z z s";
        String s2 = "s z ejt";
        System.out.println(uncommonFromSentences(s1, s2));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        String[] string1 = s1.split(" ");
        String[] string2 = s2.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : string1) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (String word : string2) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<String> uncommonWords = frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return uncommonWords.toArray(new String[0]);
    }
}
