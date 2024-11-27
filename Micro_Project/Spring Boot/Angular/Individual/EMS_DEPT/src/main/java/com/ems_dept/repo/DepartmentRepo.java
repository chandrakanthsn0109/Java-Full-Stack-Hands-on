package com.ems_dept.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems_dept.model.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer>{

}
