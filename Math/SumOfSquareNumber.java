package com.codes.Math;

public class SumOfSquareNumber {
    public static void main(String[] args) {
        System.out.println(findIsValid(2147483600));
    }

    public static boolean findIsValid(int num){
        boolean ans = false;
        int i = 0;
        int j = (int)Math.sqrt(num);
        long sum;
        while (i<=j){
            sum = (long)i*i + (long)j*j;
            if(sum == num) {
                return true;
            }if( sum > num)
                j--;
            else
                i++;
        }
        return ans;
    }
}
