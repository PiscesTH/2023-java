package com.green.day20.ch8;

import java.util.Scanner;

public class FlowEx111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = scan.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.printf("%d는(은) %s수입니다.\n", number, number % 2 == 0 ? "짝" : "홀");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
