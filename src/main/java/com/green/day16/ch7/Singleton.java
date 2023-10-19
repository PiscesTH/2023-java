package com.green.day16.ch7;

public class Singleton {
    private Singleton() {
    }  //생성자에 private 붙으면 다른 클래스에서 객체화 불가능.

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingleTonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
