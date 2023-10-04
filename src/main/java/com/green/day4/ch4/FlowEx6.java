package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);

        /*
        스위치 문 사용
        mon = 3~5 "현재의 계절은 봄입니다"
        mon = 6~8 "현재의 계절은 여름입니다"
        mon = 9~11 "현재의 계절은 가을입니다"
        mon = 12,1,2 "현재의 계절은 겨울입니다"
        */
        int mon = scan.nextInt();
        String season = "겨울";
        switch (mon) {
            case 3:                     //case 3, 4, 5: 도 가능
            case 4:
            case 5:
                season = "봄";
                break;
            case 6, 7, 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            /*case 1:
            case 2:
            case 12:
                break;*/
            default:

        }
        if (mon > 12 || mon <= 0) {
            System.out.print("1~12사이의 숫자를 입력해주세요.\n");
        } else {
            System.out.printf("현재의 계절은 %s입니다.", season);
        }
    }
}
