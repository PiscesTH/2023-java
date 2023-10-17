package com.green.day14.ch6;

public class CarSol {
    String color;
    String gearType; // auto, manual
    int door; //문의 개수

    public CarSol() {
        this("white");
    }

    public CarSol(String color) {
        this(color, "auto", 4);
    }

    public CarSol(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}

class CarSolTest {
    public static void main(String[] args) {
        CarSol car1 = new CarSol();
        CarSol car2 = new CarSol("black");

        car1.printMySelf(); // color = white, gearType = auto, door = 4
        car2.printMySelf(); // color = blue, gearType = auto, door = 4

    }
}
