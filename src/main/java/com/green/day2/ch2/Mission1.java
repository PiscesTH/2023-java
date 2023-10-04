package com.green.day2.ch2;

public class Mission1 {
    public static void main(String[] args){
        int n1 = 10, n2 = 3;


        System.out.println(n1 / n2 );
        System.out.println(n1 / n2 +"."+n2+n2+n2 );

        double r1 = n1 / n2;     //자동 형변환 들어감
        System.out.println(r1);

        double r2 = (double)n1 / n2; //double 과 int 형 계산식은 double로 출력(책 p.83 참고)
        System.out.println(r2);
    }
}
