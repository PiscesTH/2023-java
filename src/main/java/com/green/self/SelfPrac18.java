package com.green.self;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SelfPrac18 {
    public static void main(String[] args) {
/*        Cal addCal = (x, y) -> x + y;
        System.out.println(addCal.add(3, 4));

        Cal2 test = (x, y) -> x > y ? x : y ;

        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> (int)(Math.random() *5) + 1);
        System.out.println(Arrays.toString(arr));*/

        Function<Integer, Integer> getAbs = Math::abs;
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("zxc");
        list.add("qwe");
        list.add("asd");

        list.remove("asd");
        list.forEach(System.out::println);
    }
}
