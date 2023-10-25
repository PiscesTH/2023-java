package com.green.day20.ch8;

public class StringEx {
    public static void main(String[] args) {
        Numbox b1 = new Numbox(10);
        Numbox b2 = new Numbox(10);
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(b1 == b2);
        System.out.println("결과 : " + b1.equals(b2));
        System.out.println("결과 : " + b1.equals(str2));

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class Numbox {   //기본생성자 x
    private int num;

    public Numbox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object object) {
        try {
            Numbox numbox = (Numbox) object;
            return num == numbox.num;
        } catch (Exception e) {
            return false;
        }
    }
}
