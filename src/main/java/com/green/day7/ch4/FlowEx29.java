package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //3, 6, 9 게임
        /*
        i = 1
        i = 2
        i = 3 짝
        ...
        i = 30 짝

         */
        int x, y;
        for (int i = 1; i < 101; i++) {
            x = i / 10;
            y = i % 10;
            switch (i) {
                case 33, 36, 39, 63, 66, 69, 93, 96, 99:
                    System.out.printf("i = %d 짝짝\n", i);
                    break;
                default:
                    if (y % 3 == 0 && x == 0) {
                        System.out.printf("i = %d 짝\n", i);
                        break;
                    } else if (x == 0) {
                        System.out.printf("i = %d\n", i);
                        break;
                    } else if (y == 0 && x % 3 == 0) {
                        System.out.printf("i = %d\n", i);
                        break;
                    } else if (y % 3 == 0 || (x % 3) == 0) {
                        System.out.printf("i = %d 짝\n", i);
                        break;
                    }
                    System.out.printf("i = %d\n", i);
            }
        }
    }
}
