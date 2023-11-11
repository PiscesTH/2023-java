package com.green.selfBlackJack;

public class CardDeck {
    private Card[] cardDeck;

    public CardDeck(Card[] cardDeck) {
        this.cardDeck = cardDeck;
    }

    public void setCardDeck(Card[] cardDeck) {
        this.cardDeck = cardDeck;
    }

    public Card[] getCardDeck() {
        return cardDeck;
    }

    public static Card[] makeCardDeck() {
        Card[] cards = new Card[52];
        String[] patter = {"Spade", "Clover", "Heart", "Diamond"};


        return null;
    }

    public String getCardNum(int number) {

        switch (String.valueOf(number)) {
            case "1":
                return "A";
            case "11":
                return "J";
        }

        return null;
    }
}
