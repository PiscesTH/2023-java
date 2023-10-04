package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        //숫자를 하나 입력하세요 >
        //(입력 기다려야 함)
        //숫자 입력하고 엔터를 누르면 String 변수에 해당 값이 저장
        //해당 문자열을 정수형으로 형변환
        //해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        //0이 아니라면 "입력하신 수나는 0이 아닙니다."
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        String s = scan.nextLine();
        int x = Integer.parseInt(s);
        if (x==0){
            System.out.print("입력하신 숫자는 0입니다");
        }
        if (x!=0){
            System.out.print("입력하신 숫자는 0이 아닙니다");
        }
    }
}
