package com.e_medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Cart extends JFrame {

	private JPanel contentPane;
	JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList a = new ArrayList();
					Cart frame = new Cart(a);
//					Cart frame = new Cart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cart(ArrayList a) {
//		JtableData jd = new JtableData();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 21, 617, 72);
		contentPane.add(lblNewLabel);
		
		lblNewLabel.setText("  "+a);
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 148, 626, 232);
		contentPane.add(scrollPane_4);
		
		table = new JTable();
		scrollPane_4.setViewportView(table);
		//jd.ShowDataInJtable("select * from registration1 ",table);
	}
}
