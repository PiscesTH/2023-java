package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2Sol {
    public static String getNumberFromInt(int number) {
        switch (number) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(number);
    }

    public static Card[] makeCardsSol() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};     //배열 이용.
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = getNumberFromInt(j);
                Card card = new Card();
                card.kind = kinds[i];
                card.number = number;
                cards[cnt++] = card;
            }
        }
        return cards;
    }

    public static Card[] makeCardsSol2() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        for (int i = 0; i < cards.length; i++) {
            String kind = kinds[i / 13];
            String number = getNumberFromInt((i + 1) % 13);
            cards[i] = new Card();
            cards[i].kind = kind;
            cards[i].number = number;
        }
        return cards;
    }

    public static void main(String[] args) {
        Card[] cards = makeCardsSol();  //52개의 카드 배열
        for (Card c : cards) {
            c.printYourSelf(); // Sapde (A)
        }
    }
}