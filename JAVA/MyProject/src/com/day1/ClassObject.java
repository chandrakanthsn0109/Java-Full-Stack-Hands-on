package com.day1;

class Employee{
	int eid;
	String ename;
	float esal;
	Employee(int id,String name,float salary){
		eid=id;
		ename=name;
		esal=salary;
	}
	void display() {
		System.out.println("Emp ID: "+eid);
		System.out.println("Emp Name: "+ename);
		System.out.println("Emp Salary: "+esal);
	}
}
 
public class ClassObject {
 
	public static void main(String[] args) {
		Employee csn=new Employee(101,"Chandra",15000);
		csn.display();
 
	}
 
}