package com.codes.Arrays.Matrix;

import java.util.Arrays;

public class NinetyDegreeRotation {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void rotate(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[start].length-1;
            while (start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }


        for (int j = 0; j < arr.length; j++) {
            int start = 0;
            int end = arr[start].length-1;
            while (start<end){
                int temp = arr[start][j];
                arr[start][j] = arr[end][j];
                arr[end][j] = temp;
                start++;
                end--;
            }
        }
    }
}
