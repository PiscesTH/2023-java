package com.green.day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    break;          //13부터 스킵
                }
                System.out.printf("i : %d - z : %d\n", i, j);
            }
        }
        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    continue;       //13만 스킵.
                }
                System.out.printf("i : %d - z : %d\n", i, j);
            }
        }
    }
}
