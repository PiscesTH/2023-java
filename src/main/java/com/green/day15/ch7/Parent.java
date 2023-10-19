package com.green.day15.ch7;

public class Parent {
    int age;
}

class Child extends Parent {
    public Child() {
        super();        // 부모 클래스 호출 >> 객체 생성에 한번은 호출 필수. 안 적으면 컴파일러가 자동으로 입력.
    }

    void play() {
        System.out.println("놀자");
    }
}

class Child2 extends Parent {
    void jump() {
        System.out.printf("%d살의 아이가 점프를 함\n", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}