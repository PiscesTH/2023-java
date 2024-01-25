package com.green.day83;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitFruitBox);
        System.out.println(j1);

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        Juice j2 = Juicer.makeJuice(appleFruitBox);
        System.out.println(j2);
    }
}
class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer<T> {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {     // ? : 와일드카드
        //? extends Fruit : Fruit과 Fruit 자식 클래스  <->  ? super Fruit : Fruit과 Fruit 부모 클래스
        String tmp = "";
        for (Fruit fruit : box.getList()) {
            tmp += fruit + " ";
        }

        return new Juice(tmp);
    }
}