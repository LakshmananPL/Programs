package com.codes.Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(78));
    }
    public static boolean isPowerOfTwo(int n) {
        return findPowerOfTwo(n, 1);
    }
    public static boolean findPowerOfTwo(int n, long ans) {
        if(ans == n)
            return true;
        if(ans > n )
            return false;
        return findPowerOfTwo(n , ans*2);
    }
}
