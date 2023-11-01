package com.green.day24;

import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);  // 결국 연결을 위한 메소드.
            // Java와 DB를 네트워크 상에서 연결해주는 메소드.
            //연결에 성공하면 DB와 연결된 상태를 Connection 객체로 표현하여 반환한다.
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("성공");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {   //열었던 순서의 역순으로 닫아준다.
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {   //열었던 순서의 역순으로 닫아준다.
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, ps);
    }
}
