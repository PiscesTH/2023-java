package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10);   //0이 아닙니다
        me.checkZero(5);   //0이 아닙니다
        me.checkZero(0);   //0입니다
        me.checkZero(0);   //0입니다

        for (int i = 1; i < 11; i++) {
            int r = me.randomValFromTo(10, 100);
            System.out.printf("r(%d) = %d\n", i, r);
        }

        System.out.println("-------------------------");
        for (int i = 1; i < 11; i++) {
            int r = me.randomValFromTo(9, 5);
            System.out.printf("r(%d) = %d\n", i, r);
        }
        System.out.println("-------------------------");
        /*for (int i = 1; i < 11; i++) {
            int r = me.randomValFromToAbsVer(8, 4);
            System.out.printf("r(%d) = %d\n", i, r);
        }*/
        me.scoreResultPrint(101); //잘못된 점수입니다.
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90); //A학점
        me.scoreResultPrint(89); //B학점
        me.scoreResultPrint(80); //B학점
        me.scoreResultPrint(79); //C학점
        me.scoreResultPrint(69); //D학점(69이하)
        me.scoreResultPrint(0); //D학점(69이하)
        me.scoreResultPrint(-1); //잘못된 점수입니다.

    }
}
