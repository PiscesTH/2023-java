package com.green.day7.ch4;

public class FlowEx30Sol {
    public static void main(String[] args) {
        //반복문 사용
        //i 값이 증가되면서 sum에 중첩으로 더하기.
        //sum값이 100 초과가 되는 시점의 i값은 ?
        //매직 넘버 : 의미가 있는 숫자. (ex : 구하려는 값) >> 변수 선언해서 쓰는게 좋음.
        // (ex :final int NUM = 100;) 상수로 쓰면 더 빨라짐.
        int sum = 0, i = 0;
        final int TARGET = 100;
        while (sum < TARGET){
            sum += ++i;
        }
        System.out.print(i);
    }
}
