package edu.java.array02;

import java.util.HashMap;

public class ArrayMain02 {
	public static void main(String[] args) {
		// 배열의 선언과 초기화
		// 타입[] 변수이름 = new 타입
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("빨강", "사과");
		map.put("보라", "포도");
		map.put("노랑", "귤");
		
		map.remove("빨강");
		
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(value);
		}
		//관계형 데이터베이스란 컬럼(열)과 레코드(행)로 구성된 여러개의
		//테이블(표)사이에 각각 어떤 관계를 맺게한 데이터베이스
		
		
		
	}
}
