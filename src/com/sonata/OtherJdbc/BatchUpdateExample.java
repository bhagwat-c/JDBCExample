package com.sonata.OtherJdbc;
import java.sql.*;

public class BatchUpdateExample {

	public static void main(String[] args) {
		int a=200;
		String b="Sandy";
		double c=1234.56;
		
		int x=300;
		String y="rajesh";
		double z=6837.88;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root", "admin@123");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setDouble(3, c);
			
			ps.addBatch();
			ps.setInt(1, x);
			ps.setString(2, y);
			ps.setDouble(3, z);
			ps.addBatch();
			
			ps.executeBatch();
			System.out.println("numbers of records inserted ");
		}catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}catch(SQLException e2) {
			e2.printStackTrace();
		}
	}

}
