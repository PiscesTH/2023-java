package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};     //점수

        //총점
        //평균
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double avg = (double) sum / score.length;
        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + avg);

    }
}
