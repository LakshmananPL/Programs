package com.codes.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(26));
    }

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Prevent overflow by comparing mid with x / mid
            if (mid <= x / mid) {
                result = mid;  // mid is a valid candidate
                left = mid + 1;  // Try to find a larger candidate
            } else {
                right = mid - 1;  // Try smaller candidate
            }
        }

        return result;
    }
}
