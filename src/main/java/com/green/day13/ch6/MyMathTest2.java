package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 name = new MyMath2();
        name.num = 2;
        name.sNum = 30;
        MyMath2 name2 = new MyMath2();
        name2.num = 100;
        name.sNum = 50;

        System.out.printf("name.num = %d, name.sNum = %d\n",name.num, name.sNum);
        System.out.printf("name2.num = %d, name2.sNum = %d\n",name2.num, name2.sNum);
        System.out.printf("MyMath2.staticNum = %d\n", MyMath2.sNum);    //옳바른 사용법.
    }
}
