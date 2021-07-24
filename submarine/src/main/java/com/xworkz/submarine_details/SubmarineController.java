package com.xworkz.submarine_details;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.submarine_details.dto.SubmarineDTO;

@Component
@RequestMapping("/")
public class SubmarineController {
	
	public SubmarineController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@RequestMapping(value="/sub",method=RequestMethod.POST)
	public String saveSubmarineDetails(@ModelAttribute SubmarineDTO sDTO) {
		if(!sDTO.getName().isEmpty()&& sDTO.getName()!=null) {
			return "/success.jsp";
		}
		else {
			System.out.println("Invalid details");
		}
		
		return "/submarine.jsp";
		
		
	}

}
