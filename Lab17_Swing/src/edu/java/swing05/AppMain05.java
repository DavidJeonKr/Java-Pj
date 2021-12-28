package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {
	private static final String[] IMAGES = {
			"images/abc1.jpg",
			"images/abc2.jpg",
			"images/abc3.jpg",
			"images/abc4.jpg",
			"images/abc5.jpg"
	};
	
	private int index;
	
	private JFrame frame;
	private JLabel lableimage;

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
		frame.setBounds(100, 100, 500, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lableimage = new JLabel(new ImageIcon(IMAGES[index]));
		lableimage.setBounds(12, 10, 460, 285);
		frame.getContentPane().add(lableimage);
		
		JButton btnPrev = new JButton("<< 이전");
		btnPrev.addActionListener((e) -> {

			showPrevImage();
			
		});
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 32));
		btnPrev.setBounds(12, 319, 220, 77);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음 >>");
		btnNext.addActionListener((e) -> {

			showNextImage();
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 32));
		btnNext.setBounds(252, 319, 220, 77);
		frame.getContentPane().add(btnNext);
	}

	private void showNextImage() {
		if(index <IMAGES.length -1 ) {
			index++;
			lableimage.setIcon(new ImageIcon(IMAGES[index]));
		} else {
			JOptionPane.showMessageDialog(frame, "마지막 이미지 입니다");
		}
	}

	private void showPrevImage() {
		if(index > 0 ) {
			index--;
			lableimage.setIcon(new ImageIcon(IMAGES[index]));
			
		} else {
			JOptionPane.showMessageDialog(frame, "첫번째 이미지 입니다");
		}
	}
}
