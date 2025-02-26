package com.codes.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {43,12,1,34,17,76,8};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        return helper(arr);
    }

    public static int[] helper(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = helper(Arrays.copyOfRange(arr, 0,mid));
        int[] right = helper(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[left.length + right.length];
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}
