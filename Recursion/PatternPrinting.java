package com.codes.Recursion;

public class PatternPrinting {
    public static void main(String[] args) {
        printPattern(4, 0);
    }
    public static void printPattern(int i, int j){
        if(i==0)
            return;
        if(i>j){
            System.out.print('*');
            printPattern(i, j+1);
        }else {
            System.out.println();
            printPattern(i-1, 0);
        }
    }
}
