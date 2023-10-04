package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        //1~100
        //val 값이 홀수면 >> __는(은) 홀수입니다.
        //val 값이 짝수면 >> __는(은) 짝수입니다.
        int val = (int) (Math.random() * 100) + 1;
        System.out.printf("%d는(은) %s수입니다.\n", val, val % 2 == 0 ? "짝" : "홀");
        System.out.println("---끝---");
    }
}
