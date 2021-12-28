package edu.java.inheritance03;

public class Car {
	private int speed;

	public Car(int speed) {
		super();
		this.speed = speed;
	}
	
	public void drive() {
		System.out.println("자동차 운행 : 현재 스피드 = " + speed);
	}
	
}
