package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~100 사이의 숫자를 입력(종료:0) : ");
        int input = scan.nextInt();
        while (input != 0) {
            System.out.print("1~100 사이의 숫자를 입력(종료:0) : ");
            input = scan.nextInt();
        }
        System.out.println("end");

    }
}
//github : 코드, 소스 현상 관리(git). 로컬, 중앙 집중 서버에 저장 가능한 서비스(github).