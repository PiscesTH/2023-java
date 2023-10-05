package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        int[] test;    //배열로 만들면 reference 타입.
        int[] arr = {10, 20, 30};       //arr 에는 배열에 접근하기 위한 주소값이 저장됨.
        //item : 배열에 들어가있는 각각의 값 (ex : 10, 20, 30)
        System.out.println("arr[0] : " + arr[0]);      //arr[0] > 배열 읽기.
        //ArrayIndexOutOfBoundsException 에러 : 없는 배열값을 호출.
        arr[0] = 200;       //배열값 변경 가능
        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr.length : " + arr.length);

        int[] arr2 = new int[30];
        int arr3[] = new int[30];           //변수 타입에 []를 붙이는걸 추천.

    }
}
