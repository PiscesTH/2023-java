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
//                , entity.getTitle(), entity.getCtnts(), entity.getWriter());  String.format 이용하는 법
        String sql = "INSERT INTO board (title, ctnts, writer) values (?, ?, ?)";
        //sql문 적을 때 띄어쓰기 주의
        //? 에 값을 넣기 위해 PreparedStatement 이용해야 함.
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();           //DB와 연결
            ps = conn.prepareStatement(sql);   //DB로 sql문 전송하고 처리 결과 받아오는 역할
            ps.setString(1, entity.getTitle());     //첫번째 ? 에 값 지정
            ps.setString(2, entity.getCtnts());     //두번째 ? 에 값 지정
            ps.setString(3, entity.getWriter());    //세번째 ? 에 값 지정
            result = ps.executeUpdate();            //SQL문 실행. 영향 받은 레코드 개수 리턴
        } catch (Exception e) {
            e.printStackTrace();
        } finally {             //finally에서 연결 종료. 종료할 때는 역순으로 종료.
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList<>();  //DB의 레코드를 한 줄씩 저장할 공간
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_At FROM board";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);  //DB로 sql문 전송하는 역할
            rs = ps.executeQuery();      //select 는 무조건 executeQuery() 사용
            //executeQuery() 가 리턴하는 ResultSet은 select한 결과값을 가지고 있다.
            while (rs.next()) {          //rs.next() : 다음 레코드를 선택 >> 있으면 true / 없으면 false 리턴
                //rs.next() 의 첫 시작점은 첫 레코드의 앞에 있음. 레코드가 하나도 없으면 false. 하나라도 있으면 true.
                //이러한 이유로 if에서도 사용 가능.
                int iboard = rs.getInt("iboard");       //ResultSet 에 저장된 값 가져오기
                String title = rs.getString("title");   //테이블의 컬럼명과 타입 맞춰서 사용
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

    public static BoardEntity selBoardById(int id) {
        BoardEntity result = new BoardEntity();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();      //select 는 무조건 executeQuery() 사용
            if (rs.next()) {             //레코드 하나만 가져올 때 if 사용. while 도 사용 가능하긴 함.
                result.setIboard(id);
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
        return null;    //해당되는 레코드가 없으면 null 리턴
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
    public static int insBoardVer2(BoardEntity entity) {
        int result = 0;
        String sql = "INSERT INTO board SET title = ?, ctnts = ?, writer = ?";
        //insert문 다른 방식
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }
}
//https://gimmesome.tistory.com/113
/*
insBoard(BoardEntity entity)
( ) 안에 들어가는 객체
Vo  : Value Object - 값 전달용 객체 >> 값이 변경되면 안된다. >> final 사용 or setter 구현 X
Dto : Data Transfer Object - 데이터 전달용 객체
Entity : Entity - DB와 1:1 연동 >> Entity 만 봐도 테이블 파악 가능
 */