package com.green.day14.ch6;

public class Data1 {
    int value;          //int value = 100; 명시적 초기화 (권장은 x )
    int value2;
    int value3;

    public Data1() {        //생성자.
       /*
        value = 100;
        value2 = 200;
        value3 = 300;
        */
        this(100, 200, 300);      //this() >> 생성자 호출. 결과 : data1(100,200,300);
        //this. 주소값이 됨
    }

    public Data1(int x, int y, int z) {   //오버로딩 가능
        value = x;                        //객체생성하면서 멤버필드에 값 지정 가능
        value2 = y;
        value3 = z;
    }

    public void printMySelf() {
        System.out.printf("value : %d, value2 : %d, value3 : %d\n", value, value2, value3);
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 dt = new Data1();
        dt.printMySelf();

        Data1 dt2 = new Data1(10, 20, 30);
        dt2.printMySelf();
    }
}
