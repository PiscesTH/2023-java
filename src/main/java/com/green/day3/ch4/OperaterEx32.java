package com.green.day3.ch4;

public class OperaterEx32 {
    public static void main(String[] args) {
        // 조건식  -  ? true 였을 때 : false 였을 때;  <---기본 형태
        //if else 구문을 한줄로 대체 가능
        int n1 = 30, n2 = 20;
        int r = n1 > n2 ? n1 : n2;
        //int r = Math.max(n1, n2);     내장함수 ? 사용
        System.out.println("r : " + r);
    }
}
