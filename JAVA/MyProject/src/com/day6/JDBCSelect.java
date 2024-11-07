package com.day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Step-1 : Loading the driver into JVM
//		Class.forName("org.postgresql.Driver");
		
		//Step-2 : Create Connection with db
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		
		//Step-3 : Creating Statement
		String sql = "select * from employee";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Step-4 : Execute the Query

		ResultSet res = ps.executeQuery();
		while(res.next()) {
			System.out.println(res.getInt("eid")+" "+res.getString("ename")+" "+res.getInt("esalary"));
		}
		
	}

}
