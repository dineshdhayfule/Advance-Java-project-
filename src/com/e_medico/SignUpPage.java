package com.e_medico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.e_medico.dao.DatabaseCon;

//import VaccineManagemntSystem.LoginPage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private TextField textField_3;

	private JLabel lblNewLabel_4;
	ArrayList al = new ArrayList();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN- UP ");
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 18));
		lblNewLabel.setBounds(288, 38, 187, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(26, 136, 140, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(207, 136, 391, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("E-MAIL");
		lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(26, 207, 111, 22);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 202, 391, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(26, 268, 111, 31);
		contentPane.add(lblNewLabel_3);
		
		textField_2 =new JTextField();
		textField_2.setBounds(207, 267, 391, 37);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(26, 341, 127, 22);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new TextField();
		textField_3.setBounds(207, 341, 391, 37);
		contentPane.add(textField_3);
		textField_3.setEchoChar('*');
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				al.add(textField.getText());
				al.add(textField_1.getText());
				al.add(textField_2.getText());
				al.add(textField_3.getText());
				int a =0 , c =0; 
				if (a==0) {
					DatabaseCon db = new DatabaseCon();
					db.insertIntoDB(al);
					c = db.insertIntoDB(al);
					JOptionPane.showMessageDialog(null, c);
				     }
				if(c==1)
				{
					JOptionPane.showMessageDialog(null, "Succesfully Submited");
				}
		     else {
		    	 JOptionPane.showMessageDialog(null, "Not Submited");
		    	 }
				if(c==1)
				{
				LoginPage lp = new LoginPage();
						lp.setVisible(true);
						setVisible(false);
				}
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(194, 455, 145, 31);
		contentPane.add(btnNewButton);
	}
}
