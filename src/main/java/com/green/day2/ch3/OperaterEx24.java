package com.green.day2.ch3;

import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;

public class OperaterEx24 {
    public static void main(String[] args) {
        boolean b1 = 1 == 1 && 2 == 2; // && : and 연산자. 모든 값이 ture여야 ture 리턴
        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4; // && : and 연산자. 하나라도 false가 있으면 false 리턴
        System.out.println("b2 : " + b2);

        System.out.println("=====================================");

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4; // || : or 연산자. 하나라도 ture가 있으면 ture 리턴
        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 5; // || : or 연산자. ture가 하나도 없으면 false 리턴
        System.out.println("b4 : " + b4);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        boolean b5 = 1 == 1;
        System.out.println("b5 : "+ b5);  //부정연산자
        System.out.println("!b5 : "+ !b5);

    }
}
