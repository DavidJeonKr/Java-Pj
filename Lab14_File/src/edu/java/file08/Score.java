package edu.java.file08;

import java.io.Serializable;

public class Score implements Serializable {
	//filed (member variable)
	private int korean, english, math;
	
	//constructor - 기본(), 파라미터(,,,)
	public Score() {}
	
	public Score(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//getters & setters

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//toString
	@Override
	public String toString() {
		return "국어: " + korean +", 영어: " + english + ", 수학: " + math;
		//return super.toString();
	}
}
