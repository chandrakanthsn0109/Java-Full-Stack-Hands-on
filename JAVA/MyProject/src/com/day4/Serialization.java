package com.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient int eId;
	String eName;
	float eSalary;

	public Employee(int eId, String eName, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public void display() {
		System.out.println("Employee Id: " + eId);
		System.out.println("Employee Name: " + eName);
		System.out.println("Employee Salary: " + eSalary);
	}

}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(101, "Chandra", 15000.0f);

		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\BIWW\\Assignments\\JAVA\\ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fos);
		objout.writeObject(emp);

		objout.close();
		fos.close();

		System.out.println("Object Serialized.");

		//De-Serialization
		FileInputStream fis = new FileInputStream("C:\\BIWW\\Assignments\\JAVA\\ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fis);
		Employee temp = (Employee)objin.readObject();

		objin.close();
		fis.close();
		temp.display();

		System.out.println("Object De-Serialized.");
	}

}
