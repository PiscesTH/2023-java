package com.green.selfBlackJack;

public class Card {
    private String number;
    private String patter;

    public Card() {
    }

    public Card(String number, String patter) {
        this.number = number;
        this.patter = patter;
    }

    public String getNumber() {
        return number;
    }

    public String getPatter() {
        return patter;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPatter(String patter) {
        this.patter = patter;
    }
}
