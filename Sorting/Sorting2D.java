package com.codes.Sorting;

import java.util.Arrays;

public class Sorting2D {
    public static void main(String[] args) {
        int[][] arr = {{5,7,1},{3,2,9},{9,4,1}};
        sort2D(arr);
        for (int[] arrArray : arr)
            System.out.println(Arrays.toString(arrArray));
    }

    private static int[][] sort2D(int[][] arr) {
        for (int[] arrArray : arr){
            Arrays.sort(arrArray);
        }
        return arr;
    }
}
