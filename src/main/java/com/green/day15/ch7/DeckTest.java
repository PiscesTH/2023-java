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

    @Override
    public String toString() {   //.toString() 오버라이딩
        return String.format("kind : %d, number : %d", kind, number);
    }

    public Card() {
        this(SPADE, 3);
    }

    public Card(int x, int y) {
        kind = x;
        number = y;
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    public Deck() {
        init();
    }

    void init() {        //리턴타입 존재
        int index = 0;
        int[] pattern = {Card.CLOVER, Card.HEART, Card.DIAMOND, Card.SPADE};
        for (int i : pattern) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                cardArr[index++] = new Card(i, j);
            }
        }
        for (Card card : cardArr) {
            System.out.println(card);
        }
    }

    public Card pick(int index) {
        return cardArr[index];
    }

    public Card pick() {
        return cardArr[(int) (Math.random() * CARD_NUM)];
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c1 = deck.pick(51);    //10번 방 카드
        System.out.println("----------");
        System.out.println(c1);
        System.out.println("----------");
        Card c2 = deck.pick();
        System.out.println(c2);
    }
}
