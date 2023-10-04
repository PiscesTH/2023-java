package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(ex:12345) : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
            System.out.println("num = " + num);
        }
        System.out.println("sum = " + sum);
    }
}
