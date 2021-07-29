package com.xworkz.passport_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.service.PassportService;

@Controller
@RequestMapping("/")
public class PassportRegistrationController{
	@Autowired
	private PassportService pService;
	public PassportRegistrationController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@PostMapping("/registration.all")
	public ModelAndView createDetails(@ModelAttribute PassportDTO pDTO) {
		if(!pDTO.getGivenName().isEmpty()&& pDTO!=null) {
			pService.validateAndSave(pDTO);
			return new ModelAndView("PassportUserLogin", "msgg","Account created ..Please Login to continue");
		}
		else {
			return new ModelAndView("PassportUserRegistration", "msg","Sorry Registration failed..Please try again");

			
		}
		
	}
}
