package com.green.self;

import java.util.Scanner;

public class RandomSelf2 {
    public static void main(String[] args) {
        int grade = 1; //cash = 10000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Go / Stop : ");
        String input = scan.nextLine();
        switch (input) {
            case "Go":
                while (grade < 11 && grade >= 0) {
                    int x = (int) (Math.random() * 100) + 1;     // x = 1 ~ 100
                    if (x > 90) {
                        grade += 2;
                    } else if (x >= 71) {
                        grade++;
                    } else if (x < 41) {
                        grade--;
                    }
                    switch (grade) {
                        case 12, 11:
                            System.out.println("성공입니다.");
                            break;
                        case -1:
                            System.out.println("파괴되었습니다.");
                            break;
                        default:
                            if (grade >= 0) {
                                System.out.printf("현재등급 : %d등급.\n", grade);
                                break;
                            }
                            break;
                    }
                    if (0 <= grade && grade < 10) {
                        System.out.print("Go / Stop : ");
                        String after = scan.nextLine();
                        input = after;
                    }
                }
                break;
            case "Stop":
                System.out.printf("최종등급 : %s", grade);
                break;
        }

    }
}
