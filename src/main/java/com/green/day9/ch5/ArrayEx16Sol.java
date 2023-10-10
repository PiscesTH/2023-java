package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16Sol {
    public static void main(String[] args) {
        /*
        3개의 String 값을 담을 수 있는 배열
        3번 문자열로 입력 받기.Scanner 사용
        입력받은 문자열들을 순차적으로 배열에 값을 넣고
        값 넣는게 종료가 되면 향상된 for문을 이용하여 출력
         */
        String[] strs = new String[3];      //str 대신 strArr 이나 strs 로 사용 권장.
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strs.length; i++) {
            System.out.print("문자를 입력해 주세요 : ");
            strs[i] = scan.nextLine();
        }
        for (String outPut : strs) {          //iter 쓰면 자동완성.
            System.out.println(outPut);
        }
    }
}
