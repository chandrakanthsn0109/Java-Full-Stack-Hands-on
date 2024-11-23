package com.ems.repo;

import java.util.LinkedList;

import com.ems.bean.Employee;

public class EmployeeRepo {
	
	LinkedList<Employee> emp = new LinkedList<>();

	public boolean insertEmployee(Employee employee) {
		return emp.add(employee);
	}

	public boolean deleteEmployee(int id) {
		boolean flag = false;
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getEid() == id) {
				flag = true;
				System.out.println(i);
				emp.remove(i);
				break;
			}
		}
		return flag;
	}

	public boolean updateEmployee(Employee employee) {
		boolean flag = false;
		for(int i=0; i<emp.size(); i++) {
			if(emp.get(i).getEid() == employee.getEid() ) {
				flag = true;
				emp.set(i, employee);
				break;
			}
		}
		return flag;
	}

	public Employee findEmployee(int id) {
		Employee e = null;
		for(Employee emp1 : emp) {
			if(emp1.getEid() == id) {
				e = emp1;
				break;
			}
		}
		return e;
	}
	
	public LinkedList<Employee> findAllEmployee() {
		return emp;
	}
	
}
