package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobotImpl();
        Runnable2 run2 = new Runnable2() {      //익명클래스로 처리. 바로 오버라이드. UI 만들 때 주로 사용 ?
            @Override                           //interface, 추상메서드 둘 다 사용 가능. 일반 클래스도 가능.
            public void run() {
                System.out.println("달린다");
            }
        };
    }
}

interface Runnable2 {
    void run();
}

class RunRobotImpl implements Runnable2 {   //~Impl : interface 를 상속받은 클래스 라는 의미로 사용
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}