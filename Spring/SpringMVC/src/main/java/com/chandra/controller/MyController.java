package com.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chandra.bean.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");//Welcome is a name of the view which refers to Welcome.jsp
		return mv;//it is like RequestDispatcher
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}

	@RequestMapping("/employee")
	public ModelAndView loadEmployeeForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeForm");
		return mv;
	}
	
	@RequestMapping("/employee-data")
	public ModelAndView readEmployeeData(@ModelAttribute("employee") Employee employee) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeDetails");
		mv.addObject("employee", employee);
		return mv; 
		
	}

}
