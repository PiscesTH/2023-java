package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;

    public Card(String str1, String str2) {
        pattern = str1;
        denomination = str2;
    }

    public Card(String pattern) {
        this.pattern = pattern;     //전역변수 호출할 때 this. 사용
    }                               //전역변수와 지역변수 이름이 같을 때 사용. 없으면 가까운 지역변수 사용.

    public Card() {
    }

    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }
}
