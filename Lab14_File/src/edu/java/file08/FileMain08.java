package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain08 {
	public static void main(String[] args) {
		// TODO 1: ArrayList<Strudent>를 생성
		Random rd = new Random();
		ArrayList<Student> students = new ArrayList<Student>();
		Score score = null;
		// ArrayList에 Student 객체 5개를 추가
		for (int i = 0; i < 5; i++) {
			int korean = rd.nextInt((100) + 1);
			int english = rd.nextInt((100) + 1);
			int math = rd.nextInt((100) + 1);
			score = new Score(korean, english, math);
			students.add(new Student(i + 1, "David" + (i + 1), score));
		}

		// ArrayList를 파일에 Write //*에러 해결* 예)serialize
		try (FileOutputStream out = new FileOutputStream("data/student_list.dat");
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) {

			oos.writeObject(students);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO 2: 1번에서 저장된 파일에서 객체를 읽음 read
		try (FileInputStream in = new FileInputStream("data/student_list.dat");
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {

			// 객체를 ArrayList로 타입 변환 (instanceof)
			Object obj = ois.readObject();
			if (obj instanceof ArrayList<?>) {
				ArrayList<Student> list = (ArrayList<Student>) obj;
				for(Student s : list) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ArrayList에 저장된 원소들을 모두 출력

	} // end main method

}
