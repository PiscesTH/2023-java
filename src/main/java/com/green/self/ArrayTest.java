package com.green.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        String[] str = {"123","abc","qwe","zxc"};
        List<String> arr = Arrays.asList(str);
        arr.set(0,"tyu");
        arr.remove(3);
        arr.forEach(System.out::println);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str));
        arrayList.set(1,"s");
        arrayList.forEach(System.out::println);
        System.out.println(Arrays.toString(str));
    }
}
