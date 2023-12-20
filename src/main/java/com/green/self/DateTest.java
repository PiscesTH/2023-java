package com.green.self;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTest {
    public static void main(String[] args) {
        try {
            String tmpDate = "12/25/2023";
            SimpleDateFormat bDateFormat = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat aDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date formatDate = bDateFormat.parse(tmpDate);
            String resultDate = aDateFormat.format(formatDate);
            System.out.println(resultDate);
        } catch (Exception e) {
            System.out.println("error");
        }

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("null 테스트");

        list.forEach(System.out::println);
        System.out.println(list.get(0));
        System.out.println(list.get(0).isBlank());
    }
}
