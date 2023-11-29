package com.green.day44;

public class Test {
    public static void main(String[] args) {
        MyInfo mi = new MyInfo().title("greengram")
                .description("인스타 클론 코딩");

        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI().info(mi);
        System.out.println(moa);
    }
}
