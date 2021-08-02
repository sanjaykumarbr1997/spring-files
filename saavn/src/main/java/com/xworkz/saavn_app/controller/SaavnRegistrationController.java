package com.xworkz.saavn_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;
import com.xworkz.saavn_app.service.SaavnService;

@Controller
@RequestMapping("/")
public class SaavnRegistrationController {
	
	@Autowired
	public SaavnService sService;
	
	public SaavnRegistrationController() {
		System.out.println(this.getClass().getSimpleName()+"  created");
		
	}
	
	@PostMapping("/registration")
	public ModelAndView saveRegistrationDetailsSaavn(@ModelAttribute SaavnRegistrationDTO sDTO) {
		
		if(!sDTO.getName().isEmpty()&& sDTO!=null) {
			sService.validateAndSave(sDTO);
			return new ModelAndView("SaavnLogin", "msgg","Account created ..Please Login to continue");
		}
		else {
			return new ModelAndView("SaavnRegistration", "msg","Sorry Registration failed..Please try again");

			
		}
		
	}

}
