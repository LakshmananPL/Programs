package com.codes.Arrays;

public class DivideArrays2 {
    public static void main(String[] args) {
        int[] arr = {-4,-7,5,2,9,1,10,4,-8,-3};
        int k = 3;
        //op - false
        System.out.println(findDivedArrays(arr, k));
    }
    public static boolean findDivedArrays(int[] arr, int k){
        /*boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag1 = false;
            if(!flag[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[i] + arr[j]) % k == 0 && !flag[i]) {
                        flag1 = true;
                        flag[j] = true;
                        break;
                    }
                }
                if(!flag1)
                    return false;
            }
        }
        return true;*/

        int[] remainderCount = new int[k];
        for (int num : arr) {
            int rem = ((num % k) + k) % k; // To handle negative numbers correctly
            remainderCount[rem]++;
        }
        // Check pairs for remainder 0
        if (remainderCount[0] % 2 != 0) {
            return false;
        }
        // Check pairs for other remainders
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                // If remainder is exactly k/2, there must be an even count of such elements
                if (remainderCount[i] % 2 != 0) {
                    return false;
                }
            } else if (remainderCount[i] != remainderCount[k - i]) {
                // Remainders i and k-i must have the same number of elements
                return false;
            }
        }
        return true;
    }
}
