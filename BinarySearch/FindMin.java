package com.codes.BinarySearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // If the array is not rotated
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        // Binary search to find the minimum element
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If middle element is greater than end, the minimum is in the right part
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // Otherwise, the minimum is in the left part (including mid)
                end = mid;
            }
        }

        // At the end of the loop, start == end, and it's the minimum element
        return nums[start];
    }
}
