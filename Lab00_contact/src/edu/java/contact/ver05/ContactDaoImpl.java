package edu.java.contact.ver05;

import java.io.File;
import java.util.List;

import static edu.java.contact.fileutil.ContactFileUtil.*;
import edu.java.contact.model.Contact;


public class ContactDaoImpl implements ContactDao {
	// field(멤버 변수)
	private List<Contact> contacts; // 연락처 정보를 저장할 리스트.
	private File dataFile;
	private File dataDir;
	// singleton
	private static ContactDaoImpl instance = null;

	private ContactDaoImpl() {
		// TODO: 현재 작업 디렉토리(CWD(Current Working directory))에 data 폴더를 생성
		dataDir = initializeDataDir();
		// TODO: data 폴더에 잇는 cntacts.dat 파일을 읽어서 필드 contacts를 초기화
		dataFile = new File(DATA_DIR, DATA_FILE);
		
		contacts = initializeData();
	}

	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Contact> select() {
		return contacts;
	}

	@Override
	public Contact select(int index) {
		Contact result = null;
		if (index >= 0 && index < contacts.size()) { // 파라미터 index가 리스트의 인덱스 범위 안에 있으면
			result = contacts.get(index);
		}
		
		return result;
	}

	@Override
	public int insert(Contact c) {
		contacts.add(c); // ArrayList가 변경됨
		// TODO: 파일에 변경된 ArrayList를 씀(write)
		writeDataToFile(contacts, dataFile);
		return 1;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) { // 파라미터 index가 배열의 인덱스 범위 안에 있으면
//			contacts.set(index, contact);
			contacts.get(index).setName(contact.getName());
			contacts.get(index).setPhone(contact.getPhone());
			contacts.get(index).setEmail(contact.getEmail());
			
			// TODO: 파일에 변경된 ArrayList를 씀(write)
			writeDataToFile(contacts, dataFile);
			
			result = 1;
		}

		return result;
	}

	@Override
	public int delete(int index) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) {
			contacts.remove(index);
		
			// TODO: 파일에 변경된 ArrayList를 씀(write)
			writeDataToFile(contacts, dataFile);
			result = 1;
		}
		
		

		return result;
	}

}