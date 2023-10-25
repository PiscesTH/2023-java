package com.green.self;

public class SelfPrac11 {
    public static void main(String[] args) {

    }
}

abstract class Unit{
    private int x, y, hp, ap, dp;

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Tank extends Unit{
    public Tank(){
        super.setX(5);
        super.setY(5);
    }
}