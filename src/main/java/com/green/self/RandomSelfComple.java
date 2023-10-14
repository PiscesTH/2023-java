package com.green.self;

import java.util.Scanner;

public class RandomSelfComple {
    public static void main(String[] args) {
        int grade = 1;
        Scanner scan = new Scanner(System.in);
        System.out.printf("현재등급 : %d\n", grade);
        System.out.print("Upgrade / Stop : ");
        String input = scan.nextLine();
        forge:
        while (true) {
            switch (input) {
                case "Upgrade":
                    int probability = (int) (Math.random() * 100) + 1; //1~100
                    if (probability > 90) {
                        grade += 2;
                    } else if (probability > 60) {
                        grade++;
                    } else if (probability <= 40) {
                        grade--;
                    }
                    if (grade < 0) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.println("실패");
                        break forge;
                    } else if (grade < 11) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.print("Upgrade / Stop : ");
                        input = scan.nextLine();
                        break;
                    }
                    System.out.printf("현재등급 : %d\n", grade);
                    System.out.println("성공");
                    break forge;

                case "Stop":
                    System.out.println("강화를 종료합니다.");
                    System.out.printf("최종등급 : %d\n", grade);
                    break forge;
                default:
                    System.out.println("다시 입력해주세요.");
                    System.out.print("Upgrade / Stop : ");
                    input = scan.nextLine();
                    break;
            }
        }
    }
}





