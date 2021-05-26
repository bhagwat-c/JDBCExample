package com.sonata.jdbc;
import java.sql.*;

public class InsertPreaper {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample", "root", "admin@123");
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO employee values(?,?,?)");
			
			pst.setInt(1,3333);
			pst.setString(2, "Sumit");
			pst.setDouble(3, 1234.5);
			
			int a = pst.executeUpdate();
			System.out.println(a+" rows affected");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e1) {
			System.out.println(e1);
		}
	}

}
