package com.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\BIWW\\Assignments\\JAVA\\msd.png");
		FileOutputStream fos = new FileOutputStream("C:\\BIWW\\Assignments\\JAVA\\NewImage.png");
		int ch;
		while((ch = fis.read()) != -1) {
//			System.out.print((char)ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("Image Copied!!");
	}

}
