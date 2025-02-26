package com.codes.Recursion;

public class Easy {
    public static void main(String[] args) {
        //print1ToN(5);
        //System.out.println(factorial(5));
        //System.out.println(sumOfNumber(1234));
        //System.out.println(productOfNumber(1234));
        //System.out.println(reverseOfNumber(54321));
        System.out.println(countZero(28000760, 0));
    }

    private static void print1ToN(int n) {
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.println(n);
    }

    public  static int factorial(int n){
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }
    public static int sumOfNumber(int n){
        if(n%10==n)
            return n;
        return n%10 + sumOfNumber(n/10);
    }

    public static int productOfNumber(int n){
        if(n%10==n)
            return n;
        return n%10 * productOfNumber(n/10);
    }

    public static int reverseOfNumber(int n){
        int size = (int) Math.log10(n) + 1;
        return reverseOfNumberHelper(n, size);
    }

    private static int reverseOfNumberHelper(int n, int size) {
        if(n%10==n)
            return n;
        return (int) (n%10 * Math.pow(10, size-1) + reverseOfNumberHelper(n/10, size-1));
    }

    public static int countZero(int n,int count){
        if(n%10==n)
            return count;
        if(n%10==0)
            return  countZero(n/10, ++count);
        else
            return countZero(n/10, count);
    }
}
