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
import java.util.ArrayList;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LoginPage extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;
	ArrayList em = new ArrayList();

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
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setUndecorated(true);
		
				JLabel lblNewLabel_2 = new JLabel("Wrong User name or wrong password");
				lblNewLabel_2.setBounds(111, 363, 355, 44);
				contentPane.add(lblNewLabel_2);
				lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
				lblNewLabel_2.setForeground(new Color(0, 0, 0));
		
				JButton btnNewButton = new JButton("Login");
				btnNewButton.setIcon(null);
				btnNewButton.setBounds(439, 497, 118, 55);
				contentPane.add(btnNewButton);
				btnNewButton.setBorderPainted(false);
				btnNewButton.setBackground(new Color(30, 144, 255));
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						try
						{
							int b = 0;
							DatabaseCon db = new DatabaseCon();
							b = db.login(txtUserName.getText() , txtPassword.getText());
							if(txtUserName.getText().equals("admin") && txtPassword.getText().equals("admin")) 
							{
								DashBoard db1 = new DashBoard();
								db1.setVisible(true);
								dispose();
							}
							else {
						if(b==2)
							{
								lblNewLabel_2.setVisible(true);
							}
						else  {
							String id=txtUserName.getText();
								MedicineLists d = new MedicineLists();
								d.setVisible(true);
								setVisible(false);
								em.add(txtUserName.getText()); 
//								Cart es = new Cart()

//								EmailSending es = new EmailSending();
//								es.getdata(id);
							}
							}
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
						
						
					}
				});
				
				JLabel lblNewLabel = new JLabel("LOGIN");
				lblNewLabel.setBounds(151, 102, 136, 38);
				contentPane.add(lblNewLabel);
				lblNewLabel.setBackground(Color.BLACK);
				lblNewLabel.setForeground(new Color(0, 0, 0));
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
				
				JButton btnBack = new JButton("Back");
				btnBack.setToolTipText("Go To Babk");
				btnBack.setIcon(null);
				btnBack.setBounds(75, 497, 107, 55);
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
				btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
				btnBack.setBorderPainted(false);
				btnBack.setBackground(new Color(30, 144, 255));
				
				
				txtPassword = new JTextField();
				txtPassword.setBounds(111, 273, 355, 49);
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
				txtPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
				txtPassword.setColumns(10);
				
				txtUserName = new JTextField();
				txtUserName.setHorizontalAlignment(SwingConstants.LEFT);
				txtUserName.setBounds(111, 204, 355, 49);
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
				txtUserName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
				txtUserName.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\984a7602f2200e18e6a8657722c09385.png"));
				lblNewLabel_3.setBounds(37, 74, 659, 497);
				contentPane.add(lblNewLabel_3);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\Login Bg.jpg"));
				lblNewLabel_1.setBounds(0, 0, 786, 613);
				contentPane.add(lblNewLabel_1);
		lblNewLabel_2.setVisible(false);
	}
}