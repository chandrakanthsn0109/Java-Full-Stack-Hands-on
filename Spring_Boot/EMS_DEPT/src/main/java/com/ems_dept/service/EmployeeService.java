package com.ems_dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems_dept.model.Employee;
import com.ems_dept.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo repo;

	@Autowired
	public EmployeeService(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}
	
	public void createEmployee(Employee employee) {
		repo.save(employee);
	}

	public void updateEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}

	public Employee findEmployee(int empId) {
//		System.out.println(empId);
		return (Employee)repo.findById(empId).get();
	}
	
	public List<Employee> findAllEmployee() {
		return (List<Employee>)repo.findAll();
	}

}
