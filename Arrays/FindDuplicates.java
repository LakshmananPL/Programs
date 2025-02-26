package com.codes.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(findDuplicates(nums, k));
    }

    public static boolean findDuplicates(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i]) && Math.abs(map.get(arr[i])-i)<=k)
                return true;
            map.put(arr[i],i);
        }
        return false;
    }
}
