package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country) values ('경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnTest2{
    public static void main(String[] args) {
        //tltie : 처음 작성
        //ctbts : 처음 작성하는 내용입니다.
        //writer : 홍길동
        BoardEntity entity = new BoardEntity();
        entity.setTitle("insert 배움");
        entity.setCtnts("DB에 값넣어봄");
        entity.setWriter("신세계");
        int row = BoardDao.insBoard(entity);    //영향 받은 행 수 리턴
        System.out.println("row = " + row);     //제대로 작동안하면 0
    }
}