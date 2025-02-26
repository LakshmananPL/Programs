package com.codes.BinarySearch;

public class CielingNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target  = 17;
        System.out.println(findCieling(nums, target));
    }
    public static int findCieling(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start  + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
