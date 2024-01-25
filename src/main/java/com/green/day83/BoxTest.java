package com.green.day83;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setItem(1);
        int intVal = (int)b1.getItem();

        Box b2 = new Box();
        b2.setItem("hi");
    }
}
