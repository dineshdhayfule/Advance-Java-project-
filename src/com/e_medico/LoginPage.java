package com.e_medico;

import java.awt.EventQueue;  

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.e_medico.dao.DatabaseCon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

public class LoginPage extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;

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
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(315, 10, 117, 87);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 29));
		
		txtUserName = new JTextField();
		txtUserName.setBounds(233, 133, 263, 49);
		contentPane.add(txtUserName);
		txtUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtUserName.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "UserName", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				txtUserName.setText("");	
			}
		});
		txtUserName.setText("USER NAME");
		txtUserName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(233, 212, 263, 49);
		contentPane.add(txtPassword);
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtPassword.setBorder(new TitledBorder(null, "PASSWORD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				txtPassword.setText("");	

			}
		});
		txtPassword.setText("PASSWORD");
		txtPassword.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		txtPassword.setColumns(10);
		JLabel lblNewLabel_2 = new JLabel("Wrong User name or wrong password");
		lblNewLabel_2.setBounds(183, 313, 355, 44);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.RED);
		//setUndecorated(true);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(183, 448, 148, 55);
		contentPane.add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		
		JButton btnBack = new JButton("HOME");
		btnBack.setBounds(390, 448, 148, 55);
		contentPane.add(btnBack);
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
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setBounds(new Rectangle(17, 17, 17, 17));
		panel.setBorder(new TitledBorder(null, "LOGIN", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		panel.setBounds(117, 82, 472, 487);
		contentPane.add(panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int b = 0;
					DatabaseCon db = new DatabaseCon();
					b = db.login(txtUserName.getText() , txtPassword.getText());
					
				if(b==2)
					{
						lblNewLabel_2.setVisible(true);
					}
				else  {
						MedicineLists d = new MedicineLists();
						d.setVisible(true);
						setVisible(false);
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
			}
		});
		lblNewLabel_2.setVisible(false);
		
		
		
	}
}