package com.codes.Sorting;

import java.util.Arrays;

public class Sorting2545 {
    public static void main(String[] args) {
        int[][] arr = {{64766, 11978, 20502, 21365, 79611, 36797, 58431, 89540, 59373, 25955},
                {51305, 66104, 88468, 5333, 17233, 32521, 14087, 42738, 46669, 65662},
                {93306, 92793, 54009, 9715, 24354, 24895, 20069, 93332, 73836, 64359},
                {23358, 84599, 4675, 20979, 76889, 34630, 64098, 23468, 71448, 17848}};
        sortStudents(arr, 5);
        for (int[] arrArray : arr)
            System.out.println(Arrays.toString(arrArray));
    }

    public static int[][] sortStudents(int[][] score, int k) {
        for (int j = 0; j < score.length; j++) {
            for (int i = 0; i < score.length - 1 - j; i++) {
                if (score[i][k] < score[i + 1][k]) {
                    int[] temp = score[i];
                    score[i] = score[i + 1];
                    score[i + 1] = temp;
                }
            }
        }
        return score;
    }
}
