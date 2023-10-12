package com.green.day11.ch6;

public class MethodExam2Sol {
    String scoreResultOpt(int score) {
        if (score > 100 || score < 0) {
            return "잘못된 점수입니다.";
        }
        String grade = "C";
        String opt = "0";
        int scoreD = score % 10;

        if (score == 100) {
            return "A+학점";
        } else if (score < 70){
            return "D학점";
        }
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (scoreD >= 8) {
            opt = "+";
        } else if (scoreD <= 3) {
            opt = "-";
        }
        return grade + opt + "학점";
    }
}