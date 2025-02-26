package com.codes.Math;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] numbers = {24,5,64,53,26,38};
        int k = 54;
        int MOD = 1000000007;
        System.out.println(maximumProduct(numbers, k,MOD));
        System.out.println(180820950 % 1000000007);
    }
    public static int maximumProduct(int[] nums, int k ,int MOD) {
        int number = 1;
        Arrays.sort(nums);
        for(int i=0; i<k;i++){
            nums[0]++;
            Arrays.sort(nums);
        }
        System.out.println(Arrays.toString(nums));
        for (int j = nums.length-1; j>=0 ; j--) {
            number = (number * nums[j]) % MOD;
        }
        return number;
    }
}
