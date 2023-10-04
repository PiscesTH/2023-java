package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args){
        //대소문자 구별. 길이제한 x
        int a, A, b, B;
        //이름으로 예약어 사용 불가 ex)class, void

        //숫자로 시작 불가, 중간이나 끝에 숫자는 가능 ex)1bf

        //특수문자는 _ $ 만 가능. 시작으로도 가능. ex)$ew, _ew

        /*
        케이스 기법
        hello my name is

        1.파스칼 케이스 기법(클래스명)
        HelloMyNameIs  - 대문자 시작, 단어의 첫 글자 대문자

        2.카멜 케이스 기법(변수명, 메소드명)
        helloMyNameIs  - 소문자 시작, 단어의 첫 글자 대문자

        3.케밥 케이스 기법
        hello-my-name-is  - 자바에선 사용 불가

        4.스네이크 케이스 기법
        hello_my_name_is  - 자바에서 사용은 가능. 실사용은 안함.

        상수는 전부 대문자 + _(final이 붙으면 상수)
        ex) final int MAX_NUMBER = 70;
         */

        Date today = new Date(); //타입 시작문자가 대문자 : 참조형 타입 <-> int a;
    }
}
