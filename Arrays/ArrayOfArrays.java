package com.codes.Arrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[]  nums = {5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }

    public static int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int maxSize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int start = i;
                int size = 0;
                while (!visited[start]) {
                    visited[start] = true;
                    start = nums[start];
                    size++;
                }
                maxSize = Math.max(maxSize, size);
            }
        }
        return maxSize;
    }
}
