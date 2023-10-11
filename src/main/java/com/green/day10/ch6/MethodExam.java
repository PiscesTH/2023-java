package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int x) {
        System.out.println(x == 0 ? "0입니다." : "0이 아닙니다.");
    }

    int randomValFromTo(int x1, int x2) {
        if (x2 > x1) {
            return (int) ((Math.random() * (x2 - x1 + 1)) + x1);
        }
        return randomValFromTo(x2, x1);
    }

    /*int randomValFromToAbsVer(int x1, int x2) {
        if (x2 > x1) {
            return randomValFromTo(x1, x2);
        }
        return randomValFromTo(x2, x1);
    }*/

    void scoreResultPrint(int score) {
        String grade = "D";
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        }
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}

