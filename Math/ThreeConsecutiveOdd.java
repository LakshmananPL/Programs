package com.codes.Math;

public class ThreeConsecutiveOdd {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = (arr[i] == 1 || (arr[i] & 1) == 1) ? count + 1 : 0;
            if (count == 3)
                return true;
        }
        return false;
    }
}
