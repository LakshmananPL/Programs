package com.codes.Arrays.SlidingWindow;

import java.util.ArrayList;

public class FindAllSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<ArrayList<Integer>> arrayList = findAllSubArray(nums);
        for (ArrayList arrayList1 : arrayList){
            System.out.println(arrayList1);
        }
    }

    public static ArrayList<ArrayList<Integer>> findAllSubArray(int[] nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                arrayList1.add(nums[j]);
                // Add a copy of the current subarray to the result
                ans.add(new ArrayList<>(arrayList1));
            }
        }
        return ans;
    }
}
