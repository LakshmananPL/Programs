package com.codes.Arrays.SlidingWindow;
import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(kadensSubArray(nums)));
    }

    public static int findSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += nums[k];
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    public static int kadens(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum>max)
                max = sum;
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

    public static int[] kadensSubArray(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int newStart = 0;
        int newEnd =0;
        for (int i = 0; i < nums.length; i++) {
            if(sum == 0)
                start = i;

            sum+=nums[i];

            if(sum>max) {
                max = sum;
                newStart = start;
                newEnd = i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return Arrays.copyOfRange(nums, newStart, newEnd);
    }
}
