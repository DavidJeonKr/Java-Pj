package edu.java.inheritance07;
//final : 최종적인(마지막의), 변경할 수 없는
//1) 변수(멤버변수, 지역변수, 파라미터) 앞 - 변경할 수 없는 변수, 상수.
//2) 클래스 앞 - 변경할 수 없는 클래스. 상속할 수 없는 클래스. Sub class를 만들 수 없는 클래스/
//3) 메서드 앞 - 변경할 수 없는 메서드. override를 할 수 없는 메서드


import java.security.PublicKey;

public class InheritanceMain07 {

	private static final int MAX = 3;
	
	public static void main(String[] args) {
		final int n = 10;
		
	}

}//end class

class A {
	public void test() {}
	public final void testFinal() {}
	
}

class B extends A {
	A a = new A();
	@Override // final이 아닌 부모의 메서드는 override가 가능.
	public void test() {
		super.test();
		//추가기능 구현
		
	}
	
	//final로 선언된 부모의 메서드는 자식클래서에서 override 할 수 없다
	//public final void testFinal() {}
}

final class C {}

//final로 선언한 클래스는 확장(상속)할 수 없다.
//class D extends C{}
