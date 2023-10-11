package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = tv1;       //생성된 객체는 한개. 같은 객체에 접근하게 됨.
        System.out.println("tv1.channel : " + tv1.channel);

        tv1.channelUp();
        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv2.channel : " + tv2.channel);
    }
}
