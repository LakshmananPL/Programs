package com.codes.Programms;

import java.time.LocalDate;
import java.time.LocalTime;

public class SnippetTest1 {
    public static void main(String[] args) {
        function1();
        function2();
    }

    static void function1() {
        LocalTime currentTime1 = LocalTime.now();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4 && j == 4)
                    System.out.println(j);
            }
        }
        LocalTime currentTime2 = LocalTime.now();
        //System.out.println(Duration.between(currentTime2, currentTime1));
    }

    static void function2() {
        LocalTime currentTime3 = LocalTime.now();
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                for (int j = 0; j < 5; j++) {
                    if (j == 4)
                        System.out.println(j);
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    //System.out.println(j);
                }
            }
        }
        LocalTime currentTime4 = LocalTime.now();
        //System.out.println(Duration.between(currentTime4, currentTime3));
        System.out.println(LocalDate.now() + " 00:00:00.0");

        System.out.println(LocalDate.now().plusDays(120));
    }
}
