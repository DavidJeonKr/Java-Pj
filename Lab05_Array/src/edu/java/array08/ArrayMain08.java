package edu.java.array08;

import java.util.Random;


public class ArrayMain08 {
	public static void main(String[] args) {
		// 성적 처리 프로그램
		// 0 ~ 10사이의 난수 5개를 저장할 수 있는 배열선언
		// 배열에 난수 5개 저장
		// 배열에 저장된 모든 점수를 한 줄에 출력 !향샹된 for문
		// 5개 점수의 총점을 계산하고 출력
		// 5개 점수의 평균을 계산하고 출력
		// 표준편차를 계산하고 출력 : (score[x]-mean)제곱+=(score[x]-mean)제곱 /  
		// Math.sqrt() 메서드를 이용 -> 제곱근(squared root)
		// 최댓값을 찾아서 출력 max
		// 최솟값을 찾아서 출력

		Random rd = new Random();
		int[] score = new int[5];

		// Print Array use for statement
		for (int i = 0; i < score.length; i++) {
			int ranNum = rd.nextInt(10) + 1;
			score[i] = ranNum;
			System.out.print(score[i] + "\t");
		}
		System.out.println("");

		// total print
		int total = 0;
//		for (int i = 0; i < score.length; i++) {
//			total += score[i];
//		}
		for (int i : score) {
			total += i;
		}
		System.out.println("total : " + total);

		// average print
		double mean = (double) total / score.length;
		System.out.println("mean : " + mean);

		// Standard Deviation
		double var = 0;
		double dev = 0;
		double devSum = 0;
		for (int i = 0; i < score.length; i++) {
			dev = (score[i]-mean);
			devSum += Math.pow(dev, 2);
		}
		
		//분산값
		var = devSum / score.length;
		System.out.print("분산값 : " + var);
		
		//표준편차
 		double sd = Math.sqrt(var);
 		System.out.println(" 표준편차 : " + sd);

		// Max, min Score print
		int max = 0;
		int min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);

	}
}
