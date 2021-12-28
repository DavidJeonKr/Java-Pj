package edu.java.member.view;

import edu.java.member.controller.MemberDao;
import edu.java.member.controller.MemberDaoImpl;
import edu.java.member.model.Member;

//class나 interface에서 선언된 public static 멤버 변수 이름을 import하는 방법
import static edu.java.member.view.MainMenu.*; // *: 모든(하위)것이란 뜻

import java.util.Scanner;

//MVC(Model-View-Controller) 디자인 패턴
// Model : 데이터 저장을 위한 클래스 . VO(Value Object), DTO(Data Transfer Object)
// - edu.java.member.model.Member
// View : UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller : 프로그램 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Object).
// - edu.java.member.controller.MemberDao, MemberDaoImpl
// - 인터페이스와 구현 클래스로 나눔
// - 구현 클래스는 Singleton 디자인 패턴으로 설계 
public class MemberMain {

	private static Scanner scanner = new Scanner(System.in);
	private static MemberDao dao = MemberDaoImpl.getInstance(); // 다형성(polymorphism) - singleton design patten;

	public static void main(String[] args) {
		// 회원 관리 프로그램 Main(View)
		System.out.println("*** 회원 관리 프로그램 ***");
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
				selectAllMembers();
				break;

			case SELECT_BY_INDEX:
				// FIXME:
				selectMemberByIndex();
				break;

			case INSERT:
				// TODO:
				inserNewMember();
				break;

			case UPDATE:
				updateMemberInfo();
				// TODO:
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");

			}

		} // end while
		System.out.println("*** 회원 관리 프로그램 종료 ***");
	}// end main()

	private static void updateMemberInfo() {
		System.out.println();
		System.out.println("----- 회원 정보 수정 화면-----");
		System.out.println("변경할 인덱스>>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		System.out.println("변경할 패스워드>>>");
		String pwd = scanner.nextLine();
		// Controller 클래스의 기능(메서드)를 사용해서 회원 정보 업데이트 수행
		int result = dao.update(index, pwd);
		if(result == 1) {
			System.out.println("회원 정보 업데이트 성공!!!");
		} else {
			System.out.println("회원 정보 업데이트 실패!!!");
		}
		
	}
	
	private static void selectMemberByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		System.out.println("검색할 인덱스 입력>>>");
		int index = Integer.parseInt(scanner.nextLine());
		// Controller의 기능(메서드)를 사용해서 해당 인덱스의 회원 정보를 검색
		Member member = dao.select(index);
		//검색 결과 출력
		System.out.println(member);
	}

	private static void selectAllMembers() {
		System.out.println();
		System.out.println("----- 전체 회원 목록 -----");
		Member[] list = dao.select();
		for (Member m : list){
			System.out.println(m);
		}
		System.out.println("----------------------");
	}

	private static void inserNewMember() {
		System.out.println();
		System.out.println("----- 회원 가입 화면 -----");
		System.out.println("ID 입력>>>");
		String id = scanner.nextLine();
		System.out.println("PassWard 입력>>>");
		String passward = scanner.nextLine();
		Member member = new Member(id, passward);

		// Controller 기능(메서드)를 사용해서 회원가입 수행
		int result = dao.insert(member);
		// 회원 가입 결과 출력
		if(result == 1 ) {
			System.out.println("회원 가입 성공");
		} else {
			System.out.println("회원 가입 실패");
		}

	}

	private static int chooseMenu() {
		showMainMenu();
		String s = scanner.nextLine();
		int menu = Integer.parseInt(s);

		return menu;
	}

	private static void showMainMenu() {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인데스 검색 [3] 회원가입 [4] 정보수정 [0] 종료");
		System.out.println("------------------------------------------------");
		System.out.println("선택>>>");

	}

} // end class
