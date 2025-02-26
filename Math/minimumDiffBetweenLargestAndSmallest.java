package com.codes.Math;
import java.util.Arrays;

public class minimumDiffBetweenLargestAndSmallest {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        System.out.println(minDifference(nums));
    }

    public static int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }else{
            Arrays.sort(nums);
            return  nums[nums.length-4] - nums[0];
        }
    }
}
