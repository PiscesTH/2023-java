package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28Sol {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        /*
        while
        1~100 사이의 정수를 입력하세요 :
        정답 맞출때까지 up & down 출력
         */
        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 : ");
            input = scan.nextInt();
            if (input < answer) {
                System.out.println("Up");
            } else if (input > answer) {
                System.out.println("Down");
            } else {
                break;
            }
        }
        System.out.println("end");
    }
}
