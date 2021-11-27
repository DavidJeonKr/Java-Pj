package edu.java.contact.ver03;

import java.util.ArrayList;


import edu.java.contact.model.Contact;

public class ContactDaoimpl implements ContactDao {
	private int count = 0;
	private static final int MAX_LENGTH = 5;
	private ArrayList<Contact> ContactArr = new ArrayList<Contact>();
	//싱글톤 디자인 패턴
	private static ContactDaoimpl instance = null;
	private ContactDaoimpl() {}
	public static ContactDaoimpl getInstance() {
		if(instance == null) {
			instance = new ContactDaoimpl();
		}
		return instance;
	}
	
	
	@Override
	public ArrayList<Contact> select() {
		for (int i = 0; i < ContactArr.size(); i++) {
			ContactArr.get(i);
		}
		
		return ContactArr;
	}

	@Override
	public Contact select(int index) {
		Contact contact = null;
		if(index >= 0 && index <MAX_LENGTH) {
			contact = ContactArr.get(index);
		}
		return contact;
	}

	@Override
	public int insert(Contact c) {
		int result = 0;
		if(count < MAX_LENGTH) {
			ContactArr.add(c);
			count++;
			result = 1;
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if(index >=0 &&index <count) {
			ContactArr.set(index, contact);
			result = 1;
		}
		return result;
	}

	@Override
	public int delete(int index) {
		int result = 0;
		if(index >= 0&&index <count) {
			ContactArr.remove(index);
			result = 1;
		}
		
		
		
		return result;
	}

}
