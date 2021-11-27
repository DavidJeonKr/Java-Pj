package edu.java.contact.ver03;

import static edu.java.contact.ver02.MainMenuVo.*;

import java.util.ArrayList;
import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain03 {
	// filed
	private static Scanner scanner = new Scanner(System.in); // 스캐너
	private static ContactDao dao = ContactDaoimpl.getInstance();// 싱글톤

	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.3 ***");
		// 예외처리 정수가 아닌 것들이 입력이 됬을 때 try{ } catch{비정상적으로 종료되는 코드가 없게끔}
		// 싱글톤 디자인 패턴, 인터페이스 등등
		// (View)
		while (true) {
			try {
				run();
				break;
			} catch (NumberFormatException e) {
				System.out.println("--------------------------------");
				System.out.println("잘못된 입력을 하셨습니다. 다시입력해주세요 ^.^");
				System.out.println("--------------------------------");
			}
		}
	}

	private static void selectAllContacts() {
		System.out.println();
		System.out.println("----- 전체 연락처 목록 -----");
		// return ArrayList<Contact>
		ArrayList<Contact> contacts = dao.select();
		for (Contact c : contacts) {
			System.out.println(c);
		}
		System.out.println("----------------------");

	}

	private static void selectContactByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		System.out.println("검색할 인덱스 입력>>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		Contact contact = dao.select(index);
		System.out.println(contact);
	}

	private static void insertConctact() {
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

	}

	private static void deleteContact() {
		System.out.println();
		System.out.println("----- 연락처 삭제 화면-----");
		System.out.println("삭제할 인덱스>>>");
		String s1 = scanner.nextLine();
		int index = Integer.parseInt(s1);
		int result = dao.delete(index);
		if (result == 1) {
			System.out.println("연락처 삭제 성공");
		} else {
			System.out.println("연락처 삭제 실패");
		}
	}

	// try catch 예외처리
	private static int chooseMenu() {
		showMenu();
		String s = scanner.nextLine();
		int menu = Integer.parseInt(s);
		return menu;
	}

//	private static int chooseMenu() {
//		while(true) {
//			try {
//				showMenu();
//				String s = scanner.nextLine();
//				int menu = Integer.parseInt(s);
//				return menu;
//				
//			} catch (NumberFormatException e) {
//				System.out.println("정수만 입력하세요 ^.^");
//			}
//		}
	private static void showMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [5] 삭제 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println("선택>>> ");
	}

	private static void run() {
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

			case DELETE:
				deleteContact();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");

			}

		} // end while
		System.out.println("*** 프로그램 종료 ***");
	}
}
