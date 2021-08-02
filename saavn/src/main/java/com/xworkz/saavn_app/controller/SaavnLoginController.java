package com.xworkz.saavn_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.xworkz.saavn_app.dto.SaavnLoginDTO;
import com.xworkz.saavn_app.dto.SaavnRegistrationDTO;
import com.xworkz.saavn_app.service.SaavnLoginService;

//@RestController("/")
@Controller
@RequestMapping("/")
public class SaavnLoginController {
	
	@Autowired
	public SaavnLoginService sLService;
	
	public SaavnLoginController() {
		System.out.println(this.getClass().getSimpleName()+"  created");
		
	}
	
	@PostMapping("/login")
	public ModelAndView saveRegistrationDetailsSaavn(@ModelAttribute SaavnLoginDTO sDTO) {
		
		SaavnRegistrationDTO dto = null;
		if(sDTO!=null&&sDTO.getLoginId()!=null&&sDTO.getPassword()!=null) {
				dto=sLService.validateAndVerify(sDTO.getLoginId(),sDTO.getPassword());
				
				if(dto.getLoginId()!=null && dto.getPassword()!=null && dto.getLoginId().equalsIgnoreCase(sDTO.getLoginId())&& dto.getPassword().equalsIgnoreCase(sDTO.getPassword())) {
					return new ModelAndView("SongsPlay", "msgser","All Services");
				}
				else {
					return new ModelAndView("SaavnLogin", "msgg","Sorry details not matching..Please try again..");
				}
				
			}
			else {
				return new ModelAndView("SaavnLogin", "msgg","Sorry fields cant be empty..Please try again..");
			}
		
	}
	
	
	

}
