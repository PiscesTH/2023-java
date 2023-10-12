package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); //*****
        sp.line(7); //*******
        System.out.println("-----------------------------");
        sp.square(5);
        //sp.square(4);
        /*
         ****
         ****
         ****
         ****
         */
        System.out.println("-----------");
        sp.triangle(7);

        System.out.println("-----------");
        String gender = sp.chkGenderById("011231-5117111");
        /*
        8번째 자리의 숫자가 2, 4 이면 > 여성
        1, 3 이면 남성
        나머지는 유효하지 않은 주민번호
         */
        System.out.println(gender);
        System.out.println("-----------");

        int sum = sp.sumFromTo(4,10 );
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
