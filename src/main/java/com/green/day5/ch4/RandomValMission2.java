package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 10, MAX = 100;
        /*System.out.println(MAX-MIN+MIN/MIN);*/
        //리터럴 더 이상 사용 금지. 1만 사용
        //MIN, MAX 변수만 사용하여 MIN ~ MAX 범위의 랜덤한 숫자를 만드는 로직 구현
        for (int i = 0; i < 1000; i++) {
            //int val = (int) (Math.random() * (MAX - MIN + MIN / MIN)) + MIN;
            int val = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.printf("%s번째 Val : %s\n", i + 1, val);
            if (val < MIN || val > MAX) {
                System.out.println("범위를 벗어났습니다.");
                break;
            }
        }
        System.out.println("끝");
        System.out.println("수정");
    }
}
