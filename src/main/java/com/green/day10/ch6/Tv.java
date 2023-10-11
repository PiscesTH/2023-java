package com.green.day10.ch6;

public class Tv {
        /*
        객체지향언어 ( java, c++ ) < - > 절차지향언어 ( c언어 )
        절차지향언어 : 작은 소프트웨어를 만들때 유리. ex) 모니터, 키보드, 마우스 등에 들어가는 소프트웨어.(임베디드)
        객체 >> 속성(명사), 메소드(동사)

        클래스 와 객체
        클래스 : 문서, 설계도, 설명 ?
        객체   : 설계도(클래스) 로 만든 것 ? object, instance 라고도 함.
         */

        //속성 (멤버필드, property) : 값을 저장.
        String color;
        boolean power;
        int channel;
        
        //멤버메소드, 메소드
        void power() {power = !power;}
        void channelUp() {channel++;}
        void channelDown() {channel--;}

        //속성이나 메소드가 없어도 만들 수 있음.

}
