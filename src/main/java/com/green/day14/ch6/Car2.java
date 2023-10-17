package com.green.day14.ch6;

public class Car2 {
    String color;
    String gearType;
    int door;

    public Car2() {

    }

    public Car2(Car2 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }


    public void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);

        c1.printMySelf();   //color = black, gearType = "manual, door = 5
        c2.printMySelf();   //color = black, gearType = "manual, door = 5
    }
}
