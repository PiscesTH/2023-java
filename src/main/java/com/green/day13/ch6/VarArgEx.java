package com.green.day13.ch6;

import java.util.Arrays;

public class VarArgEx {

    public static void sum(int...n){    //가변인자 이용
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.printf("sum : %d\n", sum);
    }
    static int test(int x){
        int sum = 0;
        if (x == 1){
            sum = 1;
        } else {
            sum = x * test(x-1);
        }
     return sum;
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20,30);
        sum(10, 20,40,50,60);
        sum(10, 20,1,2,3,45,6,78,9);

        int y = test(5);
        System.out.println(y);
    }
}
