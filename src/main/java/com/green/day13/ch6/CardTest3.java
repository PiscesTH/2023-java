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
        Card[] result = new Card[52];
        return result;
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

        Card[] cards = makeCards();
        System.out.println(cards.length);
    }
}
