package com.green.self;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
        5입력
        ____*
        ___**
        __***
        _****
        *****
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 : ");
        int input = scan.nextInt();
        for (int i = input; i > 0; i--) {        //input만큼 실행하는 조건문
            for (int j = 1; j <= input; j++) {   //
                System.out.print(i > j ? "_" : "*");
                /*if (i > j) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }*/
            }
            System.out.println();
        }
    }
}
