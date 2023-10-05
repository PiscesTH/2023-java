package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 22};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];      //새로운 배열로 복사(deep copy)
        }
        System.out.println("arr1 == arr2 : "+ (arr1 == arr2));       //한쪽 배열을 바꿔도 다른 쪽 배열이 바뀌지 않는다.
        arr2[1] = 30;
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        //동등성 : 내용 비교 equals
        //동일성 : 주소값 비교 ==
    }
}
