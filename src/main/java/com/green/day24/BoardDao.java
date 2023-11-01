package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_At FROM board";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);  //DB로 sql문 전송하는 역할
            rs = ps.executeQuery();      //select 는 무조건 executeQuery() 사용
            while (rs.next()) {          //rs.next() : 다음 레코드를 선택 >> 있으면 true / 없으면 false 리턴
                //rs.next() 의 첫 시작점은 첫 레코드의 앞에 있음. 레코드가 하나도 없으면 false. 하나라도 있으면 true.
                //이러한 이유로 if에서도 사용 가능.
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return list;
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

    public static int updBoard(BoardEntity entity) {
        int result = 0;
        String sql = "UPDATE board SET title = ?, ctnts = ?, writer = ?, updated_at = NOW() WHERE iboard = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);        //DB로 sql문 전송하고 처리 결과 받아오는 역할
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();            //sql문 실행. 영향받은 레코드 개수 리턴
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static BoardEntity selBoardById(int iboard) {
        BoardEntity result = new BoardEntity();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();      //select 는 무조건 executeQuery() 사용
            //executeQuery() 가 리턴하는 ResultSet은 select한 결과값을 가지고 있다.
            if (rs.next()) {
                result.setIboard(iboard);
                result.setCtnts(rs.getString("ctnts"));
                result.setUpdatedAt(rs.getString("updated_at"));
                result.setTitle(rs.getString("title"));
                result.setWriter(rs.getString("writer"));
                result.setCreatedAt(rs.getString("created_at"));
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;
    }
}
//https://gimmesome.tistory.com/113
/*
insBoard(BoardEntity entity)
( ) 안에 들어가는 객체
Vo  : Value Object - 값 전달용 객체 >> 값이 변경되면 안된다. >> final or setter x
Dto : Data Transfer Object - 데이터 전달용 객체
Entity : Entity - DB와 1:1 연동 >> Entity 만 봐도 테이블 파악 가능
 */