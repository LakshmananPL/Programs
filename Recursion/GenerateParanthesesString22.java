package com.codes.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesesString22 {
    public static void main(String[] args) {
        System.out.println(generateParentheses(3));
    }

    private static List<String> generateParentheses(int n) {
        return helperGP(n , "",0,0);
    }

    private static ArrayList<String> helperGP(int n, String processd, int open, int close) {
        //ArrayList<String> arrayList = new ArrayList<>();
        if(processd.length()==n*2){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(processd);
            return arrayList;
        }
        ArrayList<String> left = new ArrayList<>();
        if(open<n)
            left = helperGP(n,processd + '(',open+1,close);
        //arrayList.addAll(helperGP(n,processd + '(',open+1,close));
        ArrayList<String> right = new ArrayList<>();
        if(open>close)
            right = helperGP(n,processd + ')',open,close+1);
        //arrayList.addAll(helperGP(n,processd + ')',open,close+1));
        left.addAll(right);
        //return arrayList;
        return left;
    }
}
