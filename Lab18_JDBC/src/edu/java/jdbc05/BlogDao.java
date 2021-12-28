package edu.java.jdbc05;

import java.util.List;

// MVC 아키텍쳐에서 Controller에 해당하는 인터페이스
// DAO(Data Access Objct)
public interface BlogDao {
	
	List<Blog> select();
	
	//Blog타입 1행을 출력하기 위해
	Blog select(int no);
	
	//여기 왜 int를 썼을 까? -> 0이면 실패 1이면 성공
	//insert into 테이블이름 (컬럼1,컬럼2,...) values(row1, row2,..)
	int insert(Blog blog);
	
	//여기 도 0이면 실패 1이면 성공
	int update(Blog blog);
	
	//글 번호로만 delete가능 하기 떄문에
	int delete(int no);
	
	
}
