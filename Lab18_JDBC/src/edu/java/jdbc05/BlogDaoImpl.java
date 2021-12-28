package edu.java.jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;
// MVC 아키텍쳐에서 Controller를 구현하는 클래스
//									     (1) sql 발행
// 처리용 자바 클래스 <----- DTO <-------   DAO <------- 데이터베이스
//         (4)데이터 전달        (3)데이터 저장            (2) 데이터 취득



public class BlogDaoImpl implements BlogDao {

	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "scott";
	String PASSWORD = "tiger";
	
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;

	List<Blog> list = new ArrayList();
	@Override
	public List<Blog> select() {
		String sql = "select * from book";
		selectdb(sql);
		return list;
	}

	@Override
	public Blog select(int no) {
		return null;
	}

	@Override
	public int insert(Blog blog) {
		return 0;
	}

	@Override
	public int update(Blog blog) {
		return 0;
	}

	@Override
	public int delete(int no) {
		return 0;
	}

	void selectdb(String sql) {

		try {
			// Oracle JDBC 드라이버를 등록(메모리 로딩)
			DriverManager.registerDriver(new OracleDriver());

			// Oracle DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			// sql 문
			// DELETE FROM blogs WHERE blog_no = ?
//			String sql = "DELETE FROM " + TABLE_BLOGS + " WHERE " + COL_BLOG_NO + " = ?";
			System.out.println(sql);
			// sql 발행
			pstmt = conn.prepareStatement(sql);

			System.out.println("삭제할 글 번호 >>>");
			int no = Integer.parseInt(sc.nextLine());
			pstmt.setInt(1, no);

			int result = pstmt.executeUpdate();
			System.out.println(result + "행이 삭제 되었습니다");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
