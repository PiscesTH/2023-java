package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},    //1번학생
                {21, 22, 23},       //2번학생
                {31, 32, 33},       //...
                {41, 42, 43},
                {51, 52, 53}        //5번학생
        };
        /*
        {국어점수, 영어점수, 수학점수}
        번호 국어 영어 수학 총점 평균
        --------------------------
        1   101  102 103  306 102.0
        ...
        5
        --------------------------
        총점 __   __   __
         */
        int sum = 0;
        double avg = 0;
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < score.length; i++) {
            sum = 0;
            System.out.printf("%d", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("\t    %d", score[i][j]);
            }
            avg = (double) sum / score[i].length;
            System.out.printf("\t    %d\t    %.1f\n", sum, avg);
        }
        System.out.println("---------------------------------------------");
        System.out.print("총점");
        for (int i = 0; i < score[i].length; i++) {
            sum = 0;
            for (int j = 0; j < score.length; j++) {
                sum += score[j][i];
            }
            System.out.printf("   \t%d", sum);
        }
    }
}




/* System.out.print("번호\t국어\t영어\t수학\t총점\t평균\n");
            System.out.printf("%d   \t%d   \t%d   \t%d   \t%d   \t%.1f   \n"
                    , num, score[i][0], score[i][1], score[i][2], sum, avg);*/
