package com.green.selfBlackJack;

public class Card {
    private int number;
    private String patter;

    public Card() {
    }

    public Card(int number, String patter) {
        this.number = number;
        this.patter = patter;
    }

    public int getNumber() {
        return number;
    }

    public String getPatter() {
        return patter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPatter(String patter) {
        this.patter = patter;
    }
}
