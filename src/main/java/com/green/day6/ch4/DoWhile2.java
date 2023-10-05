package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do {        //do 먼저 실행 후 while로 진입
            System.out.print("1~100 사이의 숫자를 입력(종료:0) : ");
            input = scan.nextInt();
        } while (input != 0);
        System.out.println("end");
    }
}
