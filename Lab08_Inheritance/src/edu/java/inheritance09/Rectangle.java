package edu.java.inheritance09;

public class Rectangle extends Shape {
	//filed
	private double width;
	private double height;

	public Rectangle(double width,double height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	// TODO 구현
	//넓이
	@Override
	public double area() {
		return (width*height);
	}
	//둘레
	@Override
	public double perimeter() {
		return (width+height)*2;
	};
	
}
