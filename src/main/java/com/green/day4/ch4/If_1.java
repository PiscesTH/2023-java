package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        //스캐너 이용 성별 입력(남자, 여자)
        //남자가 입력되면 "잘 생겼다." 출력. 여자가 입력되면 "예쁘다."가 출력
        //남자, 여자가 아닌 값이 입력되면 "누구냐."출력
        Scanner scan = new Scanner(System.in);
        System.out.print("성별(남자/여자)을 입력해 주세요 : ");
        String gender = scan.nextLine();
        if ("남자".equals(gender) || "여자".equals(gender)) {
            System.out.printf("%s", "남자".equals(gender) ? "잘 생겼다." : "예쁘다");
        } else {
            System.out.print("누구냐.");
        }
        System.out.println("\n-----------------삼항식------------------");
        System.out.printf("%s", "남자".equals(gender) || "여자".equals(gender) ?
                ("남자".equals(gender) ? "잘 생겼다." : "예쁘다") : "누구냐.");

        /*
        String mResult = "잘 생겼다.", wResult = "예쁘다.", oResult = "누구냐.";
        if ("남자".equals(gender) || "여자".equals(gender)) {
            System.out.printf("%s", "남자".equals(gender) ? mResult : wResult);
        } else {
            System.out.print(oResult);
        }
        System.out.println("\n-----------------삼항식------------------");
        System.out.printf("%s", "남자".equals(gender) || "여자".equals(gender) ?
                ("남자".equals(gender) ? mResult : wResult) : oResult);
        변수로 결과를 지정
        */

    }
}
