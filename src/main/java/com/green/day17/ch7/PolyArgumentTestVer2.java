package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);     //name : Tv, price : 100, bonusPoint : 10
        Computer2 com = new Computer2();
        System.out.println(com);    //name : Computer, price : 200, bonusPoint : 20
        Audio2 audio = new Audio2();
        System.out.println(audio);    //name : Audio, price : 500, bonusPoint : 50
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        System.out.println("---------------------");
        buyer.summary(); //총 구매금액
        System.out.println("---------------------");
        buyer.getPurchaseList();
    }
}

class Buyer2 {
    private int money;
    private int bonusPoint;
    private Product2[] pArr;
    private int index;
    private final int INITIAL_MONEY;

    public Buyer2() {
        money = 10000;
        bonusPoint = 0;
        pArr = new Product2[10];
        INITIAL_MONEY = money;
    }

    public void buy(Product2 product2) {
        if (index == pArr.length) {
            System.out.println("구매 불가");
            return;
        }
        int price = product2.getPrice();
        int bonusPoint = product2.getBonusPoint();
        if (money < price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= price;
        this.bonusPoint += bonusPoint;
        pArr[index++] = product2;
        System.out.printf("%s 구매 완료\n", product2.getName());
    }

    public void summary() {
        int used = INITIAL_MONEY - money;
        System.out.printf("구매 금액 : %d만원, 남은 금액 : %d, 포인트 : %d\n", used, money, bonusPoint);
    }

    public void getPurchaseList() {
        int comCnt = 0, tvCnt = 0 , auidoCnt = 0;
        for (int i = 0; i < index; i++) {
            switch (pArr[i].getName()) {
                case "Computer":
                    comCnt++;
                    break;
                case "Tv":
                    tvCnt++;
                    break;
                case "Audio":
                    auidoCnt++;
            }
        }
        System.out.printf("컴퓨터 : %d대, Tv : %d대, 오디오 : %d대\n", comCnt, tvCnt, auidoCnt);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name : %s, price : %d, bonusPoint : %d", name, price, bonusPoint);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}