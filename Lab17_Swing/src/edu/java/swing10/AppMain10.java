package edu.java.swing10;

import java.awt.Dialog;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain10 {

	private JFrame frame;
	private JButton btnInput;
	private JButton btnDelete;
	private JTextField textField;
	private JList<String> list;
	private JScrollPane scrollPane;
	private DefaultListModel<String> model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain10 window = new AppMain10();
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
	public AppMain10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addElementToList();
			}
		});
		btnInput.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		btnInput.setBounds(290, 10, 134, 68);
		frame.getContentPane().add(btnInput);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteElementFromList();
			}
		});
		btnDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		btnDelete.setBounds(290, 109, 134, 68);
		frame.getContentPane().add(btnDelete);

		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		textField.setBounds(12, 10, 266, 68);
		frame.getContentPane().add(textField);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 109, 266, 467);
		frame.getContentPane().add(scrollPane);

		list = new JList<>();
		list.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		model = new DefaultListModel<String>();

		list.setModel(model);
		scrollPane.setViewportView(list);
	}

	private void deleteElementFromList() {
		// confirmdialog
		int index = list.getSelectedIndex();
		if (index == -1) {
			JOptionPane.showMessageDialog(frame, "아이템을 선택해주세요");
			return;
		} else {
			int result = JOptionPane.showConfirmDialog(frame, "삭제하실 건가요?", "Delete", JOptionPane.YES_NO_OPTION, 0);
			if (result == JOptionPane.YES_OPTION) {
				model.remove(index);
			} else if (result == JOptionPane.NO_OPTION) {
				return;
			}
		}

	}

	private void addElementToList() {
		// TODO: JTextField에 내용이 있는 경우에만 JList아이템이 추가되도록
		String text = textField.getText();
		if (text.equals("")) {
			JOptionPane.showMessageDialog(frame, "공백을 입력하셨습니다");
			return;
		}
		// JtextField의 내용을 읽고 JList에 모델에 아이템을 추가한다
		model.addElement(text);
		// TODO: JList에 아이템을 추가하고 나면 TextField의 내용을 지움.
		textField.setText("");
	}
}
