package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // new : 객체화, 인스턴스 생성 / scan : 객체에 접근하기 위한 주소값
        System.out.print("두자리 정수를 하나 입력해주세요 : ");
        String input = scan.nextLine();      //input에 들어오는 숫자는 문자열
        int num = Integer.parseInt(input);   //num은 input을 정수형으로 형 변환

        System.out.printf("입력내용: "+ input);
        System.out.printf("num=%d\n",num);

        Scanner scan2 = new Scanner(System.in), scan3 = new Scanner(System.in);
        System.out.print("2자리 정수 : ");
        String input2 = scan.nextLine();
        int num2 = Integer.parseInt(input2);

        //String input3
    }
}
