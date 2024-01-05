package com.green.day69.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
            list.add(i + 16);
        }
//        list.forEach(System.out::println);  //forEach() 파라미터에 들어가는 것 : 인터페이스 consumer 를 상속받는 객체의 주소값
        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).distinct().sorted().toList();
//        list2.forEach(System.out::println);
        System.out.println("--------------------------------");
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("new Consumer : " + integer);
            }
        });*/
        System.out.println("--------------------------------");
//        list.forEach(new MyConsumer<Integer>());


        list.removeIf(i -> i % 2 == 0);
        list.forEach(System.out::println);
    }
}

class MyConsumer<T> implements Consumer<T> {    //제네릭 만드는 법. 대문자 하나 사용해서 설정. 객체화 할 때 T에 타입이 들어옴.
    @Override
    public void accept(T t) {
        System.out.println("MyConsumer : " + t);
    }
}
