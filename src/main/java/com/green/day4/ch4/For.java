package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=2) {         //for ( 초기화 공간 ; 반복여부 체크(조건식) ; 증감식 ) 모두 비어있으면 무한 루프.
            System.out.printf("안녕%d.\n",i);
        }
    }
}
