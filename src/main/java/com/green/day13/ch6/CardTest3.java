package com.green.day13.ch6;

class Card {
    String pattern;         //Spade, Heart, Diamond, Club
    String denomination;    //A, 2~10,J11,Q12,K13

    void printYourSelf() {
        System.out.printf("%s-%s\n", pattern, denomination);
    }
}

public class CardTest3 {
    public static Card[] makeCards() {
        Card[] resultArr = new Card[52];
        String[] shape = {"Spade", "Heart", "Diamond", "Club"};
        int index = 0;
        for (String pattern : shape) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card();
                card.pattern = pattern;
                card.denomination = getDenomination(j);
                resultArr[index++] = card;
            }
        }
        return resultArr;
    }

    public static String getDenomination(int x) {
        switch (x) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) {
        /*Card c = new Card();
        c.pattern = "Spade";
        c.denomination = "A";
        c.printYourSelf(); // Spade-A 출력

        Card c2 = new Card();
        c2.pattern = "Heart";
        c2.denomination = "J";
        c2.printYourSelf();*/

        Card[] cards = CardTest3.makeCards();
        System.out.println(cards.length);

        for (Card card : cards) {
            card.printYourSelf();
        }
    }
}
