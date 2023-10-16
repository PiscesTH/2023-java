package com.green.day13.ch6;

import java.util.Arrays;

public class VarArgEx {

    public static void sum(int...n){
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.printf("sum : %d\n", sum);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20,30);
        sum(10, 20,40,50,60);
        sum(10, 20,1,2,3,45,6,78,9);
    }
}
