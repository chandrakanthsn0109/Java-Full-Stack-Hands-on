package com.ems_dept.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems_dept.model.Department;
import com.ems_dept.repo.DepartmentRepo;

@Service
public class DepartmentService {

	DepartmentRepo drepo;

	public DepartmentService(DepartmentRepo drepo) {
		super();
		this.drepo = drepo;
	}
	
	public void createDepartment(Department dept) {
		drepo.save(dept);
	}

	public void updateDepartment(Department dept) {
		drepo.save(dept);
	}

	public void deleteDepartment(int dno) {
		drepo.deleteById(dno);
	}

	public Department findDepartment(int depNo) {
		return drepo.findById(depNo).get();
	}

	public List<Department> findAllDepartment() {
		return (List<Department>)drepo.findAll();
	}
}
