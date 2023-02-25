package com.dbcon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.dbcon.entity.DbEntity;
import com.dbcon.repository.DbRepo;


public class DbController {

	@Autowired
	private DbRepo Dbrepo;
	
	@GetMapping("/")
	public String SignUpForm(Model model) {
		model.addAttribute("user", new DbEntity());
		return "index";
	}

	@PostMapping("/process_register")
	public String Registration(DbEntity user) {
		Dbrepo.save(user);
		return "result";
	}

}
