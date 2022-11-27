package com.e_medico;
import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("BankGothic Md BT", Font.BOLD, 29));
		lblNewLabel.setBounds(-111, 66, 70, 29);
		contentPane.add(lblNewLabel); 
		
		JButton btnNewButton_1 = new JButton("SIGN-UP");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignUpPage sup = new SignUpPage();
				sup.setVisible(true);
				setVisible(false);
						
			}
		});
		btnNewButton_1.setFont(new Font("BankGothic Md BT", Font.BOLD, 29));
		btnNewButton_1.setBounds(372, 483, 158, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(585, 483, 150, 49);
		contentPane.add(btnNewButton);
		
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				LoginPage pg = new LoginPage();
				pg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("BankGothic Md BT", lblNewLabel.getFont().getStyle(), 29));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\WhatsApp_Image_2022-11-23_at_17-removebg-preview.png"));
		lblNewLabel_2.setBounds(451, 83, 325, 318);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\Home Page 1.jpeg"));
		lblNewLabel_1.setLocation(0, 0);
		lblNewLabel_1.setSize( 786,571);
		contentPane.add(lblNewLabel_1);
	}
}
