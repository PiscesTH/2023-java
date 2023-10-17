package com.green.day14.ch6;

public class Car {
    String color;
    String gearType; // auto, manual
    int door; //문의 개수

    public Car() {
        this("white");
    }

    public Car(String str1) {
        color = str1;
        gearType = "auto";
        door = 4;
    }

    public void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        CarSol car1 = new CarSol();
        CarSol car2 = new CarSol("blue");

        car1.printMySelf(); // color = white, gearType = auto, door = 4
        car2.printMySelf(); // color = blue, gearType = auto, door = 4

    }
}
