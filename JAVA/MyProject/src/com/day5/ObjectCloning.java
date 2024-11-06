package com.day5;

public class ObjectCloning implements Cloneable {
	
	int id;
	String name;
	float salary;

	ObjectCloning(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning obj1 = new ObjectCloning(101, "Chandra", 15000.0f);
		obj1.display();
		System.out.println(obj1.hashCode());
		System.out.println();
		
		ObjectCloning obj2 = (ObjectCloning) obj1.clone();
		obj2.display();
		System.out.println(obj2.hashCode());
	}

}
