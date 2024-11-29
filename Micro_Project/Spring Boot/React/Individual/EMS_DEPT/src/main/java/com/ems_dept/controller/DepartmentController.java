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

import com.ems_dept.model.Department;
import com.ems_dept.service.DepartmentService;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentController {
	
	DepartmentService depSer;
	
	@Autowired
	public DepartmentController(DepartmentService depSer) {
		super();
		this.depSer = depSer;
	}

	@PostMapping("/create-department")
	public void doInsert(@RequestBody Department dept) {
		depSer.createDepartment(dept);
	}

	@PutMapping("/update-department")
	public void doUpdate(@RequestBody Department dept) {
		depSer.updateDepartment(dept);
	}
	
	@DeleteMapping("/delete-department/{depNo}")
	public void doDelete(@PathVariable("depNo") int depNo) {
		depSer.deleteDepartment(depNo);
	}
	
	@GetMapping("/find-department/{depNo}")
	public Department dofind(@PathVariable("depNo") int depNo) {
		return depSer.findDepartment(depNo);
	}
	
	@GetMapping("/findAll-department")
	public List<Department> dofind() {
		return depSer.findAllDepartment();
	}
	
}
