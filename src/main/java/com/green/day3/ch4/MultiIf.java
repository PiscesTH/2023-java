package com.green.day3.ch4;

public class MultiIf {
    public static void main(String[] args) {
        int num = 75;

        if (num >= 50) {
            if (num >= 80) {
                System.out.printf("%d는(은) 엄청x3 크다!\n", num);
            } else {
                System.out.printf("%d는(은) 엄청x2 크다!\n", num);
            }
        } else {
            if (num >= 40) {
                System.out.printf("%d는(은) 엄청 크다!\n", num);
            } else {
                System.out.printf("%d는(은) 좀 크다!\n", num);
            }
        }
    }
}
