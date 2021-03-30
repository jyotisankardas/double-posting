package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.domain.EmployeeDomain;
import com.nt.service.EmployeeService;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String lunchform(@ModelAttribute("domain")EmployeeDomain domain) {
		return "page";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String handleform(@ModelAttribute("domain")EmployeeDomain domain,RedirectAttributes red) {
		
		red.addFlashAttribute("msg", "Sucessfully Register All Data");
		boolean saveData = false;
		try {
			saveData = service.saveData(domain);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(saveData)
			return "redirect:/";
		else 
			return "error";
	}

}
