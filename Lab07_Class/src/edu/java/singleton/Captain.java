package edu.java.singleton;

public class Captain {
	
	// 필드(멤버 변수)
	private static Captain instance = null;
	private String name = "캡틴 아메리카";

	// private 생성자 => 다른 클래스에서 보이지 않기 때문에 생성자를 호출할 수 없음
	private Captain() {
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

}
