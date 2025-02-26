package com.codes.Math;
import java.util.Arrays;

public class PlusOne {
    int a;
    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[] {1,2,9})));

        String a = "uygy";
        String b = "iyg";
        System.out.println(a + b);
        //internally
        String ans = new StringBuilder().append(a).append(b).toString();
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }

        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
