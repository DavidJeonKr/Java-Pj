package edu.jav.array01;

public class ArrayMain01 {
	
	public static void main(String[] args) {
		//배열 //ArrayList
		// TODO Auto-generated method stub
		int score1 = 100;
		int score2 = 90;
		int score3 = 50;
		int total = score1 + score2 + score3;
		double mean = total / 3.0;
		System.out.println("평균 = " + mean);
		// 배열(array) : 같은 타입의 ( 데이터) 여러개를 하나의 (변수) 이름으로 저장하기 위한 자료주고
		// 인덱스(index) : 배열에 자료를 저장하거나, 저장된 값을 읽어올 때 사용되는 번호
		// 배여르이 인데스는 0부터 시작, 연속된 정수

		// 배열 사용 방법
		// int(정수) 3개를 저장할 수 있는 배열을 생성. 변수 이름은 scores라고 선언.
		int[] scores = new int[3];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 50;
		total = scores[0] + scores[1] + scores[2];
		mean = total / 3.0;
		System.out.println("mean = " + mean);
		// 배열과 for 문
		int[] exams = new int[10];
		for (int i = 0; i < exams.length; i++) {
			exams[i] = 100;
			System.out.print(exams[i] + " ");
		}

		// 타입[] 변수 이름 = new 타입[]{값1,값2,...};
		int[] array = new int[] { 1, 3, 5, 7, 9 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");

		// 향상된 for 문(enhanced for statment)
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println("");

		String[] stringArray = new String[] { "java, SQL, JSP, Spring, Machine Learning" };
		for (String s : stringArray) {
			System.out.print(s + " ");
		}

	}

}
