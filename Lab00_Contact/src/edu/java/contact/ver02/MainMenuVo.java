package edu.java.contact.ver02;

public interface MainMenuVo {
	int QUIT = 0;            // 프로그램 종료
	int SELECT_ALL = 1;      // 연락처 목록 전체 검색
	int SELECT_BY_INDEX = 2; // 인덱스로 연락처 1개 정보 검색
	int INSERT = 3;          // 새 연락처 추가
	int UPDATE = 4;          // 연락처 정보(이름, 전화번호, 이메일) 업데이트
	int DELETE = 5;			 // 연락처 삭제
	
}
