package com.xworkz.medicine_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.medicine_app.dto.MedicineDTO;
import com.xworkz.medicine_app.service.MedicineService;

@Controller
@RequestMapping("/")
public class MedicineController {
	@Autowired
	private MedicineService mService;
	
	@PostMapping("/med.all")
	public ModelAndView saveDetails(@ModelAttribute MedicineDTO mDTO) {
		if(!mDTO.getName().isEmpty()&&mDTO!=null) {
			mService.validateAndSave(mDTO);
			return new ModelAndView("success", "msg", "Thank you for ordering");
		}
		else {
			return new ModelAndView("medicine", "msg", "Sorry try again");

		}
		
	}

}
