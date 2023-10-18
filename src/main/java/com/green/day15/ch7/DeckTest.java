package com.green.day15.ch7;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬 별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card() {
        //kind = SPADE;
        //number = 1;
        this(SPADE, 1);
    }

    public Card(int x, int y) {
        kind = x;
        number = y;
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.printf("c.kind : %d, c.number : %d\n", c.kind, c.number); // 4, 1

        Card c2 = new Card(Card.CLOVER, 4);
        System.out.printf("c2.kind : %d, c2.number : %d\n", c2.kind, c2.number); // 1. 4

    }
}
