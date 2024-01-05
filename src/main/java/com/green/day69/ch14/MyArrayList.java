package com.green.day69.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        arr = new int[0];
    }

    public void add(int x){
        int[] result = new int[arr.length + 1];
        if (arr.length == 0){
            result[0] = x;
            arr = result;
            return;
        }
        /*for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }*/
        System.arraycopy(arr, 0, result, 0 ,arr.length);
        result[result.length-1] = x;
        arr = result;
    }
    public void print(){
        System.out.println(arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void forEach(Consumer<Integer> con){
        for (int i : arr) {
            con.accept(i);
        }
    }
    public void removeIf(Predicate<Integer> filter){
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(!filter.test(arr[i])){
                list.add(arr[i]);
            }
        }
        this.arr = list.arr;
    }
}
