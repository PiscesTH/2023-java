package com.green.day16.ch7;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬 별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    @Override   //@애노테이션 ? Annotation >> 없어도 오버라이딩은 가능. 검증용. 오류 없으면 제대로 된 것
    public String toString() {   //.toString() 오버라이딩 >> 원래 Object 객체에 있음
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
    }
    public void shuffle(){
        for (int i = 0; i < cardArr.length; i++) {
            int rIndex = (int)(Math.random()*CARD_NUM);
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[rIndex];
            cardArr[rIndex] = tmp;
        }
        for (Card card : cardArr) {
            System.out.println(card);
        }
    }

    public Card pick(int index) {
        return cardArr[index];
    }

    public Card pick() {
        return pick((int) (Math.random() * CARD_NUM));
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    }
}
