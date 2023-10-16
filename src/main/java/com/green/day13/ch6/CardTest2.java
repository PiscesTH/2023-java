package com.green.day13.ch6;

import com.green.day12.ch6.Card;

import java.util.Arrays;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = makeCards();  //52개의 카드 배열
        for (int i = 0; i < cards.length; i++) {
            System.out.printf("%s (%s)\n",cards[i].kind ,cards[i].number);
        }
    }

    public static Card[] makeCards() {
        Card[] resultArr = new Card[52];
        for (int i = 0; i < resultArr.length; i++) {
            Card card = new Card();
            int shape = i / 13;     // (i + 1) % 13 하면 처음이 A 마지막이 K
            switch (shape) {
                case 0:
                    card.kind = "Spade";
                    break;
                case 1:
                    card.kind = "Heart";
                    break;
                case 2:
                    card.kind = "Diamond";
                    break;
                default:
                    card.kind = "Club";
            }
            int num = i % 13;
            switch (num) {
                case 1:
                    card.number = "A";
                    break;
                case 11:
                    card.number = "J";
                    break;
                case 12:
                    card.number = "Q";
                    break;
                case 0:
                    card.number = "K";
                    break;
                default:
                    card.number = String.valueOf(num);
            }
            resultArr[i] = card;
        }
        return resultArr;
        //spade, heart, diamond, club
        //A, 2~10,J11,Q12,K13
    }
}


