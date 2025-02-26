package com.codes.Strings;

import java.util.Arrays;

public class MinOperation1769 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMinCount("001011")));

    }

    private static int[] findMinCount(String number) {
        int[] ans = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                if(i==j)
                    continue;
                if(number.charAt(j)!='0'){
                    count = count + Math.abs(i-j);
                }

            }
            ans[i] = count;
        }
        return ans;
    }
}
