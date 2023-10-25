package com.green.day19.ch7;

public interface PlayingCard {          //interface 이름은 '~할 수 있는' -able 로 만드는 경향이 있음.
    public static final int SPADE = 4;  //interface 멤버 필드는 public static final 자동으로 입력해줌.
    final int DIAMOND = 3;              //객체화 불가능. 클래스 부모 노릇 (?)
    static int HEART = 2;
    int CLOVER = 1;

    default String strT() {             //추상메서드만 가지고 있는 게 interface ? default 메서드는 ?
        return "s";
    }

    public abstract String getCardNum();    //interface 메서드는 public abstract 자동으로 입력해줌.

    String getCardKind();
}

interface PlayingChess extends PlayingCard {    //interface 사이에서의 상속은 extends
    void moveKing(int x, int y);
}

class Chess implements PlayingChess {   //3개의 오버라이딩 강제화. class와 interface 사이의 상속은 implements
    @Override
    public String getCardNum() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveKing(int x, int y) {

    }
}

class Card implements PlayingCard {
    @Override
    public String getCardNum() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
        System.out.println(PlayingChess.CLOVER);
    }
}