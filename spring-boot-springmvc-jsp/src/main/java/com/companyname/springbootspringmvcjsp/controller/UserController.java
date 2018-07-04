package com.companyname.springbootspringmvcjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.companyname.springbootspringmvcjsp.model.User;
import com.companyname.springbootspringmvcjsp.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@ModelAttribute("user")
	public User constructBlog() {
		return new User();
	}

	@RequestMapping("/users")
	public String showForm(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "users";
	}
	
	@RequestMapping("/")
	public String users(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "users";
	}
	
}
