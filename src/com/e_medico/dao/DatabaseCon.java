package com.e_medico.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DatabaseCon {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	/*create table signup(NAME VARCHAR2(70),EMAIL VARCHAR2(30),ADDRESS VARCHAR2(70),PASSWORD VARCHAR2(10));
select * from signup
drop table signup
*/
	public String fname = null;
	public String lanme = null;
	public String phone = null;
	public String email = null;
	public String pass1 = null;
	PreparedStatement stm = null;
	Connection con = null;
	Statement stmt = null;
	String sql;

	public int insertIntoDB (ArrayList a) {
				
		int a1 = 0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			 sql = "insert into signup values(? , ? , ? , ? )";
			 stm = con.prepareStatement(sql);
			 
			 stm.setString(1, (String) a.get(0));
			 stm.setString(2, (String) a.get(1));
			 stm.setString(3, (String) a.get(2));
			 stm.setString(4, (String) a.get(3));
			 a1 = stm.executeUpdate();
			
		} catch (Exception e1) {

		}
		return a1;
	}
	
	public int login ( String id , String pass )
	{	
		ResultSet rs = null;
		String pass11 = null;
		String name = null ;
		int b = 0;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url , user , "root");
			stmt = con.createStatement();
			sql = "select password ,name from signup where EMAIL = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, id);
			rs = stm.executeQuery();
			
			if(	rs.next()==false)
			{	
				b = 1;
			}
			else
			{
				do
				{
					pass11 = rs.getString(1);
					name = rs.getString(1);
				}while(rs.next());
			}
			if(pass11.equals(pass11))
			{
				JOptionPane.showMessageDialog(null, "Welcome "+name);
			}
			else {
				b = 2;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException i) {
			i.printStackTrace();
		} catch (Exception u) {
			u.printStackTrace();
		}	
		return b;
	}
	
	
}
