package com.codes.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        System.out.println(findValidString("leet**cod*e"));
    }

    private static String findValidString(String string) {
        /*Stack<Character> characters = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch!='*')
                characters.push(ch);
            else
                characters.pop();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : characters)
            stringBuilder.append(character);
        return stringBuilder.toString();*/
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch!='*') {
                stringBuilder.append(ch);
                j++;
            }
            else {
                stringBuilder.deleteCharAt(j-1);
                j--;
            }
        }
        return stringBuilder.toString();
    }
}
