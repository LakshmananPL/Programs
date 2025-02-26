package com.codes.BinarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = findStarting(nums,target);
        ans[1] = findEnding(nums,target);
        return ans;
    }
    public static int findStarting(int[] nums,int target){
        int i = 0;
        int j = nums.length-1;
        int ans = -1;
        while (i<=j){
            int mid = (i + j)/2;

            if (nums[mid] == target){
                ans = mid;
                j = mid -1;
            }

            if (nums[mid]<target)
                i = mid + 1;
            if (nums[mid]>target)
                j = mid - 1;
        }
        return ans;
    }
    public static int findEnding(int[] nums,int target){
        int i = 0;
        int j = nums.length-1;
        int ans = -1;
        while (i<=j){
            int mid = (i + j)/2;

            if (nums[mid] == target){
                ans = mid;
                i = mid +1;
            }

            if (nums[mid]<target)
                i = mid + 1;
            if (nums[mid]>target)
                j = mid - 1;
        }
        return ans;
    }

    public static int findPosition(int[] nums, int target, boolean isStart){
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) {
                ans = mid;  // Found the target
                if (isStart) {
                    j = mid - 1; // Search the left side for the starting bound
                } else {
                    i = mid + 1; // Search the right side for the ending bound
                }
            } else if (nums[mid] < target) {
                i = mid + 1;  // Search the right half
            } else {
                j = mid - 1;  // Search the left half
            }
        }
        return ans;
    }
}
