package com.e_medico;

import java.awt.Color; 
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class Cart extends JFrame {

	private JPanel contentPane;
	static String name;
	static String adrress;
	static String email;
	String id1;

	/**
	 * @wbp.parser.constructor
	 */
	public void Cart1(String id) {
		id = id1;

	}

	public Cart(ArrayList a, ArrayList a1, ArrayList a2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 0, 950, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(149, 201, 649, 373);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 5, 5, 5));
//	    panel.setLayout(new GridLayout());
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			JLabel btnNewButton_1 = new JLabel("" + a.get(i));
			btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(255, 0, 0),
					new Color(0, 255, 0), new Color(34, 139, 34)));
			panel.add(btnNewButton_1);

			JLabel btnNewButton_2 = new JLabel("" + a2.get(i));
			btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(255, 0, 0),
					new Color(0, 255, 0), new Color(34, 139, 34)));
			panel.add(btnNewButton_2);

			sum += Integer.parseInt((String) a1.get(i));
		}
		JLabel label = new JLabel("" + sum);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		label.setBounds(712, 597, 85, 36);
		label.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("Total Price ");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(149, 597, 113, 36);
		contentPane.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(0, 0, 936, 133);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("E- MEDICO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(404, 25, 200, 58);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("ALWAYS CARING , ALWAYS HERE");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(351, 77, 290, 30);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\Dell\\Downloads\\AJP PR IMG\\WhatsApp_Image_2022-11-26_at_1-removebg-preview.png"));
		lblNewLabel_3.setBounds(10, 0, 222, 133);
		panel_1.add(lblNewLabel_3);
		JButton btnNewButton = new JButton("ORDER  NOW");
		btnNewButton.setFocusTraversalPolicyProvider(true);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//    			
				JOptionPane.showMessageDialog(null, "YOUR ORDER HAS BEEN CONFIRMED");
				 String email=JOptionPane.showInputDialog(null,"Enter E-mail");     
				 System.out.print(email);
				 EmailSending em = new EmailSending();
	    		 em.sendEmail(email);
				btnNewButton.setEnabled(false);

			}
		});
		btnNewButton.setBounds(697, 689, 169, 43);
		contentPane.add(btnNewButton);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = null;
					ArrayList a = new ArrayList();
					ArrayList a1 = new ArrayList();
					ArrayList a2 = new ArrayList();
					Cart frame = new Cart(a, a1, a2);
//					Cart frame1 = new Cart(id);
					frame.setVisible(true);
//					frame.C;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

}