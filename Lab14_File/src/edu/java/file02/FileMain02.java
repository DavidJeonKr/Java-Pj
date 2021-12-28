package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain02 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("data/test.txt");
			out = new FileOutputStream("data/test_copy2.txt");
			
			while(true) {
				//파일에서 읽은 데이터들을 저장하기 위한 배열
				byte[] buffer = new byte[20]; // 10바이트를 저장할 수 있는 배열 생성
				int result = in.read(buffer);
				if(result == -1) { // 파일에서 더이상 읽을 데이터가 없을 떄
					break;
				}
				System.out.println(result + "바이트 읽음.");
				out.write(buffer, 0, result);
				//수정 읽은 바이트만큼 쓰기
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
