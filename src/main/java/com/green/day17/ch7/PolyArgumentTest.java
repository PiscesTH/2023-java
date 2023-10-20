package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPoint = c.getBonusPoint();
        System.out.printf("price : %d, bonusPoint : %d\n", price, bonusPoint);

        Tv t = new Tv();
        int price2 = t.getPrice();
        int bonusPoint2 = t.getBonusPoint();
        System.out.printf("price2 : %d, bonusPoint2 : %d\n", price2, bonusPoint2);
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer);  //money : 1000 bP 0

        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Computer());
        System.out.println(buyer);
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        System.out.println(buyer);



        //buyer money 가 잔액 부족하면 "잔액 부족" 출력. money 값 마이너스 X
        //잔액 부족하지 않으면 Tv를(을) 구입하셨습니다. money, bP 변경 반영
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        money = 1050;
        bonusPoint = 0;
    }

    public void buy(Product product) {      //부모 클래스로 통일 가능
        int price = product.getPrice();
        int bonusPoint = product.getBonusPoint();
        if (money < price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= price;
        this.bonusPoint += bonusPoint;
        System.out.printf("%s를(을) 구매하셨습니다.\n", product);
    }

    @Override
    public String toString() {   //.toString() 오버라이딩 >> 원래 Object 객체에 있음
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }
}

class Product {
    private int price;
    private int bonusPoint;

    public Product(int x) {
        price = x;
        bonusPoint = (int) (x * 0.1);       // /10 보다 * 0.1 이 빠름.
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {   //.toString() 오버라이딩 >> 원래 Object 객체에 있음
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }
}

class Tv extends Product {
    String category = "Tv";

    public Tv() {
        super(100);
    }

    @Override
    public String toString() {   //toString 오버라이딩으로 해결.
        return category;
    }
}

class Computer extends Product {
    String category = "Computer";

    public Computer() {
        super(200);
    }

    @Override
    public String toString() {   //toString 오버라이딩으로 해결.
        return category;
    }
}
