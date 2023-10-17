package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
    }
    void print(){}
    void print(int x){}
    void print(int x, int y){}
    void print(String s, int y){}
    void print(int x, String s){}
    int print(int x, boolean t){
        return x;
    }
}
