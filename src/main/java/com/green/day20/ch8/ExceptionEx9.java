package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("일부러 에러 터트림");  //에러 의도적으로 만드는 법
            System.out.println("test");
            throw e;
            //throw new Exception("일부러 에러 터트림");        한 줄로 작성 가능
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
