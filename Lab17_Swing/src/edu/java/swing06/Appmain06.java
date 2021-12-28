package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Appmain06 {

	private JFrame frame;
	private JTextField nameText;
	private JTextField phoneText;
	private JTextField emailText;
	private JTextArea resultText;
	ArrayList<String> list = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appmain06 window = new Appmain06();
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
	public Appmain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 509, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");
		
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		nameLabel.setBounds(12, 10, 111, 48);
		frame.getContentPane().add(nameLabel);
		
		nameText = new JTextField();
		nameText.setFont(new Font("굴림", Font.PLAIN, 26));
		nameText.setBounds(135, 10, 346, 48);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);
		
		JButton commitBt = new JButton("commit");
		commitBt.addActionListener((e) -> {
			showinfo();
		});
		commitBt.setBounds(12, 335, 176, 54);
		frame.getContentPane().add(commitBt);
		
		resultText = new JTextArea();
		resultText.setBounds(12, 399, 462, 102);
		frame.getContentPane().add(resultText);
		
		phoneText = new JTextField();
		phoneText.setFont(new Font("굴림", Font.PLAIN, 26));
		phoneText.setColumns(10);
		phoneText.setBounds(135, 75, 346, 48);
		frame.getContentPane().add(phoneText);
		
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		phoneLabel.setBounds(12, 75, 111, 48);
		frame.getContentPane().add(phoneLabel);
		
		emailText = new JTextField();
		emailText.setFont(new Font("굴림", Font.PLAIN, 26));
		emailText.setColumns(10);
		emailText.setBounds(135, 143, 346, 48);
		frame.getContentPane().add(emailText);
		
		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		emailLabel.setBounds(12, 143, 111, 48);
		frame.getContentPane().add(emailLabel);
	}
	
	public void showinfo() {
		String name = nameText.getText();
		String phone = phoneText.getText();
		String email = emailText.getText();
		StringBuffer message = new StringBuffer(); // StringBuffer객체 생성
		message.append("이름: ").append(name).append("\n")
		.append("전화번호: ").append(phone).append("\n") 
		.append("이메일: ").append(email).append("\n");
		
		resultText.setText(message.toString());
		
		clearAlltextField();
	}

	private void clearAlltextField() {
		nameText.setText("");
		phoneText.setText("");
		emailText.setText("");		
	}
}
