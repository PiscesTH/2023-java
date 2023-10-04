package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Sol {
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
        //System.out.print("출력할 라인의 수를 입력하세요 : ");
        //int input = scan.nextInt();
        int i = 3;
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //System.out.println("-----End-----");
}
