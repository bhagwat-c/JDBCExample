package com.sonata.jdbc;

import java.sql.*;
public class UpdatePrepared {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
			
			PreparedStatement pst = con.prepareStatement("update employee set empsal=? where empId=?");
			pst.setDouble(1,30000);
			pst.setInt(2, 1111);
			int a=pst.executeUpdate();
			System.out.println(a+"row updated");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e1) {
			System.out.println(e1);
		}
	}

}
