package edu.java.lambda01;

public class LambdaMain01 {
	public static void main(String[] args) {
		//목적 : Calculable 인터페이스를 구현한 크래스의 객체를 사용(메스드 calculate)
		// 1. Calculable을 구현하는 클래스를 정의한다
		Calculable adder = new Adder(); // 구현 클래스의 객체 생성
		double result = adder.calculate(1.0, 2.0); //객체가 가지고 있는 메서드 호출
		System.out.println(result);
		
		// 2. Calculable을 구현하는 지역 클래스를 정의 
		class Subtracter implements Calculable {

			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x-y;
			}
			
		}
		
		Calculable subtracter = new Subtracter(); // 구현 클래스의 객체 생성
		result = subtracter.calculate(1.0, 2.0); //객체가 가지고 있는 메서드 호출
		System.out.println(result);
		
		Calculable multiplier = new Calculable() {
			
			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x*y;
			}
		};
		result = multiplier.calculate(1.0, 2.0);
		System.out.println(result);
		
		//4. 람다 표현식(lambda expression)
		//객체 생성과 클래스 정의를 동시에 하는 익명 클래스 객체 생성을 간단히 표현하는 문장.
		Calculable divider = (x,y) -> x/y;
		
	}
}
