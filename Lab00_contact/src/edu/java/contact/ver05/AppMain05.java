package edu.java.contact.ver05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;
import edu.java.contact.ver04.ContactDao;
import edu.java.contact.ver04.ContactDaoImpl;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.util.List;
import javax.swing.ListSelectionModel;

public class AppMain05 {

	private static ContactDao dao = ContactDaoImpl.getInstance();
	private static final String[] COLUMN_NAME_STRINGS = { "No", "이름", "전화번호", "이메일" };
	private DefaultTableModel tableModel;
	private JFrame frame;
	private JTextField nameText;
	private JTable table;
	private JTextField phoneText;
	private JTextField emailText;
	private JButton selectBt;
	private JButton selectAllBt;
	private JButton commitBt_2;
	private JButton commitBt_1;
	private JButton commitBt;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("연락처 프로그램 ver.0.5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		lblNewLabel.setBounds(120, 0, 308, 52);
		frame.getContentPane().add(lblNewLabel);

		JLabel nameLabel = new JLabel("이름");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		nameLabel.setBounds(12, 78, 80, 52);
		frame.getContentPane().add(nameLabel);

		nameText = new JTextField();
		nameText.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		nameText.setBounds(104, 78, 140, 52);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(256, 78, 526, 223);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableModel = new DefaultTableModel(null, COLUMN_NAME_STRINGS);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);

		JLabel contactLabel = new JLabel("전화번호");
		contactLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contactLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		contactLabel.setBounds(12, 140, 80, 52);
		frame.getContentPane().add(contactLabel);

		phoneText = new JTextField();
		phoneText.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		phoneText.setColumns(10);
		phoneText.setBounds(104, 140, 140, 52);
		frame.getContentPane().add(phoneText);

		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		emailLabel.setBounds(12, 202, 80, 52);
		frame.getContentPane().add(emailLabel);

		emailText = new JTextField();
		emailText.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		emailText.setColumns(10);
		emailText.setBounds(103, 202, 140, 52);
		frame.getContentPane().add(emailText);

		commitBt = new JButton("입력");
		commitBt.addActionListener((e) -> {
			inputContact();

		});
		commitBt.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		commitBt.setBounds(12, 264, 80, 37);
		frame.getContentPane().add(commitBt);

		commitBt_1 = new JButton("수정");
		commitBt_1.addActionListener((e) -> {
			updateContact();

		});
		commitBt_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		commitBt_1.setBounds(92, 264, 80, 37);
		frame.getContentPane().add(commitBt_1);

		commitBt_2 = new JButton("삭제");
		commitBt_2.addActionListener((e) -> {
			deleteContact();

		});
		commitBt_2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		commitBt_2.setBounds(172, 264, 80, 37);
		frame.getContentPane().add(commitBt_2);

		selectAllBt = new JButton("전체 검색");
		selectAllBt.addActionListener((e) -> {
			selectAllContacts();

		});
		selectAllBt.setContentAreaFilled(false);
		selectAllBt.setFocusPainted(false);
		selectAllBt.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		selectAllBt.setBounds(678, 45, 104, 23);
		frame.getContentPane().add(selectAllBt);

		selectBt = new JButton("검색");
		selectBt.addActionListener((e) -> {
			selectContact();
		});
		selectBt.setContentAreaFilled(false);
		selectBt.setFocusPainted(false);
		selectBt.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		selectBt.setBounds(256, 45, 97, 23);
		frame.getContentPane().add(selectBt);
	}
	//...
	private void selectContact() {
		tableModel = new DefaultTableModel(null, COLUMN_NAME_STRINGS);
		table.setModel(tableModel);
//		MyDialog.showMyDialog(index, this);
//		int index = 
//		Contact con = dao.select(index);
//		Object[] data = {index,con.getName(),con.getPhone(),con.getEmail()};
//		tableModel.addRow(data);;
		
	}
	public void serch(int index) {
		
	}

	private void deleteContact() {
		int index = table.getSelectedRow();
		int result = dao.delete(index);
		if (result == 1) {
			JOptionPane.showMessageDialog(frame, "삭제성공");
			selectAllContacts();
		} else {
			System.out.println("삭제 실패...");
		}
	}

	private void updateContact() {
		String name = nameText.getText();
		String phone = phoneText.getText();
		String email = emailText.getText();

		if (name.equals("") || phone.equals("") || email.equals("")) {
			JOptionPane.showMessageDialog(frame, "잘못 입력하셨습니다.^^");
			return;
		}

		int index = table.getSelectedRow();
		Contact contact = new Contact(name, phone, email);
		int result = dao.update(index, contact);
		if (result == 1) {
			selectAllContacts();
			JOptionPane.showMessageDialog(frame, "연락처 정보 수정 성공");
		} else {
			System.out.println("연락처 정보 수정 실패...");
		}

	}

	private void selectAllContacts() {
		tableModel.setRowCount(0);
		List<Contact> contactList = dao.select();
		for (int i = 0; i < contactList.size(); i++) {
			Object[] data = { i, contactList.get(i).getName(), contactList.get(i).getPhone(),
					contactList.get(i).getEmail() };

			tableModel.addRow(data);

		}
		clearTextFields();
	}

	private void inputContact() {
		String name = nameText.getText();
		String phone = phoneText.getText();
		String email = emailText.getText();

		if (name.equals("") || phone.equals("") || email.equals("")) {
			JOptionPane.showMessageDialog(frame, "잘못 입력하셨습니다.^^");
			return;
		}

		Contact contact = new Contact(name, phone, email);
		int result = dao.insert(contact);
		if (result == 1) {
			JOptionPane.showMessageDialog(frame, "연락처 추가 성공.^^");
		} else {
			System.out.println("연락처 추가 실패");
		}

		clearTextFields();
	}

	// Clear text
	private void clearTextFields() {
		nameText.setText("");
		phoneText.setText("");
		emailText.setText("");
	}

}
