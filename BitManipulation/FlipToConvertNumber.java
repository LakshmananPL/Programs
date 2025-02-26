package com.codes.BitManipulation;

public class FlipToConvertNumber {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }

    public static int minBitFlips(int start, int goal) {
        if (start == goal) return 0;

        int count = 0;
        int max = Math.max(start, goal);
        while (max > 0) {
            int dig1 = start & 1;
            int dig2 = goal & 1;
            if (dig1 != dig2) count++;

            start = start >> 1;
            goal = goal >> 1;
            max = max >> 1;
        }

        return count;

    }
}
