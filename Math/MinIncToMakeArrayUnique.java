package com.codes.Math;

import java.util.Arrays;

public class MinIncToMakeArrayUnique {
    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 2, 1, 7};
        System.out.println(minIncrementForUnique(nums));

    }

    public static int minIncrementForUnique(int[] nums) {
        int i = 0;
        int count = 0;
        Arrays.sort(nums);

        for (int j = 0; j < nums.length - 1; ) {
            if (nums[j] >= nums[j + 1]) {
                nums[j + 1]++;
                count++;
            } else {
                j++;
            }
        }
        return count;
    }
}
