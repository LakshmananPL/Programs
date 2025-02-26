package com.codes.Arrays;

import java.util.ArrayList;

public class Spiral1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(returnSpiralList(arr));
    }

    private static ArrayList<Integer> returnSpiralList(int[][] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int columnLower = 0;
        int columnUpper = arr[0].length-1;
        int rowLower = 0;
        int rowUpper = arr.length-1;
        while (columnLower<=columnUpper && rowLower<=rowUpper){
            for (int i = columnLower; i <= columnUpper; i++){
                arrayList.add(arr[rowLower][i]);
            }
            rowLower++;
            for (int i = rowLower; i <= rowUpper; i++) {
                arrayList.add(arr[i][columnUpper]);
            }
            columnUpper--;
            if(columnLower>columnUpper || rowLower>rowUpper)
                break;
            for (int i = columnUpper; i>=columnLower ; i--) {
                arrayList.add(arr[rowUpper][i]);
            }
            rowUpper--;
            for (int i = rowUpper;  i>=rowLower; i--) {
                arrayList.add(arr[i][columnLower]);
            }
            columnLower++;
        }
        return arrayList;
    }
}
