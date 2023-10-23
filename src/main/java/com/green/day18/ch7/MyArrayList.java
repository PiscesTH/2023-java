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

    public void add(int index, int num) {
        int len = arr.length + 1;
        int[] resultArr = new int[len];
        for (int i = 0; i < index; i++) {
            resultArr[i] = arr[i];
        }
        resultArr[index] = num;
        int nextIndex = index + 1;
        for (int i = nextIndex; i < resultArr.length; i++) {
            int beforeIndex = i - 1;
            resultArr[i] = arr[beforeIndex];
        }
        arr = resultArr;
    }

    public void add2(int index, int num) {
        add(num);
        int startIndex = arr.length - 1;
        for (int i = startIndex; i > index; i--) {
            int beforeIndex = i - 1;
            int tmp = arr[i];
            arr[i] = arr[beforeIndex];
            arr[beforeIndex] = tmp;
        }
    }

    public void addSol(int idx, int val) {
        int[] tmp = new int[arr.length + 1];
        tmp[idx] = val;
        for (int i = 0; i < arr.length; i++) {
            tmp[i < idx ? i : i + 1] = arr[i];
        }
        arr = tmp;
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
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
        list.add2(1, 50);
        System.out.println(list);
        list.add2(3, 80);
        System.out.println(list);
    }
}

