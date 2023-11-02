package com.green.self;

import com.green.day24.BoardEntity;
import com.green.day24.MyConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

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

    public static int insBoard(BoardEntity entity){
        int result = 0;
        String sql = "INSERT INTO 테이블 (컬럼,컬럼) ";
        return result;
    }
}
