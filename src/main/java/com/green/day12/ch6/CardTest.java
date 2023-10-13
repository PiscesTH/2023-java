package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = "10";

        /*c1 = c2;*/
        System.out.println(c1 == c2);
        System.out.println("c1.kind : " + c1.kind);
        System.out.println("c2.kind : " + c2.kind);

        System.out.println(c1.getScore());  //>> 1   A = 1 J = 11 Q = 12 K = 13
        System.out.println(c2.getScore());  //>>10
        System.out.println();
    }
}
//c2.getScore >> Card c2 안에 메소드가 있다. = Card class 안에 메소드가 있다.
