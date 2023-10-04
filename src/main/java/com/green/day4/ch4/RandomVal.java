package com.green.day4.ch4;


public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random();       // 0 < doubleVal < 1
        int intVal = (int) (doubleVal * 10);
        System.out.println("doubleVal : " + doubleVal);
        System.out.println("intVal : " + intVal);

        int rVal = (int) (Math.random() * 100);
        System.out.println("rVal : " + rVal);
    }
}
