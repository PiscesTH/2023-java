package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        //스캐너 이용 성별 입력(남자, 남, man, man, 여자, 여, woman, Woman)
        //남자가 입력되면 "잘 생겼다." 출력. 여자가 입력되면 "예쁘다."가 출력
        //남자, 여자가 아닌 값이 입력되면 "누구냐."출력

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 : ");
        String gender = scan.nextLine();
        String other = "누구냐.";
        if (("남자").equals(gender)
                || "남".equals(gender)
                || "man".equals(gender)
                || "Man".equals(gender)) {
            other = "잘 생겼다.";
        } else if ("여자".equals(gender)
                || "여".equals(gender)
                || "woman".equals(gender)
                || "Woman".equals(gender)) {
            other = "예쁘다.";
        }
        System.out.println(other);

    }
}