package com.codes.Arrays;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,3,3,4,4,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int start=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[start]!=nums[i])
            {
                start++;
                nums[start]=nums[i];
            }
        }
        return start+1;
    }
}
