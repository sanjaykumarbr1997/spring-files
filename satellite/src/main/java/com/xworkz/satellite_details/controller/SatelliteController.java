package com.xworkz.satellite_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.satellite_details.dto.SatelliteDTO;
import com.xworkz.satellite_details.service.SatelliteService;

@Controller
@RequestMapping("/")
public class SatelliteController {
	@Autowired
	private SatelliteService sService;
	
	public SatelliteController() {
		
	}
	
	@PostMapping("/sat.all")
	public ModelAndView saveSatelliteDetails(@ModelAttribute SatelliteDTO sDTO) {
		
		if(!sDTO.getName().isEmpty()&& sDTO!=null) {
			
			sService.validateAndSave(sDTO);
			return new ModelAndView("success", "msg", "Thank you details saved");
		}
		else {
			return new ModelAndView("satellite", "msg", "Sorry....Enter again ....");
		}
		
		
	}

}
