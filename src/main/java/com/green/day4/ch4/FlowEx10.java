package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'F';

        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요(0~100) : ");
        String tmp = scan.nextLine();
        score = Integer.parseInt(tmp);
        //int scoreD = score / 10;

        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다.");
        } else {
            //스위치로
            //90점 이상 "당신의 학점은 A입니다. 80점 이상 B 70점 이상 C 나머지 F
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                default:
                    break;
            }
            System.out.printf("당신의 학점은 %s입니다.", grade);
        }
    }
}