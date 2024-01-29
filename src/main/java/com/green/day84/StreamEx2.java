package com.green.day84;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream intStream = r.ints();  //무한 스트림(중간 연산)

        intStream.limit(10).forEach(System.out::println);
        System.out.println("end point 1");
        System.out.println("---------------------------");

        r.ints(10).forEach(System.out::println);
        System.out.println("end point 2");
        System.out.println("---------------------------");

        r.doubles(5).forEach(System.out::println);
        System.out.println("end point 3");
        System.out.println("---------------------------");

        List<Integer> list = r.doubles()
                .mapToInt(x -> (int) (x * 10) + 1)
                .boxed()
                .distinct()
                .limit(5)
                .toList();

        System.out.println(list);
        System.out.println("end point 4");
        System.out.println("---------------------------");

        r.ints(1, 46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
        System.out.println("end point 5");
    }
}
