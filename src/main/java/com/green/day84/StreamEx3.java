package com.green.day84;

import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item + 2)
                //무한 스트림
                .mapToInt(Integer::valueOf)
                .skip(3)    //3개 skip
                .limit(10)
                .boxed()
                .forEach(System.out::println);

    }
}
