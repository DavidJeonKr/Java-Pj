package edu.java.array07;

import java.util.Random;

import java.util.Random;

public class ArrayMain07 {
	public static void main(String[] args) {
		// 1~5까지 사이의 정수난수 3개를 저장하는 배열
//		Random rd = new Random();
//		int[] arr = new int[3];
//		int i = 0;
//		int count = 0;
//		for (; count < arr.length;) {
//			arr[i] = rd.nextInt(5); // 난수 생성
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[i + 1]) {
//					// 앞뒤 숫자 비교
//					arr[i] = rd.nextInt(5);
//					count--;
//				}
//			}
//			System.out.print(arr[i] + " \t ");
//			// 서로 다른 숫가 3개 만들여졌으면
//			count++;
//			i++;
//		}
		Random rd = new Random();
		int[] numbers = new int[4];
		int count = 0;
		while (count < numbers.length) {
			int r = rd.nextInt(5) + 1;

			boolean isSame = false; // 배열에서 같은 숫자가 있으면 true로 바꿀 변수
			for (int i = 0; i < count; i++) {
				if (numbers[i] == r) {
					isSame = true;
					break;
				}
			}

			if (isSame == false) {
				numbers[count] = r;
				count++;
			}
			System.out.print(r + "\t");
		}

	}
}
