package com.codes.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class SortStringBasedOnOccurences {
    public static void main(String[] args) {
        System.out.println(sortString("Aabbxxxxtb"));
    }

    public static String sortString(String string){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(!characterIntegerMap.containsKey(ch))
                characterIntegerMap.put(ch,1);
            else
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
        }

        Map<Character, Integer> sortedIntegerMap =
                characterIntegerMap.entrySet()
                        .stream().sorted(Map.Entry.<Character,Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));
        System.out.println(sortedIntegerMap);
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character,Integer> map :     sortedIntegerMap.entrySet()){
            for (int i = 0; i < map.getValue(); i++) {
                stringBuilder.append(map.getKey());
            }
        }

        return stringBuilder.toString();
    }
}
