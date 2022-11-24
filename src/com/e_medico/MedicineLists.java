package com.e_medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MedicineLists extends JFrame {
//C:\Users\Dell\Downloads\AJP PR IMG\
	public JPanel contentPane;
	ArrayList ar,ar1;
	
	public ImageIcon ii;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicineLists frame = new MedicineLists();
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
	public MedicineLists() {
		 ar=new ArrayList();	
		 ar1=new ArrayList  ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0 ,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("70");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(56, 249, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("70");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(243, 253, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("70");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(438, 249, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("70");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(606, 252, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("70");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(56, 562, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("70");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(233, 565, 88, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("70");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(438, 565, 88, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("70");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(606, 551, 88, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel Nise = new JLabel("Nise");
		Nise.setToolTipText("Nise Tablet ");
		
		ii = new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\Nise Just.jpg");
		Nise.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\Nise Just.jpg"));
		
		//Nise.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\Nise Just.jpg"));
		Nise.setBounds(46, 21, 121, 150);
		contentPane.add(Nise);
		
		JButton btnNewButton = new JButton("Nise");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
					ar.add(Nise.getText());
					ar1.add(lblNewLabel.getText());
				   //ar.add(Nise.setIcon(ii));
				
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton.setText("Nise");

			}
			
		//	@Override
//			public void mouseClicked(MouseEvent e) {
//				ar.add(btnNewButton.getText());
//			}
		});
		btnNewButton.setBounds(46, 198, 121, 45);
		contentPane.add(btnNewButton);
		
		JLabel VomitebTablet = new JLabel("Vomiteb_Tablet");
		VomitebTablet.setToolTipText("Vomiteb Tablet");
		VomitebTablet.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\Vomiteb.png"));
		VomitebTablet.setBounds(233, 21, 121, 150);
		contentPane.add(VomitebTablet);
		
		JButton btnNewButton_1 = new JButton("Vomiteb Tablet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(VomitebTablet.getText());
				ar1.add(lblNewLabel_1.getText());
				


			}
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton_1.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_1.setText("Vomiteb Tablet");

			}
		});
		btnNewButton_1.setBounds(233, 198, 121, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel Crocin = new JLabel("Crocin");
		Crocin.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\crosin just.png"));
		Crocin.setToolTipText("Crocin Tablet");
		Crocin.setBounds(428, 21, 121, 150);
		contentPane.add(Crocin);
		
		JButton btnNewButton_2 = new JButton("Crocin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Crocin.getText());
				ar1.add(lblNewLabel_2.getText());


			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton_2.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_2.setText("Crocin Tablet ");

			}
		});
		btnNewButton_2.setBounds(428, 198, 121, 45);
		contentPane.add(btnNewButton_2);
		
		
		
		
		
		JLabel Sinarest = new JLabel("Sinarest");
		Sinarest.setToolTipText("Sinarest tablet");
		Sinarest.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\sinarest.jpg"));
		Sinarest.setBounds(596, 21, 121, 150);
		contentPane.add(Sinarest);
		
		JButton btnNewButton_3 = new JButton("Sinarest");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Sinarest.getText());
				ar1.add(lblNewLabel_3.getText());


			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_3.setText("Sinarest");

			}
		});
		btnNewButton_3.setBounds(596, 198, 121, 45);
		contentPane.add(btnNewButton_3);
		
		JLabel Cheston_Cold = new JLabel("Cheston_Cold");
		Cheston_Cold.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\Cheston Cold.png"));
		Cheston_Cold.setToolTipText("Cheston Cold");
		Cheston_Cold.setBounds(46, 323, 121, 143);
		contentPane.add(Cheston_Cold);
		
		JButton btnNewButton_4 = new JButton("Cheston Cold");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Cheston_Cold.getText());
				ar1.add(lblNewLabel_4.getText());


			}
		});
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_4.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_4.setText("Cheston Cold");

			}
		});
		btnNewButton_4.setBounds(46, 496, 121, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel Azithromycin_Tablet = new JLabel("Azithromycin_Tablet");
		Azithromycin_Tablet.setToolTipText("Azithromycin Tablet");
		Azithromycin_Tablet.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\Azithromycin tablet.png"));
		Azithromycin_Tablet.setBounds(233, 323, 121, 143);
		contentPane.add(Azithromycin_Tablet);
		
		JButton btnNewButton_5 = new JButton("Azithromycin Tablet");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Azithromycin_Tablet.getText());
				ar1.add(lblNewLabel_5.getText());


			}
		});
		btnNewButton_5.setBounds(233, 496, 121, 45);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_5.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_5.setText("Azithromycin Tablet");

			}
		});
		
		
		
		JLabel Cyclopam_Tablet = new JLabel("Cyclopam_Tablet");
		Cyclopam_Tablet.setToolTipText("Cyclopam Tablet");
		Cyclopam_Tablet.setIcon(new ImageIcon("C:\\Users\\Prerana Dhayfule\\Downloads\\AJP PR IMG\\cyclopam.png"));
		Cyclopam_Tablet.setBounds(428, 323, 121, 143);
		contentPane.add(Cyclopam_Tablet);
		
		JButton btnNewButton_6 = new JButton("Cyclopam Tablet");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Cyclopam_Tablet.getText());
				ar1.add(lblNewLabel_6.getText());


			}
		});
		btnNewButton_6.setBounds(428, 496, 121, 45);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_6.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_6.setText("Cyclopam Tablet");

			}
		});
		

		JLabel Tus_Q = new JLabel("Tus_Q");
		Tus_Q.setIcon(new ImageIcon("C:\\\\Users\\\\Prerana Dhayfule\\\\Downloads\\\\AJP PR IMG\\Tus-Q.png"));
		Tus_Q.setToolTipText("Tus -Q Tablet");
		Tus_Q.setBounds(596, 332, 121, 130);
		contentPane.add(Tus_Q);
		
		JButton btnNewButton_7 = new JButton("Tus-Q");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Tus_Q.getText());
			ar1.add(lblNewLabel_7.getText());

			}
		});
		btnNewButton_7.setBounds(596, 496, 121, 45);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_7.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_7.setText("Tus-Q ");

			}
		});
		
		
		
		
		
		JButton btnNewButton_8 = new JButton("View Cart");
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Cart c = new Cart(ar,ar1);
				c.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(622, 573, 139, 40);
		contentPane.add(btnNewButton_8);
		
		
		
		
	}
}