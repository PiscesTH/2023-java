package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        /*
        스캐너 이용 정수 입력받고
        출력할 라인이 수를 입력하세요 >>
        만약 3을 입력
        ex)*
           **
           ***
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("출력할 라인의 수를 입력하세요 : ");
        int input = scan.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.printf("%d번째 줄 : ", i + 1);
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----End-----");

        for (int i = 1; i < input + 1; i++) {
            System.out.printf("%d번째 줄 : ", i);
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----End-----");
    }
}
