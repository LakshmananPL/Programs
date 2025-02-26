package com.codes.Sorting;

public class ID2375 {
    public static void main(String[] args) {
        System.out.println(ConstructID("IIDD"));
    }

    private static String ConstructID(String string) {
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            if(i==0){
                if(string.charAt(i) == 'I')
                    ans = ans + "12";
                else{
                    ans = ans + "21";
                }
            }
            else {
                if(string.charAt(i) == 'I')
                    ans = ans + ans.charAt(ans.length()-1) + 1;

            }
        }
        return null;
    }
}
