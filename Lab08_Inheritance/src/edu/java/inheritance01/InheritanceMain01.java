package edu.java.inheritance01;

public class InheritanceMain01 {

	public static void main(String[] args) {
		BasicTv tv1 = new BasicTv();
		tv1.powerOnOff(); // basicTv의 기능(메서드)를 사용
		
		SmartTv tv2 = new SmartTv();
		tv2.powerOnOff(); // 하위 클래스인 SmartTv 객체에서 상위 클래서 BasicTV로 부터 상속받은 기능 (메서드)를 사용.
		tv2.setIp("192.168.11.31");
		System.out.println(tv2.getIp());
		
		
	}

}
