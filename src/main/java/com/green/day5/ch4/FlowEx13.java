package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        //반복문을 사용하여 1~10을 전부 더한 값을 출력
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.printf("sum = %d\n", sum);
    }
}
