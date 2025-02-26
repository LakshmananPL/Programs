package com.codes.Recursion;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
        //createSub("abc", "");
        System.out.println(createSubList("abcf",""));
    }

    private static void createSub(String abc, String ans) {
        if(abc.isEmpty()) {
            System.out.println(ans);
            return;
        }

        createSub(abc.substring(1),ans+abc.charAt(0));
        createSub(abc.substring(1),ans);
    }

    private static ArrayList<String> createSubList(String abc, String ans, ArrayList<String> ansList) {
        if(abc.isEmpty()) {
            ansList.add(ans);
            return ansList;
        }

        createSubList(abc.substring(1),ans+abc.charAt(0), ansList);
        createSubList(abc.substring(1),ans, ansList);

        return ansList;
    }

    private static ArrayList<String> createSubList(String processed, String ans) {
        if(processed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }


        ArrayList<String> left =  createSubList(processed.substring(1), ans + processed.charAt(0));
        ArrayList<String> right = createSubList(processed.substring(1),ans);
        left.addAll(right);
        return left;
    }
}
