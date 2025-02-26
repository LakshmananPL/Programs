package com.codes.Stack;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicates316 {
    public static void main(String[] args) { //lmnyabcdefl //bcabc
        System.out.println(removeDuplicates("lmnyabcdeflghi"));
    }

    private static String removeDuplicates(String string) {
        Deque<Character> deque1 = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!deque1.contains(ch)) {
                deque1.add(ch);
            } else {
                Iterator<Character> iterator = deque1.iterator();
                char next = 0;
                while (iterator.hasNext()){
                    if(iterator.next().equals(string.charAt(i))) {
                        next = iterator.next();
                        break;
                    }
                }
                if(next<ch) {
                    deque1.remove(ch);
                    deque1.add(ch);
                }else {
                    for (int j = i+1; j < string.length(); j++) {
                        //if (string.charAt(j) < ch)

                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : deque1)
            stringBuilder.append(character);
        return stringBuilder.toString();
    }


    /*class Solution {
        public int numTeams(int[] rating) {
            int n=rating.length;

            int nge[]=new int[n];
            int nse[]=new int[n];

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(rating[i]<rating[j]){
                        nge[i]++;
                    }
                    else nse[i]++;
                }
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(rating[i]<rating[j]){
                        cnt+=nge[j];
                    }
                    else cnt+=nse[j];
                }
            }
            return cnt;
        }
    }*/
}
