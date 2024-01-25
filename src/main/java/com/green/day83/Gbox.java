package com.green.day83;

public class Gbox<T> {  //제네릭 클래스
    private T item;     //T : 타입변수

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
