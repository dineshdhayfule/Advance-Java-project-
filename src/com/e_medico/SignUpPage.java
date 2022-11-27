package com.e_medico;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.e_medico.dao.DatabaseCon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField textField_3;
	ArrayList al = new ArrayList();
	ArrayList em = new ArrayList();
	private JLabel lblNewLabel_1;


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
		JButton btnBack = new JButton("Back");
		btnBack.setToolTipText("Go To Babk");
		btnBack.setIcon(null);
		btnBack.setBounds(10, 438, 145, 46);
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
		
		JLabel lblNewLabel = new JLabel("SIGN- UP ");
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 18));
		lblNewLabel.setBounds(167, 27, 187, 52);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtName.setBorder(new TitledBorder(null, "NAME", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				txtName.setText("");
			}
		});
	
		txtName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		txtName.setText("NAME");
		txtName.setBounds(10, 124,  475, 46);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-MAIL");
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtEmail.setBorder(new TitledBorder(null, "E-MAIL", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				txtEmail.setText("");
			}
		});
		
		txtEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		
		txtEmail.setBounds(10, 197, 475, 46);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAddress =new JTextField();
		txtAddress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtAddress.setBorder(new TitledBorder(null, "ADDRESS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				txtAddress.setText("");

			}
		});
		txtAddress.setText("ADDRESS");
		txtAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		txtAddress.setBounds(10, 274, 475, 46);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				textField_3.setText("");
				textField_3.setBorder(new TitledBorder(null, "PASSWORD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			}
		});
		textField_3.setText("PASSWORD");
		textField_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		textField_3.setBounds(10, 352, 475, 46);
		contentPane.add(textField_3);
		//textField_3.setEchoChar('*');
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int c = 0; 
				boolean b;
				//1First Name
				b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(txtName.getText()).matches();
				if(b==false) 
				{
					txtName.setText("enter name proper");
					c = 1;
				}
				else {
					al.add(txtName.getText());
//					em.add(txtName.getText());
				}
				//Email Id
				b = Pattern.compile("^(.+)@(.+)$").matcher(txtEmail.getText()).matches();
				if(b==false) 
				{
					c = 1;
					txtEmail.setText("enter Valid E-mail");
				}
				else {
					al.add(txtEmail.getText());
					em.add(txtEmail.getText());
				}
				
				//7Address
				b = Pattern.compile("").matcher(txtAddress.getText()).matches();
				if(b==true) 
				{
					
					c = 1;
					txtAddress.setText("Enter Valid Address");
				}
				else {
					al.add(txtAddress.getText());
//					em.add(txtAddress.getText());
				}
				
				// password
				if(textField_3.getText().equals(textField_3.getText()))
				{
					textField_3.setText("Enter valid Password");
					c = 1;
				}
				else {
					al.add(textField_3.getText());
				}
			
			
				int a =0 ;
				if (a==0) {
					DatabaseCon db = new DatabaseCon();
					c= db.insertIntoDB(al);
//					JOptionPane.showMessageDialog(null, c);
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
					String e1 = txtEmail.getText();
					MedicineLists d = new MedicineLists();
					d.setVisible(true);
					setVisible(false);
//						Cart es = new Cart(e1);
//						es.getdata(e1);
				}
			}
		});/*
		
		*/
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(209, 438, 162, 46);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\AJP PR IMG\\sign up .png"));
		lblNewLabel_1.setLocation(0, 0);
		lblNewLabel_1.setSize(786, 542);
		contentPane.add(lblNewLabel_1);
	}
}