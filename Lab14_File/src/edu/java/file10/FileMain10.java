package edu.java.file10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileMain10 {
	private static final String ANSI_FILE = "data/ansi.txt";
	private static final String UTF8_FILE = "data/utf8.txt";
	
	public static void main(String[] args) {
		
		
		try (InputStream in = new FileInputStream(ANSI_FILE);
				InputStreamReader reader = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(reader);){
			
			while(true) {
				int r = reader.read();
				if(r == -1) {
					break;
				}
				System.out.println(r + " : " + (char) r);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
