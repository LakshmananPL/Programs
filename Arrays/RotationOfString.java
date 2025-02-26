package com.codes.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RotationOfString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateString(arr);
        //System.out.println(emptyString(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateString(int[] arr){
        for (int j = 0; j < 2; j++) {
            shiftReverse(arr);
        }
    }

    public static void shift(int[] arr){
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }

    public static void shiftReverse(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }

    public static int emptyString(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr){
            queue.add(num);
        }
        int count = 0;
        while (queue.size()>0){
            count = count + shiftWithCondition(queue);
        }
        return count;
    }

    public static int shiftWithCondition(Queue<Integer> queue) {
        int first = queue.poll();
        int small = first;
        for (Integer num : queue) {
            if (small > num) {
                queue.add(first);
                return 1;
            }
        }
        if (small != first)
            queue.add(first);
        return 1;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0 , n-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k , n-1);
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
