package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d 일 때, 참인 것은 %n", x);

        if ( x == 0 ){ System.out.println("x == 0"); }//수행할 명령이 한 줄이면 {} 생략 가능
        if ( x != 0 ){ System.out.println("x != 0"); }
        System.out.println("++++++++++++++++++");

        x = 1;
        System.out.printf("x = %d 일 때, 참인 것은 %n", x);

        if ( !(x == 0) ){ System.out.println("x == 0"); }
        if ( !(x != 0) ){ System.out.println("x != 0"); }
    }
}
