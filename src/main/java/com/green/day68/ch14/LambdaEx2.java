package com.green.day68.ch14;

interface MyFunction2 {
    void MyMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf = () -> System.out.println("안녕하세요");
    }
}
