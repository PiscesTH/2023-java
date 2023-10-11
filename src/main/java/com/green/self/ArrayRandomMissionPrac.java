package com.green.self;

import java.util.Arrays;

public class ArrayRandomMissionPrac {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~5의 랜덤한 값을 넣어주세요.
        중복 제거
        */
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length) + 1;
            arr[i] = random;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
