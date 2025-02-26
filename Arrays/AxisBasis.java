package com.codes.Arrays;

import java.util.HashSet;

public class AxisBasis {
    public static void main(String[] args) {
        int[] arr = {14,4,18,1,15};
        int a = 3;
        int b = 15;
        int x = 9;
        System.out.println(findCount(arr, a, b, x));
    }
    public static int findCount(int[] arr, int a, int b, int x){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : arr){
            hashSet.add(num);
        }
        int count = 0;
        int current = 0;
        while (current!=x) {
            int temp1 = current + a;
            int temp2 = current - b;
            if (temp1 <=x && !hashSet.contains(temp1) || temp1>x && temp2<x) {
                current = temp1;
                count++;
            }
            temp2 = current - b;
            if (current > x && !hashSet.contains(temp2)) {
                current = temp2;
                count++;
            }
        }
        return count;
    }
}
