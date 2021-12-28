package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JFrame frame;
	private JTextField serchText;
	private JButton okButton;
	private JButton cancelButton;
	private int index;
	private AppMain05 mainApp;
	
	
	public static void showMyDialog(int index, AppMain05 mainApp) {
		MyDialog dialog = new MyDialog(index, mainApp);
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	
		dialog.setVisible(true);
	}
	

	public MyDialog(int index, AppMain05 mainApp) {
		this.index = index;
		this.mainApp = mainApp;
		initialize();
	}

	public void initialize() {
		setBounds(100, 100, 188, 148);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		serchText = new JTextField();
		serchText.setBounds(27, 35, 116, 21);
		contentPanel.add(serchText);

		JLabel lblNewLabel = new JLabel("검색할 인덱스");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 10, 116, 15);
		contentPanel.add(lblNewLabel);

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		okButton = new JButton("검색");
		okButton.addActionListener((e) -> {
			serchContact();

			dispose();
		});
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		cancelButton = new JButton("취소");
		cancelButton.addActionListener((e) -> {
			dispose();
		});
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
	}


	private void serchContact() {
		index = Integer.parseInt(okButton.getText());
		
	}
}
