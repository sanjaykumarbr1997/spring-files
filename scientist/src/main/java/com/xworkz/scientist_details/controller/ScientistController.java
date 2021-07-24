package com.xworkz.scientist_details.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;

import com.xworkz.scientist_details.dto.ScientistDTO;

@Component
@RequestMapping("/")
public class ScientistController {
	
	public ScientistController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@RequestMapping(value="/sci",method=RequestMethod.POST)
	public String saveSubmarineDetails(@ModelAttribute ScientistDTO sDTO) {
		System.out.println("in controller");

		if(!sDTO.getName().isEmpty()&& sDTO.getName()!=null) {
			return "/success.jsp";
		}
		else {
			System.out.println("Invalid details");
		}
		
		return "/scientist.jsp";
		
		
	}

}
