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
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = getNumberFromInt(j);
                Card c = new Card();
                c.kind = kinds[i];
                c.number = number;
                cards[cnt++] = c;
            }
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