package com.green.day5.ch4;

public class MultiFor {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {

            for (int m = 0; m < 60; m++) {
                System.out.printf("h:%d - m:%d\n", h, m);
            }
        }
    }
}
