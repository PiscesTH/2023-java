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
            return String.format("%s%s학점", grade, opt);
        } else if (score < 70) {
            opt = "";
            return String.format("%s%s학점", grade, opt);
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
        return String.format("%s%s학점", grade, opt);
    }

    String getSeason(int mon) {
        switch (mon) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 1, 2, 12:
                return "겨울";
        }
        return "없음"; //default 없이 마지막에 써도 가능.
    }
}