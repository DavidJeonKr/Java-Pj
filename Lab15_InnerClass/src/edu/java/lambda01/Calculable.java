package edu.java.lambda01;

// FunctionalInterface: 오직 한 개의 추상 메서드를 갖는 인터페이스

@FunctionalInterface
public interface Calculable {
	
	double calculate(double x, double y);
	
}

