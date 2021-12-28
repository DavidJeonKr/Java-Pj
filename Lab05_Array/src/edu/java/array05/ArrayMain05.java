package edu.java.array05;

public class ArrayMain05 {
	public static void main(String[] args) {
		String[][] groups = { 
				{"RM", "진", "제이홉", "지민", "뷔","정국"},
				{"민영", "유정", "은지", "유나"}};	
		//[0][5]
		//[1][3]
		//System.out.println(groups[1].length);
		
		for (int i = 0; i < groups.length; i++) {
			for (int j = 0; j < groups[i].length; j++) {
				System.out.print(groups[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for(String[] x : groups) {
			for(String y : x) {
				System.out.print(y + "\t");
			}
			System.out.println("");
		}
		
		
		
	}
}
