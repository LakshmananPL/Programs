package com.codes.Strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCount {
    public static void main(String[] args) {
        String string = "12(7)26#24#(764)6(76)";
        System.out.println(findCount(string));
    }

    public static List<Integer> findCount(String string){
        int[] arr = new int[26];
        int count = 0;
        for (int i = string.length()-1; i >=0 ; i--) {
            char ch = string.charAt(i);
            if(ch == ')'){
                i--;
                while (string.charAt(i)!='('){
                    count = 10 * count + (string.charAt(i) - '0');
                    i--;
                }
                count = reverse(count);
            }
            else if (ch == '#'){
                int sum = 0;
                sum = string.charAt(i - 2) - '0';
                sum = sum * 10 + string.charAt(i-1) - '0';
                i--;
                if(count>0){
                    arr[sum-1] = count;
                    count = 0;
                }else {
                    arr[sum-1] = 1;
                }
            }else {
                int pos = string.charAt(i) - '0';
                if(count>0){
                    arr[pos-1] = count;
                    count = 0;
                }else {
                    arr[pos-1] = 1;
                }
            }
        }
        return IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

    }
    //123
    public static int reverse(int number){
        int reversed = 0;
        while (number!=0){
            int rem = number%10;
            reversed = reversed*10 + rem;
            number/=10;
        }
        return reversed;
    }
}
