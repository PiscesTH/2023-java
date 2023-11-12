package com.green.selfBlackJack;

import java.util.Arrays;

public class GameTable {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffleCards();
        System.out.println(Arrays.toString(cardDeck.getCards()));
    }
}
