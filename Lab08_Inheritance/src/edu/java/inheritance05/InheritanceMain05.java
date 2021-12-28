package edu.java.inheritance05;


public class InheritanceMain05 {

	public static void main(String[] args) {
		//다형성(polymorphism)을 사용할 떄 주의점
		        Parent child1 = new Child();
		        child1.testParent();
		        ((Child) child1).testChild();
		        
		        System.out.println("");
		        
		        Parent child2 = new AnotherChild();
			        child2.testParent();
		        //위 코드는 컴파일 에러는 발생하지 않음.
		        //실행 중에 ClassCastException이 발생함
		        //강제 타입 변환(downcasting)을 할 때는 어떤 클래스의 인스턴스인지 검사하고 타입변환을 할 필요가 있음
		        //변수이름 instanceof 클래스 이름
		        if(child2 instanceof Child) {
		        	((Child) child2).testChild();
		        } else if (child2 instanceof AnotherChild) {
		        	((AnotherChild) child2).testAnotherChild();
		        	
		        }
		
		
	} //end class InheritanceMain05

}

class Parent {
	public void testParent () {
		System.out.println("Parent");
	}
} // end class

class Child extends Parent {
	
	public void testChild() {
		System.out.println("Child");
	}
}

class AnotherChild extends Parent {
	public void testAnotherChild() {
		System.out.println("AnotherChild");
	}
}