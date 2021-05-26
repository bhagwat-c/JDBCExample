package com.sonata.OtherJdbc;
import java.sql.*;

public class CallableDelete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample", "root","admin@123");
			
			CallableStatement cs = con.prepareCall("{ call DEL(?)}");
			
			cs.setInt(1,1334);
		
			int rs = cs.executeUpdate();
			System.out.println("the number of record inserted is :"+rs);
			
			
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e1) {
		e1.printStackTrace();
	}
	}

	

}
