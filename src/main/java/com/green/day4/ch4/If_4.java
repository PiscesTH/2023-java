package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        //50~200 랜덤값
        //100이하면 그 값의 *2
        //100초과면 그 값의 + 10
        int i = (int) (Math.random() * 151) + 50;
        System.out.println("초기값 : " + i);
        System.out.printf("결과값 : %s", i > 100 ? i + 10 : i * 2);
    }
}
