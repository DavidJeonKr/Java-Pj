package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.ojdbc.OracleJdbc.*;
public class JdbcMain04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// Oracle JDBC 드라이버를 등록(메모리 로딩)
			//어느 클래스든 자동으로 클래스 컴파일 읽어줘서
			DriverManager.registerDriver(new OracleDriver());
			
			// Oracle DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			//sql 문
			// DELETE FROM blogs WHERE blog_no = ?
			String sql = "DELETE FROM " + TABLE_BLOGS + 
					" WHERE " + COL_BLOG_NO + " = ?";
			System.out.println(sql);
			//sql 발행
			pstmt = conn.prepareStatement(sql);
			
			System.out.println("삭제할 글 번호 >>>");
			int no = Integer.parseInt(sc.nextLine());
			pstmt.setInt(1, no);
			
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "행이 삭제 되었습니다");
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
