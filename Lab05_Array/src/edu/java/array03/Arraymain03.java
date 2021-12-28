package edu.java.array03;

import java.util.Iterator;

public class Arraymain03 {
	public static void main(String[] args) {
		// array10
		int[] arr = new int[10];
		int x = 5;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = x * (i + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// boolean true, false
		// true false true false true
		boolean[] array2 = new boolean[5];
		for (boolean y : array2) {
			System.out.print(y + " ");
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
//			if (i % 2 == 0) {
//				array2[i]= true; 
//			}
			// same code
			array2[i] = (i % 2 == 0) ? true : false;
		}

		for (boolean y : array2) {
			System.out.print(y + " ");
		}
		System.out.println("");

		// char print
		char ch = 'a';
		char[] array3 = new char[26];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = ch;
			ch++;
			System.out.print(array3[i] + " ");
		}

	}
}
