package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("1~100 사이의 숫자를 입력(종료:0) : ");
            int input = scan.nextInt();
            if (input == 0) {
                break;
            }
        }
        System.out.println("end");
    }
}
