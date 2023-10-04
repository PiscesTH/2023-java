package com.green.self;

public class For_3 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5 - i; j < 5; j++) {
                System.out.print("s");
            }
            for (int k = i; k < 5 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

