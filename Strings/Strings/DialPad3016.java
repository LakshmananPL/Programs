package com.codes.Strings;

import java.util.Arrays;
import java.util.Collections;

public class DialPad3016 {
    public static void main(String[] args) {
        System.out.println(findCount("aabbccddeeffgghhiiiiii"));
    }
    public static int findCount(String string){
        int[] arr = new int[26];
        for (int i = 0; i < string.length(); i++) {
            arr[string.charAt(i) - 'a']++;
        }
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Collections.reverseOrder());

        int count = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(boxedArray[i]!=0){
                if(counter<8) {
                    count = count + boxedArray[i];
                    counter++;
                }
                else if(counter<16){
                    count = count + boxedArray[i]*2;
                    counter++;
                }
                else if(counter<24){
                    count = count + boxedArray[i]*3;
                    counter++;
                }else {
                    count = count + boxedArray[i]*4;
                    counter++;
                }
            }
        }
        return count;
    }
}
