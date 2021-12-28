package edu.java.class05;

public class Score {
	
	int korean, english, math, science;
	int[] scores = new int[4];
	
	//생성자 - default, 파리미터 4개
	public Score() {}
	
	public Score(int[] socres) {
		this.scores = socres;
	}
	
	
	public Score(int korean,int english,int math,int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	//메서드 - 총점 리턴, 평균 리턴
	public int total() {
		return (korean + english + math + science);
	}
	
	public int mean() {
		
		return (total()/4);
	}
	
	
}
