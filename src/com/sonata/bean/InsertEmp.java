package com.sonata.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InsertEmp {

	public static void main(String[] args) {
		
		List <Employee> l2 = new ArrayList<>();
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
			PreparedStatement ps = con.prepareStatement("Insert into employee values (?,?,?)");
			
			ps.setInt(1,3333);
			ps.setString(2,"Harsh");
			ps.setDouble(3, 13000.58);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
