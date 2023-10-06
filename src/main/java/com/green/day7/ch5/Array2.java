package com.green.day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 10, 15};
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println("----------------------------------------");
        arr1 = arr2;        //같은 주소값을 가지게 된다.
        arr1[1] = 77;       //같은 주소값이라 같이 바뀜.
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));
    }
}
