package edu.java.inner03;

public class EnclosingCls {
	// member variable
	private int instanceVar; //인스턴스 변수
	public static int classvar = 100; //static 변수(클래스 변수)
	public EnclosingCls(int instanceVar) {
		this.instanceVar = instanceVar;
	}
	
	//메서드
	// 인스턴스 메서드(static이 아닌 메서드, 인스턴스가 생성되어야만 사용할 수 있는 메서드)
	 public void printMembers() {
		 
	 }
	
	
	
}
