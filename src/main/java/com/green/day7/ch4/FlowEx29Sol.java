package com.green.day7.ch4;

public class FlowEx29Sol {
    public static void main(String[] args) {
        //3, 6, 9 게임
        /*
        i = 1
        i = 2
        i = 3 짝
        ...
        i = 30 짝

         */
        for (int i = 1; i < 101; i++) {
            System.out.printf("i = %d ", i);
            int temp = i;
            while (temp > 0) {
                int modVal = temp % 10;     //modVal : i의 1의 자리
                if (modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;                 // temp : >> modVal로 넘어가면서 i 의 10의 자리
            }
        System.out.println();
        }
    }
}

