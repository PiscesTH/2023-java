package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Sol3 {
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
        String grade = "C", opt = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {
            int scoreD = score % 10;
            if (scoreD >= 8 || score == 100) {
                opt = "+";
            } else if (scoreD <= 3) {
                opt = "-";
            }
        }
        System.out.printf("%s%s학점\n", grade, opt);
    }
}


