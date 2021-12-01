package edu.java.file01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 입/출력 스트림(Input/Output Stream)
 * 프로그램 <== InputStream <== 입력 장치(키보드, 마우스, 펜, 파일, ...)
 * 프로그램 ==> OutputStream ==> 출력 장치(모니터, 프린터, 파일, ...)
 * System.in: InputStream(외부에서 프로그램으로 데이터가 들어오는 통로) 클래스의 인스턴스.
 * System.out: OutputStream(프로그램이 외부로 데이터를 보내는 통로)을 상속받는 PrintStream 클래스의 인스턴스.
 * 
 * 프로그램 <== FileInputStream <== 파일
 * 프로그램 ==> FileOutputStream ==> 파일
 * 
 * java.io.InputStream: 데이터를 읽어오는(read) 통로
 * |__ java.io.FileInputStream: 파일에서 데이터를 읽어오는 통로
 * 
 * java.io.OutputStream: 데이터를 쓰는(write) 통로
 * |__ java.io.FileOutputStream: 파일에 데이터를 쓰는 통로
 * 
 */

public class FileMain01 {
	//수정된 문서이다
	//맥으로 수정된 문서이
	public static void main(String[] args) {
		// 파일 읽기(read), 쓰기(write)
		FileInputStream in = null; // 파일 읽기를 위한 통로
		FileOutputStream out = null; // 파일 쓰기를 위한 통로
		
		try {
			// data 폴더에 있는 test.txt 파일을 읽기 위한 통로 객체를 생성
			in = new FileInputStream("data/test.txt");
			int read = in.read(); // FIS에서 1바이트를 읽음.
			System.out.println((char)read);
			
			read = in.read();
			System.out.println((char)read);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close(); // InputStream 객체를 닫음.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}