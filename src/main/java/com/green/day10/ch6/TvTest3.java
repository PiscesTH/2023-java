package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = tv1;       //생성된 객체는 한개. 같은 객체에 접근하게 됨.
        System.out.println("tv1.channel : " + tv1.channel);

        tv1.channelUp();
        tv1.power();
        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv1.power : " + tv1.power);
    }
}
/*
메모리 할당 >> 삼등분 : 클래스 메모리 / stack 메모리 / heap 메모리
stack 메모리 >> 선입후출 FILO first in last out
ex ) Tv tv1 / Tv tv2
heap 메모리  >> 선입선출 FIFO first in first out
ex ) [ Tv / channel / 메소드 ](tv1) / [ Tv / channel / 메소드 ](tv2)
...
 */