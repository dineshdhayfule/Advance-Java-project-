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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setSize(700,590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME PAGE");
		lblNewLabel.setFont(new Font("BankGothic Md BT", lblNewLabel.getFont().getStyle(), 29));
		lblNewLabel.setBounds(157, 97, 262, 29);
		contentPane.add(lblNewLabel); 
		
		JButton btnNewButton_1 = new JButton("SIGN-UP");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignUpPage sup = new SignUpPage();
				sup.setVisible(true);
				setVisible(false);
						
			}
		});
		btnNewButton_1.setFont(new Font("BankGothic Md BT", lblNewLabel.getFont().getStyle(), 29));
		btnNewButton_1.setBounds(310, 366, 194, 51);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(63, 353, 150, 57);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				panel.setBackground(new Color(124, 252, 0));

			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				panel.setBackground(new Color(240, 240, 240));

			}
		});
		panel.add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				LoginPage pg = new LoginPage();
				pg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("BankGothic Md BT", lblNewLabel.getFont().getStyle(), 29));
	}
}