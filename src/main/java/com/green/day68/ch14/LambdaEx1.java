package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf = () -> System.out.println("abstract");
        mf.run();
        MyFunction mf2 = new MyFunctionClass();
        mf2.run();
        MyFunction mf3 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("interface");
            }
        };
    }
}

class MyFunctionClass implements MyFunction{
    public void run(){
        System.out.println("class");
    }
}