package com.codes.Strings;

public class RemoveABC1910 {
    public static void main(String[] args) {
        System.out.println(removeABC("ccctltctlltlb","ctl"));
    }

    private static String removeABC(String string1, String string2) {
        return findValidString(string1,string2, new StringBuilder(""));
    }
    private static String findValidString(String string1, String string2, StringBuilder stringBuilder){
        if(string1.isEmpty())
            return stringBuilder.toString();
        if(!string1.startsWith(string2))
            return  findValidString(string1.substring(1),string2, stringBuilder.append(string1.charAt(0)));
        else {
            if (stringBuilder.length() < string2.length())
                return findValidString(stringBuilder + string1.substring(string2.length()),
                        string2, new StringBuilder());
            else {
                String ch = stringBuilder.substring(stringBuilder.length() - string2.length(), stringBuilder.length());
                return findValidString(ch + string1.substring(string2.length()),
                        string2,
                        stringBuilder.delete(stringBuilder.length() - string2.length(), stringBuilder.length()));
            }
        }
    }
//ctla ctl
    /*for (int i = 0; i < string1.length(); i++) {
        stringBuilder.append(string1.charAt(i));

        if (stringBuilder.length() >= len2) {
            if (stringBuilder.substring(stringBuilder.length() - len2).equals(string2)) {
                stringBuilder.setLength(stringBuilder.length() - len2);
            }
        }
    }*/
}
