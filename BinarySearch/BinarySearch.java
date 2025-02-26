package com.codes.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,56,89,90};
        System.out.println(findElement(arr,91,0,arr.length-1));
    }

    private static int findElement(int[] arr, int key, int start , int end) {
        while (start<=end){
            int m = (start + end)/2;
            if(arr[m] == key)
                return m;
            else if (arr[m]<key) {
                start  = m + 1;
            }else {
                end = m - 1;
            }
        }
        return -1;
    }
}
