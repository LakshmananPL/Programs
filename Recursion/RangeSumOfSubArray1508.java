package com.codes.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeSumOfSubArray1508 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = new int[args.length];
        System.out.println(createSubList(arr,ans));
    }

    private static ArrayList<int[]> createSubList(int[] arr, int[] ans) {
        if(arr.length==0) {
            ArrayList<int[]> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ans[0] = 1;
        ArrayList<int[]> left =  createSubList(Arrays.copyOfRange(arr, 1,arr.length),ans);
        ArrayList<int[]> right = createSubList(Arrays.copyOfRange(arr, 1,arr.length),ans);
        left.addAll(right);
        return left;
    }
}
