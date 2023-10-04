package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        //중첩 반복문을 사용하여
        //가로 10개, 세로 5줄 * 찍기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("---------------------------");

        }//for문 하나로 같은 결과 만들기.(강사님 ver.)
        for (int i = 1; i <= 10 * 5; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
