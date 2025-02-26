package com.codes.Arrays;

import java.util.HashMap;
import java.util.Map;

public class DivideArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,4,4};
        System.out.println(divideArray(arr));
    }

    public static boolean divideArray(int[] arr){
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (int j : arr) {
            integerHashMap.put(j, integerHashMap.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map : integerHashMap.entrySet()){
            if(map.getValue()%2!=0)
                return false;
        }
        return true;
    }
}
