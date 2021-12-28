package edu.java.swing02;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblOutput;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); // Absolute layout - UI 콤포넌트들을 원하는 위치에 배치할 수 있는 레이아웃.
		
		lblOutput = new JLabel("Hello, Swing!");
		lblOutput.setFont(new Font("D2Coding", Font.BOLD, 32));
		lblOutput.setBounds(12, 10, 560, 88);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textInput.setBounds(12, 108, 560, 88);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		btnConfirm = new JButton("입력 완료");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOutput.setText(textInput.getText());
				
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.PLAIN, 32));
		btnConfirm.setBounds(12, 206, 560, 88);
		frame.getContentPane().add(btnConfirm);
	}
}