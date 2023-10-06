package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        abc:        //반복문에 abc 라는 이름 설정
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    break abc;          //이름이 정해진 반복문을 탈출
                }
                System.out.printf("i : %d - z : %d\n", i, j);
            }
        }
        System.out.println("-------------------------------");
        dsa:
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    continue dsa;       //이름이 정해진 반복문을 재시작 > break; 랑 같은 효과
                }
                System.out.printf("i : %d - z : %d\n", i, j);
            }
        }
    }
}


