package com.green.self;

import java.util.Scanner;

public class RandomSelfComple {
    public static void main(String[] args) {
        int grade = 1;
        Scanner scan = new Scanner(System.in);
        System.out.printf("현재등급 : %d\n", grade);
        System.out.print("go / stop : ");
        String input = scan.nextLine();
        while (0 <= grade && grade < 11) {
            switch (input) {
                case "go":
                    int pro = (int) (Math.random() * 100) + 1; //1~100
                    if (pro > 90) {
                        grade += 2;
                    } else if (pro > 60) {
                        grade++;
                    } else if (pro <= 40) {
                        grade--;
                    }
                    if (grade < 0) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.println("실패");
                        break;
                    } else if (grade < 11) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.print("go / stop : ");
                        input = scan.nextLine();
                        break;
                    } else {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.println("성공");
                        grade = 100;
                        break;
                    }
                case "stop":
                    System.out.printf("최종등급 : %d\n", grade);
                    grade = 100;
                    break;
            }

        }
    }
}





