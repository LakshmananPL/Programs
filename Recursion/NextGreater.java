package com.codes.Recursion;

import java.util.Arrays;

public class NextGreater {
    public static void main(String[] args) {
        int[] head = {2,7,4,3,5};
        int[] ans = new int[head.length];
        findNextGreater(head,ans,0);
        System.out.println(Arrays.toString(ans));
    }

    private static void findNextGreater(int[] head, int[] ans,int index) {
        if(index == head.length)
            return;
        findNextGreater(head,ans,index+1);

    }
}
