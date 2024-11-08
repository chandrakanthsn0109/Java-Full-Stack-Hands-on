package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMS {

	static Scanner sc = new Scanner(System.in);
	static EmployeeDAO dao = new EmployeeDAO();

	public static int menu() {
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Update");
		System.out.println("4. Find");
		System.out.println("5. FindAll");
		System.out.println("6. Quit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
//  For View purpose
	public static Employee insertEmployee() {
		System.out.println("Enter employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt());
	}

	public static int deleteEmployee() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}

	public static Employee updateEmployee() {
		System.out.println("Enter employee id, name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt());
	}

	public static int findEmployee() {
		System.out.println("Enter employee id");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		String msg = "";
		do {
//            Flow control
			switch(EMS.menu()) {
			case 1:
				//Employee employee = inseertEmployee();
				//int n = dao.insertEmployee(employee);
				if(dao.insertEmployee(insertEmployee()) == 1) {
					System.out.println("Record Inserted");
				}else {
					System.out.println("Record Not Inserted");
				}
				break;
			case 2:
				if(dao.deleteEmployee(deleteEmployee()) == 1) {
					System.out.println("Record Deleted");
				}else {
					System.out.println("Record Not Deleted");
				}
				break;
			case 3:
				//Employee employee = updateEmployee();
				//int n = dao.updateEmployee(employee);
				if(dao.updateEmployee(updateEmployee()) == 1) {
					System.out.println("Record Updated");
				}else {
					System.out.println("Record Not Updated");
				}
				break;
			case 4:
				int eid = findEmployee();
				Employee temp = dao.findEmployee(eid);
				if(temp == null) {
					System.out.println("Record Not Found");
				}else {
					System.out.println(temp.getEid() + " " + temp.getEname() + " " + temp.getEsalary());
				}
				break;
			case 5:
				List<Employee> list = dao.findAllEmployee();
				if(list.isEmpty()) {
					System.out.println("Records Not Found");
				}else {
					for(Employee e : list) {
						System.out.print(e.getEid() + " " + e.getEname() + " " + e.getEsalary());
						System.out.println();
					}
				}

				break;
			case 6: System.exit(0);
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		}while(msg.equalsIgnoreCase("Yes"));
	}

}
