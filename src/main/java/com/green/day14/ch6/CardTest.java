package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //카드 52장 바로 생성
        //cd.printAll();  //카드 전체 출력 Spade (A)...

        //Card c1 = cd.getCard(); //랜덤한 카드 한장 호출. 호출한 카드 삭제.
                                //삭제된 카드 또 나오면 새로 뽑기.

        for (int i = 0; i < 52; i++) {
            Card c = cd.getCard();
            c.printMySelf();
        }
    }
}
