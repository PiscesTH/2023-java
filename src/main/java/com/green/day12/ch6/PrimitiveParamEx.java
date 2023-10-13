package com.green.day12.ch6;

class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);
        change(d.x);
        System.out.println(d.x);
        System.out.println("--------------");
        Data d2 = new Data();
        d2.x = 100;


    }

    public static void change(int x) {
        x = 1000;
        System.out.println(x);
    }

    public static void change(Data d) {
        d.x = 1000;
        System.out.println(d.x);
    }
}
