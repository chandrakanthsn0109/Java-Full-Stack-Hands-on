package com.ems_dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems_dept.model.Employee;
import com.ems_dept.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {
	
	EmployeeService empSer;

	@Autowired
	public EmployeeController(EmployeeService empSer) {
		super();
		this.empSer = empSer;
	}
	
	@PostMapping("/create-employee")
	public void doInsert(@RequestBody Employee employee) {
		empSer.createEmployee(employee);
	}
	
	@PutMapping("/update-employee")
	public void doUpdate(@RequestBody Employee employee) {
		empSer.updateEmployee(employee);
	}

	@DeleteMapping("/delete-employee/{empId}")
	public void doDelete(@PathVariable("empId") int empId) {
		empSer.deleteEmployee(empId);
	}
	
	@GetMapping("/find-employee/{empId}")
	public Employee doFind(@PathVariable("empId") int empId) {
		return empSer.findEmployee(empId);
	}
	
	@GetMapping("/findAll-employee")
	public List<Employee> doFindAll() {
		return empSer.findAllEmployee();
	}
	
}
