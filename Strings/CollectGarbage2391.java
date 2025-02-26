package com.codes.Strings;

public class CollectGarbage2391 {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        String[] s = {"M","P","G"};
        int totalTime = 0;
        for (int i = 0; i < 3; i++) {
            int distance = 0;
            for (int j = 0; j < garbage.length; j++) {
                String string = garbage[j];
                if(j!=0)
                    distance = distance + travel[j-1];
                if(string.contains(s[i])){
                    for (int x = 0; x < string.length(); x++) {
                        if(string.charAt(x) == s[i].charAt(0))
                            totalTime++;
                    }
                    totalTime = totalTime + distance;
                    distance = 0;
                }
            }
        }
        return totalTime;
    }
}
