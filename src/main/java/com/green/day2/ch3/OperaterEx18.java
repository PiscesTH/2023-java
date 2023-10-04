package com.green.day2.ch3;

public class OperaterEx18 {
    public static void main(String[] args) {
        float f1 = 15.1f, f2 = 15.6f, f3 = 15.9f;

        //ceil : 올림
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f): %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f): %f\n", f3, Math.ceil(f3));

        //floor : 내림
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3));

        //round : 반올림 - 리턴값이 int로 나옴
        System.out.printf("round(%f): %d\n", f1, Math.round(f1)); //타입도 int로 변경
        System.out.printf("round(%f): %d\n", f2, Math.round(f2));
        System.out.printf("round(%f): %d\n", f3, Math.round(f3));


    }
}
