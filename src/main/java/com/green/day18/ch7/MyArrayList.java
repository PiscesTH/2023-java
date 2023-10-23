package com.green.day18.ch7;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int num) {
        int len = arr.length + 1;
        int[] resultArr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        resultArr[arr.length] = num;
        arr = resultArr;
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "Null";
        }
        String s = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            s += String.format(", %d", arr[i]);
        }
        s += "]";
        return s;
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list);
        list.add(10);   //0번방 10
        System.out.println(list);
        list.add(20);   //1번방 20
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

    }
}

