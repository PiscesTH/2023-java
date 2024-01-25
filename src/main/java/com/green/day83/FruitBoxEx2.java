package com.green.day83;

import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {

    }
}

class FruitBox<T extends Fruit> extends GBoxList<T>{    //타입 변수 제한
    List<T> getList() { return list; }
}
