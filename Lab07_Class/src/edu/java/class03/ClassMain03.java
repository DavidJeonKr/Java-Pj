package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// Rectangle 클래스의 인스턴스를 생성.
		// default constructor를 사용해서 인스턴스를 생성.
		Rectangle rect1 = new Rectangle();
		System.out.println("rect1.width = " + rect1.width);
		System.out.println("rect1.height = " + rect1.height);
		
		// 파라미터(매개변수)가 1개인 생성자를 사용해서 인스턴스를 생성.
		Rectangle rect2 = new Rectangle(5.0);
		System.out.println("rect2.width = " + rect2.width);
		System.out.println("rect2.height = " + rect2.height);

		// 파라미터가 2개인 생성자를 사용해서 인스턴스를 생성.
		Rectangle rect3 = new Rectangle(3.0, 4.0);
		System.out.println("rect3.width = " + rect3.width);
		System.out.println("rect3.height = " + rect3.height);
		
	}

}