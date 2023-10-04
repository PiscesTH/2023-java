package com.green.day2.ch2;

public class PrimitiveType {
    public static void main(String[] args){
        //논리형
        boolean T = true, F = false;

        //문자형
        char c1 = 'a', c2 = '다';

        //정수형
        byte b1 = 1;    //1byte
        short s1 = 10;  //2byte
        int i1 = 100;   //4byte - 처리속도가 가장 빠름. 주로 사용
        long l1 = 1000; //8byte

        //실수형
        float f1 = 10.1f, f2 = 10.2F;      //10.1자체는 double 타입이라 f of F를 붙어 float 타입으로 입력
        float f3 = (float)10.1;            //(float) - double 타입을 float 타입으로 강제 형변환
        double d1 = 10.1;
        float f4 = (float) d1;             //강제 형변환을 사용해야 하는 경우
    }
}
