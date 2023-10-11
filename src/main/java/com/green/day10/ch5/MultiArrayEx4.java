package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrayEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"conputer", "컴퓨터"},
                {"integer", "정수"},
                {"double", "실수"}
        };
        /*
        Q1. chair의 뜻은 ? >> 정수
        틀렸습니다. 정답은 의자입니다.
        Q2. integer의 뜻은 ? >> 컴퓨터
        정답입니다.
        ...
        정답입력 3번
        정답 오답 3번
         */
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            String answer = "";
            String[] quiz = words[i];
            for (int j = 0; j < quiz.length; j++) {
                if (j == 0) {
                    System.out.printf("Q%d. %s의 뜻은 ? ", i + 1, quiz[j]);
                    answer = scan.nextLine();
                    continue;
                } else if (answer.equals(quiz[j])) {
                    System.out.println("정답입니다.");
                    break;
                }
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", quiz[j]);
            }
        }
        System.out.println("문제 종료");
    }
}
