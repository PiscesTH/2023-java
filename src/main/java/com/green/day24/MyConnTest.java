package com.green.day24;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country) values ('나라 이름')";

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
        BoardEntity entity = new BoardEntity();
        entity.setTitle("A");
        entity.setCtnts("B");
        entity.setWriter("C");
        int row = BoardDao.insBoard(entity);    //영향 받은 레코드 수 리턴
        System.out.println("row = " + row);     //제대로 작동안하면 0 리턴
    }
}

class MyConnTest3{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(1);

        int row = BoardDao.delBoard(entity);
        System.out.println(row);
    }
}

class MyConnTest4{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(10);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println(row);
    }
}