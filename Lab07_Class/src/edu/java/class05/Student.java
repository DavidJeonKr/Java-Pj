package edu.java.class05;

import java.util.Scanner;

public class Student {

	int id;//학번
	String name;//이름
	Score score;// 학생이 수강신청한 과목의 점수들을 저장하는 객체
	
	//생성자 default, 파라미터 3개
	public Student() {
		score = new Score();
	}
	
	public Student(int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	//메서드 - info : 학번, 이름, 과목점수들, 총점, 평균
	public void info() {
	System.out.print("학번 : " + id);
	System.out.println(" 이름 : " + name);
	System.out.println("국어 : " + score.korean);
	System.out.println("영어 : " + score.english);
	System.out.println("수학 : " + score.math);
	System.out.println("과학 : " + score.science);
	System.out.println("총점 : " + score.total());
	System.out.println("평균 : " + score.mean());
	}
	
	public void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("각 과목의 점수를 입력하십시오");
		System.out.println("국어");
		int kor = scanner.nextInt();
		System.out.println("영어");
		int eng = scanner.nextInt();
		System.out.println("수학");
		int math= scanner.nextInt();
		System.out.println("과학");
		int sc = scanner.nextInt();
		
		score.korean = kor;
		score.english = eng;
		score.math = math;
		score.science = sc;
		
		scanner.close();
		
	}
	

}
