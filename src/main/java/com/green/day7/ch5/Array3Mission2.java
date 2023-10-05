package com.green.day7.ch5;

public class Array3Mission2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 16, 19, 18};

        //arr2 : 길이 arr1보다 1 큰 배열. arr1과 같은 방은 같은 값
        //마지막 방은 20을 갖고 있는 배열 만들기
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%s] = %s\n", i, arr2[i]);
        }
        //System.out.printf("arr1.length : %s , arr2.length : %s ", arr1.length, arr2.length);
    }
}
