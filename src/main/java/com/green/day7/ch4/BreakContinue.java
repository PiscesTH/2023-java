package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        //break : switch, 반복문 에서 사용
        //continue : 반복문 에서 사용

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;      //반복문 탈출. if 랑 자주 사용.
            }
        }
        System.out.println("------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                continue;       //continue 아래 부분 스킵하고 반복문 다시 시작.
            }
            System.out.println(i * i);
        }
    }
}
