package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args){
        int intVal1 = 12;
        byte byteVal1 = (byte)intVal1;  //byte : -128 ~ 127
        System.out.printf("byteVal1 : %d\n", byteVal1);

        int intVal2 = 256;
        byte byteVal2 = (byte)intVal2;  //Overflow
        System.out.printf("byteVal2 : %d\n", byteVal2);

        int intVal3 = -255;
        byte byteVal3 = (byte)intVal3;  //Underflow
        System.out.printf("byteVal3 : %d\n", byteVal3);

    }
}
