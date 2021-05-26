package com.sonata.bean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PrepareEx {

	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<>();
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
	PreparedStatement pst=con.prepareStatement("select * from employee");
	ResultSet rs = pst.executeQuery();
	while(rs.next())
	{
		Employee e = new Employee();
		e.setEmpId(rs.getInt(1));
		e.setEmpName(rs.getString(2));
		e.setEmpSal(rs.getDouble(3));
		l1.add(e);
	}
} catch (ClassNotFoundException e) {
	System.out.println(e);
}catch(SQLException e1) {
	System.out.println(e1);
}

	for(Employee es :l1) {
		System.out.println(es.getEmpId());
	}
	}

}
