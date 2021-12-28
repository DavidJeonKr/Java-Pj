package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AppMain07 {

	private JFrame frame;
	private JTextField idText;
	private JPasswordField passwordText;
	private JTextArea resultArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(SystemColor.info);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 152, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(SystemColor.info);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 65, 152, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		idText = new JTextField();
		idText.setFont(new Font("굴림", Font.PLAIN, 25));
		idText.setBounds(176, 10, 251, 45);
		frame.getContentPane().add(idText);
		idText.setColumns(10);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("굴림", Font.PLAIN, 25));
		passwordText.setBounds(176, 65, 251, 45);
		frame.getContentPane().add(passwordText);
		
		JButton commitBt = new JButton("확인");
		commitBt.setOpaque(true);
		commitBt.setBackground(SystemColor.textHighlight);
		commitBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
				
			} 
		});
		commitBt.setFont(new Font("굴림", Font.PLAIN, 25));
		commitBt.setBounds(12, 116, 152, 45);
		frame.getContentPane().add(commitBt);
		
		resultArea = new JTextArea();
		resultArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
		resultArea.setBounds(12, 171, 415, 104);
		frame.getContentPane().add(resultArea);
		
	}

	//비밀번호가 가져려서 표시 되지만 가져올 떄는 표시됨
	//-> getPassword
	protected void showInfo() {
		StringBuffer sb = new StringBuffer();
		String id = idText.getText();
		char[] password = passwordText.getPassword();


		StringBuffer message = sb.append("아이디: ").append(id).append("\n")
				.append("비밀번호: ").append(password).append("\n");
		
		resultArea.setText(message.toString());
		
		
	}
}
