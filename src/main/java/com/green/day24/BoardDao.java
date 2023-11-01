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
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);   // -ed 유무 확인
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();            //SQL문 실행
        } catch (Exception e) {
            e.printStackTrace();
        } finally {                                              //종료할 때는 역순으로 종료.
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM board where iboard = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }
    public static int updBoard(BoardEntity entity){
        int result = 0;
        String sql = "UPDATE board SET title = ?, ctnts = ?, writer = ? WHERE iboard = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }
}
/*
insBoard(BoardEntity entity)
( ) 안에 들어가는 객체
Vo  : Value Object - 값 전달용 객체 >> 값이 변경되면 안된다. >> final or setter x
Dto : Data Transfer Object - 데이터 전달용 객체
Entity : Entity - DB와 1:1 연동 >> Entity 만 봐도 테이블 파악 가능
 */