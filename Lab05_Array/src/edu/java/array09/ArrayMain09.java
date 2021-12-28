package edu.java.array09;
//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
//이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class ArrayMain09 {
	public static void main(String[] args) {
		//최댓값 점수를 M
		
		int max = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		//점수 갯수
		System.out.println("점수 갯수");
		int num = scanner.nextInt();
		//점수
		System.out.println("점수 입력해라!");
		int[] scores = new int[3];
		scores[0] = scanner.nextInt();
		scores[1] = scanner.nextInt();
		scores[2] = scanner.nextInt();
	
		for (int i = 0; i < num; i++) {
			max = scores[i];
			for (int j = 0; j < num; j++) {
				if(scores[i] > max ) {
					max = scores[i];
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			int temp = scores[i]/max*100;
			sum += temp;
		}
		
		int mean = sum/num;
		System.out.println(mean);
		
		
		
		
	}
}
