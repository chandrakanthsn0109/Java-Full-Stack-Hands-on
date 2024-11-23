package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.repo.EmployeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/employee")
	public ModelAndView loadEmployeeForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeForm");
		return mv;
	}

	@RequestMapping("/employee-data")
	public ModelAndView readEmployeeData(@RequestParam("btn") String btn,
			@ModelAttribute("employee") Employee employee) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeOutput");
		if (btn.equalsIgnoreCase("insert") && repo.insertEmployee(employee)) {
			mv.addObject("msg", "Employee Details Added Successfully");
		}
		if (btn.equalsIgnoreCase("update") && repo.updateEmployee(employee)) {
			mv.addObject("msg", "Employee Details Updated Successfully");
		}
		if (btn.equalsIgnoreCase("delete") && repo.deleteEmployee(employee.getEid())) {
			mv.addObject("msg", "Employee Detail Deleted Successfully");
		}
		if (employee != null && btn.equalsIgnoreCase("find")) {
			mv.setViewName("Find");
			Employee emp = repo.findEmployee(employee.getEid());
			mv.addObject("msg", "Employee Found Successfully");
			mv.addObject("msg1", emp);
		}
		return mv;

	}
	

	@RequestMapping("/find-all")
	public ModelAndView findAll(@RequestParam("btn") String btn) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeOutput");
		if (btn.equalsIgnoreCase("findAll")) {
			mv.setViewName("EmployeeOutput");
			List<Employee> emp = repo.findAllEmployee();
			mv.addObject("msg", emp);
		}
		return mv;
	}

}
