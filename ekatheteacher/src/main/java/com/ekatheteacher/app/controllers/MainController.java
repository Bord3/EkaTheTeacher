package com.ekatheteacher.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping({"/", "/index"})
	public String index (Model model) {
		model.addAttribute("titulo", "EkaTheTeacher");
		return "index";
	}
	

}
