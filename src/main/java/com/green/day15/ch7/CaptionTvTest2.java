package com.green.day15.ch7;

class Tv2 {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class CaptionTv2 extends Tv2 {
    boolean caption;
    int channel;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    void printParentChannel() {
        System.out.printf("P-channel : %d\n", super.channel);
    }
}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 cTv = new CaptionTv2();
        cTv.channel = 10;
        cTv.channelUp();

        System.out.printf("cTv.channel : %d\n", cTv.channel);
        cTv.printParentChannel();
    }
}
