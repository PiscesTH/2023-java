package com.green.day19.ch7.starcraft2;

public interface Fighterble extends Movable, Attackable {   //p.384 인터페이스 다중상속. 구현부 없어서 가능
}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}

class Unit {
    private int currentHp;
    private int x;
    private int y;
}

class Fighter extends Unit implements Fighterble{
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class Test{
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        Attackable attackable = (Fighter)movable;
        attackable.attack(null);
    }
}