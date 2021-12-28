package edu.java.inheritance09;

public class Circle extends Shape{
	//filed
	private double radius;
	//construcr
	public Circle(double radius) {
	super("Circle");
	this.radius = radius;
	}
	//TODO: 구현
	//넓이
	@Override
	public double area() {
		return (Math.PI*Math.pow(radius, 2));
	}
	//둘레
	@Override
	public double perimeter() {
		return (2*Math.PI*radius);
	}
	

	
	
	
	
	
	
}
