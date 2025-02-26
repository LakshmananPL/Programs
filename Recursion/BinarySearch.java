package com.codes.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,26,34,56,78,89};
        System.out.println(findElement(arr, 90, 0, arr.length-1));
    }

    public static int findElement(int[] arr, int key, int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == key)
            return mid;
        else if (arr[mid]<key) {
            return findElement(arr, key, mid + 1, end);
        }else {
            return findElement(arr, key, start, mid - 1);
        }
    }
}
