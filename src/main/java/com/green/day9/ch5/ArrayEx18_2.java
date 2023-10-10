package com.green.day9.ch5;

public class ArrayEx18_2 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };
        /*
        score[0][0] = 101 / score[0][1] = 102 / ... / score [3][2] = 43
        sum = ?
        리터럴 사용금지. 0만 사용 가능.
        enhanced for 사용 sum 구하기
         */
        int sum = 0;
        for (int[] scoreIn : score) {
            for (int x : scoreIn) {
                sum += x;
            }
        }
        System.out.println("sum = " + sum);
    }
}
