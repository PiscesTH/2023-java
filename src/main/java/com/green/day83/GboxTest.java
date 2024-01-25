package com.green.day83;

public class GboxTest {
    public static void main(String[] args) {
        Gbox<Integer> g1 = new Gbox<>();    //컴파일 시점에 제네릭 타입 정해짐
        g1.setItem(1);
        g1.setItem(2);

        int intVal = g1.getItem();  //사용할 때 형변환 필요 x

        Gbox<String> g2 = new Gbox<>();
        g2.setItem("hello");
        String str = g2.getItem();
    }
}
