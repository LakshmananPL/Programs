package com.codes.Arrays;

import java.util.ArrayList;

public class Construct2D2610 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(construct2D(arr));
    }

    private static ArrayList<ArrayList<Integer>> construct2D(int[] arr) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            boolean flag = false;
            for (; j < arrayList.size(); j++) {
                if (!arrayList.get(j).contains(arr[i])) {
                    arrayList.get(j).add(arr[i]);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ArrayList<Integer> arrayList1 = new ArrayList<>();
                arrayList1.add(arr[i]);
                arrayList.add(arrayList1);
            }

        }
        return arrayList;
    }
}
