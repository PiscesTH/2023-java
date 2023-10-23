package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();    //배열과는 다르게 순서 개념 X. Object로 key, value 저장
        map.put("a", 10);           //(key , value) label
        map.put("b", 20);           // key 호출 > value 리턴
        map.put("b", 30);           // key 중복되면 이전 value 사라짐.

        Object obj = map.get("b");
        int val = (int) obj;
        System.out.println(val);
    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();   //제네릭스 < key 타입, value 타입 > 으로 사용
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);
        System.out.println(map.size());

        map.put("Tv", map.get("Tv") + 1);
        map.put("Tv", map.get("Tv") + 1);
        System.out.println(map.get("Tv"));
    }
}