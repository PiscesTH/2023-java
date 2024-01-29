package com.green.day84;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = {77, 10, 1, 22, 80, 90, 33, 22};
        Stream<Integer> stream1 = Arrays.stream(intArr).boxed();
        Stream<Integer> stream2 = IntStream.of(intArr).boxed();

        List<Integer> list1 = stream1
                .sorted()
                .filter(i -> i % 2 == 0)
                .distinct()
                .limit(3)
                .toList();  //최종연산 과정이 없으면 중간연산 실행 안 됨.
        System.out.println(list1);
        List<Integer> list2 = stream2.sorted(Comparator.reverseOrder()).toList();
        System.out.println(list2);
    }
}
