package edu.java.Array06;

public class ArrayMain06 {
	public static void main(String[] args) {
		// 2차원 배열 선언과 생성
		int[][] numbers = new int[2][3];
		for (int[] arr : numbers) {
			for (int x : arr) {
				System.out.print(x + "\t");
			}
			System.out.println("");
		}

		System.out.println("==================");
		int[][] numbers2 = new int[3][]; // 행의 크기는 정해져있고 아직 열의 크기가 정해져 있지 않은경우
		numbers2[0] = new int[3];
		numbers2[1] = new int[5];
		numbers2[2] = new int[4];
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.print(numbers2[i][j]+ "\t");
			}
			System.out.println("");
		}
		
		//(주의) int[][] array = new int[][]; 문장처럼 숫자2개를 모두 생략할 수 없다
		int[][][] a = new int[2][][];
	}
}
