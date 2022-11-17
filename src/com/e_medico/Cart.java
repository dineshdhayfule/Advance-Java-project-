package com.e_medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 21, 617, 72);
//		String aa = (String) a.get(0);
		lblNewLabel.setText("  "+a);
//		lblNewLabel.setText(aa);
		
		contentPane.add(lblNewLabel);
//	    String [][] data  = {{"a.get(0)"},{"100"}};
//		String  [] col = { "Medicine Name","Price"};
//	    table = new JTable(data,col);
//		table.setBounds(117, 198, 404, 267);
//	    contentPane.add(table);
		
		
		
	}
}
