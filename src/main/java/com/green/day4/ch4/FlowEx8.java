package com.green.day4.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //주민등록번호 입력받고
        //주민번호를 확인하고 여자인지 남자인지, 유효하지 않은 주민등록번호인지 출력
        System.out.print("당신의 주민등록번호를 입력하세요.(______-________) : ");
        String id = scan.nextLine();
        System.out.println(id.charAt(7));
        switch (id.charAt(7)) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2', '4':
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }

    }
}
