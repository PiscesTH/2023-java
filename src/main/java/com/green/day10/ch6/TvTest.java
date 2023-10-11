package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();      //객체 생성 >> new 클래스명();
        tv1.channel = 10;
        tv1.power = true;      //>> 주소값.___ = ___;
        tv1.color = "red";

        Tv tv2 = new Tv();      //tv1 == tv2 >> false. 둘은 다른 객체.
        //tv2.channel = 20;

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.color : " + tv1.color);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv2.channel : " + tv2.channel); // default 값 존재. 0 (정수)
        System.out.println("tv2.color : " + tv2.color);     // default 값 존재. false (boolean)
        System.out.println("tv2.power : " + tv2.power);     // default 값 존재. null (참조형)
    }
}
//null : 주소값을 가지고 있지 않다.