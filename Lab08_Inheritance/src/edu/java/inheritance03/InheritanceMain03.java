package edu.java.inheritance03;

public class InheritanceMain03 {

	public static void main(String[] args) {
		// 메서드 override

		// Car 클래스의 인스턴스를 생성
		Car car1 = new Car(50);
		car1.drive();

		// ElectricCar 클래스의 인스턴스를 생성
		ElectricCar car2 = new ElectricCar(50, 100);
		car2.drive();
		System.out.println("");
	
		Car car3 = new ElectricCar(0, 0);
		car3.drive(); //ElectricCar의 (override된 drive메서드가 실행됨
		
		//다형성을 사용한 배열생성
		Car[] cars = new Car[3];
		cars[0] = new Car(0);
		cars[1] = new ElectricCar(0, 0);
		cars[2] = new ElectricCar(59, 100);
		for(Car c : cars) {
			c.drive();
			System.out.println("------");
		}
		
	}
}