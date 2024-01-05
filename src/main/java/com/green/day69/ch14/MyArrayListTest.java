package com.green.day69.ch14;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//        list.print();
        list.forEach(i -> System.out.println("i : " + i));
        list.removeIf(v -> v % 20 == 0);
        System.out.println("removeIf 결과");
        list.forEach(i -> System.out.println("i : " + i));
    }
}
