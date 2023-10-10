package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        /*
     1. 정수 10개를 저장할 수 있는 배열 만들고
        0~9 값을 순차적으로 대입
     2. 쓰기는 너무 복잡한 문제
        d
        d
         */
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {      //초기값 0으로 만들기 때문에 i = 1 로 시작 가능.
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length);       //10(리터럴) 대신 arr.length 사용.
            /*
            if (i == random) {      >>중복이 많이 나오면 쓰는게 좋을 수도...
                continue;
            }
            */
            tmp = arr[i];
            arr[i] = arr[random];
            arr[random] = tmp;
        }
        System.out.println("------------셔플-------------");
        System.out.println(Arrays.toString(arr));
    }
}
