package com.codes.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryPermutation1980 {
    public static void main(String[] args) {
        String[] strings = {"111","011","001"};
        System.out.println(findPermuatation(strings));
    }

    private static String findPermuatation(String[] strings) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        //return helperFP(arrayList,"");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strings.length;i++){
            sb.append(strings[i].charAt(i)=='0' ? '1' : '0');
        }
        return sb.toString();
    }

    private static String helperFP(ArrayList<String> arrayList, String processed) {
        if(processed.length() == arrayList.get(0).length()){
            if(!arrayList.contains(processed))
                return processed;
            else
                return "";
        }
        String ans = "";
        ans =  helperFP(arrayList,processed + '0');
        if(!ans.isEmpty())
            return ans;
        ans = helperFP(arrayList, processed + '1');
        if(!ans.isEmpty())
            return ans;
        return "";
    }
}
