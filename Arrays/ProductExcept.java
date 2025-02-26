package com.codes.Arrays;

import java.util.Arrays;

public class ProductExcept {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(findArray(arr)));
    }

    public static int[] findArray(int[] numbs) {
        int n = numbs.length;
        int[] left = new int[numbs.length];
        int[] right = new int[numbs.length];
        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * numbs[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * numbs[i + 1];
        }
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = left[i] * right[i];
        }
        return numbs;

    }
}
