package com.codes.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class KthDistinctString2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(findDistinct(arr,2));
    }

    private static String findDistinct(String[] arr, int key) {
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String string : arr){
            if(!unique.add(string))
                duplicate.add(string);
        }
        unique.removeAll(duplicate);
        if(unique.size()<key)
            return "";
        else {
            int i = 1;
            for (String string : unique) {
                if(i==key)
                    return string;
                i++;
            }
        }
        return "";
    }
}
