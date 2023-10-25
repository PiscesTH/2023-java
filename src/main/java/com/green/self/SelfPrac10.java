package com.green.self;

import java.util.Arrays;

public class SelfPrac10 {
    public static void main(String[] args) {
        int[] arr = {-1, 1, -7, 3, -2, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        // -1 1 -7 3 -2 4 2 ans: -1 -7 -2 1 3 4 2.
    }

    public static void sort(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < 0) {
                    resultArr[i] = arr[j];
                    arr[j]=0;
                    break;
                }else if (arr[j]>0){
                    resultArr[i] = arr[j];
                }
            }
        }
    }
}
