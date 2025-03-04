package com.codes.Arrays;

import java.util.Arrays;

public class MergeTwoArrayDSA {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int  m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;  // Last element in the initial portion of nums1
        int p2 = n - 1;  // Last element in nums2
        int p = m + n - 1;  // Last position in nums1

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy any remaining elements from nums2 (if any)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
