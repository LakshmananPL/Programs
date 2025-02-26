package com.codes.BitManipulation;

public class Nos1Count {
    public static void main(String[] args) {
        System.out.println(count1(6));
        //0110
    }
    public static int count1(int n){
        int count=0;
        while (n>0){
            if((n&1)==1)
                count++;
            n = n>>1;

        }
        return count;
    }
}
