package com.dbcon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dbcon.entity.DbEntity;
import com.dbcon.repository.DbRepo;

@Controller
public class DbController {

	@Autowired
	private DbRepo Dbrepo;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/register")
	public String userRegistration(@ModelAttribute DbEntity user, Model model) {
		System.out.println(user.toString());
		// validate
		System.out.println(user.getFirstname());
		System.out.println(user.getLastname());
		System.out.println(user.getPhonenumber());
		System.out.println(user.getEmail());
		model.addAttribute("firstname", user.getFirstname());
		model.addAttribute("lastname", user.getLastname());
		Dbrepo.save(user);
		return "result";
	}

}
