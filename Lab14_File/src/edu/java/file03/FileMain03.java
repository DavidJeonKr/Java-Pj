package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileMain03 {
	public static void main(String[] args) {
		//크기(25mb)가 큰 파일 복사 시간 비교
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("data/ratings.dat");
			out = new FileOutputStream("data/ratings_copy.data");
			
			long startTime = System.currentTimeMillis(); //시스템의 현재 시간을 ms 단위로 리턴
			
			while(true) {
//				int result = in.read();
				// byte 배열을 사용한 읽기 쓰기
				byte[] buffer = new byte[4 * 1024]; // 1024bytes = 1KB
				int result = in.read(buffer); // 파일에서 (최대) 1KB씩 읽기
				if(result == -1) {
					break; //파일의 끝
				}
//				out.write(result); // (1) 1byte 읽은 내용을 파일에 쓰기
				out.write(buffer, 0, result); // byte 배열의 내용을 result 크기만큼 파일에 쓰기
				//First : 경과 시간 : 121763ms
			
			}
			
			long endTime = System.currentTimeMillis();
			// -> 1byte 읽기/쓰기 : 120초
			// -> 4  KB 읽기/쓰기 : 약 0.1초
			
			long elapsedTime = endTime - startTime; // 경과 시간(파일 복사하는 데 걸리 시간)
			System.out.println("경과 시간 : " + elapsedTime + "ms");
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
