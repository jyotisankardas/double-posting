package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.domain.UserDomain;

@Controller
public class MainController {
	
	@Autowired
	UserDomain domain;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String lunchFormPage() {
		return "formpage";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String handleData(@ModelAttribute("value")UserDomain domain,Model mod) {
		
		
		mod.addAttribute("data", "Register sucessfully complited   ");
		
		
		
		return "formpage";
	}


}
