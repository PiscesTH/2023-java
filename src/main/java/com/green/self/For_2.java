package com.green.self;

public class For_2 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            /*for (int j = 5 - i; j < 5; j++) {
                System.out.print("S");
            }
            System.out.println("*");
        }*/
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
