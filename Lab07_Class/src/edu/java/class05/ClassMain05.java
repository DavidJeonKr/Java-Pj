package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		//Score score = new Score(10, 20, 30, 40);
		Student st1 = new Student(1172011650, "David", new Score(10, 20, 30, 40));
		st1.info();

		Student st2 = new Student(123123, "Maria", new Score());
		st2.init();
		st2.info();
	}

}
