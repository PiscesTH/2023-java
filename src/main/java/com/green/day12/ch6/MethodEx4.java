package com.green.day12.ch6;

import java.util.Arrays;

public class MethodEx4 {

    int[] plusMap(int[] arr, int x) {
        int len = arr.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = arr[i] + x;
        }
        return result;
    }

    void plusOrigin(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += x;
        }
    }
    int[] randomValFromTo(int len, int x, int y){
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = (int)(Math.random()*(y-x+1)+x);
        }
        return result;
    }

    public static void main(String[] args) {
        MethodEx4 me4 = new MethodEx4();

        int[] arr = {10, 20, 30, 40};
        int[] rArr1 = me4.plusMap(arr, 5);      //비파괴 메소드 (?): 원본 수정 없이 새로운 결과값 출력 <-> 파괴 (?)
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));

        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));

        int[] rArr2 = me4.randomValFromTo(10,5,20); // (배열크기, 최소, 최대값)
        System.out.println(Arrays.toString(rArr2));
    }
}
