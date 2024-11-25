package com.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {
	
//	@GetMapping("/hello") //	@RequestMapping(method = RequestMethod.GET)
//	public String sayHello() {
//		return "Hello Spring Boot";
//	}
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/create-employee")
	public void doInsert(@RequestBody Employee employee) {
		repo.save(employee);
	}
	
	@PutMapping("/update-employee")
	public void doUpdate(@RequestBody Employee employee) {
		repo.save(employee);
	}
	
	@DeleteMapping("/delete-employee/{empId}")
	public void doDelete(@PathVariable("empId") int empId) {
		repo.deleteById(empId);
	}
	
	@GetMapping("/read-employee/{empId}")
	public Employee doRead(@PathVariable("empId") int empId) {
		return repo.findById(empId).get();
	}
	
	@GetMapping("/readAll-employee")
	public List<Employee> doReadAll() {
		return ((List<Employee>) repo.findAll());
	}
	
}
