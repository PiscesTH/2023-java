package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrayEx4Sol {
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
            String[] wordArr = words[i];
            String goal = wordArr[1];
            System.out.printf("Q%d. %s의 뜻은 ? ", i + 1, wordArr[0]);
            String answer = scan.nextLine();
            /*if (answer.equals(goal)) {
                System.out.printf("정답입니다.\n");
                continue;
            }
            System.out.printf("오답입니다. 정답은 %s입니다.\n", goal);*/
            System.out.printf(answer.equals(goal) ? "정답입니다.\n" :"오답입니다. 정답은 %s입니다.\n", goal);
        }
        System.out.println("end");
    }
}
