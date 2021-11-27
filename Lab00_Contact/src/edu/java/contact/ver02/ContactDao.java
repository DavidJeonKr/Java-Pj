package edu.java.contact.ver02;
//interface
//filed(멤버변수)
//public static final // 모든 함수에 포함 컴파일 과정에서 자동으로 삽입 생략가능
//public abstract // 추상메서드.. also 생략가능
import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 Controller 인터페이스
public interface ContactDao {
	//abstract
	/**
	 * 배여렝 저장된 연락처 정보를 return
	 * @return 배열에 저장된 원소 개수 크기의 Contact 배열
	 */
	Contact[] select();
	
	/**
	 * 인덱스에 해당하는 배열의 원소(Contact 객체)를 return
	 * @param index
	 * @return
	 */
	Contact select(int index);
	
	/**
	 * 삽입하는 기능
	 * @param c - Contact 객체를 전달 받아서 배열에 저장, 만약 배열에 빈 공간이 없으면 0을 return
	 * @return Contact c = new Contact[new ,,,];
	 * result가 1이면 성공, 0이면 실패
	 */
	
	int insert(Contact c);
	
	/**
	 * 
	 * @param index - 인덱스를 받는 기능
	 * @param contact - Contact타입의 name, phone, email을 수정할 파라미터
	 * 
	 * @return result 1이면 성공, 0이면 실패
	 */
	int update(int index, Contact contact);
	
//	int update(int index, String name, String phone, String email);

}