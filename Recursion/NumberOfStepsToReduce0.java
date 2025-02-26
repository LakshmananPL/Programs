package com.codes.Recursion;

public class NumberOfStepsToReduce0 {
    public static void main(String[] args) {
        System.out.println(findCount(20));
    }

    private static int findCount(int a) {
        int count = 0;
        //return findCountInRecursion(a,count);
        return findCountInRecursion(a);
    }

    private static int findCountInRecursion(int a, int count) {
        if(a==0)
            return count;
        if((a&1)==0)
            return findCountInRecursion(a/2,++count);
        else
            return findCountInRecursion(a-1, ++count);
    }

    private static int findCountInRecursion(int a) {
        int count = 0;
        if(a==0)
            return count;
        count++;
        if((a&1)==0)
            count = count +  findCountInRecursion(a/2);
        else
            count = count +  findCountInRecursion(a-1);
        return count;
    }
}
