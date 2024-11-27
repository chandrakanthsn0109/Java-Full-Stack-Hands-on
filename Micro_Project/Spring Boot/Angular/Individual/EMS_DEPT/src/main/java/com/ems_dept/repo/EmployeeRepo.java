package com.ems_dept.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems_dept.model.Employee;

@Repository
public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{

}
