package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        중복 허용
         */
        int[] arr = new int[5];                             //final int LEN = 5; 로 만들어서 쓰는게 좋다.
        for (int i = 0; i < arr.length; i++) {              //입력
            int x = (int) ((Math.random() * 10) + 1);
            arr[i] = x;
        }
        for (int i = 0; i < arr.length; i++) {              //출력 >> 입.출력 분리하기.
            System.out.printf("arr[%d] = %d\n", i, arr[i]); 
        }
    }
}
