package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        //0~10까지 출력(11번 반복)
        //3의 배수는 (0포함) 출력 안되게.
        //1 2 4 5 7 8 10
        for (int i = 0; i < 11; i++) {
            System.out.printf(i % 3 == 0 ? "" : "%d\n", i);
        }

        System.out.println("---------------------------continue");
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
