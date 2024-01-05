package com.green.day69.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> f = v -> Integer.parseInt(v); //Function<파라미터 타입, 리턴 타입>
        Function<String, Integer> f2 = Integer::parseInt;   //메서드 참조

        System.out.println(f.apply("12") + f.apply("12").getClass().getSimpleName());
        System.out.println(f2.apply("12") + f.apply("12").getClass().getSimpleName());

        BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2); //BiFunction<첫번째 파라미터 타입, 두번째 파라미터 타입, 리턴 타입>
        BiFunction<String, String, Boolean> bf2 = String::equals;
    }
}
