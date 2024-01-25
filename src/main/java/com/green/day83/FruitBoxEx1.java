package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        GBoxList<Fruit> fruitGBoxList = new GBoxList<>();
        fruitGBoxList.add(new Fruit());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());
        System.out.println(fruitGBoxList);

        //GBoxList<Fruit> fruitGBoxList1 = new GBoxList<Apple>(); //에러 발생
    }
}

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class GBoxList<T> {
    protected List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int idx) {
        return list.get(idx);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}