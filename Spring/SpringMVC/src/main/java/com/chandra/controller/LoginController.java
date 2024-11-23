package com.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chandra.bean.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView loadUser() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	
	@RequestMapping("/login-data")
	public ModelAndView readLoginData(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		if(user.getUserName().equals("Admin") && user.getPassword().equals("123")) {
			mv.setViewName("AdminHome");
		}
		else {
			mv.setViewName("Login");
			mv.addObject("message", "Login Failed!!");
		}
		return mv;
	}

}
