package com.codes.Strings;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strings));

    }

    public static List<List<String>> groupAnagram(String[] strings) {
       /* boolean[] booleans = new boolean[strings.length];
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            List<String> list = new ArrayList<>();
            if (!booleans[i]) {
                list.add(strings[i]);
                char[] chars = strings[i].toCharArray();
                Arrays.sort(chars);
                for (int j = i + 1; j < strings.length - 1; j++) {
                    char[] chars1 = strings[j].toCharArray();
                    Arrays.sort(chars1);
                    if (Arrays.equals(chars, chars1)) {
                        list.add(strings[j]);
                        booleans[j] = true;
                    }
                }
                lists.add(list);
            }
        }
        return lists;
*/
        if (strings == null || strings.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
