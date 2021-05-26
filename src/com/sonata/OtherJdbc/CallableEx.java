package com.sonata.OtherJdbc;
import java.sql.*;


public class CallableEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection
					("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
			CallableStatement cs = con.prepareCall("{call SAVEOURUPDATE(?,?,?)}");
			
			cs.setInt(1, 322);
			cs.setString(2, "execution");
			cs.setDouble(3, 4455.89);
			
			int rs = cs.executeUpdate();
			System.out.println("the number of record inserted is :"+rs);
			
			
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e1) {
		e1.printStackTrace();
	}

	}
}