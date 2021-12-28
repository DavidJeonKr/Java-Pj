package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.ojdbc.OracleJdbc.*;

public class JdbcMain03 {

	public static void main(String[] args) {
		// Oracle JDBC를 사용한 테이블 업데이트
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// Oracle jDBC 드라이버를 등록(로딩)
			DriverManager.deregisterDriver(new OracleDriver());
			//Oracle DB서버 접속(연결)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			//SQL문장 템플릿(template)
//			String sql = "UPDATE blogs SET title = ?, content = ?, update_time = sysdate where blog_no = ?";
			String sql = "UPDATE " + TABLE_BLOGS + " SET " + COL_TITLE + " =?, " + COL_CONTENT +
			" =?, " + COL_UPDATE_TIME + "= sysdate " + " where " + COL_BLOG_NO + " =?";
//			PrearedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// pstst의 ? 세 개를 채움
			System.out.println("변경할 제목 입력>>>");
			String title = sc.nextLine();
			System.out.println("변경할 본문 입력>>>");
			String content = sc.nextLine();
			
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, 1);
			
			//SQL을 실행, 결과 확인
			int result = pstmt.executeUpdate();
			System.out.println(result + "행 이(가) 업데이트 되었습니다");		
			
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