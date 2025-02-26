package com.codes.Strings;

public class Count1S {
    public static void main(String[] args) {
        String[] devices = {"011001","000000","010100","001000"};
        System.out.println(findBeamCount(devices));
    }

    private static int findBeamCount(String[] devices) {
        int totalCount = 0;
        int beamCount = 0;
        int count = countOnes(devices[0],totalCount);
        for (int i = 1; i < devices.length; i++) {
            int countOf1s = countOnes(devices[i],totalCount);
            beamCount = beamCount  + count * countOf1s;
            if(countOf1s>0)
                count = countOf1s;
        }
        return beamCount==totalCount ? 0 : beamCount;
    }

    private static int countOnes(String device, int totalCount) {
        int count = 0;
        for (int i = 0; i < device.length(); i++) {
            if(device.charAt(i) != '0')
                count++;
            totalCount = totalCount + count;
        }
        return count;
    }
}
