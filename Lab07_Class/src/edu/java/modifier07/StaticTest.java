package edu.java.modifier07;

//인스턴스 멤버(변수, 메서드) : static 수식어를 사용하지 않은 필드, 메서드.
// - 반드시 인스턴스를 먼저 생성하고 난 이후에 사용할 수 있는 멤버 변수(필드) 메서드.
// - "참조변수.변수이름", "참조변수.메서드이름(...)" 형식으로 사용./
// static 멤버(변수/필드, 메서드) : static 수식어를 사용한 핀ㅇ드, 메서드
// 인스턴스가 생성되지 않아도 사용할 수 있는 멤버 변수(필드), 메서드

public class StaticTest {
	int instanceVariable; // 인스턴스 필드(멤버 변수)
	static int staticVariable; // static 필드(멤버 변수)

	public void printVariables() {
		System.out.println("--- 인스턴스 메서드 ---");
		System.out.println("instanceVariable = " + instanceVariable);
		System.out.println("staticVariable = " + staticVariable);
	}

	public static void printVariables2() {
		System.out.println("--- static 메서드 ---");
//		System.out.println("instanceVariable = " + instanceVariable);
		// static 메서드는 static 아닌 (non static) 멤버 변수를 참조할 수 없다.
		System.out.println("staticVariable = " + staticVariable);
	}
	

}
