package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //while - 반복문
        int i = 0;
        while (i < 10) {
            System.out.println("while-" + i++);
        }
        System.out.println("-----------------------------");
        i = 0;
        while (i < 10) {
            System.out.println("while-" + ++i);
        }
    }
}
