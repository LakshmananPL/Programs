package com.codes.Recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class SubstringNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,1};
        int[] arr1 = {1,2,3,4};
        System.out.println(createSubList(arr1,0, new ArrayList<>()));
        // System.out.println(createSubListNumber(arr,new ArrayList<>(),0, new ArrayList<>(), new HashSet<>()));
    }

    private static ArrayList<ArrayList<Integer>> createSubListNumber(int[] processed, ArrayList<Integer> ans, int index, ArrayList<ArrayList<Integer>> list, HashSet<String> set) {
        if(index == processed.length) {
            if( ans.size()>1) {
                String setString = ans.toString();
                if(!set.contains(setString)) {
                    list.add(new ArrayList<>(ans));
                    set.add(setString);
                }
            }
            return list;
        }
        if(ans.isEmpty() || ans.get(ans.size() - 1)<=processed[index]){
            ans.add(processed[index]);
            //ArrayList<ArrayList<Integer>> left =  createSubListNumber(processed ,ans, index+1, list);
            createSubListNumber(processed ,ans, index+1, list, set);
            ans.remove(ans.size() - 1);
        }
        //ArrayList<ArrayList<Integer>> right = createSubListNumber(processed,ans, index+1, list);
        createSubListNumber(processed,ans, index+1, list,set);
        //left.addAll(right);
        return list;
    }

    private static ArrayList<ArrayList<Integer>> createSubList(int[] processed, int index, ArrayList<Integer> list){
        if(index == processed.length){
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            lists.add(list);
            return lists;
        }
        list.add(processed[index]);
        ArrayList<ArrayList<Integer>> left = createSubList(processed, index+1,new ArrayList<>(list));
        list.remove(list.size()-1);
        ArrayList<ArrayList<Integer>> right = createSubList(processed, index+1,new ArrayList<>(list));
        left.addAll(right);
        return left;
    }
}
