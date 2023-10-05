package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문 사용
        //i 값이 증가되면서 sum에 중첩으로 더하기.
        //sum값이 100 초과가 되는 시점의 i값은 ?
        //매직 넘버 : 의미가 있는 숫자. (ex : 구하려는 값) >> 변수 선언해서 쓰는게 좋음.(ex : int num = 100;)
        int sum = 0, i = 0;
        while (true) {
            sum += ++i;
            if (sum > 100) {
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
