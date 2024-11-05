package com.day4;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fin = new FileReader("C:\\BIWW\\Assignments\\JAVA\\Demo.txt");
		FileWriter fout = new FileWriter("C:\\BIWW\\Assignments\\JAVA\\NewFile1.txt");
		int ch;
		while((ch = fin.read()) != -1) {
//			System.out.print((char)ch);
			fout.write(ch);
		}
		fin.close();
		fout.close();
		System.out.println("File Copied!!");
	}

}
