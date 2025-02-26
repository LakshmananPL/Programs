package com.codes.Arrays;

import java.util.Arrays;

public class Array3075 {
    public static void main(String[] args) {
        int[] happiness = {12,1,42};
        int k = 3;
        System.out.println(findHappiness(happiness, k));
    }

    public static int findHappiness(int[] happiness, int k){
        Arrays.sort(happiness);
        int pos = happiness.length-1;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = ans + Math.max(happiness[pos] - i, 0);
            pos--;
        }
        return ans;
    }
}
