package com.green.day13.ch6;

public class MyMath2 {
    int num;
    public static int sNum;

    public static void print() {
        System.out.printf("sNum : %d\n", sNum);  //num은 사용 불가.
    }

    void print2() {
        System.out.printf("sNum : %d\n", sNum, num);  //num은 사용 가능.
    }
}
