package com.green.selfBlackJack;


public class CardDeck {
    private Card[] cards;

    public CardDeck() {
        this.cards = makeCards();
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    private Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] patterns = {"Spade", "Clover", "Heart", "Diamond"};
        int index = 0;
        for (String pattern : patterns) {
            for (int j = 1; j < 14; j++) {
                cards[index++] = new Card(getCardNum(j),pattern);
            }
        }
        return cards;
    }

    private String getCardNum(int number) {
        String num = String.valueOf(number);
        switch (num) {
            case "1":
                return "A";
            case "11":
                return "J";
            case "12":
                return "Q";
            case "13":
                return "K";
        }
        return num;
    }
    public void shuffleCards(){
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random()* cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
    }
    public Card getCard(){
        return null;
    }
}
