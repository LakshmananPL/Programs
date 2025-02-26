package com.codes.Strings;

public class ZigZagConversion {
    public static void main(String[] args) {
        String string = "PAYPALISHIRING"; //
        //P   I   N
        //A  LS  IG
        //Y A H R
        //P   I
        int num = 4;
        System.out.println(convert(string, num));
    }

    public static String convert(String s, int numRows) {
        int temp1;
        int temp4;
        int temp2 = (numRows *2)-2;
        int temp3 = (numRows *2)-2;
        int count1=0;
        StringBuilder res = new StringBuilder();
        if(numRows >1){
            for (int i = 0; i < numRows; i++) {
                temp1 = i;
                while(temp1< s.length()){
                    res.append(s.charAt(temp1));
                    if(numRows %2!=0 && i== numRows /2){
                        temp1 = temp1+temp2;
                    } else if (i==0 || i== numRows -1) {
                        temp1 = temp1+temp2;
                    } else {
                        temp4 = temp3-temp2;
                        if(count1%2==0)
                            temp1 = temp1+temp2;
                        else
                            temp1 = temp1+temp4;
                        count1++;
                    }
                }
                if(i == numRows -2) {
                    temp2 = temp3;
                }
                else
                    temp2 = temp2-2;
                count1 = 0;
            }
            return res.toString();
        }
        else
            return s;
    }
}
