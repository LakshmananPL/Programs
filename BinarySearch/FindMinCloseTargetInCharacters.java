package com.codes.BinarySearch;

public class FindMinCloseTargetInCharacters {
    public static void main(String[] args) {
        char[] chars = {'c','f','j'};
        char target = 'g'; // 'g'
        System.out.println(findMin(chars, target));
    }
    public static char findMin(char[] chars, char target){
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(chars[mid]<target){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return chars[start];
    }
}
