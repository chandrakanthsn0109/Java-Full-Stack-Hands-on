package com.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\BIWW\\Assignments\\JAVA\\Demo.txt");
		FileOutputStream fos = new FileOutputStream("C:\\BIWW\\Assignments\\JAVA\\NewFile.txt");
		int ch;
		while((ch = fis.read()) != -1) {
//			System.out.print((char)ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("File Copied!!");
	}

}
