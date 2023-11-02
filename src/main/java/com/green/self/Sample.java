package com.green.self;

import com.green.day24.BoardEntity;
import com.green.day24.MyConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
    }
}

class Practice {
    public static int upBoard(BoardEntity entity) {
        int result = 0;
        String sql = "UPDATE 테이블명 SET 컬럼명 = ? WHERE 컬럼명 = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "수정내용");
            ps.setInt(2, 1);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM 테이블 WHERE 컬럼명 = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static int insBoard(BoardEntity entity) {
        int result = 0;
        String sql = "INSERT INTO 테이블 (컬럼,컬럼) VALUES (?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "입력");
            ps.setString(2, "입력2");
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoard() {
        List<BoardEntity> list = new ArrayList<>();
        String sql = "SELECT * FROM 테이블";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(rs.getInt("iboard"));
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardId(int id) {
        String sql = "SELECT * FROM 테이블 WHERE 컬럼 = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(id);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                entity.setCreatedAt(rs.getString("created_at"));
                return entity;
            }
        } catch (Exception e) {

        }
        return null;
    }
}
