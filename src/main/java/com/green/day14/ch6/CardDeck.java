package com.green.day14.ch6;

public class CardDeck {
    Card[] cards;           //전역변수로 설정. 객체 생성 후에도 유지.
    // 지역변수로 설정하면 객체 생성 후에 사라짐.

    public CardDeck() {
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int j = 1; j <= 13; j++) {
                String denomination = getNumberFromInt(j);
               /* Card card = new Card(pattern, denomination);
                cards[index++] = card;*/
                cards[index++] = new Card(pattern, denomination);
            }
        }
    }

    private String getNumberFromInt(int number) {   //같은 클래스 내에서만 호출 가능.
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

    public void printAll() {
        for (Card card : cards) {
            card.printMySelf();
        }
    }

    public Card getCard() {
        Card resultCard = new Card();       //새 객체 생성할 필요는 없음.
        for (int i = 0; i < cards.length;) {    //while 사용 하는게... i++ i-- 할 필요 없어지니까.
            int random = (int) (Math.random() * cards.length);
            if (cards[random] != null) {
                resultCard = cards[random];
                cards[random] = null;
                break;
            }
        }return resultCard;
    }
    public Card[] shuffle(){

        return null;
    }

    public Card getCardSol(){
        Card c;
        while(true){
            int rIdx = (int)(Math.random()*cards.length);
            c = cards[rIdx];
            if (c != null) {
                cards[rIdx] = null;
                break;
            }
        }return c;
    }
}
