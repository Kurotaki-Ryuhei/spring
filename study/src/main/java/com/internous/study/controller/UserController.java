package com.internous.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.internous.study.model.form.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/")
	public String UserIndex() {
		return "userindex";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerUser(
			@ModelAttribute("userForm") UserForm form,
			Model model) {
		
		model.addAttribute("userForm", form);
		return "register";
	}
	
}
