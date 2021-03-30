package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/welcome/{name}")
	public String getMasg(@PathVariable("name") String name, Model mod) {
		mod.addAttribute("msg", name + " Welcome to Zensar Family ");
		return "welcome";

	}

}
