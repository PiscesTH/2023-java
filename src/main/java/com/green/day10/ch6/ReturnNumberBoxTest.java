package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox box1 = new ReturnNumberBox();
        box1.sum(10, 20);
        int r1 = box1.sum(10, 20);
        int r2 = box1.sum(30, 20);

        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("---end---");

        int r3 = box1.abs(-10);
        System.out.println("r3 : " + r3);
        System.out.println("r4 : " + box1.abs(10));
        System.out.println("r4 : " + box1.abs(-99));
        System.out.println("r4 : " + box1.abs(98));

        box1.abs(-70);
        r3 = box1.abs(-30);
        System.out.println(r3);
        box1.sum(20);

    }
}
