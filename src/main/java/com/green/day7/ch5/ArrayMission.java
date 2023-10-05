package com.green.day7.ch5;

public class ArrayMission {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500};
        /*for arr 이용 배열의 모든 방의 값을 출력.
        ex)
        100
        200
        300
        400
        500
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }

    }
}
