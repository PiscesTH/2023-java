package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32Sol {
    public static void main(String[] args) {
        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요.(종료 : 0) :
        위 내용이 계속 반복(0입력할 때 까지)
        예)
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요.(종료 : 0) :
        1 > 선택하신 메뉴는 1번입니다
        2 > 선택하신 메뉴는 2번입니다
        4 > 메뉴를 잘못 선택하셨습니다
        0 > 종료합니다
         */

        Scanner scan = new Scanner(System.in);

        menu:
        while (true) {
            System.out.print("""
                    (1) square
                    (2) tri
                    (3) log
                    원하는 메뉴(1~3)를 선택하세요.(종료 : 0) :\s
                    """);
            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            } else if (choice < 1 || choice > 3) {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }
            System.out.printf("선택하신 메뉴는 %s번입니다.\n", choice);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
