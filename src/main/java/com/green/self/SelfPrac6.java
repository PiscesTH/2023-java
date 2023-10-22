package com.green.self;

public class SelfPrac6 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1.7, 4.8);
        System.out.printf("원통의 부피 : %.2f\n", c1.getVolume());

        Cylinder c2 = new Cylinder(new Circle(2.8), 5.6);
        System.out.printf("원통의 부피 : %.2f\n", c2.getVolume());


    }
}

class Circle {
    private final double radius;
    private static final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}

class Cylinder {
    private final double height;
    private Circle circle;

    public Cylinder(double raidus, double height) {
        this.circle = new Circle(raidus);
        this.height = height;
    }

    public Cylinder(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return circle.getArea() * height;
    }
}
