package com.green.day11.ch6;

public class StarPrint {
    void line(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int x) {
        for (int i = 0; i < x; i++) {
            line(x);
        }
    }

    void triangle(int x) {
        for (int i = 1; i <= x; i++) {
            line(i);
        }
    }

    String chkGenderById(String id) {
        char idNum = id.charAt(7);
        switch (idNum) {
            case '1', '3':
                return "남성";
            case '2', '4':
                return "여성";
        }
        return "유효하지 않은 주민번호입니다.";
    }

    int sumFromTo(int x, int y) {
        int result = 0;
        for (int i = x; i <= y; i++) {
            result += i;
        }
        return result;
    }
}
