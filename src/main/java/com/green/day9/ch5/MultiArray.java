package com.green.day9.ch5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {                  //[][] >> 2차원 배열
                {100, 200},
                {300, 400},
                {500, 600}
        };
        /*
        int[] intArr1 = arr[0];

        int [] newIntArr = {1, 2, 3, 4};
        arr[0] = newIntArr;
        */
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][1]);      //풀어쓰면 아래처럼.

        int[] intArr = arr[2];
        System.out.println(intArr[1]);

        System.out.println("----------");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
        System.out.println(Arrays.toString(arr[0]));
    }
}
