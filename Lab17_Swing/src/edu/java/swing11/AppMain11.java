package edu.java.swing11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AppMain11 {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain11 window = new AppMain11();
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
	public AppMain11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		String[] colNames = { "상품 번호", "상품이름", "가격", "카테고리", "재고수량" };
		Object[][] data = {
				{1, "핸드폰",100_000, "전자제품", 10},
				{2, "볼펜", 1_000, "문구", 100},
				{3, "초콜릿", 2_000, "식료품", 50  },
		};
		model = new DefaultTableModel(data, colNames);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}

}