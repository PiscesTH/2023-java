package com.green.self;

import java.util.Scanner;
//23.09.27
//23.10.14 수정
public class ScannerExSelfComple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~20 사이 숫자를 하나 입력해주세요. : ");
        //String s = scan.nextLine();
        //int x = Integer.parseInt(s);
        int goal = scan.nextInt();
        System.out.println("\n\n\n\n");

        while (goal > 20 || goal < 1) {
            System.out.print("1~20 사이 숫자를 다시 입력해주세요. : ");
            //String s1 = scan.nextLine();
            //s = s1;
            goal = scan.nextInt();
            System.out.println("\n\n\n\n");

        }
        //처음 정답 입력 문구 "정답을 입력해주세요 : " - 1번만 출력
        //오답 이후 정답 입력 문구 " 정답을 다시 입력해주세요 : " - 4번 출력
        int tryTimes = 0;
        final int OPPORTUNITY = 5;
        while (tryTimes < OPPORTUNITY) {
            tryTimes++;
            System.out.print(tryTimes == 1 ? "정답을 입력해주세요 : " : "정답을 다시 입력해주세요 : ");
            int answer = scan.nextInt();
            if (goal == answer) {
                System.out.println("정답입니다.");
                break;
            }
            if (tryTimes == OPPORTUNITY) {
                System.out.println("기회가 모두 소진되었습니다.");
                break;
            }
            System.out.printf("%s\n", goal > answer ? "Up" : "Down");
        }
    }
}

