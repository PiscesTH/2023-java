package com.green.selfBlackJack;

public class Card {
    private String number;
    private String pattern;

    public Card() {
    }

    public Card(String number, String patter) {
        this.number = number;
        this.pattern = patter;
    }

    public String getNumber() {
        return number;
    }

    public String getPatter() {
        return pattern;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPatter(String patter) {
        this.pattern = patter;
    }

    @Override
    public String toString(){
        return String.format("pattern = %s, number = %s\n", pattern, number);
    }
}
