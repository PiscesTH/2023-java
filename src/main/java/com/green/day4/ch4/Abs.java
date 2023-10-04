package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        /*int num = 10;*/
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = scan.nextInt();

        //10는(은) 절대값 10
        //-9는(은) 절대값 9
        System.out.printf("%d는(은) 절대값 %d", num, num >= 0 ? num : -num); // 함수에 넣어서 사용하는게 좋음.
                                                                            //ex) int result = num >= 0 ? num : -num
        //Math.abs(num) >> 절대값 구하는 메소드
    }
}
