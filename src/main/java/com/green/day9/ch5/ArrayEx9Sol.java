package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx9Sol {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];
        /*
        arr각 방에 code에 있는 값만 랜덤하게 넣어주세요.
        */
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * code.length);
            arr[i] = code[random];
        }
        System.out.println(Arrays.toString(arr));
    }
}
