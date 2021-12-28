package edu.java.inheritance09;

public class InheritanceMain09 {

	public static void main(String[] args) {

		// Shape 타입 2개를 저장할 수 있는 배열을 선언
		Shape[] shapes = new Shape[2];
		
		// Rectangle 객체를 생성하고 배열의 첫번째 원소로 저장
		shapes[0] = new Rectangle(5,5);
		// Circle 객체를 생성하고 배열의 두번째 원소로 저장
		shapes[1] = new Circle(5);
		// 향상된 for 문을 사용해서 배열의 원소들의 area() 메서드를 호출하고 결과 확인
		
		for(Shape s : shapes) {
			s.draw();
		}
	}

}
