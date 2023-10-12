package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("num : " + num);

        NumBox nb = new NumBox();
        System.out.println("nb.num : " + nb.num);
        nb.num = 30;
        System.out.println("nb.num : " + nb.num);
        changeVal(nb);      //주소값을 전달.
        System.out.println("nb.num : " + nb.num);

    }

    public static void changeVal(int num3) {
        System.out.println("changeVal - int");
        num3 = 10;
        System.out.println(num3);
    }

    public static void changeVal(NumBox nb) {
        System.out.println("changeVal - NumBox");
        nb.num = 10;
        nb = new NumBox();
        nb.num = 30;
    }
}

class NumBox {
    int num;
}