package com.green.day11.ch6;

import com.green.day10.ch6.NumberBox;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();

        String r1 = me2.scoreResultOpt(99);

        /*
        100초과 0미만 "점수를 확인해 주세요"
        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //score값이 70점보다 같거나 크면 C학점 출력
        //나머지 D
        //1의 자리수가 8이상이면 + ex)A+
        //1의 자리수가 3이하면 - ex)A-
        //나머지는 0
         */
        System.out.println(r1);
        /*
        3, 4, 5 >> 봄
        6,7,8 여름 9, 10, 11 가을 12 1 2 겨울
        나머지 없음
         */
        String season = me2.getSeason(5);
        System.out.println(season);
    }
}
