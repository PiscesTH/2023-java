package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        중복 제거
        */

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int x = (int) ((Math.random() * 10) + 1);
            arr[i] = x;
            for (int j = 0; j < i; j++) {                // j < i ...
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }*/
        System.out.println(Arrays.toString(arr));       //배열 출력
    }
}
                    /*
            for (int j = 4; j >= 0; j--) {
                if (i == j) {
                    i--;
                    break;
                }
                */



/*
            arr2[i] = arr[i];
            for (int j = 4; j >= 0; j--) {
                if (i == j) {
                i--
                    break;
                }
                while (arr[i] == arr2[j]) {
                    x = (int) ((Math.random() * 5) + 1);
                    arr[i] = x;
                }
            }


        }
        for (int j = 0; j < 5; j++) {
            System.out.printf("arr[%d] = %d\n", j, arr[j]);
        }


    }
}


*/