package com.green.day84;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        File[] files = {
                new File("Ex1.java"), new File("Ex1.bak")
                , new File("Ex2.java"), new File("Ex2"), new File("Ex2.txt")
        };
        Stream<File> fileStream = Stream.of(files);
        List<String> list = fileStream.map(File::getName).toList();
        System.out.println(list);

        Stream.of(files).map(File::getName)
                .filter(x -> x.indexOf('.') != -1)
                .map(x -> x.substring(x.indexOf('.') + 1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }
}
