package com.green.day24;

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
        entity.setTitle("insert 배움");
        entity.setCtnts("DB에 값넣어봄");
        entity.setWriter("오호라");
        int row = BoardDao.insBoard(entity);    //영향 받은 레코드 수 리턴
        System.out.println("row = " + row);     //제대로 작동안하면 0 리턴
    }
}