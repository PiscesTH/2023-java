package com.green.self;

import java.util.Scanner;

public class ScannerExSelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~20 사이 숫자를 하나 입력해주세요. : ");
        String s = scan.nextLine();
        int x = Integer.parseInt(s);
        while (x > 20 || x < 1) {
            System.out.print("1~20 사이 숫자를 다시 입력해주세요. : ");
            String s1 = scan.nextLine();
            int x1 = Integer.parseInt(s1);
            s = s1;
            x = x1;
        }
        //처음 정답 입력 문구 "정답을 입력해주세요 : " - 1번만 출력
        //오답 이후 정답 입력 문구 " 정답을 다시 입력해주세요 : " - 4번 출력
        int i = 0;
        while (i < 5) {
            i++;
            System.out.print("정답을 다시 입력해주세요 : ");
            String a = scan.nextLine();
            int y = Integer.parseInt(a);
            if (i == 5 && x != y) {
                System.out.println("기회가 모두 소진되었습니다.");
            } else {
                if (x == y) {
                    System.out.println("정답입니다.");
                    break;
                } else if (x < y) {
                    System.out.println("Down");
                } else {
                    System.out.println("Up");

                }
            }
        }
    }
}

