package com.green.day5.ch4;

public class MultiFor2 {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("------------------2");
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println("------------------3");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
