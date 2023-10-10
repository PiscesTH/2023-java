package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95, 179};
        //score 안에서 min값과 max 값을 찾아서 출력해주세요.
        int max = score[0], min = score[0];
        for (int i = 0; i < score.length; i++) {   //max & min 초기값을 배열 첫번째 값으로 설정해서 >> i = 1 부터 시작 가능.
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.printf("max : %d, min = %d\n", max, min);
    }
}