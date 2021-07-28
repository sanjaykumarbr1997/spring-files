package com.xworkz.engine_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.engine_details.dto.EngineDTO;
import com.xworkz.engine_details.service.EngineService;

@Controller
@RequestMapping("/")
public class EngineController {

	public EngineController() {

	}
	@Autowired
	private EngineService eService;
	@PostMapping("/eng.all")
	//@RequestMapping(value="/eng" ,method=RequestMethod.POST )
	//	public String saveEngineDetails(@ModelAttribute EngineDTO eDTO) {



	public ModelAndView saveEngineDetails(@ModelAttribute EngineDTO eDTO) {
		if(!eDTO.getName().isEmpty() && eDTO.getName()!=null) {
			
			eService.validateAndSave(eDTO);

			return new ModelAndView("success", "msg", "Thank you for purchasing ....");
		}
		else {
			System.out.println("failed");
		}
		return new ModelAndView("engine", "msg", "Sorry ...Try agian ....");

	}

}
