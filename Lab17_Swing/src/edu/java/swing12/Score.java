package edu.java.swing12;

public class Score {
	private int korean;
	private int english;
	private int math;

	public Score() {
	}

	public Score(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

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

	public int total() {
		return this.korean + this.english + this.math;
	}

	public double mean() {
		return (total() / 3);
	}

}
