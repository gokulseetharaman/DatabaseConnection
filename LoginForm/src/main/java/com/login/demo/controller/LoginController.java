package com.login.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.demo.entity.UserEntity;
import com.login.demo.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private UserRepository repo;

	@GetMapping("")
	public String Home() {

		return "index";
	}

	@GetMapping("/register")
	public String SignUpForm(Model model) {
		model.addAttribute("user", new UserEntity());
		return "SignupForm";
	}

	@PostMapping("/process_register")
	public String Registration(UserEntity user) {
		repo.save(user);
		return "registerSucess";
	}
}
