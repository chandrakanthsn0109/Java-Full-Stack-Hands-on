package com.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Step-1 : Loading the driver into JVM
//		Class.forName("org.postgresql.Driver");
		
		//Step-2 : Create Connection with db
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		
		//Step-3 : Creating Statement
		String sql = "delete from employee where eid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step-4 : Execute the Query
		ps.setInt(1, 102);
//		ps.setString(2, "Raju");
//		ps.setInt(3, 35000);
		
		int x = ps.executeUpdate();
		if(x == 1) {
			System.out.println("Record Deleted Successfully");
		}
		else {
			System.out.println("Record Deletion Failed");
		}
		
	}

}
