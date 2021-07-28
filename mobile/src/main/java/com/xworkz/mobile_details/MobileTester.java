package com.xworkz.mobile_details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mobile_details.dto.MobileDTO;
import com.xworkz.mobile_details.service.MobileSevice;

public class MobileTester {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		
		
		MobileDTO mDTO = new MobileDTO();
		
		mDTO.setName("Poco");
		mDTO.setColor("Black");
		mDTO.setPrice(2000);
		
		MobileSevice mService = applicationContext.getBean(MobileSevice.class);
		mService.validateAndSave(mDTO);
		
		System.out.println("details saved");
		/*
		MobileSevice mmService = applicationContext.getBean(MobileSevice.class);
		mmService.validateAndUpdate("Sony","White");
		System.out.println("details updated");*/
		
		
//		MobileSevice mmmService = applicationContext.getBean(MobileSevice.class);
//		mmmService.validateAndDelete("Real Me");
//		System.out.println("deleted");
		
		
		
		
	}

}
