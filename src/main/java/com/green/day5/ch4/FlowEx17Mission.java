package com.green.day5.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx17Mission {
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
        System.out.print("숫자를 입력해 주세요 : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {                 //for(연산 o;연산 안들어가는게 좋음. ;연산 o)
            for (int j = i - num; j < 0; j++) {
                System.out.print("_");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        /*
            for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print("_");
                System.out.print("*");
            }
            System.out.println();
        }*/
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
                if (j < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j < i ? "_" : "*");
            }
        System.out.println();
        }
    }
}

