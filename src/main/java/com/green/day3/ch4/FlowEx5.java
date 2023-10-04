package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //나머지 C
        //1의 자리수가 8이상이면 + ex)A+
        //1의 자리수가 3이하면 - ex)A-
        //나머지는 빈칸
        System.out.print("점수를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String grade = "C";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                grade = "A+";
            } else if (score <= 93) {
                grade = "A-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                grade = "B+";
            } else if (score <= 83) {
                grade = "B-";
            }
        }
        System.out.printf("%s학점\n", grade);
    }
}


