package com.e_medico;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Cart extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList a = new ArrayList();
					ArrayList a1 = new ArrayList();
					Cart frame = new Cart(a,a1);
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
	public Cart(ArrayList a,ArrayList a1) {
//		JtableData jd = new JtableData();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 JPanel panel = new JPanel();
		    panel.setBounds(36, 41, 652, 398);
		    contentPane.add(panel);
		    panel.setLayout(new GridLayout(8, 8,8,8));
		    int sum = 0;
		    for(int i = 0; i<a.size();i++) 
		    {
		    	panel.add(new JLabel(""+a.get(i)));
		    	sum += Integer.parseInt( (String) a1.get(i));
		    }
		    
		    JLabel lblNewLabel = new JLabel(" "+sum);
		    lblNewLabel.setBounds(498, 489, 45, 13);
		    contentPane.add(lblNewLabel);

	}
}	
	
	