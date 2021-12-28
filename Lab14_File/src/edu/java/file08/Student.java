package edu.java.file08;

import java.io.Serializable;

public class Student implements Serializable{
	//filed
	private int studentId;
	private String studentName;
	private Score score;
	
	// TODO: constructor - 기본(), 파라미터( , , )
	public Student() {};

	public Student(int studentId, String studentName, Score score) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student {" + "ID: " + studentId + ", NAME: " + studentName + ", SCORE: " + score + "}";
	//	return super.toString();
	}
	
	
	
}
