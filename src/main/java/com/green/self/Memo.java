package com.green.self;

import java.util.StringJoiner;

public class Memo {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr);
        System.out.println(str);

        StringJoiner sj = new StringJoiner(",", "(", ")");
        String[] strArr = {"aaa", "bbb", "ccc"};
        for (String s : strArr) {
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}
