package edu.java.lambda03;

import edu.java.lambda03.Calculator.Calculable;

public class LambdaMain03 {
	public static void main(String[] args) {
		//Calculator(계산기) 객체 생성
		Calculator calculator = new Calculator();
		
		//1. 변수 add가 두 숫자의 덧셈 결과가 저장되도록...
		//익명 클래스를 사용해서 (annonymous) 
		double add = calculator.calculate(1.0, 2.0, new Calculable() {
			
			@Override
			public double calculate(double x, double y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		});
		
		System.out.println("add = " + add); //-> 3.0
		
		//2. 변수 substract가 두 숫자의 뺄셈 결과가 저장되도록...
		// 람다 표현식
		double substract = calculator.calculate(1.0, 2.0, (x,y) -> x-y);
		
		System.out.println("substract : " + substract); // -> -1.0
		
	}
}
