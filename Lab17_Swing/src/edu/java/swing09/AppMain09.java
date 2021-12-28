package edu.java.swing09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.lang.model.element.Element;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class AppMain09 {
	private static final String[] ITEMS = { "@itwill.co.kr", "@naver.com", "@google.com", "@daum.net" };
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnProtected;
	private JRadioButton rdbtnPackage;
	private JRadioButton rdbtnNewRadioButton;
	private JComboBox<String> comboBox;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxStatic;
	private JCheckBox chckbxFinal;
	private JTextArea textArea;
	private JTextField emailText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain09 window = new AppMain09();
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
	public AppMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		rdbtnNewRadioButton = new JRadioButton("private");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(8, 6, 101, 31);
		frame.getContentPane().add(rdbtnNewRadioButton);

		rdbtnPackage = new JRadioButton("package");
		rdbtnPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdbtnPackage);
		rdbtnPackage.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdbtnPackage.setBounds(123, 6, 101, 31);
		frame.getContentPane().add(rdbtnPackage);

		rdbtnProtected = new JRadioButton("protected");
		rdbtnProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdbtnProtected);
		rdbtnProtected.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdbtnProtected.setBounds(247, 6, 120, 31);
		frame.getContentPane().add(rdbtnProtected);

		rdbtnNewRadioButton_2 = new JRadioButton("public");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(388, 6, 101, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_2);

		comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object selected = (String) comboBox.getSelectedItem();
				textArea.setText(selected + " selected");
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<>(ITEMS));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 21));
		comboBox.setBounds(172, 127, 160, 43);
		frame.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		btnNewButton.setBounds(8, 184, 160, 43);
		frame.getContentPane().add(btnNewButton);

		chckbxNewCheckBox = new JCheckBox("abstract");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		chckbxNewCheckBox.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(8, 67, 125, 31);
		frame.getContentPane().add(chckbxNewCheckBox);

		chckbxStatic = new JCheckBox("static");
		chckbxStatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		chckbxStatic.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		chckbxStatic.setBounds(135, 67, 125, 31);
		frame.getContentPane().add(chckbxStatic);

		chckbxFinal = new JCheckBox("final");
		chckbxFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		chckbxFinal.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		chckbxFinal.setBounds(264, 67, 125, 31);
		frame.getContentPane().add(chckbxFinal);

		textArea = new JTextArea();
		textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		textArea.setBounds(8, 237, 594, 178);
		frame.getContentPane().add(textArea);

		emailText = new JTextField();
		emailText.setFont(new Font("굴림", Font.PLAIN, 15));
		emailText.setBounds(8, 127, 152, 43);
		frame.getContentPane().add(emailText);
		emailText.setColumns(10);
	}

	private void showInfo() {
		StringBuilder sb = new StringBuilder();
		// radio button들 중에서 선택된 상태
		

		if (rdbtnNewRadioButton.isSelected()) {
			sb.append(rdbtnNewRadioButton.getText());
		} else if (rdbtnNewRadioButton_2.isSelected()) {
			sb.append(rdbtnNewRadioButton_2.getText());
		} else if (rdbtnPackage.isSelected()) {
			sb.append(rdbtnPackage.getText());
		} else {
			sb.append(rdbtnProtected.getText());
		}
		sb.append("\n");

		if (chckbxNewCheckBox.isSelected()) {
			sb.append(chckbxNewCheckBox.getText()).append("\n");
		}
		if (chckbxStatic.isSelected()) {
			sb.append(chckbxStatic.getText()).append("\n");
		}
		if (chckbxFinal.isSelected()) {
			sb.append(chckbxFinal.getText()).append("\n");
		}
		String email = emailText.getText();

		String item = (String) comboBox.getSelectedItem();
		sb.append(email).append(item);

		textArea.setText(sb.toString());

	}

	protected void showCheckBoxStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
		JCheckBox chkBox = (JCheckBox) e.getSource();
		boolean selected = chkBox.isSelected();

		textArea.setText(cmd + " Checkbox: " + selected);
	}

	private void showRadioButtonStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
//		Object source = e.getSource();
		textArea.setText(cmd + " Radio Button Selected");
	}

}
