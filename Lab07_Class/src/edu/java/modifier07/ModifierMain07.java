package edu.java.modifier07;

public class ModifierMain07 {

	public static void main(String[] args) {
		// static 필드는 이미 메모리에 기본값으로 생성되어 있음.
		System.out.println(StaticTest.staticVariable);

		// StaticTest 클래스의 인스턴스를 생성하기 전에 static 메서드를 호출할 수 있음
		// StaticTest.printVariables2();

		// StaticTest 클래스의 인스턴스를 생성
		StaticTest test = new StaticTest();
		test.printVariables();
		// 인스턴스 변수와 인스턴스 메서드는 참조 변수를 통해서 사용함

		System.out.println();

		// test1() 메서드를 사용하기 위해서는 인스턴스를 먼저 생성한 후 참조 변수를 통해서 사용함
		ModifierMain07 inst = new ModifierMain07();
		inst.test1();
		
		System.out.println("");
		MySystem.out.print();
	}

	public void test() {
		System.out.println("메서드");
	}

	public void test1() {
		System.out.println("메인 인스턴스 메서드");
	}

	public static void test2() {
		System.out.println("메인 static 메서드");
	}
	

}
