package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for 활용 구구단 2단~9단 출력
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d단\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println("-----계산종료-----");
    }
}
