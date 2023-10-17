package com.green.day14.ch6;

public class Document {
    static int num;
    String name;

    public Document() {
        this(String.format("제목없음%d",++num));
    }

    public Document(String str) {
        name = str;
        System.out.printf("문서 %s (이)가 생성되었습니다.\n", name);
    }
}

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();           //문서 제목없음 1 가 생성되었습니다.
        Document d2 = new Document("자바.txt"); //문서 자바.txt가 생성되었습니다.
        Document d3 = new Document();           //문서 제목없음 2 가 생성되었습니다.
        Document d4 = new Document();           //문서 제목없음 3 가 생성되었습니다.
    }
}
