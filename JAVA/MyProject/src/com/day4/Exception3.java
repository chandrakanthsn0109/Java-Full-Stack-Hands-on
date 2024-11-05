package com.day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class Exception3 {
	
	static void myMethod() throws FileNotFoundException, SQLException {
		FileReader fr = new FileReader("Demo.txt");
	}

	public static void main(String[] args) {
		try {
			Exception3.myMethod();
		} catch (FileNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
