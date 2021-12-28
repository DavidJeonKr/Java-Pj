package edu.java.modifier07;

public class MySystem {
	public static MyPrintStream out = new MyPrintStream(); //static 변수 초기화
	
	
	
}

class MyPrintStream {
	public void print() {
		System.out.println("MyPrintStream print 메서드");
		
	}

	
}

