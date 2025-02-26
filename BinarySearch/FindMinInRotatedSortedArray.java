package com.codes.BinarySearch;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
