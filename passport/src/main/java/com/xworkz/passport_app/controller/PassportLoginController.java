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
public class PassportLoginController {
	@Autowired
	private PassportService pService;
	public PassportLoginController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@PostMapping("/login.all")
	public ModelAndView verifyyDetails(String loginId,String password) {
		if(loginId!=null && password!=null) {
			Boolean b = pService.validateAndVerifyDetails(loginId,password);
			if(b==true) {
				return new ModelAndView("PassportServices", "msgser","All Services");
			}
			else {
				return new ModelAndView("PassportUserLogin", "msgg","Sorry details not matching..Please try again..");
			}
			
		}
		else {
			return new ModelAndView("PassportUserLogin", "msgg","Sorry name cant be empty..Please try again..");

			
		}
		
	}

}
