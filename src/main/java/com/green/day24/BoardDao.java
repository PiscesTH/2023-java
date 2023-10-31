package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

//dao : data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
//        String sql = String.format("INSERT INTO board (title, ctnts, writer) values ('%s','%s','%s')"
//                , entity.getTitle(), entity.getCtnts(), entity.getWriter());
        String sql = "INSERT INTO board (title, ctnts, writer) values (?, ?, ?)";
        System.out.println(sql);
        try {
            Connection conn = MyConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();            //SQL문 실행
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }
}
