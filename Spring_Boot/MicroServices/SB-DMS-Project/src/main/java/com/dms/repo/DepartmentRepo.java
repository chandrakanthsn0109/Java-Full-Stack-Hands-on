package com.dms.repo;

import java.util.List;

//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.dms.model.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer>{
	
//	public List<Department> findByDepName(String depName);
//	
//	@Transactional
//	public void deleteByDepName(String depName);
	
//	@Query("from Employee where empSalary > :esalary")
//	public List<Department> findByEmpSalary(int esalary);
//	
//	@Modifying
//	@Transactional
//	@Query("delete from Employee e where e.empSalary > :esalary")
//	public void deleteByEmpSalary(int esalary);
}
