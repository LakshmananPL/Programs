package com.codes.Pattern;

public class MagicalPattern {
    public static void main(String[] args) {

        int k = 4;
        int n = 4;
        for (int i = 0; i < k*2; i++) {
            for (int j = 0; j < k*2; j++) {
                System.out.print(n);
                if(j<k)
                    n--;
                else
                    n++;
            }
            System.out.println();
            if(i<k)
                n--;
            else
                n++;
        }
    }
}
