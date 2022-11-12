package com.e_medico;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.e_medico.dao.DatabaseCon;

//import VaccineManagemntSystem.databse.data;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 10, 537, 378);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 29));
		lblNewLabel.setBounds(185, 23, 117, 87);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1.setBounds(23, 120, 138, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		textField.setBounds(182, 120, 178, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(23, 175, 138, 30);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(183, 179, 178, 30);
		panel.add(textField_1);
		JLabel lblNewLabel_2 = new JLabel("Wrong User name or wrong password");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(99, 234, 313, 44);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		//setUndecorated(true);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnNewButton.setBounds(62, 295, 148, 55);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("HOME");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				HomePage h = new HomePage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.GREEN);
		btnBack.setBounds(244, 295, 148, 55);
		panel.add(btnBack);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int b = 0;
				DatabaseCon db = new DatabaseCon();
//				b = db.login(textField.getText() , textField_1.getText());
				
			if(b==1)
				{
					lblNewLabel_2.setVisible(true);
				}
			else {
//					DashBoard d = new DashBoard();
//					d.setVisible(true);
					setVisible(false);
				}
				
			}
		});
		
		
		
	}
}