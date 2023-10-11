package com.green.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        return;     //없으면 자동으로 들어가짐.
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }

    void abs(int x) {
        System.out.println(x > 0 ? x : -x);
    }
}
