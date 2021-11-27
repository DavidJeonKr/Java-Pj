package edu.java.contact.ver02;


import edu.java.contact.model.Contact;
//ContactDAo implements 구현

public class ContactDaoImpl implements ContactDao {
	private static final int MAX_LENGTH = 5;
	private int count = 0;
	private Contact[] ContactList = new Contact[MAX_LENGTH];

	//Singleton // 공식처럼 외우자!
	//private static 자기자신 instace = null;
	//private 생성자() {}
	//public static 자기자신 getInstance(){
	//  if(instance == null) {
	//     instance = new 자기자신();
	//  return instrance;
	// 리턴값을 자기 자신의 주소로;
	//
	
	private static ContactDaoImpl instance = null;
	private ContactDaoImpl() {}
	public static ContactDaoImpl getInstance() {
		if(instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;
	}
	
	
	
	@Override
	public Contact[] select() {
		Contact[] list = new Contact[count];
		for (int i = 0; i < count; i++) {
			list[i] = ContactList[i]; 
		}
		return list;
	}

	@Override
	public Contact select(int index) {
		Contact contact = null;
		if(index >= 0 && index <MAX_LENGTH) {
			contact = ContactList[index];
		}
		return contact;
	}

	@Override
	public int insert(Contact c) {
		int result = 0;
		if(count <MAX_LENGTH) {
			ContactList[count] = c;
			count++;
			result = 1;
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if(index >=0 &&index <count) {
			ContactList[index] = contact;
			result = 1;
		}
		return result;
	}

}
