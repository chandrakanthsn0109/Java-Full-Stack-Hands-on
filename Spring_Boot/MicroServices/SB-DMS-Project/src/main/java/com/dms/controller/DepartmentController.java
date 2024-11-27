package com.dms.controller;

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

import com.dms.model.Department;
import com.dms.repo.DepartmentRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentController {

//	@GetMapping("/hello") //	@RequestMapping(method = RequestMethod.GET)
//	public String sayHello() {
//		return "Hello Spring Boot";
//	}
	
	private DepartmentRepo repo;
	
	@Autowired
	public DepartmentController(DepartmentRepo repo) {
		this.repo = repo;
	}

	@PostMapping("/create-department")
	public void doInsert(@RequestBody Department department) {
		repo.save(department);
	}

	@PutMapping("/update-department")
	public void doUpdate(@RequestBody Department department) {
		repo.save(department);
	}

	@DeleteMapping("/delete-department/{depNo}")
	public void doDelete(@PathVariable("depNo") int depNo) {
		repo.deleteById(depNo);
	}

	@GetMapping("/read-department/{depNo}")
	public Department doRead(@PathVariable("depNo") int depNo) {
		return repo.findById(depNo).get();
	}

	@GetMapping("/readAll-department")
	public List<Department> doReadAll() {
		return ((List<Department>) repo.findAll());
	}
	
	@GetMapping("/get-dept")
	public String getDepartment() {
		return "Data From Department";
	}

	@GetMapping("/get-dept-details/{depNo}")
	public String getDepartmentDetails(@PathVariable("depNo") int depNo) {
		Department dep = repo.findById(depNo).get();
		return dep.getDepNo() + " " +dep.getDepName();
	}
//	@GetMapping("/find-department-name/{depName}")
//	public List<Department> doFindByName(@PathVariable("depName") String depName) {
//		return ((List<Department>) repo.findByDepName(depName));
//	}
//
//	@DeleteMapping("/delete-department-name/{depName}")
//	public void doDeleteByName(@PathVariable("depName") String depName) {
//		repo.deleteByDepName(depName);
//	}

//	@GetMapping("/find-employee-salary/{empSalary}")
//	public List<Employee> doFindBySalary(@PathVariable("empSalary") int empSalary) {
//		return ((List<Employee>) repo.findByEmpSalary(empSalary));
//	}
//	
//	@DeleteMapping("/delete-employee-salary/{empSalary}")
//	public void doDeleteBySalary(@PathVariable("empSalary") int empSalary) {
//		repo.deleteByEmpSalary(empSalary);
//	}
	
}
