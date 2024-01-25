package com.green.day83;


import java.util.List;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBoxV2<Apple> appleBox = new FruitBoxV2<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        String strMix = appleBox.mix(new Toy(), new Toy());
        System.out.println(strMix);
    }
}

class FruitBoxV2<T extends Fruit> extends GBoxList<T>{    //타입 변수 제한
    List<T> getList() { return list; }

    static <T> String mix(T var1, T var2) {
        return var1.toString() + var2.toString();
    }
}
