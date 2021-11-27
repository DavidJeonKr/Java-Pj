package edu.java.contact.ver02;

import static edu.java.contact.ver02.MainMenuVo.*;

import java.io.DataOutput;
import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain02 {
	// filed(멤버변수)
	private static Scanner scanner = new Scanner(System.in);
	private static ContactDao dao = ContactDaoImpl.getInstance();

	public static void main(String[] args) {

		// (View)
			System.out.println("*** 연락처 프로그램 ver 0.2 ***");
			boolean run = true;
			while (run) {
				// 메인 메뉴를 보여주고, 사용자가 메뉴(기능)선택을 입력
				int menu = chooseMenu();
				switch (menu) {
				case QUIT:
					run = false;
					break;
				case SELECT_ALL:
					// TODO:
					selectAllContacts();
					break;

				case SELECT_BY_INDEX:
					// FIXME:
					selectContactByIndex();
					break;

				case INSERT:
					// TODO:
					insertConctact();
					break;

				case UPDATE:
					updateContact();
					// TODO:
					break;
				default:
					System.out.println("메뉴를 다시 선택하세요...");

				}

			} // end while


		System.out.println("*** 프로그램 종료 ***");

	}

	// UI: User Interface
	private static void selectAllContacts() {
		System.out.println();
		System.out.println("----- 전체 연락처 목록 -----");
		Contact[] contacts = dao.select();
		for (Contact c : contacts) {
			System.out.println(c);
		}
		System.out.println("----------------------");
		// Contact[] contact = dao.select();

	}

	private static void selectContactByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		System.out.println("검색할 인덱스 입력>>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		Contact contact = dao.select(index);
		System.out.println(contact);
		// TODO:
		// ----- 인덱스 검색 -----
		// 검색할 인덱스 입력>>>
		// contact = dao.select(index);
		// 인덱스의 값 출력 (배열)
	}

	private static void insertConctact() {
		// TODO:
		System.out.println();
		System.out.println("----- 회원 가입 화면 -----");
		System.out.println("이름 입력>>>");
		String name = scanner.nextLine();
		System.out.println("전화번호 입력>>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력>>>");
		String email = scanner.nextLine();
		Contact c = new Contact(name, phone, email);
		int result = dao.insert(c);
		if (result == 1) {
			System.out.println("연락처 추가 성공");
		} else {
			System.out.println("연락처 추가 실패");
		}

		// ----- 연락처 추가 -----
		// 이름입력>>>
		// 연락처입력>>>
		// email입력>>>
		// contact = new Contact(name, phone, email);
	}

	private static void updateContact() {
		System.out.println();
		System.out.println("----- 연락처 수정 화면-----");
		System.out.println("변경할 인덱스>>>");
		String s1 = scanner.nextLine();
		int index = Integer.parseInt(s1);
		System.out.println("변경할 이름>>>");
		String name = scanner.nextLine();
		System.out.println("변경할 연락처>>>");
		String phone = scanner.nextLine();
		System.out.println("변경할 이메일>>>");
		String email = scanner.nextLine();

		int result = dao.update(index, new Contact(name, phone, email));
		if (result == 1) {
			System.out.println("연락처 수정 성공");
		} else {
			System.out.println("연락처 수정 실패");
		}

		// TODO:
		// ----- 연락처 수정 -----
		// 수정할 인덱스>>>
		// 변경할 이름>>>
		// 변경할 연락처>>>
		// 변경할 이메일>>>
		// result = dao.update(index, new contact(name, phone, email));
	}

	private static int chooseMenu() {
		try {
			showMenu();
			String s = scanner.nextLine();
			int menu = Integer.parseInt(s);
			return menu;
		} catch (NullPointerException e) {
			System.out.println("정수가 아님 정수를 입력해주세요^^");
			return 100;
		} 
	}

	private static void showMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println("선택>>> ");
	}
}
