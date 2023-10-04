package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5MissionSol {
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
        int mah = 170, wah = 157;
        String d = "평균";

        if ("남자".equals(S)) {   //"남자".equals(S) 가 실행하기에 안전. 리터럴이 앞쪽으로.
            if (h < mah) {
                d += " 미만";
            } else if (h > mah) {
                d += " 초과";
            }
        } else {
            if (h < wah) {
                d += " 미만";
            } else if (h > wah) {
                d += " 초과";
            }
        }
        System.out.printf("%s키 %dcm는 %s %s입니다.", S, h, S, d);
    }
}
