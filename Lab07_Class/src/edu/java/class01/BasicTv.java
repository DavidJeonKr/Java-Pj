package edu.java.class01;

//객체 지향 프로그래밍(OOP : object-Orientied Programming) 언어 : java C+=, C#, Python
//클래스(class) : 프로그램에서 필요한 데이터(filed)와 기능(method)을 묶어서 하나의 "데이터 타입" 을 정의한 것.
//데이터 타입 -> 변수 선언, 파라미터 ㄱ선언, 리턴타입 서언
public class BasicTv {
	// 데이터(객체의 상태를 저장하기 위한 변수) - filed, instance variable(인스턴스 변수)
	boolean powerOn; // Tv의 현재 전원 상태를 저장하기 위한 필드( true on false off)
	int volume; // TV의 현재 음량 상태를 저장하기 위한 필드
	int channel; // TV의 현재 채널 번호를 저장하기 위한 필드

	public void volumUp() {
		volume++; // (지역 변수가 아니라) 필드의 값을 변화
		System.out.println("volume 증가: " + volume);
	}

	public void volumeDown() {
		volume--;
		System.out.println("volume 감소: " + volume);
	}

	public void channelUp() {
		channel++;
		System.out.println("chnnel을 " + channel  +"증가시킵니다");
	}

	public void channelDown() {
		channel--;
		System.out.println("chnnel을 " + channel  +"감소시킵니다");
	}

	int makeDouble(int x) {
		int result = x * 2;
		return result;
	}

	public void powerOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("전원 끄기");
		} else {
			powerOn = true;
			System.out.println("전원 켜기");
		}
	}

}
