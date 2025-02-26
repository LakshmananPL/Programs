package com.codes.BinarySearch;

public class FindMountain {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,3,2};
        System.out.println(findMountain(nums));
    }

    public static int findMountain(int[] nums){
        int start = 0;
        int end =nums.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if we are in the increasing part of the mountain
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1; // Move towards the right (increasing slope)
            } else {
                // We are in the decreasing part or at the peak
                end = mid; // Move towards the left (or stay at mid)
            }
        }

        // Start and end will converge to the peak index
        return start;
    }
}
