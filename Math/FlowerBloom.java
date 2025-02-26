package com.codes.Math;

import java.util.Arrays;

public class FlowerBloom {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        System.out.println(findIsValid(bloomDay,m,k));
    }

    public static int findIsValid(int[] bloomDay, int m, int k){
        if(bloomDay.length < m * k)
            return -1;
        Arrays.sort(bloomDay);
        System.out.println(Arrays.toString(bloomDay));
        if(k==1) {
            return bloomDay[m-1];
        }else{
            return bloomDay[m*k];
        }
    }
}
