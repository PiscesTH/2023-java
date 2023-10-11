package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox box1 = new NumberBox();
        box1.sum(10, 20);
        box1.sum(30, 40);

        box1.minus(40, 20);
        box1.minus(4, 2);

        box1.abs(-10);
        box1.abs(10);
        box1.abs(-33);
        box1.abs(39);

    }
}
