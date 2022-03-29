package com.briefBankApi.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		String message = "You just create Spring Boot Example successfully";
		model.addAttribute("message", message);

		return "index";
	}
}
