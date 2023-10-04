package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 6;
        /*
        6 x 1 = 6
        6 x 2 = 12
        ...
        6 x 9 = 54
         */
        System.out.printf("%d단\n", DAN);
        for (int i = 1; i < 10; i++) {
            //int result = DAN * i;
            System.out.printf("%d x %d = %d\n", DAN, i, DAN * i);
        }
        System.out.println("계산 종료");

        System.out.println("----------------------------------- 입력값");
        //입력값 받아서 구구단 계산하기.
        Scanner scan = new Scanner(System.in);
        System.out.print("2~9사이 숫자를 입력하세요 : ");
        int num = scan.nextInt();
        System.out.printf("%d단\n", num);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        System.out.println("계산 종료");
    }
}
