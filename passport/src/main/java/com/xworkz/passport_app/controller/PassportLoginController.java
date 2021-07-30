package com.xworkz.passport_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.passport_app.dto.PassportDTO;
import com.xworkz.passport_app.dto.PassportLoginDTO;
import com.xworkz.passport_app.service.PassportLoginService;
import com.xworkz.passport_app.service.PassportService;

@Controller
@RequestMapping("/")
public class PassportLoginController {
	@Autowired
	private PassportLoginService plService;
	
	public PassportLoginController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@PostMapping("/login.all")
	public ModelAndView verifyLoginDetails(@ModelAttribute PassportLoginDTO plDTO) {
		PassportDTO dto = null;
		if(plDTO!=null&&plDTO.getLoginId()!=null&&plDTO.getPassword()!=null) {
			dto=plService.validateAndVerify(plDTO.getLoginId(),plDTO.getPassword());
			System.out.println(dto);
			
			if(dto.getLoginId()!=null && dto.getPassword()!=null && dto.getLoginId().equalsIgnoreCase(plDTO.getLoginId())&& dto.getPassword().equalsIgnoreCase(plDTO.getPassword())) {
				return new ModelAndView("PassportServices", "msgser","All Services");
			}
			else {
				return new ModelAndView("PassportUserLogin", "msgg","Sorry details not matching..Please try again..");
			}
			
		}
		else {
			return new ModelAndView("PassportUserLogin", "msgg","Sorry fields cant be empty..Please try again..");
		}
		
	}


}
