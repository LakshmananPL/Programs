package com.codes.Arrays;

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        int[] arr = {3,5,0,3,4};
        System.out.println(findPattern(arr));
    }

    public static boolean findPattern(int[] nums){
        int n = nums.length;
        if (n < 3)
            return false;
        int second = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < second) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
