package com.green.day12.ch6;

public class Gugudan {
    void print(int x) {
        System.out.printf("%d단\n", x);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }
    }

    void printFromTo(int x, int y) {
        for (int i = x; i <= y; i++) {
            print(i);
        }
    }

    void printFromTo(int x, int y, String sp) {
        for (int i = x; i <= y; i++) {
            print(i);
            System.out.println(i != y ? sp : "종료");
        }
    }
}
