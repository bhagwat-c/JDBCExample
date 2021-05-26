package com.sonata.OtherJdbc;
import java.sql.*;


public class TranscationControllREx {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection
					("jdbc:mysql://localhost/JDBCExample","root","admin@123");
			con.setAutoCommit(false);
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			
			ps.setInt(1, 133);
			ps.setString(2, "girh");
			ps.setDouble(3, 2346.98);
			
			int a= ps.executeUpdate();
			
			//con.commit();
		System.out.println("The numbers of records updated:"+a);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e1) {
			e1.printStackTrace();
			con.rollback();
		}
		finally {
			con.close();
		}

	}

}
