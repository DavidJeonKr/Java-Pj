package edu.java.file12;

import java.io.File;

public class FileMain12 {
	public static void main(String[] args) {
		// 파일, 디렉토리(폴더) 관리 - 정보 ,생성 ,삭제
		//System.getProperty(String): Java Runtime이 실행 중인 컴퓨터에 여러가지 (시스템) 정보들을 리턴. 
		//user.dir: 현재 작업 디렉토리(폴더)
		String string = System.getProperty("user.dir");
		System.out.println(string);
		
		//user.home: OS에 로그인한 사용자(User)의 기본(홈) 디렉토리(폴더).
		String home = System.getProperty("user.home");
		System.out.println(home);
		
		// 디렉토리 구분자(separator):
		// (1) MS-Window: \
		// (2) Linux, MacOS, unix, Android, ios,... : /
		// 절대 경로(absolute path)
		
		//File 클래스: (txt, jpg, mp4, ppt, java, ...)과 디렉토리(폴더)를 관리할 수 있는 클래스.
		System.out.println("");
		File f1 = new File("data" + File.separator + "test.txt");
		System.out.println("file: " + f1);
		System.out.println("절대 경로: " + f1.getAbsolutePath());
		System.out.println("경로: " + f1.getPath());
		System.out.println("파일이름: " + f1.getName());
		//C:\Users\dudgh\git\Java-Pj\Lab14_File\data\test.txt
		System.out.println("---");
		File f2 = new File("C:" + File.separator+ "User"+File.separator + "test");
		System.out.println("file: " + f2);
		System.out.println("절대 경로: " + f2.getAbsolutePath());
		System.out.println("경로: " + f2.getPath());
		System.out.println("숨긴경로: " + f2.isDirectory());
		System.out.println("");
		String parent = System.getProperty("user.dir");
		String child = "data";
		File dir = new File(parent, child);
		System.out.println(dir);
		File[] files = dir.listFiles();
		for(File f : files) {
			String fname = f.getName();
			if(f.isFile()) {
				fname += "\t" + f.length() + " bytes";
			} else {
				fname += "\t <DIR>";
			}
			System.out.println(fname);
		}
		
		System.out.println("");
		File newFolder = new File("data", "test123");
		if(!newFolder.exists()) { //디렉토리가 존재하지 않으면
			newFolder.mkdir();
			System.out.println("디렉토리 생성 성공");
		} else {
			System.out.println("디렉토리가 이미 존재합니다");
		}
		
		if(newFolder.exists()) {
			newFolder.delete();
			System.out.println("삭제 성공");
		} else {
			System.out.println("디렉토리가 존재하지 않습니다");
		}
		
		
	}
}
