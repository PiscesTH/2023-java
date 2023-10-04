package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        //남자 평균키 170, 여자 평균키 157
        //Scanner 이용 성별 입력 (남자, 여자)
        //키 입력
        //평균 키 이하면 "156cm는 남자 평균 미만입니다."
        //평균 키랑 같다면 "170cm는 남자 평균 입니다."
        //평균 키 초과면 "178cm는 남자 평균 초과입니다."
        Scanner scan = new Scanner(System.in);
        System.out.print("성별(남자/여자)을 입력해주세요 : ");
        String S = scan.nextLine();
        System.out.print("키를 입력해주세요 : ");
        int h = scan.nextInt();
        int mvh = 170, wvh = 157;
        String d = "평균";

        if (S.equals("남자")) {
            if (h < mvh) {
                d = "평균 미만";
            } else if (h > mvh) {
                d = "평균 초과";
            }
        } else {
            if (h < wvh) {
                d = "평균 미만";
            } else if (h > wvh) {
                d = "평균 초과";
            }
        }
        System.out.printf("%dcm는 %s %s입니다.",h,S,d);
    }
}
