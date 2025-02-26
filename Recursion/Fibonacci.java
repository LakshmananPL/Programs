package com.codes.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonacci(7));
    }

    private static int findFibonacci(int a) {
        if(a<2)
            return a;
        else
            return   findFibonacci(a-1) + findFibonacci(a-2);

    }
}
