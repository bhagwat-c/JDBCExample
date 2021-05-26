package com.sonata.OtherJdbc;

import java.sql.*;
public class MetadataExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/JDBCExample", "root", "admin@123");
			DatabaseMetaData dm = con.getMetaData();
			
			System.out.println(dm.getDatabaseMajorVersion());
			System.out.println(dm.getDriverName());
			System.out.println(dm.getDriverVersion());
			
			PreparedStatement ps =con.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rms = rs.getMetaData();
			System.out.println(rms.getColumnCount());
			System.out.println(rms.getColumnName(2));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}

	}

}
