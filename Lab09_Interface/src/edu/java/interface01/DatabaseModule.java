package edu.java.interface01;

//구현하기 위해 만든 클래스가 아니에요
//이렇게 이렇게 만들어라!!! 라고 설명해주는거에요
public interface DatabaseModule {
	// 필드(멤버 변수) - public static final 생략 가능.
	public static final int DBSDSD = 2;

	int DB_VERSION = 1;
	
	// 메서드 - public abstract 생략 가능.
	/**
	 * 데이터베이스에서 자료를 검색하는 기능.
	 * 
	 * @return 검색된 자료의 개수(정수).
	 */
	int select();
	
	/**
	 * 데이터베이스에서 비밀번호를 수정하는 기능.
	 * 
	 * @param pw 수정할 비밀번호
	 * @return 수정된 자료의 개수(정수).
	 */
	int update(String pw);
}