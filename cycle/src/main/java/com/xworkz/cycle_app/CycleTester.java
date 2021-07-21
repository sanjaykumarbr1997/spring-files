package com.xworkz.cycle_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.cycle_app.dto.CycleDTO;
import com.xworkz.cycle_app.service.CycleService;

public class CycleTester {

	public static void main(String[] args) {
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		CycleDTO cDTO = new CycleDTO();
		cDTO.setName("Hercules");
		cDTO.setPrice(27000);
		cDTO.setColor("White");
		
		CycleService cycleService = applicationContext.getBean(CycleService.class);
		cycleService.validateAndSave(cDTO);
		System.out.println("details saved");

	}

}
