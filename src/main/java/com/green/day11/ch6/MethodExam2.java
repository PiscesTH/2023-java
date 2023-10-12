package com.green.day11.ch6;

public class MethodExam2 {
   /*
    String scoreResultOpt(int score) {
        String grade = "D";
        String opt = "";
        int scoreD = score % 10;
        if (score > 100 || score < 0) {
            return "잘못된 점수입니다.";
        }
        if (score == 100) {
            grade = "A";
            opt = "+";
            return grade + opt + "학점";
        }
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        if (scoreD >= 8) {
            opt = "+";
        } else if (scoreD <= 3) {
            opt = "-";
        } else {
            opt = "0";
        }
        return grade + opt + "학점";
    }
*/
    String scoreResultOpt(int score) {
        String grade = "D";
        String opt = "+";
        int scoreD = score % 10;
        if (score > 100 || score < 0) {
            return "잘못된 점수입니다.";
        }
        if (score == 100) {
            grade = "A";
            return String.format("%s%s학점",grade,opt);
        } else if (score < 70) {
            opt = "";
            return String.format("%s%s학점",grade,opt);
        }
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else {
            grade = "C";
        }
        if (scoreD <= 3) {
            opt = "-";
        } else if (scoreD < 8) {
            opt = "0";
        }
        return String.format("%s%s학점",grade,opt);
    }
}