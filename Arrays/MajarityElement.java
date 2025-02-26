package com.codes.Arrays;

public class MajarityElement {
    public static void main(String[] args) {
        int[] nums = {7,7,5,7,5,1,2,2,7};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
            /*if(num == candidate)
                count = count + 1;
            else
                count = count - 1;*/
        }

        return candidate;
    }
}
