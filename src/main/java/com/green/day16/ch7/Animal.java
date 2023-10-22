package com.green.day16.ch7;



class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani5 = d1;
        Bulldog bull = (Bulldog) ani5;
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();
        System.out.println("오류 없음");

        //2. 자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog b1 = new Dog();

        //3. 타입은 알고 있는 메소드만 호출할 수 있고, 호출이 된다면 객체 기준이다.
        Bulldog bull1 = new Bulldog();
        bull1.jump();
        bull1.crying();

        Dog dog2 = new Bulldog();
        //dog2.jump();      호출 불가능
        dog2.crying();  //객체가 Bulldog
    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        Animal ani = new Bulldog();
        System.out.println(ani instanceof Bulldog); //true
        System.out.println(ani instanceof Dog);     //true
        System.out.println(ani instanceof Animal);  //true
        System.out.println(ani instanceof Cat);     //false
        Bulldog a = (Bulldog)ani ;                  //가능

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }

    private static void callCrying(Animal animal) {
        animal.crying();
        if (animal instanceof Bulldog) {
            ((Bulldog) animal).jump();
        }
    }
}

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}
class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍멍");
    }
}

class Bulldog extends Dog {
    public void jump() {
        System.out.println("불독 점프!");
    }

    @Override
    public void crying() {
        System.out.println("불독이 왈왈");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹");
    }
}