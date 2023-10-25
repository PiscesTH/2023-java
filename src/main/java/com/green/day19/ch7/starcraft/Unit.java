package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {
    protected int x;
    protected int y;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void move(int x, int y);

    @Override
    public String toString(){
        return String.format("x : %d, y : %d\n",x, y);
    }

    public void stop() {         //추상클래스도 일반메서드 가질 수 있음.
        System.out.println("현재 위치에 정지");
    }
}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;     //protected 라서 사용 가능. 상속 관계
        this.y = y;     //setter 사용해도 됨.
        System.out.printf("마린이 좌표 x:%d, y:%d로 이동\n", x, y);
    }

    public void steamPack() {
        System.out.println("스팀팩!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
        System.out.printf("탱크가 좌표 x:%d, y:%d로 이동\n", x, y);
    }

    public void changeMode() {
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드를 풀었습니다.");
    }
}

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);
        unit.getX();

        Unit unit2 = new Tank();
        unit2.move(30, 15);
        Tank tank = new Tank();
        //배열 & ArrayList(ArrayList 사용 추천)
        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit2);
        System.out.println(unit2);
    }
}

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);
        Unit unit1 = units.get(units.size()-1);//마지막 탱크
        Tank tank = (Tank)unit1;
        tank.changeMode();
        tank.changeMode();
    }

    public static void moveAll(List<Unit> list, int x, int y) {
        for (Unit unit : list) {
            unit.move(x, y);
        }
    }
}