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
@CrossOrigin(origins = "http://localhost:3000/")
public class EmployeeController {

//	@GetMapping("/hello") //	@RequestMapping(method = RequestMethod.GET)
//	public String sayHello() {
//		return "Hello Spring Boot";
//	}
	
	private EmployeeRepo repo;
	
	@Autowired
	public EmployeeController(EmployeeRepo repo) {
		this.repo = repo;
	}

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

	@GetMapping("/find-employee-name/{empName}")
	public List<Employee> doFindByName(@PathVariable("empName") String empName) {
		return ((List<Employee>) repo.findByEmpName(empName));
	}

	@DeleteMapping("/delete-employee-name/{empName}")
	public void doDeleteByName(@PathVariable("empName") String empName) {
		repo.deleteByEmpName(empName);
	}

	@GetMapping("/find-employee-salary/{empSalary}")
	public List<Employee> doFindBySalary(@PathVariable("empSalary") int empSalary) {
		return ((List<Employee>) repo.findByEmpSalary(empSalary));
	}
	
	@DeleteMapping("/delete-employee-salary/{empSalary}")
	public void doDeleteBySalary(@PathVariable("empSalary") int empSalary) {
		repo.deleteByEmpSalary(empSalary);
	}
}
