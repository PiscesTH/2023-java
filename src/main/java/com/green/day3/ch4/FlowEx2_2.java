package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        //숫자를 하나 입력하세요 >
        //(입력 기다려야 함)
        //숫자 입력하고 엔터를 누르면
        //(타입자유)변수에 해당값이 저장
        //해당값이 홀수면 00은 홀수입니다. ex)7은 홀수입니다.
        //해당값이 짝수면 00은 짝수입니다. ex)8은 짝수입니다.
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        int s = scan.nextInt();     //입력받은 값을 바로 정수형으로 저장
        //int s = Integer.parseInt(scan.nextLine());
        //int x = Integer.parseInt(s);

        if (s % 2 == 0) {
            System.out.printf("%d은 짝수입니다.",s);
        } else{
            System.out.printf("%d는 홀수입니다",s);
        }
    }
}
