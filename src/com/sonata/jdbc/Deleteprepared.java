package com.sonata.jdbc;
import java.sql.*;

public class Deleteprepared {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
			PreparedStatement pst= con.prepareStatement("delete  from employee where empId=?");
			pst.setInt(1, 3333);
			
			int a = pst.executeUpdate();
			System.out.println(a+" row deleated");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e1) {
			System.out.println(e1);
		}
	}

}
