package com.sonata.jdbc;

import java.sql.*;


public class PreparedStatement1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample", "root", "admin@123");
			PreparedStatement pst = con.prepareStatement("select * from employee");
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
			
				
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e1) {
			System.out.println(e1);
		}
		

	}

}
