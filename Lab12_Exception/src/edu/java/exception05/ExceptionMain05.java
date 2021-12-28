package edu.java.exception05;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ExceptionMain05 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		double x = inputDouble();
		double y = inputDouble();
		
		System.out.println("x+y = " + (x+y));

	}

	private static double inputDouble() {
		boolean run = true;
		double result = 0;

		while(run) {
		try {
			System.out.println("숫자 입력");
			String s = scanner.nextLine();
			result = Integer.parseInt(s);
			
			run = false;
			
		} catch (NumberFormatException | FileSystemNotFoundException e) {
			System.out.println("실수가 아닙니다");
		}
		}
		
		return result;
		
	}

}
