package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 1, 7, 8, 10);
        int sum = list.stream().mapToInt(x -> x).sum();
        System.out.println("sum = " + sum);

        OptionalDouble avg = list.stream().mapToInt(x -> x).average();
        //OptionalDouble : null 체크 편의성 주는 클래스(Optional)
        if (avg.isPresent()){
            System.out.println("avg = " + avg.getAsDouble());
        }
    }
}
