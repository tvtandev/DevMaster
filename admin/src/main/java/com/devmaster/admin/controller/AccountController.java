package com.devmaster.admin.controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devmaster.Library.repository.CustomerRepository;
import com.devmaster.Library.model.Customer;


import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("admin")
public class AccountController {
	@Autowired
	private CustomerRepository dao;

	@Autowired
	ServletContext app;
	
	@RequestMapping("account")
	public String index(Model model, HttpServletResponse response) {
		model.addAttribute("item", new Customer());
		model.addAttribute("items", dao.findAll());
		return "admin/account";
	}

}
