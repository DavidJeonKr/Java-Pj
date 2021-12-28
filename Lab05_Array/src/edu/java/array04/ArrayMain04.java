package edu.java.array04;

public class ArrayMain04 {
	public static void main(String[] args) {
		// 2차원 배열: 1차원 배열을 원소로 갖는 배열
		// 2차원 분석, 머신러닝 등
		// 2차원 배열 
		// 코드가 (방)
		// [2][2] [][][]
		//		  [][][]
						 // (행)            //2번쨰 행				//3번째 행
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 11, 21, 31, 41 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.println(arr[i][j]);
			}
		}

		for (int x[] : arr) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println("");
		}

		for (int[] numbers : arr) {
			for (int z : numbers) {
				System.out.print(z + "\t");
			}
			System.out.println("");
		}
	}
}