package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();

        String r1 = me2.scoreResultOpt(99);
        String r2 = me2.scoreResultOpt(100);
        String r3 = me2.scoreResultOpt(79);
        String r4 = me2.scoreResultOpt(83);
        String r5 = me2.scoreResultOpt(95);
        String r6 = me2.scoreResultOpt(30);
        String r7 = me2.scoreResultOpt(-1);
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
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
    }
}
